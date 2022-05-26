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
    Dim pet_cod As Int
	Private lst_PET As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Lista_PET")
	ListarPET(Main.Usu_Cod)
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

Sub ListarPET(pet As Int)
	Dim req As DBRequestManager = CreateRequest
	Dim cmd As DBCommand = CreateCommand("ListarPET", Array (pet))
	Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	'ProgressDialogShow("Carregando...")
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		Log(res.Columns)
		lst_PET.Clear
		For Each row() As Object In res.Rows
			Dim oBitMap As Bitmap
			Dim buffer() As Byte
			'buffer = row(res.Columns.Get("pet_foto"))
			buffer = row(5)
			oBitMap = req.BytesToImage(buffer)
			'lst_Feed.AddTwoLinesAndBitmap(row(2), "    " & row(3) & "      See more...")
			lst_PET.TwoLinesAndBitmap.Label.TextColor=Colors.Black
			lst_PET.AddTwoLinesAndBitmap("(" &row(0)& ") - " &row(1),row(2) & " " & row(3) & " " & row(7) ,oBitMap)
			'lst_Feed.AddTwoLines("Linha 1", "    " & "Linha 2" & "      Veja mais")
		Next
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	ProgressDialogHide
	j.Release
End Sub

Sub ExcluirPET(DeleteByID As Int)
	Dim cmd As DBCommand = CreateCommand("ExcluirPET", Array(DeleteByID))
	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
	Wait For (j) jobDone(j As HttpJob)
	ProgressDialogShow("Excluindo...")
	If j.Success Then
		ToastMessageShow("Excluído com sucesso!", False)
	End If
	ListarPET(Main.Usu_Cod)
	j.Release
End Sub

Sub ExcluirDesapPET(DeleteByID As Int)
	Dim cmd As DBCommand = CreateCommand("ExcluirDesapPET", Array(DeleteByID))
	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
	Wait For (j) jobDone(j As HttpJob)
	ProgressDialogShow("Excluindo Desaparecimentos...")
	If j.Success Then
		ToastMessageShow("Excluído(s) com sucesso!", False)
	End If
	ListarPET(Main.Usu_Cod)
	j.Release
End Sub

Sub btnMenu_Click
	Activity.Finish
End Sub

Sub lst_PET_ItemClick (Position As Int, Value As Object)
	Try
		Dim sf As StringFunctions
		Main.CodigoPet = sf.MidExtract(Value,"(",")")
	Catch
		Main.CodigoPet=0
	End Try
	StartActivity(Tela_EditarPET)
End Sub

Sub lst_PET_ItemLongClick (Position As Int, Value As Object)
	Dim result As Int
	result = Msgbox2("Confirmar exclusão", "PETS", "Sim", "","Não", LoadBitmap(File.DirAssets, "question.png"))
	If result = DialogResponse.POSITIVE Then
		Try
			Dim sf As StringFunctions
			pet_cod = sf.MidExtract(Value,"(",")")
			ExcluirDesapPET(pet_cod)
			ExcluirPET(pet_cod)
		Catch
			pet_cod=0
		End Try
	End If
End Sub