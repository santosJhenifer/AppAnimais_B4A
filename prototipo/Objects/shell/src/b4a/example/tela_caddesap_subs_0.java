package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_caddesap_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"CadDesap\")";
Debug.ShouldStop(134217728);
tela_caddesap.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CadDesap")),tela_caddesap.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="CarregarPETS(Main.Usu_Cod)";
Debug.ShouldStop(268435456);
_carregarpets(tela_caddesap.mostCurrent._main._usu_cod);
 BA.debugLineNum = 30;BA.debugLine="Main.CodigoPet=1";
Debug.ShouldStop(536870912);
tela_caddesap.mostCurrent._main._codigopet = BA.numberCast(int.class, 1);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _btncaddesap_click() throws Exception{
try {
		Debug.PushSubsStack("btnCadDesap_Click (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,96);
if (RapidSub.canDelegate("btncaddesap_click")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","btncaddesap_click");}
RemoteObject _foto = null;
 BA.debugLineNum = 96;BA.debugLine="Sub btnCadDesap_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim Foto () As Byte";
Debug.ShouldStop(1);
_foto = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 98;BA.debugLine="Foto = CreateRequest.ImageToBytes(petFoto.Bitmap)";
Debug.ShouldStop(2);
_foto = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_imagetobytes",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_caddesap.mostCurrent._petfoto.runMethod(false,"getBitmap")));Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 100;BA.debugLine="InserirDesap(txtPontRef.Text, Data,Main.CodigoPet";
Debug.ShouldStop(8);
_inserirdesap(tela_caddesap.mostCurrent._txtpontref.runMethod(true,"getText"),tela_caddesap.mostCurrent._data,tela_caddesap.mostCurrent._main._codigopet,_foto);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("btnMenu_Click (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,157);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","btnmenu_click");}
 BA.debugLineNum = 157;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
tela_caddesap.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpetfoto_click() throws Exception{
try {
		Debug.PushSubsStack("btnPETfoto_Click (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,123);
if (RapidSub.canDelegate("btnpetfoto_click")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","btnpetfoto_click");}
 BA.debugLineNum = 123;BA.debugLine="Sub btnPETfoto_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
Debug.ShouldStop(134217728);
tela_caddesap.mostCurrent._imagechooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("imgChooser")));
 BA.debugLineNum = 125;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
Debug.ShouldStop(268435456);
tela_caddesap.mostCurrent._imagechooser.runVoidMethod ("Show",tela_caddesap.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Escolha a Foto")));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendario_click() throws Exception{
try {
		Debug.PushSubsStack("calendario_Click (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,113);
if (RapidSub.canDelegate("calendario_click")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","calendario_click");}
 BA.debugLineNum = 113;BA.debugLine="Sub calendario_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 116;BA.debugLine="Data = DateTime.GetYear(calendario.DatePicker) &";
Debug.ShouldStop(524288);
tela_caddesap.mostCurrent._data = RemoteObject.concat(tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(tela_caddesap.mostCurrent._calendario.getField(true,"_datepicker"))),RemoteObject.createImmutable("-"),tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(tela_caddesap.mostCurrent._calendario.getField(true,"_datepicker"))),RemoteObject.createImmutable("-"),tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(tela_caddesap.mostCurrent._calendario.getField(true,"_datepicker"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_caddesap.processBA, e4.toString()); BA.debugLineNum = 118;BA.debugLine="Data = DateTime.GetDayOfMonth(DateTime.Now) & \"/";
Debug.ShouldStop(2097152);
tela_caddesap.mostCurrent._data = RemoteObject.concat(tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable("/"),tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable("/"),tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(tela_caddesap.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _carregarpets(RemoteObject _usu_cod) throws Exception{
try {
		Debug.PushSubsStack("CarregarPETS (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,72);
if (RapidSub.canDelegate("carregarpets")) { b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","carregarpets", _usu_cod); return;}
ResumableSub_CarregarPETS rsub = new ResumableSub_CarregarPETS(null,_usu_cod);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CarregarPETS extends BA.ResumableSub {
public ResumableSub_CarregarPETS(b4a.example.tela_caddesap parent,RemoteObject _usu_cod) {
this.parent = parent;
this._usu_cod = _usu_cod;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_caddesap parent;
RemoteObject _usu_cod;
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
		Debug.PushSubsStack("CarregarPETS (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,72);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("usu_cod", _usu_cod);
 BA.debugLineNum = 73;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(256);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 74;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarPET";
Debug.ShouldStop(512);
_cmd = _createcommand(BA.ObjectToString("CarregarPETS"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_usu_cod)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 75;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_caddesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 76;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_caddesap.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 77;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 78;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 79;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_caddesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 82;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 84;BA.debugLine="cmb_PETS.Clear";
Debug.ShouldStop(524288);
parent.mostCurrent._cmb_pets.runVoidMethod ("Clear");
 BA.debugLineNum = 85;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 86;BA.debugLine="cmb_PETS.Add(\"[\" & row(0) & \"] \" & row(1))";
Debug.ShouldStop(2097152);
parent.mostCurrent._cmb_pets.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),_row.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable("] "),_row.getArrayElement(false,BA.numberCast(int.class, 1)))));
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
 BA.debugLineNum = 89;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 91;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 92;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _cmb_pets_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cmb_PETS_ItemClick (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,104);
if (RapidSub.canDelegate("cmb_pets_itemclick")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","cmb_pets_itemclick", _position, _value);}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 104;BA.debugLine="Sub cmb_PETS_ItemClick (Position As Int, Value As";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 106;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(512);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 107;BA.debugLine="Main.CodigoPet = sf.MidExtract(Value,\"[\",\"]\")";
Debug.ShouldStop(1024);
tela_caddesap.mostCurrent._main._codigopet = BA.numberCast(int.class, _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("]"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_caddesap.processBA, e5.toString()); BA.debugLineNum = 109;BA.debugLine="Main.CodigoPet=0";
Debug.ShouldStop(4096);
tela_caddesap.mostCurrent._main._codigopet = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CreateCommand (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,48);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","createcommand", _name, _parameters);}
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
		Debug.PushSubsStack("CreateRequest (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,42);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 42;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 44;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_caddesap.processBA,(Object)(tela_caddesap.getObject()),(Object)(tela_caddesap.mostCurrent._main._exportrdclink));
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
 //BA.debugLineNum = 16;BA.debugLine="Private txtDataDesap As EditText";
tela_caddesap.mostCurrent._txtdatadesap = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtPontRef As EditText";
tela_caddesap.mostCurrent._txtpontref = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private cmb_PETS As Spinner";
tela_caddesap.mostCurrent._cmb_pets = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private calendario As SDCalendarDialog";
tela_caddesap.mostCurrent._calendario = RemoteObject.createNew ("b4a.example.sdcalendardialog");
 //BA.debugLineNum = 21;BA.debugLine="Dim Data As String";
tela_caddesap.mostCurrent._data = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim ImageChooser As ContentChooser";
tela_caddesap.mostCurrent._imagechooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 23;BA.debugLine="Private petFoto As ImageView";
tela_caddesap.mostCurrent._petfoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgchooser_result(RemoteObject _succes,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("imgChooser_Result (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,128);
if (RapidSub.canDelegate("imgchooser_result")) { return b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","imgchooser_result", _succes, _dir, _filename);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _delta = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Succes", _succes);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 128;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="If Succes=True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_succes,tela_caddesap.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 130;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(2);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 131;BA.debugLine="b.Initialize(Dir, FileName)";
Debug.ShouldStop(4);
_b.runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 133;BA.debugLine="petFoto.Bitmap = b";
Debug.ShouldStop(16);
tela_caddesap.mostCurrent._petfoto.runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 139;BA.debugLine="Dim Delta, Height, Width As Int";
Debug.ShouldStop(1024);
_delta = RemoteObject.createImmutable(0);Debug.locals.put("Delta", _delta);
_height = RemoteObject.createImmutable(0);Debug.locals.put("Height", _height);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
 BA.debugLineNum = 140;BA.debugLine="If b.Width / b.Height > petFoto.Width /petFoto.H";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight")}, "/",0, 0),RemoteObject.solve(new RemoteObject[] {tela_caddesap.mostCurrent._petfoto.runMethod(true,"getWidth"),tela_caddesap.mostCurrent._petfoto.runMethod(true,"getHeight")}, "/",0, 0))) { 
 BA.debugLineNum = 141;BA.debugLine="Height = b.Height / b.Width * petFoto.Width";
Debug.ShouldStop(4096);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getHeight"),_b.runMethod(true,"getWidth"),tela_caddesap.mostCurrent._petfoto.runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("Height", _height);
 BA.debugLineNum = 142;BA.debugLine="Delta = (petFoto.Height - Height) / 2";
Debug.ShouldStop(8192);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_caddesap.mostCurrent._petfoto.runMethod(true,"getHeight"),_height}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 143;BA.debugLine="petFoto.Height = Height";
Debug.ShouldStop(16384);
tela_caddesap.mostCurrent._petfoto.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 144;BA.debugLine="petFoto.Top = petFoto.Top + Delta";
Debug.ShouldStop(32768);
tela_caddesap.mostCurrent._petfoto.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {tela_caddesap.mostCurrent._petfoto.runMethod(true,"getTop"),_delta}, "+",1, 1));
 }else {
 BA.debugLineNum = 146;BA.debugLine="Width = b.Width / b.Height * petFoto.Height";
Debug.ShouldStop(131072);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight"),tela_caddesap.mostCurrent._petfoto.runMethod(true,"getHeight")}, "/*",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 147;BA.debugLine="Delta = (petFoto.Width - Width) / 2";
Debug.ShouldStop(262144);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_caddesap.mostCurrent._petfoto.runMethod(true,"getWidth"),_width}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 148;BA.debugLine="petFoto.Width = Width";
Debug.ShouldStop(524288);
tela_caddesap.mostCurrent._petfoto.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 149;BA.debugLine="petFoto.Left = petFoto.Left + Delta";
Debug.ShouldStop(1048576);
tela_caddesap.mostCurrent._petfoto.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {tela_caddesap.mostCurrent._petfoto.runMethod(true,"getLeft"),_delta}, "+",1, 1));
 };
 }else {
 BA.debugLineNum = 152;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
Debug.ShouldStop(8388608);
tela_caddesap.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Imagem não Selecionada")),(Object)(tela_caddesap.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inserirdesap(RemoteObject _ponto_ref,RemoteObject _desap_data,RemoteObject _pet,RemoteObject _fotopet) throws Exception{
try {
		Debug.PushSubsStack("InserirDesap (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,56);
if (RapidSub.canDelegate("inserirdesap")) { b4a.example.tela_caddesap.remoteMe.runUserSub(false, "tela_caddesap","inserirdesap", _ponto_ref, _desap_data, _pet, _fotopet); return;}
ResumableSub_InserirDesap rsub = new ResumableSub_InserirDesap(null,_ponto_ref,_desap_data,_pet,_fotopet);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InserirDesap extends BA.ResumableSub {
public ResumableSub_InserirDesap(b4a.example.tela_caddesap parent,RemoteObject _ponto_ref,RemoteObject _desap_data,RemoteObject _pet,RemoteObject _fotopet) {
this.parent = parent;
this._ponto_ref = _ponto_ref;
this._desap_data = _desap_data;
this._pet = _pet;
this._fotopet = _fotopet;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_caddesap parent;
RemoteObject _ponto_ref;
RemoteObject _desap_data;
RemoteObject _pet;
RemoteObject _fotopet;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InserirDesap (tela_caddesap) ","tela_caddesap",2,tela_caddesap.mostCurrent.activityBA,tela_caddesap.mostCurrent,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("ponto_ref", _ponto_ref);
Debug.locals.put("desap_data", _desap_data);
Debug.locals.put("pet", _pet);
Debug.locals.put("FotoPET", _fotopet);
 BA.debugLineNum = 57;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InserirDesa";
Debug.ShouldStop(16777216);
_cmd = _createcommand(BA.ObjectToString("InserirDesap"),RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_ponto_ref),(_desap_data),(_pet),(_fotopet)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 58;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(33554432);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 59;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_caddesap.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 60;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Publicado com sucesso!\", \"PETS\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Publicado com sucesso!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_caddesap.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="Activity.Finish";
Debug.ShouldStop(536870912);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"Verifique os Valores Informados!\", \"PETS";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Verifique os Valores Informados!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_caddesap.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 67;BA.debugLine="j.Release";
Debug.ShouldStop(4);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
}