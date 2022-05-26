package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_vizdesap_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"Viz_Desap\")";
Debug.ShouldStop(1048576);
tela_vizdesap.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Viz_Desap")),tela_vizdesap.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="VizDesap_Usu(Main.Usu_Cod)";
Debug.ShouldStop(2097152);
_vizdesap_usu(tela_vizdesap.mostCurrent._main._usu_cod);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","activity_resume");}
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnMenu_Click (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,116);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","btnmenu_click");}
 BA.debugLineNum = 116;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
tela_vizdesap.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("CreateCommand (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,42);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 42;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(1024);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 44;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(2048);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(4096);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 46;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 47;BA.debugLine="Return cmd";
Debug.ShouldStop(16384);
if (true) return _cmd;
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("CreateRequest (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,36);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 36;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(16);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 38;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_vizdesap.processBA,(Object)(tela_vizdesap.getObject()),(Object)(tela_vizdesap.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 39;BA.debugLine="Return req";
Debug.ShouldStop(64);
if (true) return _req;
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _excluirdesap(RemoteObject _deletebyid) throws Exception{
try {
		Debug.PushSubsStack("ExcluirDesap (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,104);
if (RapidSub.canDelegate("excluirdesap")) { b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","excluirdesap", _deletebyid); return;}
ResumableSub_ExcluirDesap rsub = new ResumableSub_ExcluirDesap(null,_deletebyid);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ExcluirDesap extends BA.ResumableSub {
public ResumableSub_ExcluirDesap(b4a.example.tela_vizdesap parent,RemoteObject _deletebyid) {
this.parent = parent;
this._deletebyid = _deletebyid;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_vizdesap parent;
RemoteObject _deletebyid;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExcluirDesap (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,104);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("DeleteByID", _deletebyid);
 BA.debugLineNum = 105;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ExcluirDesa";
Debug.ShouldStop(256);
_cmd = _createcommand(BA.ObjectToString("ExcluirDesap"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_deletebyid)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 106;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(512);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 107;BA.debugLine="Wait For (j) jobDone(j As HttpJob)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_vizdesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 108;BA.debugLine="ProgressDialogShow(\"Excluindo...\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_vizdesap.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Excluindo..."))));
 BA.debugLineNum = 109;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 110;BA.debugLine="ToastMessageShow(\"Excluído com sucesso!\", False)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Excluído com sucesso!")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 112;BA.debugLine="VizDesap_Usu(Main.Usu_Cod)";
Debug.ShouldStop(32768);
_vizdesap_usu(parent.mostCurrent._main._usu_cod);
 BA.debugLineNum = 113;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim CodigoDesap As Int";
tela_vizdesap._codigodesap = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Private lst_desapUsu As ListView";
tela_vizdesap.mostCurrent._lst_desapusu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lst_desapusu_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lst_desapUsu_ItemClick (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,120);
if (RapidSub.canDelegate("lst_desapusu_itemclick")) { return b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","lst_desapusu_itemclick", _position, _value);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 120;BA.debugLine="Sub lst_desapUsu_ItemClick (Position As Int, Value";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="Dim result As Int";
Debug.ShouldStop(16777216);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 122;BA.debugLine="result = Msgbox2(\"Confirmar exclusão\", \"PETS\", \"S";
Debug.ShouldStop(33554432);
_result = tela_vizdesap.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Confirmar exclusão")),(Object)(BA.ObjectToCharSequence("PETS")),(Object)(BA.ObjectToString("Sim")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Não")),(Object)((tela_vizdesap.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(tela_vizdesap.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("question.png"))).getObject())),tela_vizdesap.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 123;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, tela_vizdesap.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 124;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 125;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(268435456);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 126;BA.debugLine="CodigoDesap = sf.MidExtract(Value,\"(\",\")\")";
Debug.ShouldStop(536870912);
tela_vizdesap._codigodesap = BA.numberCast(int.class, _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("(")),(Object)(RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 127;BA.debugLine="ExcluirDesap(CodigoDesap)";
Debug.ShouldStop(1073741824);
_excluirdesap(tela_vizdesap._codigodesap);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_vizdesap.processBA, e9.toString()); BA.debugLineNum = 129;BA.debugLine="CodigoDesap=0";
Debug.ShouldStop(1);
tela_vizdesap._codigodesap = BA.numberCast(int.class, 0);
 };
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static void  _vizdesap_usu(RemoteObject _usu_cod) throws Exception{
try {
		Debug.PushSubsStack("VizDesap_Usu (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,51);
if (RapidSub.canDelegate("vizdesap_usu")) { b4a.example.tela_vizdesap.remoteMe.runUserSub(false, "tela_vizdesap","vizdesap_usu", _usu_cod); return;}
ResumableSub_VizDesap_Usu rsub = new ResumableSub_VizDesap_Usu(null,_usu_cod);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_VizDesap_Usu extends BA.ResumableSub {
public ResumableSub_VizDesap_Usu(b4a.example.tela_vizdesap parent,RemoteObject _usu_cod) {
this.parent = parent;
this._usu_cod = _usu_cod;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_vizdesap parent;
RemoteObject _usu_cod;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject _obitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _buffer = null;
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("VizDesap_Usu (tela_vizdesap) ","tela_vizdesap",6,tela_vizdesap.mostCurrent.activityBA,tela_vizdesap.mostCurrent,51);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("usu_cod", _usu_cod);
 BA.debugLineNum = 52;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(524288);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 53;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"VizDesap_Us";
Debug.ShouldStop(1048576);
_cmd = _createcommand(BA.ObjectToString("VizDesap_Usu"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_usu_cod)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 54;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_vizdesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 55;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_vizdesap.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 56;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 57;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16777216);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 58;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_vizdesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 60;BA.debugLine="req.PrintTable(res)";
Debug.ShouldStop(134217728);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_printtable",(Object)(_res));
 BA.debugLineNum = 61;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 62;BA.debugLine="lst_desapUsu.Clear";
Debug.ShouldStop(536870912);
parent.mostCurrent._lst_desapusu.runVoidMethod ("Clear");
 BA.debugLineNum = 63;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.getField(false,"Rows");
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (group11.runMethod(false,"Get",index11));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 64;BA.debugLine="Dim oBitMap As Bitmap";
Debug.ShouldStop(-2147483648);
_obitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 65;BA.debugLine="Dim buffer() As Byte";
Debug.ShouldStop(1);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 67;BA.debugLine="buffer = row(12)";
Debug.ShouldStop(4);
_buffer = (_row.getArrayElement(false,BA.numberCast(int.class, 12)));Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 68;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
Debug.ShouldStop(8);
_obitmap = _req.runClassMethod (b4a.example.dbrequestmanager.class, "_bytestoimage",(Object)(_buffer));Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 70;BA.debugLine="lst_desapUsu.TwoLinesAndBitmap.Label.TextColor=";
Debug.ShouldStop(32);
parent.mostCurrent._lst_desapusu.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 71;BA.debugLine="lst_desapUsu.AddTwoLinesAndBitmap(\"(\"&row(8)&\")";
Debug.ShouldStop(64);
parent.mostCurrent._lst_desapusu.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("("),_row.getArrayElement(false,BA.numberCast(int.class, 8)),RemoteObject.createImmutable(") - "),_row.getArrayElement(false,BA.numberCast(int.class, 14)),RemoteObject.createImmutable(" - "),_row.getArrayElement(false,BA.numberCast(int.class, 9))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _row.getArrayElement(false,BA.numberCast(int.class, 10))))))),(Object)((_obitmap.getObject())));
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
 BA.debugLineNum = 76;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 78;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 80;BA.debugLine="j.Release";
Debug.ShouldStop(32768);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
}