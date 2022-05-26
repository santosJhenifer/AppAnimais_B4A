package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_feed_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"Feed\")";
Debug.ShouldStop(134217728);
tela_feed.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Feed")),tela_feed.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="Main.CodDesap=0";
Debug.ShouldStop(268435456);
tela_feed.mostCurrent._main._coddesap = BA.numberCast(int.class, 0);
 BA.debugLineNum = 30;BA.debugLine="If Main.logado = True Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",tela_feed.mostCurrent._main._logado,tela_feed.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 31;BA.debugLine="btnRelat_Desap.Visible = True";
Debug.ShouldStop(1073741824);
tela_feed.mostCurrent._btnrelat_desap.runMethod(true,"setVisible",tela_feed.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 32;BA.debugLine="btnMenu.Visible = True";
Debug.ShouldStop(-2147483648);
tela_feed.mostCurrent._btnmenu.runMethod(true,"setVisible",tela_feed.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 35;BA.debugLine="btnRelat_Desap.Visible = False";
Debug.ShouldStop(4);
tela_feed.mostCurrent._btnrelat_desap.runMethod(true,"setVisible",tela_feed.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="btnMenu.Visible = False";
Debug.ShouldStop(8);
tela_feed.mostCurrent._btnmenu.runMethod(true,"setVisible",tela_feed.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 39;BA.debugLine="sm.Initialize(Activity, Me, \"SlideMenu\", 53.5dip,";
Debug.ShouldStop(64);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_initialize",tela_feed.mostCurrent.activityBA,(Object)(tela_feed.mostCurrent._activity),(Object)(tela_feed.getObject()),(Object)(BA.ObjectToString("SlideMenu")),(Object)(tela_feed.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 53.5)))),(Object)(tela_feed.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 41;BA.debugLine="sm.AddItem(\"Cadastrar PET\",Null, 1)";
Debug.ShouldStop(256);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Cadastrar PET")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_feed.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 43;BA.debugLine="sm.AddItem(\"Visualizar PET\", Null, 2)";
Debug.ShouldStop(1024);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Visualizar PET")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_feed.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 44;BA.debugLine="sm.AddItem(\"Editar Perfil\", Null,3 )";
Debug.ShouldStop(2048);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Editar Perfil")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_feed.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 45;BA.debugLine="sm.AddItem(\"Meus Desaparecimentos\", Null,4 )";
Debug.ShouldStop(4096);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Meus Desaparecimentos")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_feed.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 46;BA.debugLine="sm.AddItem(\"Sair\", Null,5)";
Debug.ShouldStop(8192);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_additem",(Object)(BA.ObjectToString("Sair")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_feed.mostCurrent.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable((5))));
 BA.debugLineNum = 52;BA.debugLine="CarregarDesap";
Debug.ShouldStop(524288);
_carregardesap();
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,111);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 111;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK And sm.isVisib";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, tela_feed.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"))) && RemoteObject.solveBoolean(".",tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_isvisible"))) { 
 BA.debugLineNum = 114;BA.debugLine="sm.Hide";
Debug.ShouldStop(131072);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_hide");
 BA.debugLineNum = 115;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return tela_feed.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 119;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_MENU Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, tela_feed.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_MENU")))) { 
 BA.debugLineNum = 120;BA.debugLine="If sm.isVisible Then sm.Hide Else sm.Show";
Debug.ShouldStop(8388608);
if (tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_isvisible").<Boolean>get().booleanValue()) { 
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_hide");}
else {
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_show");};
 BA.debugLineNum = 121;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return tela_feed.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,55);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","activity_resume");}
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="CarregarDesap";
Debug.ShouldStop(16777216);
_carregardesap();
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnMenu_Click (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,125);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","btnmenu_click");}
 BA.debugLineNum = 125;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="sm.Show";
Debug.ShouldStop(536870912);
tela_feed.mostCurrent._sm.runClassMethod (b4a.example.slidemenu.class, "_show");
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
public static RemoteObject  _btnrelat_desap_click() throws Exception{
try {
		Debug.PushSubsStack("btnRelat_Desap_Click (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,162);
if (RapidSub.canDelegate("btnrelat_desap_click")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","btnrelat_desap_click");}
 BA.debugLineNum = 162;BA.debugLine="Sub btnRelat_Desap_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="StartActivity(\"Tela_CadDesap\")";
Debug.ShouldStop(8);
tela_feed.mostCurrent.__c.runVoidMethod ("StartActivity",tela_feed.processBA,(Object)((RemoteObject.createImmutable("Tela_CadDesap"))));
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _carregardesap() throws Exception{
try {
		Debug.PushSubsStack("CarregarDesap (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,78);
if (RapidSub.canDelegate("carregardesap")) { b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","carregardesap"); return;}
ResumableSub_CarregarDesap rsub = new ResumableSub_CarregarDesap(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CarregarDesap extends BA.ResumableSub {
public ResumableSub_CarregarDesap(b4a.example.tela_feed parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_feed parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject _obitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _buffer = null;
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CarregarDesap (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,78);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 79;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(16384);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 80;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarDes";
Debug.ShouldStop(32768);
_cmd = _createcommand(BA.ObjectToString("CarregarDesap"),(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 81;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_feed.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 82;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_feed.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 83;BA.debugLine="If j.Success Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 84;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 85;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_feed.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 87;BA.debugLine="req.PrintTable(res)";
Debug.ShouldStop(4194304);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_printtable",(Object)(_res));
 BA.debugLineNum = 88;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 89;BA.debugLine="lst_Feed.Clear";
Debug.ShouldStop(16777216);
parent.mostCurrent._lst_feed.runVoidMethod ("Clear");
 BA.debugLineNum = 91;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 92;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//for
this.state = 7;
group12 = _res.getField(false,"Rows");
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_row = (group12.runMethod(false,"Get",index12));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index12++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 93;BA.debugLine="Dim oBitMap As Bitmap";
Debug.ShouldStop(268435456);
_obitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 94;BA.debugLine="Dim buffer() As Byte";
Debug.ShouldStop(536870912);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 96;BA.debugLine="buffer = row(4)";
Debug.ShouldStop(-2147483648);
_buffer = (_row.getArrayElement(false,BA.numberCast(int.class, 4)));Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 97;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
Debug.ShouldStop(1);
_obitmap = _req.runClassMethod (b4a.example.dbrequestmanager.class, "_bytestoimage",(Object)(_buffer));Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 99;BA.debugLine="lst_Feed.TwoLinesAndBitmap.Label.TextColor=Colo";
Debug.ShouldStop(4);
parent.mostCurrent._lst_feed.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 101;BA.debugLine="lst_Feed.AddTwoLinesAndBitmap(\"(\" &row(0)& \") -";
Debug.ShouldStop(16);
parent.mostCurrent._lst_feed.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("("),_row.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(") - "),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _row.getArrayElement(false,BA.numberCast(int.class, 2)))))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_row.getArrayElement(false,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("         Veja mais...")))),(Object)((_obitmap.getObject())));
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
 BA.debugLineNum = 105;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 108;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateCommand (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,70);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 70;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(64);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 72;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(128);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(256);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 74;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 75;BA.debugLine="Return cmd";
Debug.ShouldStop(1024);
if (true) return _cmd;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("CreateRequest (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,64);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 64;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(1);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 66;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(2);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_feed.processBA,(Object)(tela_feed.getObject()),(Object)(tela_feed.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 67;BA.debugLine="Return req";
Debug.ShouldStop(4);
if (true) return _req;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private PanelMenu As Panel";
tela_feed.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnRelat_Desap As Button";
tela_feed.mostCurrent._btnrelat_desap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnMenu As Button";
tela_feed.mostCurrent._btnmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim sm As SlideMenu";
tela_feed.mostCurrent._sm = RemoteObject.createNew ("b4a.example.slidemenu");
 //BA.debugLineNum = 23;BA.debugLine="Private lst_Feed As ListView";
tela_feed.mostCurrent._lst_feed = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lst_feed_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lst_Feed_ItemClick (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,146);
if (RapidSub.canDelegate("lst_feed_itemclick")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","lst_feed_itemclick", _position, _value);}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 146;BA.debugLine="Sub lst_Feed_ItemClick (Position As Int, Value As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 150;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 151;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(4194304);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 152;BA.debugLine="Main.CodDesap = sf.MidExtract(Value,\"(\",\")\")";
Debug.ShouldStop(8388608);
tela_feed.mostCurrent._main._coddesap = BA.numberCast(int.class, _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("(")),(Object)(RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 154;BA.debugLine="StartActivity(Tela_ListarDesap)";
Debug.ShouldStop(33554432);
tela_feed.mostCurrent.__c.runVoidMethod ("StartActivity",tela_feed.processBA,(Object)((tela_feed.mostCurrent._tela_listardesap.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_feed.processBA, e6.toString()); BA.debugLineNum = 156;BA.debugLine="Main.CodDesap=0";
Debug.ShouldStop(134217728);
tela_feed.mostCurrent._main._coddesap = BA.numberCast(int.class, 0);
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
public static RemoteObject  _lst_feed_scrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("lst_Feed_ScrollChanged (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,168);
if (RapidSub.canDelegate("lst_feed_scrollchanged")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","lst_feed_scrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 168;BA.debugLine="Sub lst_Feed_ScrollChanged(Position As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _slidemenu_click(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("SlideMenu_Click (tela_feed) ","tela_feed",11,tela_feed.mostCurrent.activityBA,tela_feed.mostCurrent,130);
if (RapidSub.canDelegate("slidemenu_click")) { return b4a.example.tela_feed.remoteMe.runUserSub(false, "tela_feed","slidemenu_click", _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 130;BA.debugLine="Sub SlideMenu_Click(Item As Object)";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="If Item =1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_item,RemoteObject.createImmutable((1)))) { 
 BA.debugLineNum = 132;BA.debugLine="StartActivity(Tela_CadPET)";
Debug.ShouldStop(8);
tela_feed.mostCurrent.__c.runVoidMethod ("StartActivity",tela_feed.processBA,(Object)((tela_feed.mostCurrent._tela_cadpet.getObject())));
 }else 
{ BA.debugLineNum = 133;BA.debugLine="Else If Item =2 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_item,RemoteObject.createImmutable((2)))) { 
 BA.debugLineNum = 134;BA.debugLine="StartActivity(Tela_ListarPET)";
Debug.ShouldStop(32);
tela_feed.mostCurrent.__c.runVoidMethod ("StartActivity",tela_feed.processBA,(Object)((tela_feed.mostCurrent._tela_listarpet.getObject())));
 }else 
{ BA.debugLineNum = 135;BA.debugLine="Else If Item =3 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_item,RemoteObject.createImmutable((3)))) { 
 BA.debugLineNum = 136;BA.debugLine="StartActivity(Tela_EditarPerfil)";
Debug.ShouldStop(128);
tela_feed.mostCurrent.__c.runVoidMethod ("StartActivity",tela_feed.processBA,(Object)((tela_feed.mostCurrent._tela_editarperfil.getObject())));
 }else 
{ BA.debugLineNum = 137;BA.debugLine="Else If Item =4 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_item,RemoteObject.createImmutable((4)))) { 
 BA.debugLineNum = 138;BA.debugLine="StartActivity(Tela_VizDesap)";
Debug.ShouldStop(512);
tela_feed.mostCurrent.__c.runVoidMethod ("StartActivity",tela_feed.processBA,(Object)((tela_feed.mostCurrent._tela_vizdesap.getObject())));
 }else 
{ BA.debugLineNum = 139;BA.debugLine="Else If Item =5 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_item,RemoteObject.createImmutable((5)))) { 
 BA.debugLineNum = 140;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
tela_feed.mostCurrent._activity.runVoidMethod ("Finish");
 }}}}}
;
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}