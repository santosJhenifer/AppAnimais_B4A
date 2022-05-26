package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_cadusu_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"Cad_Usu\")";
Debug.ShouldStop(268435456);
tela_cadusu.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cad_Usu")),tela_cadusu.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="CarregarCidades";
Debug.ShouldStop(1073741824);
_carregarcidades();
 BA.debugLineNum = 32;BA.debugLine="Main.CodigoCidade=1'temporario, para deixar a cid";
Debug.ShouldStop(-2147483648);
tela_cadusu.mostCurrent._main._codigocidade = BA.NumberToString(1);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","activity_resume");}
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncadastro_click() throws Exception{
try {
		Debug.PushSubsStack("btnCadastro_Click (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,99);
if (RapidSub.canDelegate("btncadastro_click")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","btncadastro_click");}
RemoteObject _foto = null;
 BA.debugLineNum = 99;BA.debugLine="Sub btnCadastro_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Try";
Debug.ShouldStop(16);
try { BA.debugLineNum = 102;BA.debugLine="Dim Foto () As Byte";
Debug.ShouldStop(32);
_foto = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 103;BA.debugLine="Foto = CreateRequest.ImageToBytes(usu_foto.Bitma";
Debug.ShouldStop(64);
_foto = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_imagetobytes",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_cadusu.mostCurrent._usu_foto.runMethod(false,"getBitmap")));Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 105;BA.debugLine="InserirUsuario(txtNomeUsu.Text,txtEnd.Text,txtLo";
Debug.ShouldStop(256);
_inserirusuario(tela_cadusu.mostCurrent._txtnomeusu.runMethod(true,"getText"),tela_cadusu.mostCurrent._txtend.runMethod(true,"getText"),tela_cadusu.mostCurrent._txtloginusu.runMethod(true,"getText"),tela_cadusu.mostCurrent._txtsenhausu.runMethod(true,"getText"),tela_cadusu.mostCurrent._main._codigocidade,_foto,tela_cadusu.mostCurrent._txtcelular.runMethod(true,"getText"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_cadusu.processBA, e6.toString()); BA.debugLineNum = 107;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
tela_cadusu.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(tela_cadusu.mostCurrent.__c.runMethod(false,"LastException",tela_cadusu.mostCurrent.activityBA))));
 BA.debugLineNum = 108;BA.debugLine="Msgbox2(\"Verifique os Valores Informados!\", \"PET";
Debug.ShouldStop(2048);
tela_cadusu.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Verifique os Valores Informados!")),(Object)(BA.ObjectToCharSequence("PETS")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((tela_cadusu.mostCurrent.__c.getField(false,"Null"))),tela_cadusu.mostCurrent.activityBA);
 };
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
public static RemoteObject  _btnfotousu_click() throws Exception{
try {
		Debug.PushSubsStack("btnFotoUsu_Click (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,129);
if (RapidSub.canDelegate("btnfotousu_click")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","btnfotousu_click");}
 BA.debugLineNum = 129;BA.debugLine="Sub btnFotoUsu_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
Debug.ShouldStop(2);
tela_cadusu.mostCurrent._imagechooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("imgChooser")));
 BA.debugLineNum = 131;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
Debug.ShouldStop(4);
tela_cadusu.mostCurrent._imagechooser.runVoidMethod ("Show",tela_cadusu.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Escolha a Foto")));
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
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,162);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","btnmenu_click");}
 BA.debugLineNum = 162;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
tela_cadusu.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _carregarcidades() throws Exception{
try {
		Debug.PushSubsStack("CarregarCidades (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,56);
if (RapidSub.canDelegate("carregarcidades")) { b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","carregarcidades"); return;}
ResumableSub_CarregarCidades rsub = new ResumableSub_CarregarCidades(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CarregarCidades extends BA.ResumableSub {
public ResumableSub_CarregarCidades(b4a.example.tela_cadusu parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_cadusu parent;
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
		Debug.PushSubsStack("CarregarCidades (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 57;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(16777216);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 58;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarCid";
Debug.ShouldStop(33554432);
_cmd = _createcommand(BA.ObjectToString("CarregarCidades"),(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 59;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_cadusu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 60;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_cadusu.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 61;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 62;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 63;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_cadusu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 66;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 68;BA.debugLine="spinnerCidade.Clear";
Debug.ShouldStop(8);
parent.mostCurrent._spinnercidade.runVoidMethod ("Clear");
 BA.debugLineNum = 69;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(16);
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.getField(false,"Rows");
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 70;BA.debugLine="spinnerCidade.Add(\"[\" & row(0) & \"] \" & row(1))";
Debug.ShouldStop(32);
parent.mostCurrent._spinnercidade.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),_row.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable("] "),_row.getArrayElement(false,BA.numberCast(int.class, 1)))));
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
 BA.debugLineNum = 73;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 76;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("CreateCommand (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,48);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 48;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(65536);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 50;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(131072);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(262144);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 52;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 53;BA.debugLine="Return cmd";
Debug.ShouldStop(1048576);
if (true) return _cmd;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("CreateRequest (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,42);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 42;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 44;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_cadusu.processBA,(Object)(tela_cadusu.getObject()),(Object)(tela_cadusu.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 45;BA.debugLine="Return req";
Debug.ShouldStop(4096);
if (true) return _req;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 16;BA.debugLine="Private spinnerCidade As Spinner";
tela_cadusu.mostCurrent._spinnercidade = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtCodUsu As EditText";
tela_cadusu.mostCurrent._txtcodusu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtEnd As EditText";
tela_cadusu.mostCurrent._txtend = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtLoginUsu As EditText";
tela_cadusu.mostCurrent._txtloginusu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtNomeUsu As EditText";
tela_cadusu.mostCurrent._txtnomeusu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtSenhaUsu As EditText";
tela_cadusu.mostCurrent._txtsenhausu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private usu_foto As ImageView";
tela_cadusu.mostCurrent._usu_foto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim ImageChooser As ContentChooser";
tela_cadusu.mostCurrent._imagechooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 24;BA.debugLine="Private txtCelular As EditText";
tela_cadusu.mostCurrent._txtcelular = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgchooser_result(RemoteObject _succes,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("imgChooser_Result (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,134);
if (RapidSub.canDelegate("imgchooser_result")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","imgchooser_result", _succes, _dir, _filename);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _delta = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Succes", _succes);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 134;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="If Succes=True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_succes,tela_cadusu.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 136;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(128);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 137;BA.debugLine="b.Initialize(Dir, FileName)";
Debug.ShouldStop(256);
_b.runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 139;BA.debugLine="usu_foto.Bitmap = b";
Debug.ShouldStop(1024);
tela_cadusu.mostCurrent._usu_foto.runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 145;BA.debugLine="Dim Delta, Height, Width As Int";
Debug.ShouldStop(65536);
_delta = RemoteObject.createImmutable(0);Debug.locals.put("Delta", _delta);
_height = RemoteObject.createImmutable(0);Debug.locals.put("Height", _height);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
 BA.debugLineNum = 146;BA.debugLine="If b.Width / b.Height > usu_foto.Width /usu_foto";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight")}, "/",0, 0),RemoteObject.solve(new RemoteObject[] {tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getWidth"),tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getHeight")}, "/",0, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="Height = b.Height / b.Width * usu_foto.Width";
Debug.ShouldStop(262144);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getHeight"),_b.runMethod(true,"getWidth"),tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("Height", _height);
 BA.debugLineNum = 148;BA.debugLine="Delta = (usu_foto.Height - Height) / 2";
Debug.ShouldStop(524288);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getHeight"),_height}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 149;BA.debugLine="usu_foto.Height = Height";
Debug.ShouldStop(1048576);
tela_cadusu.mostCurrent._usu_foto.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 150;BA.debugLine="usu_foto.Top = usu_foto.Top + Delta";
Debug.ShouldStop(2097152);
tela_cadusu.mostCurrent._usu_foto.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getTop"),_delta}, "+",1, 1));
 }else {
 BA.debugLineNum = 152;BA.debugLine="Width = b.Width / b.Height * usu_foto.Height";
Debug.ShouldStop(8388608);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight"),tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getHeight")}, "/*",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 153;BA.debugLine="Delta = (usu_foto.Width - Width) / 2";
Debug.ShouldStop(16777216);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getWidth"),_width}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 154;BA.debugLine="usu_foto.Width = Width";
Debug.ShouldStop(33554432);
tela_cadusu.mostCurrent._usu_foto.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 155;BA.debugLine="usu_foto.Left = usu_foto.Left + Delta";
Debug.ShouldStop(67108864);
tela_cadusu.mostCurrent._usu_foto.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {tela_cadusu.mostCurrent._usu_foto.runMethod(true,"getLeft"),_delta}, "+",1, 1));
 };
 }else {
 BA.debugLineNum = 158;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
Debug.ShouldStop(536870912);
tela_cadusu.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Imagem não Selecionada")),(Object)(tela_cadusu.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inserirusuario(RemoteObject _nome,RemoteObject _endereco,RemoteObject _login,RemoteObject _senha,RemoteObject _cidade,RemoteObject _foto,RemoteObject _celular) throws Exception{
try {
		Debug.PushSubsStack("InserirUsuario (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,80);
if (RapidSub.canDelegate("inserirusuario")) { b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","inserirusuario", _nome, _endereco, _login, _senha, _cidade, _foto, _celular); return;}
ResumableSub_InserirUsuario rsub = new ResumableSub_InserirUsuario(null,_nome,_endereco,_login,_senha,_cidade,_foto,_celular);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InserirUsuario extends BA.ResumableSub {
public ResumableSub_InserirUsuario(b4a.example.tela_cadusu parent,RemoteObject _nome,RemoteObject _endereco,RemoteObject _login,RemoteObject _senha,RemoteObject _cidade,RemoteObject _foto,RemoteObject _celular) {
this.parent = parent;
this._nome = _nome;
this._endereco = _endereco;
this._login = _login;
this._senha = _senha;
this._cidade = _cidade;
this._foto = _foto;
this._celular = _celular;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_cadusu parent;
RemoteObject _nome;
RemoteObject _endereco;
RemoteObject _login;
RemoteObject _senha;
RemoteObject _cidade;
RemoteObject _foto;
RemoteObject _celular;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InserirUsuario (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,80);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Nome", _nome);
Debug.locals.put("endereco", _endereco);
Debug.locals.put("login", _login);
Debug.locals.put("senha", _senha);
Debug.locals.put("cidade", _cidade);
Debug.locals.put("Foto", _foto);
Debug.locals.put("Celular", _celular);
 BA.debugLineNum = 81;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InserirUsua";
Debug.ShouldStop(65536);
_cmd = _createcommand(BA.ObjectToString("InserirUsuario"),RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_nome),(_endereco),(_login),(_senha),(_cidade),(_foto),(_celular)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 82;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(131072);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 83;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_cadusu.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 84;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Inserido com sucesso!\", \"PETS\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Inserido com sucesso!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_cadusu.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="Main.logado=True";
Debug.ShouldStop(2097152);
parent.mostCurrent._main._logado = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 87;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 88;BA.debugLine="StartActivity(\"Tela_Feed\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",tela_cadusu.processBA,(Object)((RemoteObject.createImmutable("Tela_Feed"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 91;BA.debugLine="Msgbox(\"Login já exixtente!\", \"PETS\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Login já exixtente!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_cadusu.mostCurrent.activityBA);
 BA.debugLineNum = 92;BA.debugLine="txtLoginUsu.Text = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._txtloginusu.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 93;BA.debugLine="txtLoginUsu.RequestFocus";
Debug.ShouldStop(268435456);
parent.mostCurrent._txtloginusu.runVoidMethod ("RequestFocus");
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 95;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinnercidade_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinnerCidade_ItemClick (tela_cadusu) ","tela_cadusu",4,tela_cadusu.mostCurrent.activityBA,tela_cadusu.mostCurrent,118);
if (RapidSub.canDelegate("spinnercidade_itemclick")) { return b4a.example.tela_cadusu.remoteMe.runUserSub(false, "tela_cadusu","spinnercidade_itemclick", _position, _value);}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 118;BA.debugLine="Sub spinnerCidade_ItemClick (Position As Int, Valu";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 121;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(16777216);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 122;BA.debugLine="Main.CodigoCidade = sf.MidExtract(Value,\"[\",\"]\")";
Debug.ShouldStop(33554432);
tela_cadusu.mostCurrent._main._codigocidade = _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("]")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_cadusu.processBA, e5.toString()); BA.debugLineNum = 124;BA.debugLine="Main.CodigoCidade=0";
Debug.ShouldStop(134217728);
tela_cadusu.mostCurrent._main._codigocidade = BA.NumberToString(0);
 };
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
}