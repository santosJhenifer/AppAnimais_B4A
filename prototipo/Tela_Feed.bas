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

	
	Private PanelMenu As Panel
	Private btnRelat_Desap As Button
	Private btnMenu As Button
	Dim sm As SlideMenu
	Private lst_Feed As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Feed")
	Main.CodDesap=0
If Main.logado = True Then
	btnRelat_Desap.Visible = True
	btnMenu.Visible = True

	Else
		btnRelat_Desap.Visible = False		
		btnMenu.Visible = False
End If

	sm.Initialize(Activity, Me, "SlideMenu", 53.5dip, 300dip)

	sm.AddItem("Cadastrar PET",Null, 1)
	'sm.AddItem("Item #2", LoadBitmap(File.DirAssets, "book_add.png"), 2)
	sm.AddItem("Visualizar PET", Null, 2)
	sm.AddItem("Editar Perfil", Null,3 )
	sm.AddItem("Meus Desaparecimentos", Null,4 )
	sm.AddItem("Sair", Null,5)
	




CarregarDesap
End Sub

Sub Activity_Resume
	'Msgbox("Resume", "PETS")
	CarregarDesap
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	'Msgbox("Pause", "PETS")
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

Sub CarregarDesap
	Dim req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("CarregarDesap", Null)
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	ProgressDialogShow("Carregando...")
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		req.PrintTable(res)
		Log(res.Columns)
		lst_Feed.Clear
		
		DateTime.DateFormat = "dd/MM/yyyy"
		For Each row() As Object In res.Rows
			Dim oBitMap As Bitmap
			Dim buffer() As Byte
			'buffer = row(res.Columns.Get("pet_foto"))
			buffer = row(4)
			oBitMap = req.BytesToImage(buffer)
			'lst_Feed.AddTwoLinesAndBitmap(row(2), "    " & row(3) & "      See more...")
			lst_Feed.TwoLinesAndBitmap.Label.TextColor=Colors.Black

			lst_Feed.AddTwoLinesAndBitmap("(" &row(0)& ") - " &  DateTime.Date(row(2)),row(1) & "         Veja mais...",oBitMap)
			'lst_Feed.AddTwoLines("Linha 1", "    " & "Linha 2" & "      Veja mais")
		Next
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	ProgressDialogHide
	j.Release
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	'Pressing the back key while the slidemenu is open will close it
	If KeyCode = KeyCodes.KEYCODE_BACK And sm.isVisible Then
		sm.Hide
		Return True
	End If

	'Pressing the menu key will open/close the slidemenu
	If KeyCode = KeyCodes.KEYCODE_MENU Then
		If sm.isVisible Then sm.Hide Else sm.Show
		Return True
	End If
End Sub

Sub btnMenu_Click
	sm.Show
End Sub

'Event sub which is called when an item in the slidemenu is clicked
Sub SlideMenu_Click(Item As Object)
	If Item =1 Then
		StartActivity(Tela_CadPET)
	Else If Item =2 Then
		StartActivity(Tela_ListarPET)
	Else If Item =3 Then
		StartActivity(Tela_EditarPerfil)
	Else If Item =4 Then
		StartActivity(Tela_VizDesap)
	Else If Item =5 Then
		Activity.Finish
	End If
	
	
End Sub

Sub lst_Feed_ItemClick (Position As Int, Value As Object)
	
	
	'Pegar o CÓDIGO do desaparecimento da linha 1 da lsitview
	Try
		Dim sf As StringFunctions
		Main.CodDesap = sf.MidExtract(Value,"(",")")
		'chamar a tela de desapareccimento pra ver td
		StartActivity(Tela_ListarDesap)
	Catch
		Main.CodDesap=0
	End Try
	
	
End Sub

Sub btnRelat_Desap_Click
	'colocar um If Else para saber se a pessoa esta cadastrada ou não
	StartActivity("Tela_CadDesap")
End Sub


Sub lst_Feed_ScrollChanged(Position As Int)
	
End Sub