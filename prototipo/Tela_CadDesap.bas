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

	Private txtDataDesap As EditText
	Private txtPontRef As EditText
	Private cmb_PETS As Spinner
	
	Private calendario As SDCalendarDialog
	Dim Data As String
	Dim ImageChooser As ContentChooser
	Private petFoto As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("CadDesap")
	CarregarPETS(Main.Usu_Cod)
	Main.CodigoPet=1

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

Sub InserirDesap (ponto_ref As String, desap_data As String, pet As Int,FotoPET() As Byte)
	Dim cmd As DBCommand = CreateCommand("InserirDesap", Array(ponto_ref, desap_data, pet,FotoPET))
	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
	Wait For(j) JobDone(j As HttpJob)
	If j.Success Then
		Msgbox("Publicado com sucesso!", "PETS")
		Activity.Finish
	Else
		Msgbox("Verifique os Valores Informados!", "PETS")
		
	End If
	j.Release
End Sub



Sub CarregarPETS(usu_cod As Int)
	Dim req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("CarregarPETS", Array (usu_cod))
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	ProgressDialogShow("Carregando...")
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		Log(res.Columns)
		'req.PrintTable(res)
		cmb_PETS.Clear
		For Each row() As Object In res.Rows
			cmb_PETS.Add("[" & row(0) & "] " & row(1))
		Next
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	ProgressDialogHide
	j.Release
End Sub


Sub btnCadDesap_Click
	Dim Foto () As Byte
	Foto = CreateRequest.ImageToBytes(petFoto.Bitmap)
	
	InserirDesap(txtPontRef.Text, Data,Main.CodigoPet, Foto)
	
End Sub

Sub cmb_PETS_ItemClick (Position As Int, Value As Object)
	Try
		Dim sf As StringFunctions
		Main.CodigoPet = sf.MidExtract(Value,"[","]")
	Catch
		Main.CodigoPet=0
	End Try
End Sub

Sub calendario_Click
	'calendario.SetDate = DateTime.DateParse(DateTime.Now)
	Try	
		Data = DateTime.GetYear(calendario.DatePicker) & "-" & DateTime.GetMonth(calendario.DatePicker) & "-" & DateTime.GetDayofMonth(calendario.DatePicker)
	Catch
		Data = DateTime.GetDayOfMonth(DateTime.Now) & "/" & DateTime.GetMonth(DateTime.Now) & "/" & DateTime.GetYear(DateTime.Now)
	End Try
	
End Sub

Sub btnPETfoto_Click
	ImageChooser.Initialize("imgChooser")
	ImageChooser.Show("image/*","Escolha a Foto")
End Sub

Sub imgChooser_Result(Succes As Boolean, Dir As String, FileName As String)
	If Succes=True Then
		Dim b As Bitmap
		b.Initialize(Dir, FileName)
		
		petFoto.Bitmap = b
		
'		FotoPET.Top = 300
'		FotoPET.Width = 150
'		FotoPET.Height = 150
		
		Dim Delta, Height, Width As Int
		If b.Width / b.Height > petFoto.Width /petFoto.Height Then
			Height = b.Height / b.Width * petFoto.Width
			Delta = (petFoto.Height - Height) / 2
			petFoto.Height = Height
			petFoto.Top = petFoto.Top + Delta
		Else
			Width = b.Width / b.Height * petFoto.Height
			Delta = (petFoto.Width - Width) / 2
			petFoto.Width = Width
			petFoto.Left = petFoto.Left + Delta
		End If
	Else
		ToastMessageShow("Imagem não Selecionada",True)
	End If
End Sub


Sub btnMenu_Click
	Activity.Finish
End Sub
