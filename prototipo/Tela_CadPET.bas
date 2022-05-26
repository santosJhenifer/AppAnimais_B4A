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

	Private txtNomePET As EditText
	Private txtRacaPET As EditText
	Private txtCorPET As EditText
	Private txtPetDescricao As EditText
	Dim ImageChooser As ContentChooser
	Private FotoPET As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Cad_PET")

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

Sub InserirPET ( Nome As String,raca As String,cor As String, usuario As Int,doacao As String, descricao As String,Foto() As Byte)
	Dim cmd As DBCommand = CreateCommand("InserirPET", Array(Nome,raca,cor,usuario,doacao, descricao,Foto))
	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
	Wait For(j) JobDone(j As HttpJob)
	If j.Success Then
		Msgbox("Inserido com sucesso!", "PETS")
		Activity.Finish
	Else
		Msgbox("Verifique os Valores Informados!", "PETS")
		
	End If
	j.Release
End Sub

Sub btnCadastrarPET_Click
	
	Dim Foto () As Byte
	Foto = CreateRequest.ImageToBytes(FotoPET.Bitmap)
	
	InserirPET(txtNomePET.Text, txtRacaPET.Text, txtCorPET.Text,Main.Usu_Cod,"Não", txtPetDescricao.Text,Foto)
End Sub



Sub btnFotoPET_Click
	ImageChooser.Initialize("imgChooser")
	ImageChooser.Show("image/*","Escolha a Foto")
	
End Sub


Sub imgChooser_Result(Succes As Boolean, Dir As String, FileName As String)
	If Succes=True Then
		Dim b As Bitmap
		b.Initialize(Dir, FileName)
		
		FotoPET.Bitmap = b
		
'		FotoPET.Top = 300
'		FotoPET.Width = 150
'		FotoPET.Height = 150
		
		Dim Delta, Height, Width As Int
		If b.Width / b.Height > FotoPET.Width / FotoPET.Height Then
			Height = b.Height / b.Width * FotoPET.Width
			Delta = (FotoPET.Height - Height) / 2
			FotoPET.Height = Height
			FotoPET.Top = FotoPET.Top + Delta
		Else
			Width = b.Width / b.Height * FotoPET.Height
			Delta = (FotoPET.Width - Width) / 2
			FotoPET.Width = Width
			FotoPET.Left = FotoPET.Left + Delta
		End If
	Else
		ToastMessageShow("Imagem não Selecionada",True)
	End If
End Sub

Sub btnMenu_Click
	Activity.Finish
	'Tela_Feed.CarregarDesap
End Sub
