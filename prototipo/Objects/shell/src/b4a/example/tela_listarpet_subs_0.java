package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_listarpet_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"Lista_PET\")";
Debug.ShouldStop(1048576);
tela_listarpet.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Lista_PET")),tela_listarpet.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="ListarPET(Main.Usu_Cod)";
Debug.ShouldStop(2097152);
_listarpet(tela_listarpet.mostCurrent._main._usu_cod);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,29);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","activity_resume");}
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,101);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","btnmenu_click");}
 BA.debugLineNum = 101;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32);
tela_listarpet.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,39);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 39;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(128);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 41;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(256);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(512);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 43;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 44;BA.debugLine="Return cmd";
Debug.ShouldStop(2048);
if (true) return _cmd;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest() throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,33);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 33;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(2);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 35;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(4);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_listarpet.processBA,(Object)(tela_listarpet.getObject()),(Object)(tela_listarpet.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 36;BA.debugLine="Return req";
Debug.ShouldStop(8);
if (true) return _req;
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _excluirdesappet(RemoteObject _deletebyid) throws Exception{
try {
		Debug.PushSubsStack("ExcluirDesapPET (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,89);
if (RapidSub.canDelegate("excluirdesappet")) { b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","excluirdesappet", _deletebyid); return;}
ResumableSub_ExcluirDesapPET rsub = new ResumableSub_ExcluirDesapPET(null,_deletebyid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ExcluirDesapPET extends BA.ResumableSub {
public ResumableSub_ExcluirDesapPET(b4a.example.tela_listarpet parent,RemoteObject _deletebyid) {
this.parent = parent;
this._deletebyid = _deletebyid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_listarpet parent;
RemoteObject _deletebyid;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExcluirDesapPET (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("DeleteByID", _deletebyid);
 BA.debugLineNum = 90;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ExcluirDesa";
Debug.ShouldStop(33554432);
_cmd = _createcommand(BA.ObjectToString("ExcluirDesapPET"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_deletebyid)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 91;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(67108864);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 92;BA.debugLine="Wait For (j) jobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_listarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 93;BA.debugLine="ProgressDialogShow(\"Excluindo Desaparecimentos...";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_listarpet.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Excluindo Desaparecimentos..."))));
 BA.debugLineNum = 94;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 95;BA.debugLine="ToastMessageShow(\"Excluído(s) com sucesso!\", Fal";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Excluído(s) com sucesso!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 97;BA.debugLine="ListarPET(Main.Usu_Cod)";
Debug.ShouldStop(1);
_listarpet(parent.mostCurrent._main._usu_cod);
 BA.debugLineNum = 98;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static void  _excluirpet(RemoteObject _deletebyid) throws Exception{
try {
		Debug.PushSubsStack("ExcluirPET (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,77);
if (RapidSub.canDelegate("excluirpet")) { b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","excluirpet", _deletebyid); return;}
ResumableSub_ExcluirPET rsub = new ResumableSub_ExcluirPET(null,_deletebyid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ExcluirPET extends BA.ResumableSub {
public ResumableSub_ExcluirPET(b4a.example.tela_listarpet parent,RemoteObject _deletebyid) {
this.parent = parent;
this._deletebyid = _deletebyid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_listarpet parent;
RemoteObject _deletebyid;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExcluirPET (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("DeleteByID", _deletebyid);
 BA.debugLineNum = 78;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ExcluirPET\"";
Debug.ShouldStop(8192);
_cmd = _createcommand(BA.ObjectToString("ExcluirPET"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_deletebyid)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 79;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(16384);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 80;BA.debugLine="Wait For (j) jobDone(j As HttpJob)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_listarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 81;BA.debugLine="ProgressDialogShow(\"Excluindo...\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_listarpet.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Excluindo..."))));
 BA.debugLineNum = 82;BA.debugLine="If j.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 4;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(\"Excluído com sucesso!\", False)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Excluído com sucesso!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 85;BA.debugLine="ListarPET(Main.Usu_Cod)";
Debug.ShouldStop(1048576);
_listarpet(parent.mostCurrent._main._usu_cod);
 BA.debugLineNum = 86;BA.debugLine="j.Release";
Debug.ShouldStop(2097152);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim pet_cod As Int";
tela_listarpet._pet_cod = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Private lst_PET As ListView";
tela_listarpet.mostCurrent._lst_pet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _listarpet(RemoteObject _pet) throws Exception{
try {
		Debug.PushSubsStack("ListarPET (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,47);
if (RapidSub.canDelegate("listarpet")) { b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","listarpet", _pet); return;}
ResumableSub_ListarPET rsub = new ResumableSub_ListarPET(null,_pet);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListarPET extends BA.ResumableSub {
public ResumableSub_ListarPET(b4a.example.tela_listarpet parent,RemoteObject _pet) {
this.parent = parent;
this._pet = _pet;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_listarpet parent;
RemoteObject _pet;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject _obitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _buffer = null;
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListarPET (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("pet", _pet);
 BA.debugLineNum = 48;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(32768);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 49;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ListarPET\",";
Debug.ShouldStop(65536);
_cmd = _createcommand(BA.ObjectToString("ListarPET"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pet)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 50;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_listarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 52;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 53;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 54;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_listarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 57;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 58;BA.debugLine="lst_PET.Clear";
Debug.ShouldStop(33554432);
parent.mostCurrent._lst_pet.runVoidMethod ("Clear");
 BA.debugLineNum = 59;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//for
this.state = 7;
group9 = _res.getField(false,"Rows");
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index9 < groupLen9) {
this.state = 6;
_row = (group9.runMethod(false,"Get",index9));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index9++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 60;BA.debugLine="Dim oBitMap As Bitmap";
Debug.ShouldStop(134217728);
_obitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 61;BA.debugLine="Dim buffer() As Byte";
Debug.ShouldStop(268435456);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 63;BA.debugLine="buffer = row(5)";
Debug.ShouldStop(1073741824);
_buffer = (_row.getArrayElement(false,BA.numberCast(int.class, 5)));Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 64;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
Debug.ShouldStop(-2147483648);
_obitmap = _req.runClassMethod (b4a.example.dbrequestmanager.class, "_bytestoimage",(Object)(_buffer));Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 66;BA.debugLine="lst_PET.TwoLinesAndBitmap.Label.TextColor=Color";
Debug.ShouldStop(2);
parent.mostCurrent._lst_pet.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 67;BA.debugLine="lst_PET.AddTwoLinesAndBitmap(\"(\" &row(0)& \") -";
Debug.ShouldStop(4);
parent.mostCurrent._lst_pet.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("("),_row.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(") - "),_row.getArrayElement(false,BA.numberCast(int.class, 1))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_row.getArrayElement(false,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(" "),_row.getArrayElement(false,BA.numberCast(int.class, 3)),RemoteObject.createImmutable(" "),_row.getArrayElement(false,BA.numberCast(int.class, 7))))),(Object)((_obitmap.getObject())));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 71;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 73;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 74;BA.debugLine="j.Release";
Debug.ShouldStop(512);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _lst_pet_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lst_PET_ItemClick (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,105);
if (RapidSub.canDelegate("lst_pet_itemclick")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","lst_pet_itemclick", _position, _value);}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 105;BA.debugLine="Sub lst_PET_ItemClick (Position As Int, Value As O";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 107;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(1024);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 108;BA.debugLine="Main.CodigoPet = sf.MidExtract(Value,\"(\",\")\")";
Debug.ShouldStop(2048);
tela_listarpet.mostCurrent._main._codigopet = BA.numberCast(int.class, _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("(")),(Object)(RemoteObject.createImmutable(")"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_listarpet.processBA, e5.toString()); BA.debugLineNum = 110;BA.debugLine="Main.CodigoPet=0";
Debug.ShouldStop(8192);
tela_listarpet.mostCurrent._main._codigopet = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 112;BA.debugLine="StartActivity(Tela_EditarPET)";
Debug.ShouldStop(32768);
tela_listarpet.mostCurrent.__c.runVoidMethod ("StartActivity",tela_listarpet.processBA,(Object)((tela_listarpet.mostCurrent._tela_editarpet.getObject())));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lst_pet_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lst_PET_ItemLongClick (tela_listarpet) ","tela_listarpet",5,tela_listarpet.mostCurrent.activityBA,tela_listarpet.mostCurrent,115);
if (RapidSub.canDelegate("lst_pet_itemlongclick")) { return b4a.example.tela_listarpet.remoteMe.runUserSub(false, "tela_listarpet","lst_pet_itemlongclick", _position, _value);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 115;BA.debugLine="Sub lst_PET_ItemLongClick (Position As Int, Value";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Dim result As Int";
Debug.ShouldStop(524288);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 117;BA.debugLine="result = Msgbox2(\"Confirmar exclusão\", \"PETS\", \"S";
Debug.ShouldStop(1048576);
_result = tela_listarpet.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Confirmar exclusão")),(Object)(BA.ObjectToCharSequence("PETS")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),(Object)((tela_listarpet.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(tela_listarpet.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png"))).getObject())),tela_listarpet.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 118;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, tela_listarpet.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 119;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 120;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(8388608);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 121;BA.debugLine="pet_cod = sf.MidExtract(Value,\"(\",\")\")";
Debug.ShouldStop(16777216);
tela_listarpet._pet_cod = BA.numberCast(int.class, _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("(")),(Object)(RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 122;BA.debugLine="ExcluirDesapPET(pet_cod)";
Debug.ShouldStop(33554432);
_excluirdesappet(tela_listarpet._pet_cod);
 BA.debugLineNum = 123;BA.debugLine="ExcluirPET(pet_cod)";
Debug.ShouldStop(67108864);
_excluirpet(tela_listarpet._pet_cod);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_listarpet.processBA, e10.toString()); BA.debugLineNum = 125;BA.debugLine="pet_cod=0";
Debug.ShouldStop(268435456);
tela_listarpet._pet_cod = BA.numberCast(int.class, 0);
 };
 };
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}