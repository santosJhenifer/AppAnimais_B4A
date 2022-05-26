package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,43);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="Activity.LoadLayout(\"Login\")";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="logado = False";
Debug.ShouldStop(131072);
main._logado = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncadastrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnCadastrar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,129);
if (RapidSub.canDelegate("btncadastrar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btncadastrar_click");}
 BA.debugLineNum = 129;BA.debugLine="Sub btnCadastrar_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="StartActivity(\"Tela_CadUsu\")";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("Tela_CadUsu"))));
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
public static RemoteObject  _btncancel_click() throws Exception{
try {
		Debug.PushSubsStack("btnCancel_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,184);
if (RapidSub.canDelegate("btncancel_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btncancel_click");}
 BA.debugLineNum = 184;BA.debugLine="Sub btnCancel_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="edtEsq.Text = \"\"";
Debug.ShouldStop(16777216);
main.mostCurrent._edtesq.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 186;BA.debugLine="Panel4.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._panel4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnentrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnEntrar_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,121);
if (RapidSub.canDelegate("btnentrar_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnentrar_click");}
 BA.debugLineNum = 121;BA.debugLine="Sub btnEntrar_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 124;BA.debugLine="LocalizarUsuario(edtLogin.Text, edtSenha.Text)";
Debug.ShouldStop(134217728);
_localizarusuario(main.mostCurrent._edtlogin.runMethod(true,"getText"),main.mostCurrent._edtsenha.runMethod(true,"getText"));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnesqueceu_click() throws Exception{
try {
		Debug.PushSubsStack("btnEsqueceu_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,134);
if (RapidSub.canDelegate("btnesqueceu_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnesqueceu_click");}
 BA.debugLineNum = 134;BA.debugLine="Sub btnEsqueceu_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Panel4. Visible = True";
Debug.ShouldStop(64);
main.mostCurrent._panel4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnok_click() throws Exception{
try {
		Debug.PushSubsStack("btnOK_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,177);
if (RapidSub.canDelegate("btnok_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnok_click");}
 BA.debugLineNum = 177;BA.debugLine="Sub btnOK_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 180;BA.debugLine="EsqueceuSenha(edtEsq.Text)";
Debug.ShouldStop(524288);
_esqueceusenha(main.mostCurrent._edtesq.runMethod(true,"getText"));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnvizu_desap_click() throws Exception{
try {
		Debug.PushSubsStack("btnVizu_Desap_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,117);
if (RapidSub.canDelegate("btnvizu_desap_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnvizu_desap_click");}
 BA.debugLineNum = 117;BA.debugLine="Sub btnVizu_Desap_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="StartActivity(\"Tela_Feed\")";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("Tela_Feed"))));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("CreateCommand (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.main.remoteMe.runUserSub(false, "main","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 64;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(1);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 66;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(2);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(4);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 68;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 69;BA.debugLine="Return cmd";
Debug.ShouldStop(16);
if (true) return _cmd;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("CreateRequest (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.main.remoteMe.runUserSub(false, "main","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 58;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(67108864);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 60;BA.debugLine="req.Initialize(Me, rdcLink)";
Debug.ShouldStop(134217728);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",main.processBA,(Object)(main.getObject()),(Object)(main._rdclink));
 BA.debugLineNum = 61;BA.debugLine="Return req";
Debug.ShouldStop(268435456);
if (true) return _req;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _esqueceusenha(RemoteObject _login) throws Exception{
try {
		Debug.PushSubsStack("EsqueceuSenha (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
if (RapidSub.canDelegate("esqueceusenha")) { b4a.example.main.remoteMe.runUserSub(false, "main","esqueceusenha", _login); return;}
ResumableSub_EsqueceuSenha rsub = new ResumableSub_EsqueceuSenha(null,_login);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_EsqueceuSenha extends BA.ResumableSub {
public ResumableSub_EsqueceuSenha(b4a.example.main parent,RemoteObject _login) {
this.parent = parent;
this._login = _login;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _login;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EsqueceuSenha (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,138);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("login", _login);
 BA.debugLineNum = 139;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(1024);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 140;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"EsqueceuSen";
Debug.ShouldStop(2048);
_cmd = _createcommand(BA.ObjectToString("EsqueceuSenha"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_login)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 141;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 142;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 143;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 16;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 144;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 145;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 147;BA.debugLine="req.PrintTable(res)";
Debug.ShouldStop(262144);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_printtable",(Object)(_res));
 BA.debugLineNum = 151;BA.debugLine="If res.Rows.Size =1 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_res.getField(false,"Rows").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 155;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//for
this.state = 10;
group10 = _res.getField(false,"Rows");
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 156;BA.debugLine="Msgbox(\"Sua senha é \" & row(4), \"PETS\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Sua senha é "),_row.getArrayElement(false,BA.numberCast(int.class, 4))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),main.mostCurrent.activityBA);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("row", _row);
;
 BA.debugLineNum = 160;BA.debugLine="edtEsq.Text = \"\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._edtesq.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 161;BA.debugLine="Panel4.Visible = False";
Debug.ShouldStop(1);
parent.mostCurrent._panel4.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 163;BA.debugLine="Msgbox(\"login não encontrado\",\"Pets\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("login não encontrado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Pets"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 164;BA.debugLine="edtEsq.RequestFocus";
Debug.ShouldStop(8);
parent.mostCurrent._edtesq.runVoidMethod ("RequestFocus");
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 168;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 170;BA.debugLine="j.Release";
Debug.ShouldStop(512);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 171;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 35;BA.debugLine="Private edtLogin As EditText";
main.mostCurrent._edtlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private edtSenha As EditText";
main.mostCurrent._edtsenha = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private edtEsq As EditText";
main.mostCurrent._edtesq = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Panel4 As Panel";
main.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _localizarusuario(RemoteObject _login,RemoteObject _senha) throws Exception{
try {
		Debug.PushSubsStack("LocalizarUsuario (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("localizarusuario")) { b4a.example.main.remoteMe.runUserSub(false, "main","localizarusuario", _login, _senha); return;}
ResumableSub_LocalizarUsuario rsub = new ResumableSub_LocalizarUsuario(null,_login,_senha);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LocalizarUsuario extends BA.ResumableSub {
public ResumableSub_LocalizarUsuario(b4a.example.main parent,RemoteObject _login,RemoteObject _senha) {
this.parent = parent;
this._login = _login;
this._senha = _senha;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.main parent;
RemoteObject _login;
RemoteObject _senha;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _login_ok = RemoteObject.createImmutable(false);
RemoteObject _row = null;
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LocalizarUsuario (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("login", _login);
Debug.locals.put("senha", _senha);
 BA.debugLineNum = 73;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(256);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 74;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"LocalizarUs";
Debug.ShouldStop(512);
_cmd = _createcommand(BA.ObjectToString("LocalizarUsuario"),RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_login),(_senha)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 75;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 76;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 77;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 16;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 78;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 79;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 24;
return;
case 24:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 81;BA.debugLine="req.PrintTable(res)";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_printtable",(Object)(_res));
 BA.debugLineNum = 84;BA.debugLine="Dim login_ok As Boolean";
Debug.ShouldStop(524288);
_login_ok = RemoteObject.createImmutable(false);Debug.locals.put("login_ok", _login_ok);
 BA.debugLineNum = 85;BA.debugLine="If res.Rows.Size =1 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_res.getField(false,"Rows").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 86;BA.debugLine="login_ok=True";
Debug.ShouldStop(2097152);
_login_ok = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("login_ok", _login_ok);
 BA.debugLineNum = 89;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//for
this.state = 10;
group12 = _res.getField(false,"Rows");
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index12 < groupLen12) {
this.state = 9;
_row = (group12.runMethod(false,"Get",index12));Debug.locals.put("row", _row);}
if (true) break;

case 26:
//C
this.state = 25;
index12++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 26;
 BA.debugLineNum = 90;BA.debugLine="Usu_Cod= row(0)";
Debug.ShouldStop(33554432);
parent._usu_cod = BA.numberCast(int.class, _row.getArrayElement(false,BA.numberCast(int.class, 0)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("row", _row);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 95;BA.debugLine="login_ok=False";
Debug.ShouldStop(1073741824);
_login_ok = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("login_ok", _login_ok);
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 99;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 101;BA.debugLine="j.Release";
Debug.ShouldStop(16);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 102;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 103;BA.debugLine="If login_ok = True Then";
Debug.ShouldStop(64);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_login_ok,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 104;BA.debugLine="logado = True";
Debug.ShouldStop(128);
parent._logado = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 105;BA.debugLine="StartActivity(\"Tela_Feed\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((RemoteObject.createImmutable("Tela_Feed"))));
 BA.debugLineNum = 106;BA.debugLine="edtLogin.Text=\"\"";
Debug.ShouldStop(512);
parent.mostCurrent._edtlogin.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 107;BA.debugLine="edtSenha.Text=\"\"";
Debug.ShouldStop(1024);
parent.mostCurrent._edtsenha.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 109;BA.debugLine="logado = False";
Debug.ShouldStop(4096);
parent._logado = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 110;BA.debugLine="Msgbox(\"Usuário ou senha Incorreta\",\"PETS\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuário ou senha Incorreta")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),main.mostCurrent.activityBA);
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
tela_caddesap_subs_0._process_globals();
tela_editarpet_subs_0._process_globals();
tela_cadusu_subs_0._process_globals();
tela_listarpet_subs_0._process_globals();
tela_vizdesap_subs_0._process_globals();
tela_listardesap_subs_0._process_globals();
tela_editarperfil_subs_0._process_globals();
tela_cadpet_subs_0._process_globals();
tela_feed_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
tela_caddesap.myClass = BA.getDeviceClass ("b4a.example.tela_caddesap");
tela_editarpet.myClass = BA.getDeviceClass ("b4a.example.tela_editarpet");
tela_cadusu.myClass = BA.getDeviceClass ("b4a.example.tela_cadusu");
tela_listarpet.myClass = BA.getDeviceClass ("b4a.example.tela_listarpet");
tela_vizdesap.myClass = BA.getDeviceClass ("b4a.example.tela_vizdesap");
tela_listardesap.myClass = BA.getDeviceClass ("b4a.example.tela_listardesap");
tela_editarperfil.myClass = BA.getDeviceClass ("b4a.example.tela_editarperfil");
tela_cadpet.myClass = BA.getDeviceClass ("b4a.example.tela_cadpet");
dbrequestmanager.myClass = BA.getDeviceClass ("b4a.example.dbrequestmanager");
tela_feed.myClass = BA.getDeviceClass ("b4a.example.tela_feed");
sdcalendardialog.myClass = BA.getDeviceClass ("b4a.example.sdcalendardialog");
slidemenu.myClass = BA.getDeviceClass ("b4a.example.slidemenu");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 21;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 22;BA.debugLine="Private const rdcLink As String = \"http://10.10.1";
main._rdclink = BA.ObjectToString("http://10.10.10.101:17178/rdc");
 //BA.debugLineNum = 23;BA.debugLine="Dim item_name, exportrdcLink As String";
main._item_name = RemoteObject.createImmutable("");
main._exportrdclink = RemoteObject.createImmutable("");
 //BA.debugLineNum = 24;BA.debugLine="exportrdcLink = rdcLink";
main._exportrdclink = main._rdclink;
 //BA.debugLineNum = 25;BA.debugLine="Dim logado As Boolean";
main._logado = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 26;BA.debugLine="Dim CodigoCidade As String";
main._codigocidade = RemoteObject.createImmutable("");
 //BA.debugLineNum = 27;BA.debugLine="Dim Usu_Cod,CodDesap,CodigoPet  As Int";
main._usu_cod = RemoteObject.createImmutable(0);
main._coddesap = RemoteObject.createImmutable(0);
main._codigopet = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}