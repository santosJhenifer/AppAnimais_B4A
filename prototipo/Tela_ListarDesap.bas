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
	Private lbl_PontRef As Label
	Private lblPET_nome As Label
	Private lblUsu_Cel As Label
	Private lblUsu_nome As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ListaDesap")
	CarregarDesaparecimento(Main.CodDesap)

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


Sub CarregarDesaparecimento(Codigo As Int)
	Dim req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("ListarDesaparecimentoUnico", Array(Codigo))
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	'ProgressDialogShow("Carregando...")
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		Log(res.Columns)
		For Each row() As Object In res.Rows
			Dim oBitMap As Bitmap
			Dim buffer() As Byte
			buffer = row(12)
			oBitMap = req.BytesToImage(buffer)
			
			imgPET.Bitmap=oBitMap
			lblPET_nome.Text=row(14)
			lblUsu_nome.Text=row(1)
			lbl_PontRef.Text=row(9)
			lblUsu_Cel.Text=row(7)
			
			
			
			
			

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

Sub btnWpp_Click
	Dim Intent1 As Intent
 
	Intent1.Initialize(Intent1.ACTION_VIEW, $"https://api.whatsapp.com/send?phone=${"+55" & lblUsu_Cel.Text}&text=${"Olá, tenho informações sobre seu animal desaparecido"}"$)
	Intent1.SetComponent("android/com.android.internal.app.ResolverActivity")
	StartActivity(Intent1)
End Sub