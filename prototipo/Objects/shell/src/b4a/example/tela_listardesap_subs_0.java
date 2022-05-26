package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_listardesap_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"ListaDesap\")";
Debug.ShouldStop(16777216);
tela_listardesap.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListaDesap")),tela_listardesap.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="CarregarDesaparecimento(Main.CodDesap)";
Debug.ShouldStop(33554432);
_carregardesaparecimento(tela_listardesap.mostCurrent._main._coddesap);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Resume (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnMenu_Click (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,91);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","btnmenu_click");}
 BA.debugLineNum = 91;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
tela_listardesap.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnwpp_click() throws Exception{
try {
		Debug.PushSubsStack("btnWpp_Click (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,95);
if (RapidSub.canDelegate("btnwpp_click")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","btnwpp_click");}
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 95;BA.debugLine="Sub btnWpp_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(-2147483648);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 98;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, $\"https:/";
Debug.ShouldStop(2);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://api.whatsapp.com/send?phone="),tela_listardesap.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("+55"),tela_listardesap.mostCurrent._lblusu_cel.runMethod(true,"getText"))))),RemoteObject.createImmutable("&text="),tela_listardesap.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.createImmutable("Olá, tenho informações sobre seu animal desaparecido")))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 99;BA.debugLine="Intent1.SetComponent(\"android/com.android.interna";
Debug.ShouldStop(4);
_intent1.runVoidMethod ("SetComponent",(Object)(RemoteObject.createImmutable("android/com.android.internal.app.ResolverActivity")));
 BA.debugLineNum = 100;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(8);
tela_listardesap.mostCurrent.__c.runVoidMethod ("StartActivity",tela_listardesap.processBA,(Object)((_intent1.getObject())));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _carregardesaparecimento(RemoteObject _codigo) throws Exception{
try {
		Debug.PushSubsStack("CarregarDesaparecimento (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,54);
if (RapidSub.canDelegate("carregardesaparecimento")) { b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","carregardesaparecimento", _codigo); return;}
ResumableSub_CarregarDesaparecimento rsub = new ResumableSub_CarregarDesaparecimento(null,_codigo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CarregarDesaparecimento extends BA.ResumableSub {
public ResumableSub_CarregarDesaparecimento(b4a.example.tela_listardesap parent,RemoteObject _codigo) {
this.parent = parent;
this._codigo = _codigo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_listardesap parent;
RemoteObject _codigo;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject _obitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _buffer = null;
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CarregarDesaparecimento (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,54);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 55;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(4194304);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 56;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ListarDesap";
Debug.ShouldStop(8388608);
_cmd = _createcommand(BA.ObjectToString("ListarDesaparecimentoUnico"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_codigo)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 57;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_listardesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 59;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 60;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(134217728);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 61;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_listardesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 64;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 65;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1);
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.getField(false,"Rows");
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 66;BA.debugLine="Dim oBitMap As Bitmap";
Debug.ShouldStop(2);
_obitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 67;BA.debugLine="Dim buffer() As Byte";
Debug.ShouldStop(4);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 68;BA.debugLine="buffer = row(12)";
Debug.ShouldStop(8);
_buffer = (_row.getArrayElement(false,BA.numberCast(int.class, 12)));Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 69;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
Debug.ShouldStop(16);
_obitmap = _req.runClassMethod (b4a.example.dbrequestmanager.class, "_bytestoimage",(Object)(_buffer));Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 71;BA.debugLine="imgPET.Bitmap=oBitMap";
Debug.ShouldStop(64);
parent.mostCurrent._imgpet.runMethod(false,"setBitmap",(_obitmap.getObject()));
 BA.debugLineNum = 72;BA.debugLine="lblPET_nome.Text=row(14)";
Debug.ShouldStop(128);
parent.mostCurrent._lblpet_nome.runMethod(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 14))));
 BA.debugLineNum = 73;BA.debugLine="lblUsu_nome.Text=row(1)";
Debug.ShouldStop(256);
parent.mostCurrent._lblusu_nome.runMethod(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 74;BA.debugLine="lbl_PontRef.Text=row(9)";
Debug.ShouldStop(512);
parent.mostCurrent._lbl_pontref.runMethod(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 9))));
 BA.debugLineNum = 75;BA.debugLine="lblUsu_Cel.Text=row(7)";
Debug.ShouldStop(1024);
parent.mostCurrent._lblusu_cel.runMethod(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 7))));
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
 BA.debugLineNum = 84;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 86;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 87;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,45);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 45;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(8192);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 47;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(16384);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(32768);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 49;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 50;BA.debugLine="Return cmd";
Debug.ShouldStop(131072);
if (true) return _cmd;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("CreateRequest (tela_listardesap) ","tela_listardesap",7,tela_listardesap.mostCurrent.activityBA,tela_listardesap.mostCurrent,39);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_listardesap.remoteMe.runUserSub(false, "tela_listardesap","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 39;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(128);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 41;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_listardesap.processBA,(Object)(tela_listardesap.getObject()),(Object)(tela_listardesap.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 42;BA.debugLine="Return req";
Debug.ShouldStop(512);
if (true) return _req;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private imgPET As ImageView";
tela_listardesap.mostCurrent._imgpet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private lbl_PontRef As Label";
tela_listardesap.mostCurrent._lbl_pontref = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private lblPET_nome As Label";
tela_listardesap.mostCurrent._lblpet_nome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblUsu_Cel As Label";
tela_listardesap.mostCurrent._lblusu_cel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblUsu_nome As Label";
tela_listardesap.mostCurrent._lblusu_nome = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}