B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private imgPET As ImageView
	Private txtCorPET As EditText
	Private txtNomePET As EditText
	Private txtPetDescricao As EditText
	Private txtRacaPET As EditText
	Dim ImageChooser As ContentChooser
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("EditarPET")
	ListarEditPET(Main.CodigoPet)
	'ToastMessageShow(Main.CodigoPet,False)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateRequest As DBRequestManager
	Dim req As DBRequestManager
	req.Initialize(Me, Main.exportrdcLink)
	Return req
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub

Sub AtualizarPET(Nome As String,raca As String,cor As String, usuario As Int,Foto() As Byte, doacao As String, descricao As String)
	Dim cmd As DBCommand = CreateCommand("AtualizarPET", Array(Nome,raca,cor,usuario,Foto,doacao, descricao,Main.CodigoPet))
	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
	Wait For(j) JobDone(j As HttpJob)
	If j.Success Then
		Msgbox("Atualizado com sucesso!", "PETS")
		'Activity.Finish
	Else
		Msgbox("Verifique os Valores Informados!", "PETS")
		
	End If
	j.Release
	
End Sub


Sub ListarEditPET(Codigo As Int)
	Dim req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("ListarEditPET", Array(Codigo))
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		Log(res.Columns)
		For Each row() As Object In res.Rows
			Dim oBitMap As Bitmap
			Dim buffer() As Byte
			buffer = row(5)
			oBitMap = req.BytesToImage(buffer)
			
			imgPET.Bitmap=oBitMap
			txtNomePET.Text=row(1)
			txtRacaPET.Text=row(2)
			txtCorPET.Text=row(3)
			txtPetDescricao.Text=row(7)
		Next
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	ProgressDialogHide
	j.Release
End Sub

Sub btnMenu_Click
	Activity.Finish
End Sub

Sub btnFotoPET_Click
	ImageChooser.Initialize("imgChooser")
	ImageChooser.Show("image/*","Escolha a Foto")
End Sub

Sub imgChooser_Result(Succes As Boolean, Dir As String, FileName As String)
	If Succes=True Then
		Dim b As Bitmap
		b.Initialize(Dir, FileName)
		
		imgPET.Bitmap = b
		
'		FotoPET.Top = 300
'		FotoPET.Width = 150
'		FotoPET.Height = 150
		
		Dim Delta, Height, Width As Int
		If b.Width / b.Height > imgPET.Width / imgPET.Height Then
			Height = b.Height / b.Width * imgPET.Width
			Delta = (imgPET.Height - Height) / 2
			imgPET.Height = Height
			imgPET.Top = imgPET.Top + Delta
		Else
			Width = b.Width / b.Height * imgPET.Height
			Delta = (imgPET.Width - Width) / 2
			imgPET.Width = Width
			imgPET.Left = imgPET.Left + Delta
		End If
	Else
		ToastMessageShow("Imagem não Selecionada",True)
	End If
End Sub


Sub btnAtualizar_Click
	Dim Foto () As Byte
	Foto = CreateRequest.ImageToBytes(imgPET.Bitmap)
	
	AtualizarPET(txtNomePET.Text, txtRacaPET.Text, txtCorPET.Text,Main.Usu_Cod,Foto,"Não", txtPetDescricao.Text)
End Sub