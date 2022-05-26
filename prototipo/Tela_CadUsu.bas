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
	
	Private spinnerCidade As Spinner
	Private txtCodUsu As EditText
	Private txtEnd As EditText
	Private txtLoginUsu As EditText
	Private txtNomeUsu As EditText
	Private txtSenhaUsu As EditText	
	Private usu_foto As ImageView
	Dim ImageChooser As ContentChooser
	Private txtCelular As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Cad_Usu")
	'Carregar os dados da cidade no spinner
	CarregarCidades
	Main.CodigoCidade=1'temporario, para deixar a cidad de codigo 1 como padrão
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

Sub CarregarCidades
	Dim req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("CarregarCidades", Null)
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	ProgressDialogShow("Carregando...")
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		Log(res.Columns)
		'req.PrintTable(res)
		spinnerCidade.Clear
		For Each row() As Object In res.Rows
			spinnerCidade.Add("[" & row(0) & "] " & row(1))
		Next
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	ProgressDialogHide
	j.Release
End Sub


Sub InserirUsuario ( Nome As String,endereco As String,login As String,senha As String,cidade As String, Foto() As Byte,Celular As String)
	Dim cmd As DBCommand = CreateCommand("InserirUsuario", Array(Nome,endereco,login,senha,cidade, Foto,Celular))
	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
	Wait For(j) JobDone(j As HttpJob)
	If j.Success Then
		Msgbox("Inserido com sucesso!", "PETS")
		Main.logado=True
		Activity.Finish
		StartActivity("Tela_Feed")
		
	Else
		Msgbox("Login já exixtente!", "PETS")
		txtLoginUsu.Text = ""
txtLoginUsu.RequestFocus
	End If
	j.Release
End Sub


Sub btnCadastro_Click	
	
	Try
		Dim Foto () As Byte
		Foto = CreateRequest.ImageToBytes(usu_foto.Bitmap)
	
		InserirUsuario(txtNomeUsu.Text,txtEnd.Text,txtLoginUsu.Text,txtSenhaUsu.Text,Main.CodigoCidade, Foto,txtCelular.Text)
	Catch
		Log(LastException)
		Msgbox2("Verifique os Valores Informados!", "PETS", "OK", "", "",Null )
	End Try
	
	
	
End Sub




Sub spinnerCidade_ItemClick (Position As Int, Value As Object)
	'Pegar o CÓDIGO da CIDADE
	Try
		Dim sf As StringFunctions		
		Main.CodigoCidade = sf.MidExtract(Value,"[","]")		
	Catch
		Main.CodigoCidade=0
	End Try
	
End Sub

Sub btnFotoUsu_Click
	ImageChooser.Initialize("imgChooser")
	ImageChooser.Show("image/*","Escolha a Foto")
End Sub

Sub imgChooser_Result(Succes As Boolean, Dir As String, FileName As String)
	If Succes=True Then
		Dim b As Bitmap
		b.Initialize(Dir, FileName)
		
		usu_foto.Bitmap = b
		
'		FotoPET.Top = 300
'		FotoPET.Width = 150
'		FotoPET.Height = 150
		
		Dim Delta, Height, Width As Int
		If b.Width / b.Height > usu_foto.Width /usu_foto.Height Then
			Height = b.Height / b.Width * usu_foto.Width
			Delta = (usu_foto.Height - Height) / 2
			usu_foto.Height = Height
			usu_foto.Top = usu_foto.Top + Delta
		Else
			Width = b.Width / b.Height * usu_foto.Height
			Delta = (usu_foto.Width - Width) / 2
			usu_foto.Width = Width
			usu_foto.Left = usu_foto.Left + Delta
		End If
	Else
		ToastMessageShow("Imagem não Selecionada",True)
	End If
End Sub

Sub btnMenu_Click
	Activity.Finish
End Sub