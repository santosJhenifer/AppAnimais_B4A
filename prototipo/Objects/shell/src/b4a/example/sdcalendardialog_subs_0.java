package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sdcalendardialog_subs_0 {


public static RemoteObject  _buttoncancel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonCancel_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,514);
if (RapidSub.canDelegate("buttoncancel_click")) { return __ref.runUserSub(false, "sdcalendardialog","buttoncancel_click", __ref);}
 BA.debugLineNum = 514;BA.debugLine="private Sub ButtonCancel_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="Ret=DialogResponse.NEGATIVE";
Debug.ShouldStop(4);
__ref.setField ("_ret",sdcalendardialog.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"));
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonok_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonOk_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,508);
if (RapidSub.canDelegate("buttonok_click")) { return __ref.runUserSub(false, "sdcalendardialog","buttonok_click", __ref);}
 BA.debugLineNum = 508;BA.debugLine="private Sub ButtonOk_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 509;BA.debugLine="DatePicker=DateRet";
Debug.ShouldStop(268435456);
__ref.setField ("_datepicker",__ref.getField(true,"_dateret"));
 BA.debugLineNum = 510;BA.debugLine="Ret=DialogResponse.POSITIVE";
Debug.ShouldStop(536870912);
__ref.setField ("_ret",sdcalendardialog.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"));
 BA.debugLineNum = 511;BA.debugLine="If SubExists(CallBack,EventName & \"_Click\") Then";
Debug.ShouldStop(1073741824);
if (sdcalendardialog.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_Click")))).<Boolean>get().booleanValue()) { 
sdcalendardialog.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_Click"))));};
 BA.debugLineNum = 512;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Public DatePicker As Long";
sdcalendardialog._datepicker = RemoteObject.createImmutable(0L);__ref.setField("_datepicker",sdcalendardialog._datepicker);
 //BA.debugLineNum = 14;BA.debugLine="Public Color As Int = Colors.RGB(0,150,136)";
sdcalendardialog._color = sdcalendardialog.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 136)));__ref.setField("_color",sdcalendardialog._color);
 //BA.debugLineNum = 15;BA.debugLine="Public TextColor As Int = Colors.White";
sdcalendardialog._textcolor = sdcalendardialog.__c.getField(false,"Colors").getField(true,"White");__ref.setField("_textcolor",sdcalendardialog._textcolor);
 //BA.debugLineNum = 16;BA.debugLine="Public TextSize As Int = 16";
sdcalendardialog._textsize = BA.numberCast(int.class, 16);__ref.setField("_textsize",sdcalendardialog._textsize);
 //BA.debugLineNum = 17;BA.debugLine="Public Title As String = \"\"";
sdcalendardialog._title = BA.ObjectToString("");__ref.setField("_title",sdcalendardialog._title);
 //BA.debugLineNum = 18;BA.debugLine="Public Square As Boolean = True";
sdcalendardialog._square = sdcalendardialog.__c.getField(true,"True");__ref.setField("_square",sdcalendardialog._square);
 //BA.debugLineNum = 20;BA.debugLine="Private EventName As String 'ignore";
sdcalendardialog._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",sdcalendardialog._eventname);
 //BA.debugLineNum = 21;BA.debugLine="Private CallBack As Object 'ignore";
sdcalendardialog._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",sdcalendardialog._callback);
 //BA.debugLineNum = 22;BA.debugLine="Private mBase As Panel";
sdcalendardialog._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbase",sdcalendardialog._mbase);
 //BA.debugLineNum = 23;BA.debugLine="Private Pa As Panel";
sdcalendardialog._pa = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pa",sdcalendardialog._pa);
 //BA.debugLineNum = 24;BA.debugLine="Private Pan As Panel";
sdcalendardialog._pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pan",sdcalendardialog._pan);
 //BA.debugLineNum = 25;BA.debugLine="Private MyAct As Panel";
sdcalendardialog._myact = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_myact",sdcalendardialog._myact);
 //BA.debugLineNum = 27;BA.debugLine="Private DateRet As Long = 0";
sdcalendardialog._dateret = BA.numberCast(long.class, 0);__ref.setField("_dateret",sdcalendardialog._dateret);
 //BA.debugLineNum = 28;BA.debugLine="Private Ret As Int = 0";
sdcalendardialog._ret = BA.numberCast(int.class, 0);__ref.setField("_ret",sdcalendardialog._ret);
 //BA.debugLineNum = 30;BA.debugLine="Private Cale As Panel";
sdcalendardialog._cale = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_cale",sdcalendardialog._cale);
 //BA.debugLineNum = 31;BA.debugLine="Private Testa As Panel";
sdcalendardialog._testa = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_testa",sdcalendardialog._testa);
 //BA.debugLineNum = 32;BA.debugLine="Private ButtonOk As Button";
sdcalendardialog._buttonok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonok",sdcalendardialog._buttonok);
 //BA.debugLineNum = 33;BA.debugLine="Private ButtoCancel As Button";
sdcalendardialog._buttocancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttocancel",sdcalendardialog._buttocancel);
 //BA.debugLineNum = 34;BA.debugLine="Private LabelNow As Label";
sdcalendardialog._labelnow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelnow",sdcalendardialog._labelnow);
 //BA.debugLineNum = 35;BA.debugLine="Private LDay As Label";
sdcalendardialog._lday = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lday",sdcalendardialog._lday);
 //BA.debugLineNum = 36;BA.debugLine="Private LYear As Label";
sdcalendardialog._lyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lyear",sdcalendardialog._lyear);
 //BA.debugLineNum = 37;BA.debugLine="Private LMounth As Label";
sdcalendardialog._lmounth = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lmounth",sdcalendardialog._lmounth);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _corner(RemoteObject __ref,RemoteObject _colore) throws Exception{
try {
		Debug.PushSubsStack("Corner (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("corner")) { return __ref.runUserSub(false, "sdcalendardialog","corner", __ref, _colore);}
RemoteObject _cdb = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Colore", _colore);
 BA.debugLineNum = 146;BA.debugLine="private Sub Corner(Colore As Int) As ColorDrawable";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Dim cdb As ColorDrawable";
Debug.ShouldStop(262144);
_cdb = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdb", _cdb);
 BA.debugLineNum = 148;BA.debugLine="cdb.Initialize(Colore, 20dip)";
Debug.ShouldStop(524288);
_cdb.runVoidMethod ("Initialize",(Object)(_colore),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 149;BA.debugLine="Return cdb";
Debug.ShouldStop(1048576);
if (true) return _cdb;
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "sdcalendardialog","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _can = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 46;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim Bm As Bitmap";
Debug.ShouldStop(16384);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 48;BA.debugLine="Dim Can As Canvas";
Debug.ShouldStop(32768);
_can = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("Can", _can);
 BA.debugLineNum = 49;BA.debugLine="Dim D,M,Y As Int";
Debug.ShouldStop(65536);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
 BA.debugLineNum = 51;BA.debugLine="mBase = Base";
Debug.ShouldStop(262144);
__ref.setField ("_mbase",_base);
 BA.debugLineNum = 52;BA.debugLine="mBase.Color=Colors.Transparent";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbase").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 55;BA.debugLine="Dim Obj As View = mBase";
Debug.ShouldStop(4194304);
_obj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
_obj.setObject(__ref.getField(false,"_mbase").getObject());Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 56;BA.debugLine="Do While Not(GetType(Obj) = \"android.widget.Frame";
Debug.ShouldStop(8388608);
while (sdcalendardialog.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",sdcalendardialog.__c.runMethod(true,"GetType",(Object)((_obj.getObject()))),RemoteObject.createImmutable("android.widget.FrameLayout"))))).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 57;BA.debugLine="Obj=Obj.Parent";
Debug.ShouldStop(16777216);
_obj.setObject(_obj.runMethod(false,"getParent"));
 }
;
 BA.debugLineNum = 59;BA.debugLine="MyAct=Obj";
Debug.ShouldStop(67108864);
__ref.getField(false,"_myact").setObject (_obj.getObject());
 BA.debugLineNum = 62;BA.debugLine="Pan.Initialize(\"Pan\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pan").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Pan")));
 BA.debugLineNum = 63;BA.debugLine="mBase.AddView(Pan,0dip,0dip,mBase.Width,mBase.Hei";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mbase").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pan").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase").runMethod(true,"getHeight")));
 BA.debugLineNum = 66;BA.debugLine="If Props.ContainsKey(\"TextColor\") Then TextColor=";
Debug.ShouldStop(2);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("TextColor")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_textcolor",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextColor"))))));};
 BA.debugLineNum = 67;BA.debugLine="If Props.ContainsKey(\"TextSize\") Then TextSize=Pr";
Debug.ShouldStop(4);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("TextSize")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_textsize",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TextSize"))))));};
 BA.debugLineNum = 68;BA.debugLine="If Props.ContainsKey(\"Color\") Then Color=Props.Ge";
Debug.ShouldStop(8);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Color")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_color",BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Color"))))));};
 BA.debugLineNum = 69;BA.debugLine="If Props.ContainsKey(\"DayOfMounth\") Then d=Props.";
Debug.ShouldStop(16);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("DayOfMounth")))).<Boolean>get().booleanValue()) { 
_d = BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DayOfMounth")))));Debug.locals.put("D", _d);};
 BA.debugLineNum = 70;BA.debugLine="If Props.ContainsKey(\"Mounth\") Then m=Props.Get(\"";
Debug.ShouldStop(32);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Mounth")))).<Boolean>get().booleanValue()) { 
_m = BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Mounth")))));Debug.locals.put("M", _m);};
 BA.debugLineNum = 71;BA.debugLine="If Props.ContainsKey(\"Year\") Then y=Props.Get(\"Ye";
Debug.ShouldStop(64);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Year")))).<Boolean>get().booleanValue()) { 
_y = BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Year")))));Debug.locals.put("Y", _y);};
 BA.debugLineNum = 72;BA.debugLine="If Props.ContainsKey(\"Title\") Then Title=Props.Ge";
Debug.ShouldStop(128);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Title")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_title",BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Title"))))));};
 BA.debugLineNum = 73;BA.debugLine="If Props.ContainsKey(\"Square\") Then Square=Props.";
Debug.ShouldStop(256);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Square")))).<Boolean>get().booleanValue()) { 
__ref.setField ("_square",BA.ObjectToBoolean(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Square"))))));};
 BA.debugLineNum = 75;BA.debugLine="If Props.ContainsKey(\"Now\") Then";
Debug.ShouldStop(1024);
if (_props.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("Now")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="If Props.Get(\"Now\")=True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Now")))),(sdcalendardialog.__c.getField(true,"True")))) { 
 BA.debugLineNum = 77;BA.debugLine="DatePicker=DateTime.Now";
Debug.ShouldStop(4096);
__ref.setField ("_datepicker",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 78;BA.debugLine="D=DateTime.GetDayOfMonth(DatePicker)";
Debug.ShouldStop(8192);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_datepicker")));Debug.locals.put("D", _d);
 BA.debugLineNum = 79;BA.debugLine="M=DateTime.GetMonth(DatePicker)";
Debug.ShouldStop(16384);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_datepicker")));Debug.locals.put("M", _m);
 BA.debugLineNum = 80;BA.debugLine="Y=DateTime.GetYear(DatePicker)";
Debug.ShouldStop(32768);
_y = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_datepicker")));Debug.locals.put("Y", _y);
 }else {
 BA.debugLineNum = 82;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyyy\"";
Debug.ShouldStop(131072);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyyyy"));
 BA.debugLineNum = 83;BA.debugLine="DatePicker=DateTime.DateParse(m & \"/\" & d & \"/\"";
Debug.ShouldStop(262144);
__ref.setField ("_datepicker",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/"),_d,RemoteObject.createImmutable("/"),_y))));
 };
 };
 BA.debugLineNum = 87;BA.debugLine="DateRet=DatePicker";
Debug.ShouldStop(4194304);
__ref.setField ("_dateret",__ref.getField(true,"_datepicker"));
 BA.debugLineNum = 89;BA.debugLine="If Square Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_square").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
Debug.ShouldStop(33554432);
_bm.runVoidMethod ("InitializeMutable",(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 91;BA.debugLine="Can.Initialize2(Bm)";
Debug.ShouldStop(67108864);
_can.runVoidMethod ("Initialize2",(Object)((_bm.getObject())));
 BA.debugLineNum = 92;BA.debugLine="Can.DrawColor(Color)";
Debug.ShouldStop(134217728);
_can.runVoidMethod ("DrawColor",(Object)(__ref.getField(true,"_color")));
 BA.debugLineNum = 93;BA.debugLine="Can.DrawText(NomeMese(M),210dip,80dip,Typeface.D";
Debug.ShouldStop(268435456);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(_m))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210))))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, 60)),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 94;BA.debugLine="Can.DrawText(d,200dip,260dip,Typeface.DEFAULT_BO";
Debug.ShouldStop(536870912);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_d)),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260))))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, 180)),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 95;BA.debugLine="Can.DrawText(y,200dip,350dip,Typeface.DEFAULT_BO";
Debug.ShouldStop(1073741824);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_y)),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, 60)),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 96;BA.debugLine="Pan.SetBackgroundImage(Can.Bitmap)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pan").runVoidMethod ("SetBackgroundImageNew",(Object)((_can.runMethod(false,"getBitmap").getObject())));
 }else {
 BA.debugLineNum = 98;BA.debugLine="Pan.Background=Corner(Color)";
Debug.ShouldStop(2);
__ref.getField(false,"_pan").runMethod(false,"setBackground",(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_corner",(Object)(__ref.getField(true,"_color"))).getObject()));
 BA.debugLineNum = 99;BA.debugLine="Can.Initialize(Pan)";
Debug.ShouldStop(4);
_can.runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_pan").getObject())));
 BA.debugLineNum = 100;BA.debugLine="Can.DrawText(d & \"-\" & NomeMese(M).SubString2(0,";
Debug.ShouldStop(8);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_d,RemoteObject.createImmutable("-"),__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(_m)).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable("-"),_y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/+",1, 0))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_textsize"))),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 };
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
public static RemoteObject  _fillcalendar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FillCalendar (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("fillcalendar")) { return __ref.runUserSub(false, "sdcalendardialog","fillcalendar", __ref);}
RemoteObject _gday = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _datestart = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _lab = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 154;BA.debugLine="private Sub FillCalendar";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Dim GDay,D,M,A,Y,X As Int";
Debug.ShouldStop(67108864);
_gday = RemoteObject.createImmutable(0);Debug.locals.put("GDay", _gday);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
_x = RemoteObject.createImmutable(0);Debug.locals.put("X", _x);
 BA.debugLineNum = 156;BA.debugLine="Dim DateStart As Long";
Debug.ShouldStop(134217728);
_datestart = RemoteObject.createImmutable(0L);Debug.locals.put("DateStart", _datestart);
 BA.debugLineNum = 158;BA.debugLine="Cale.RemoveAllViews";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cale").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 160;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
Debug.ShouldStop(-2147483648);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("D", _d);
 BA.debugLineNum = 161;BA.debugLine="m=DateTime.GetMonth(DateRet)";
Debug.ShouldStop(1);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("M", _m);
 BA.debugLineNum = 162;BA.debugLine="a=DateTime.GetYear(DateRet)";
Debug.ShouldStop(2);
_a = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("A", _a);
 BA.debugLineNum = 163;BA.debugLine="GDay=DateTime.GetDayOfWeek(DateRet)";
Debug.ShouldStop(4);
_gday = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("GDay", _gday);
 BA.debugLineNum = 165;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyy\"";
Debug.ShouldStop(16);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyy"));
 BA.debugLineNum = 166;BA.debugLine="DateStart=DateTime.DateParse(M & \"/01/\" & A)";
Debug.ShouldStop(32);
_datestart = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/01/"),_a)));Debug.locals.put("DateStart", _datestart);
 BA.debugLineNum = 168;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyy\"";
Debug.ShouldStop(128);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyy"));
 BA.debugLineNum = 169;BA.debugLine="GDay=DateTime.GetDayOfWeek(DateTime.DateParse(M &";
Debug.ShouldStop(256);
_gday = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/01/"),_a)))));Debug.locals.put("GDay", _gday);
 BA.debugLineNum = 171;BA.debugLine="For i=0 To 6";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = 6;
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 172;BA.debugLine="Dim Lab As Label";
Debug.ShouldStop(2048);
_lab = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Lab", _lab);
 BA.debugLineNum = 173;BA.debugLine="Lab.Initialize(\"\")";
Debug.ShouldStop(4096);
_lab.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 174;BA.debugLine="Lab.Text=NomeGiorno(i)";
Debug.ShouldStop(8192);
_lab.runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomegiorno",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 175;BA.debugLine="Lab.Color=Colors.Transparent";
Debug.ShouldStop(16384);
_lab.runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 176;BA.debugLine="If i=0 Then Lab.Textcolor=Colors.Red Else Lab.Te";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_lab.runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Red"));}
else {
_lab.runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Black"));};
 BA.debugLineNum = 177;BA.debugLine="Lab.Gravity=Gravity.CENTER";
Debug.ShouldStop(65536);
_lab.runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 178;BA.debugLine="Lab.Typeface=Typeface.DEFAULT_BOLD";
Debug.ShouldStop(131072);
_lab.runMethod(false,"setTypeface",sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 179;BA.debugLine="Lab.TextSize=14";
Debug.ShouldStop(262144);
_lab.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 180;BA.debugLine="Cale.AddView(Lab,i*40dip,0dip,40dip,40dip)";
Debug.ShouldStop(524288);
__ref.getField(false,"_cale").runVoidMethod ("AddView",(Object)((_lab.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "*",0, 1)),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 183;BA.debugLine="Y=40dip";
Debug.ShouldStop(4194304);
_y = sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)));Debug.locals.put("Y", _y);
 BA.debugLineNum = 184;BA.debugLine="X=(GDay-1)*40dip";
Debug.ShouldStop(8388608);
_x = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_gday,RemoteObject.createImmutable(1)}, "-",1, 1)),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "*",0, 1);Debug.locals.put("X", _x);
 BA.debugLineNum = 185;BA.debugLine="For i=1 To 31";
Debug.ShouldStop(16777216);
{
final int step25 = 1;
final int limit25 = 31;
_i = 1 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 186;BA.debugLine="If DateTime.GetMonth(DateStart)=m Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_datestart)),BA.numberCast(double.class, _m))) { 
 BA.debugLineNum = 187;BA.debugLine="Dim Lab As Label";
Debug.ShouldStop(67108864);
_lab = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Lab", _lab);
 BA.debugLineNum = 189;BA.debugLine="Lab.Initialize(\"Giorno\")";
Debug.ShouldStop(268435456);
_lab.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Giorno")));
 BA.debugLineNum = 190;BA.debugLine="If d=i Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, _i))) { 
 BA.debugLineNum = 191;BA.debugLine="Lab.Background=Corner(Color)";
Debug.ShouldStop(1073741824);
_lab.runMethod(false,"setBackground",(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_corner",(Object)(__ref.getField(true,"_color"))).getObject()));
 BA.debugLineNum = 192;BA.debugLine="Lab.Textcolor=Colors.White";
Debug.ShouldStop(-2147483648);
_lab.runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 193;BA.debugLine="LabelNow=Lab";
Debug.ShouldStop(1);
__ref.setField ("_labelnow",_lab);
 }else {
 BA.debugLineNum = 195;BA.debugLine="Lab.Color=Colors.Transparent";
Debug.ShouldStop(4);
_lab.runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 196;BA.debugLine="Lab.TextColor=Colors.Black";
Debug.ShouldStop(8);
_lab.runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Black"));
 };
 BA.debugLineNum = 198;BA.debugLine="Lab.Text=i";
Debug.ShouldStop(32);
_lab.runMethod(true,"setText",BA.ObjectToCharSequence(_i));
 BA.debugLineNum = 199;BA.debugLine="Lab.Tag=DateStart";
Debug.ShouldStop(64);
_lab.runMethod(false,"setTag",(_datestart));
 BA.debugLineNum = 200;BA.debugLine="Lab.Gravity=Gravity.CENTER";
Debug.ShouldStop(128);
_lab.runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 201;BA.debugLine="Lab.TextSize=14";
Debug.ShouldStop(256);
_lab.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 202;BA.debugLine="Cale.AddView(Lab,X,Y,40dip,40dip)";
Debug.ShouldStop(512);
__ref.getField(false,"_cale").runVoidMethod ("AddView",(Object)((_lab.getObject())),(Object)(_x),(Object)(_y),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 204;BA.debugLine="GDay=GDay+1";
Debug.ShouldStop(2048);
_gday = RemoteObject.solve(new RemoteObject[] {_gday,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("GDay", _gday);
 BA.debugLineNum = 205;BA.debugLine="If GDay>7 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_gday,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 206;BA.debugLine="GDay=1";
Debug.ShouldStop(8192);
_gday = BA.numberCast(int.class, 1);Debug.locals.put("GDay", _gday);
 BA.debugLineNum = 207;BA.debugLine="Y=Y+35dip";
Debug.ShouldStop(16384);
_y = RemoteObject.solve(new RemoteObject[] {_y,sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))}, "+",1, 1);Debug.locals.put("Y", _y);
 BA.debugLineNum = 208;BA.debugLine="X=0dip";
Debug.ShouldStop(32768);
_x = sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("X", _x);
 }else {
 BA.debugLineNum = 210;BA.debugLine="X=X+40dip";
Debug.ShouldStop(131072);
_x = RemoteObject.solve(new RemoteObject[] {_x,sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 1);Debug.locals.put("X", _x);
 };
 };
 BA.debugLineNum = 214;BA.debugLine="DateStart=DateStart + DateTime.TicksPerDay";
Debug.ShouldStop(2097152);
_datestart = RemoteObject.solve(new RemoteObject[] {_datestart,sdcalendardialog.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+",1, 2);Debug.locals.put("DateStart", _datestart);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 218;BA.debugLine="ButtonOk.Initialize(\"ButtonOk\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_buttonok").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ButtonOk")));
 BA.debugLineNum = 219;BA.debugLine="ButtonOk.Color=Colors.Transparent";
Debug.ShouldStop(67108864);
__ref.getField(false,"_buttonok").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 220;BA.debugLine="ButtonOk.TextColor=Color";
Debug.ShouldStop(134217728);
__ref.getField(false,"_buttonok").runMethod(true,"setTextColor",__ref.getField(true,"_color"));
 BA.debugLineNum = 221;BA.debugLine="ButtonOk.Gravity=Gravity.CENTER";
Debug.ShouldStop(268435456);
__ref.getField(false,"_buttonok").runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 222;BA.debugLine="ButtonOk.Typeface=Typeface.DEFAULT_BOLD";
Debug.ShouldStop(536870912);
__ref.getField(false,"_buttonok").runMethod(false,"setTypeface",sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 223;BA.debugLine="ButtonOk.Text=\"OK\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_buttonok").runMethod(true,"setText",BA.ObjectToCharSequence("OK"));
 BA.debugLineNum = 224;BA.debugLine="ButtonOk.Textsize=14";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_buttonok").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 225;BA.debugLine="Cale.AddView(ButtonOk,140dip,240dip,140dip,40dip)";
Debug.ShouldStop(1);
__ref.getField(false,"_cale").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_buttonok").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 227;BA.debugLine="ButtoCancel.Initialize(\"ButtonCancel\")";
Debug.ShouldStop(4);
__ref.getField(false,"_buttocancel").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("ButtonCancel")));
 BA.debugLineNum = 228;BA.debugLine="ButtoCancel.Color=Colors.Transparent";
Debug.ShouldStop(8);
__ref.getField(false,"_buttocancel").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 229;BA.debugLine="ButtoCancel.TextColor=Color";
Debug.ShouldStop(16);
__ref.getField(false,"_buttocancel").runMethod(true,"setTextColor",__ref.getField(true,"_color"));
 BA.debugLineNum = 230;BA.debugLine="ButtoCancel.Gravity=Gravity.CENTER";
Debug.ShouldStop(32);
__ref.getField(false,"_buttocancel").runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 231;BA.debugLine="ButtoCancel.Typeface=Typeface.DEFAULT_BOLD";
Debug.ShouldStop(64);
__ref.getField(false,"_buttocancel").runMethod(false,"setTypeface",sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 232;BA.debugLine="ButtoCancel.Text=\"CANCEL\"";
Debug.ShouldStop(128);
__ref.getField(false,"_buttocancel").runMethod(true,"setText",BA.ObjectToCharSequence("CANCEL"));
 BA.debugLineNum = 233;BA.debugLine="ButtoCancel.Textsize=14";
Debug.ShouldStop(256);
__ref.getField(false,"_buttocancel").runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 234;BA.debugLine="Cale.AddView(ButtoCancel,0dip,240dip,140dip,40dip";
Debug.ShouldStop(512);
__ref.getField(false,"_cale").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_buttocancel").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filltesta(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FillTesta (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("filltesta")) { return __ref.runUserSub(false, "sdcalendardialog","filltesta", __ref);}
RemoteObject _lab = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 237;BA.debugLine="private Sub FillTesta";
Debug.ShouldStop(4096);
 BA.debugLineNum = 239;BA.debugLine="Dim Lab As Label";
Debug.ShouldStop(16384);
_lab = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Lab", _lab);
 BA.debugLineNum = 240;BA.debugLine="Lab.Initialize(\"\")";
Debug.ShouldStop(32768);
_lab.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 241;BA.debugLine="Lab.Gravity=Gravity.CENTER";
Debug.ShouldStop(65536);
_lab.runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 242;BA.debugLine="Lab.Text=Title";
Debug.ShouldStop(131072);
_lab.runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_title")));
 BA.debugLineNum = 243;BA.debugLine="Lab.TextSize=14";
Debug.ShouldStop(262144);
_lab.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 244;BA.debugLine="Lab.Textcolor=Colors.White";
Debug.ShouldStop(524288);
_lab.runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 245;BA.debugLine="Lab.Color=Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(1048576);
_lab.runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 246;BA.debugLine="Testa.AddView(Lab,0dip,0dip,280dip,30dip)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((_lab.getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 249;BA.debugLine="LMounth.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lmounth").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 250;BA.debugLine="LMounth.Gravity=Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lmounth").runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 251;BA.debugLine="LMounth.Text=NomeMese(DateTime.GetMonth(DateRet))";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lmounth").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_dateret")))))));
 BA.debugLineNum = 252;BA.debugLine="LMounth.TextSize=25";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lmounth").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 253;BA.debugLine="LMounth.Textcolor=Colors.White";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lmounth").runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 254;BA.debugLine="LMounth.Color=Colors.Transparent";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lmounth").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 255;BA.debugLine="Testa.AddView(LMounth,0dip,30dip,280dip,60dip)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lmounth").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 265;BA.debugLine="Dim P2 As Button";
Debug.ShouldStop(256);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("P2", _p2);
 BA.debugLineNum = 266;BA.debugLine="P2.Initialize(\"PrevM\")";
Debug.ShouldStop(512);
_p2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PrevM")));
 BA.debugLineNum = 267;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_left_confirm_gray\"";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_loaddrawablebyname",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _p2.getObject()),(Object)(RemoteObject.createImmutable("jog_tab_left_confirm_gray")));
 BA.debugLineNum = 268;BA.debugLine="Testa.AddView(P2,0dip,35dip,40dip,40dip)";
Debug.ShouldStop(2048);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 279;BA.debugLine="Dim P2 As Button";
Debug.ShouldStop(4194304);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("P2", _p2);
 BA.debugLineNum = 280;BA.debugLine="P2.Initialize(\"NextM\")";
Debug.ShouldStop(8388608);
_p2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("NextM")));
 BA.debugLineNum = 281;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_right_confirm_gray";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_loaddrawablebyname",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _p2.getObject()),(Object)(RemoteObject.createImmutable("jog_tab_right_confirm_gray")));
 BA.debugLineNum = 282;BA.debugLine="Testa.AddView(P2,240dip,35dip,40dip,40dip)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 285;BA.debugLine="LDay.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lday").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 286;BA.debugLine="LDay.Gravity=Gravity.CENTER";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lday").runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 287;BA.debugLine="LDay.Text=DateTime.GetDayOfMonth(DateRet)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lday").runMethod(true,"setText",BA.ObjectToCharSequence(sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_dateret")))));
 BA.debugLineNum = 288;BA.debugLine="LDay.TextSize=100";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lday").runMethod(true,"setTextSize",BA.numberCast(float.class, 100));
 BA.debugLineNum = 289;BA.debugLine="LDay.Textcolor=Colors.White";
Debug.ShouldStop(1);
__ref.getField(false,"_lday").runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 290;BA.debugLine="LDay.Typeface=Typeface.SANS_SERIF";
Debug.ShouldStop(2);
__ref.getField(false,"_lday").runMethod(false,"setTypeface",sdcalendardialog.__c.getField(false,"Typeface").getField(false,"SANS_SERIF"));
 BA.debugLineNum = 291;BA.debugLine="LDay.Color=Colors.Transparent";
Debug.ShouldStop(4);
__ref.getField(false,"_lday").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 292;BA.debugLine="Testa.AddView(LDay,0dip,70dip,280dip,120dip)";
Debug.ShouldStop(8);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lday").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))));
 BA.debugLineNum = 295;BA.debugLine="LYear.Initialize(\"\")";
Debug.ShouldStop(64);
__ref.getField(false,"_lyear").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 296;BA.debugLine="LYear.Gravity=Gravity.CENTER";
Debug.ShouldStop(128);
__ref.getField(false,"_lyear").runMethod(true,"setGravity",sdcalendardialog.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 297;BA.debugLine="LYear.Text=DateTime.GetYear(DateRet)";
Debug.ShouldStop(256);
__ref.getField(false,"_lyear").runMethod(true,"setText",BA.ObjectToCharSequence(sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_dateret")))));
 BA.debugLineNum = 298;BA.debugLine="LYear.TextSize=30";
Debug.ShouldStop(512);
__ref.getField(false,"_lyear").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 299;BA.debugLine="LYear.Textcolor=Colors.ARGB(200,255,255,255)";
Debug.ShouldStop(1024);
__ref.getField(false,"_lyear").runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 300;BA.debugLine="LYear.Color=Colors.Transparent";
Debug.ShouldStop(2048);
__ref.getField(false,"_lyear").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 301;BA.debugLine="Testa.AddView(LYear,0dip,190dip,280dip,40dip)";
Debug.ShouldStop(4096);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lyear").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 311;BA.debugLine="Dim P2 As Button";
Debug.ShouldStop(4194304);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("P2", _p2);
 BA.debugLineNum = 312;BA.debugLine="P2.Initialize(\"PrevY\")";
Debug.ShouldStop(8388608);
_p2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("PrevY")));
 BA.debugLineNum = 313;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_left_confirm_gray\"";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_loaddrawablebyname",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _p2.getObject()),(Object)(RemoteObject.createImmutable("jog_tab_left_confirm_gray")));
 BA.debugLineNum = 314;BA.debugLine="Testa.AddView(P2,0dip,190dip,40dip,40dip)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 325;BA.debugLine="Dim P2 As Button";
Debug.ShouldStop(16);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("P2", _p2);
 BA.debugLineNum = 326;BA.debugLine="P2.Initialize(\"NextY\")";
Debug.ShouldStop(32);
_p2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("NextY")));
 BA.debugLineNum = 327;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_right_confirm_gray";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_loaddrawablebyname",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _p2.getObject()),(Object)(RemoteObject.createImmutable("jog_tab_right_confirm_gray")));
 BA.debugLineNum = 328;BA.debugLine="Testa.AddView(P2,240dip,190dip,40dip,40dip)";
Debug.ShouldStop(128);
__ref.getField(false,"_testa").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 190)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "sdcalendardialog","getbase", __ref);}
 BA.debugLineNum = 105;BA.debugLine="Public Sub GetBase As Panel";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Return mBase";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_mbase");
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _giorno_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Giorno_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("giorno_click")) { return __ref.runUserSub(false, "sdcalendardialog","giorno_click", __ref);}
 BA.debugLineNum = 387;BA.debugLine="private Sub Giorno_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="LabelNow.Color=Colors.Transparent";
Debug.ShouldStop(8);
__ref.getField(false,"_labelnow").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 389;BA.debugLine="LabelNow.TextColor=Colors.Black";
Debug.ShouldStop(16);
__ref.getField(false,"_labelnow").runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 391;BA.debugLine="LabelNow=Sender";
Debug.ShouldStop(64);
__ref.getField(false,"_labelnow").setObject (sdcalendardialog.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 392;BA.debugLine="LabelNow.Background=Corner(Color)";
Debug.ShouldStop(128);
__ref.getField(false,"_labelnow").runMethod(false,"setBackground",(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_corner",(Object)(__ref.getField(true,"_color"))).getObject()));
 BA.debugLineNum = 393;BA.debugLine="LabelNow.Textcolor=Colors.White";
Debug.ShouldStop(256);
__ref.getField(false,"_labelnow").runMethod(true,"setTextColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 395;BA.debugLine="DateRet=LabelNow.Tag";
Debug.ShouldStop(1024);
__ref.setField ("_dateret",BA.numberCast(long.class, __ref.getField(false,"_labelnow").runMethod(false,"getTag")));
 BA.debugLineNum = 396;BA.debugLine="LDay.Text=LabelNow.Text";
Debug.ShouldStop(2048);
__ref.getField(false,"_lday").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_labelnow").runMethod(true,"getText")));
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sdcalendardialog","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallback", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 40;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(256);
__ref.setField ("_eventname",_veventname);
 BA.debugLineNum = 42;BA.debugLine="CallBack = vCallback";
Debug.ShouldStop(512);
__ref.setField ("_callback",_vcallback);
 BA.debugLineNum = 43;BA.debugLine="Pa.Initialize(\"Pa\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_pa").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Pa")));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lingua(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Lingua (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,586);
if (RapidSub.canDelegate("lingua")) { return __ref.runUserSub(false, "sdcalendardialog","lingua", __ref);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 586;BA.debugLine="private Sub Lingua As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 587;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1024);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 588;BA.debugLine="r.Target = r.RunStaticMethod(\"java.util.Locale\",";
Debug.ShouldStop(2048);
_r.setField ("Target",_r.runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("java.util.Locale")),(Object)(BA.ObjectToString("getDefault")),(Object)((sdcalendardialog.__c.getField(false,"Null"))),(Object)((sdcalendardialog.__c.getField(false,"Null")))));
 BA.debugLineNum = 589;BA.debugLine="Return r.RunMethod(\"getLanguage\")";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getLanguage"))));
 BA.debugLineNum = 590;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddrawablebyname(RemoteObject __ref,RemoteObject _control,RemoteObject _imagename) throws Exception{
try {
		Debug.PushSubsStack("LoadDrawableByName (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("loaddrawablebyname")) { return __ref.runUserSub(false, "sdcalendardialog","loaddrawablebyname", __ref, _control, _imagename);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _id_drawable = RemoteObject.createImmutable(0);
Debug.locals.put("Control", _control);
Debug.locals.put("ImageName", _imagename);
 BA.debugLineNum = 399;BA.debugLine="Private Sub LoadDrawableByName(Control As View, Im";
Debug.ShouldStop(16384);
 BA.debugLineNum = 400;BA.debugLine="Dim R As Reflector";
Debug.ShouldStop(32768);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("R", _r);
 BA.debugLineNum = 401;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 402;BA.debugLine="R.Target = R.GetContext";
Debug.ShouldStop(131072);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 403;BA.debugLine="R.Target = R.RunMethod(\"getResources\")";
Debug.ShouldStop(262144);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 404;BA.debugLine="R.Target = R.RunMethod(\"getSystem\")";
Debug.ShouldStop(524288);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSystem"))));
 BA.debugLineNum = 405;BA.debugLine="Dim ID_Drawable As Int";
Debug.ShouldStop(1048576);
_id_drawable = RemoteObject.createImmutable(0);Debug.locals.put("ID_Drawable", _id_drawable);
 BA.debugLineNum = 406;BA.debugLine="ID_Drawable = R.RunMethod4(\"getIdentifier\", Arra";
Debug.ShouldStop(2097152);
_id_drawable = BA.numberCast(int.class, _r.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("getIdentifier")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_imagename),RemoteObject.createImmutable(("drawable")),(RemoteObject.createImmutable("android"))})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("java.lang.String"),BA.ObjectToString("java.lang.String"),RemoteObject.createImmutable("java.lang.String")}))));Debug.locals.put("ID_Drawable", _id_drawable);
 BA.debugLineNum = 408;BA.debugLine="R.Target = R.GetContext";
Debug.ShouldStop(8388608);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 409;BA.debugLine="R.Target = R.RunMethod(\"getResources\")";
Debug.ShouldStop(16777216);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 410;BA.debugLine="Control.Background = R.RunMethod2(\"getDrawable\",";
Debug.ShouldStop(33554432);
_control.runMethod(false,"setBackground",(_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_id_drawable)),(Object)(RemoteObject.createImmutable("java.lang.int")))));
 BA.debugLineNum = 411;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) return sdcalendardialog.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e13.toString()); BA.debugLineNum = 414;BA.debugLine="LogColor(\"ERROR.LoadDrawableByName:\" & LastExcep";
Debug.ShouldStop(536870912);
sdcalendardialog.__c.runVoidMethod ("LogColor",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR.LoadDrawableByName:"),sdcalendardialog.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(sdcalendardialog.__c.getField(false,"Colors").getField(true,"Red")));
 BA.debugLineNum = 415;BA.debugLine="Return False";
Debug.ShouldStop(1073741824);
if (true) return sdcalendardialog.__c.getField(true,"False");
 };
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nextm_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextM_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("nextm_click")) { return __ref.runUserSub(false, "sdcalendardialog","nextm_click", __ref);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 446;BA.debugLine="Private Sub NextM_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 447;BA.debugLine="Dim D,M,A As Int";
Debug.ShouldStop(1073741824);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
 BA.debugLineNum = 449;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
Debug.ShouldStop(1);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("D", _d);
 BA.debugLineNum = 450;BA.debugLine="m=DateTime.GetMonth(DateRet)";
Debug.ShouldStop(2);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("M", _m);
 BA.debugLineNum = 451;BA.debugLine="a=DateTime.GetYear(DateRet)";
Debug.ShouldStop(4);
_a = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("A", _a);
 BA.debugLineNum = 453;BA.debugLine="M=M+1";
Debug.ShouldStop(16);
_m = RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("M", _m);
 BA.debugLineNum = 454;BA.debugLine="If M=13 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_m,BA.numberCast(double.class, 13))) { 
 BA.debugLineNum = 455;BA.debugLine="M=1";
Debug.ShouldStop(64);
_m = BA.numberCast(int.class, 1);Debug.locals.put("M", _m);
 BA.debugLineNum = 456;BA.debugLine="a=a+1";
Debug.ShouldStop(128);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 };
 BA.debugLineNum = 459;BA.debugLine="If (M=2)And(D>28) Then D=28";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_m,BA.numberCast(double.class, 2))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_d,BA.numberCast(double.class, 28)))))) { 
_d = BA.numberCast(int.class, 28);Debug.locals.put("D", _d);};
 BA.debugLineNum = 460;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_m,BA.numberCast(double.class, 30))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 4)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 6)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 9)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 11)))))) { 
_d = BA.numberCast(int.class, 30);Debug.locals.put("D", _d);};
 BA.debugLineNum = 462;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
Debug.ShouldStop(8192);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyyy"));
 BA.debugLineNum = 463;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
Debug.ShouldStop(16384);
__ref.setField ("_dateret",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/"),_d,RemoteObject.createImmutable("/"),_a))));
 BA.debugLineNum = 464;BA.debugLine="FillCalendar";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_fillcalendar");
 BA.debugLineNum = 465;BA.debugLine="LMounth.Text=NomeMese(M)";
Debug.ShouldStop(65536);
__ref.getField(false,"_lmounth").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(_m))));
 BA.debugLineNum = 466;BA.debugLine="LYear.Text=a";
Debug.ShouldStop(131072);
__ref.getField(false,"_lyear").runMethod(true,"setText",BA.ObjectToCharSequence(_a));
 BA.debugLineNum = 467;BA.debugLine="LDay.Text=d";
Debug.ShouldStop(262144);
__ref.getField(false,"_lday").runMethod(true,"setText",BA.ObjectToCharSequence(_d));
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nexty_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Nexty_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,489);
if (RapidSub.canDelegate("nexty_click")) { return __ref.runUserSub(false, "sdcalendardialog","nexty_click", __ref);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 489;BA.debugLine="Private Sub Nexty_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 490;BA.debugLine="Dim D,M,A As Int";
Debug.ShouldStop(512);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
 BA.debugLineNum = 492;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
Debug.ShouldStop(2048);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("D", _d);
 BA.debugLineNum = 493;BA.debugLine="m=DateTime.GetMonth(DateRet)";
Debug.ShouldStop(4096);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("M", _m);
 BA.debugLineNum = 494;BA.debugLine="a=DateTime.GetYear(DateRet)";
Debug.ShouldStop(8192);
_a = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("A", _a);
 BA.debugLineNum = 496;BA.debugLine="a=a+1";
Debug.ShouldStop(32768);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 498;BA.debugLine="If (M=2)And(D>28) Then D=28";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_m,BA.numberCast(double.class, 2))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_d,BA.numberCast(double.class, 28)))))) { 
_d = BA.numberCast(int.class, 28);Debug.locals.put("D", _d);};
 BA.debugLineNum = 499;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_m,BA.numberCast(double.class, 30))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 4)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 6)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 9)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 11)))))) { 
_d = BA.numberCast(int.class, 30);Debug.locals.put("D", _d);};
 BA.debugLineNum = 501;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
Debug.ShouldStop(1048576);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyyy"));
 BA.debugLineNum = 502;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
Debug.ShouldStop(2097152);
__ref.setField ("_dateret",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/"),_d,RemoteObject.createImmutable("/"),_a))));
 BA.debugLineNum = 503;BA.debugLine="FillCalendar";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_fillcalendar");
 BA.debugLineNum = 504;BA.debugLine="LYear.Text=a";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lyear").runMethod(true,"setText",BA.ObjectToCharSequence(_a));
 BA.debugLineNum = 505;BA.debugLine="LDay.Text=d";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lday").runMethod(true,"setText",BA.ObjectToCharSequence(_d));
 BA.debugLineNum = 506;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nomegiorno(RemoteObject __ref,RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("NomeGiorno (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("nomegiorno")) { return __ref.runUserSub(false, "sdcalendardialog","nomegiorno", __ref, _d);}
RemoteObject _l_it = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_en = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_es = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_fr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_de = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_pt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_ru = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_ko = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("D", _d);
 BA.debugLineNum = 522;BA.debugLine="private Sub NomeGiorno(D As Int) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 523;BA.debugLine="Dim L_it As List = Array As String (\"D\",\"L\",\"M\",\"";
Debug.ShouldStop(1024);
_l_it = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_it = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("D"),BA.ObjectToString("L"),BA.ObjectToString("M"),BA.ObjectToString("M"),BA.ObjectToString("G"),BA.ObjectToString("V"),RemoteObject.createImmutable("S")})));Debug.locals.put("L_it", _l_it);Debug.locals.put("L_it", _l_it);
 BA.debugLineNum = 524;BA.debugLine="Dim L_en As List = Array As String (\"S\",\"M\",\"T\",\"";
Debug.ShouldStop(2048);
_l_en = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_en = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("S"),BA.ObjectToString("M"),BA.ObjectToString("T"),BA.ObjectToString("W"),BA.ObjectToString("T"),BA.ObjectToString("F"),RemoteObject.createImmutable("S")})));Debug.locals.put("L_en", _l_en);Debug.locals.put("L_en", _l_en);
 BA.debugLineNum = 525;BA.debugLine="Dim L_es As List = Array As String (\"D\",\"L\",\"M\",\"";
Debug.ShouldStop(4096);
_l_es = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_es = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("D"),BA.ObjectToString("L"),BA.ObjectToString("M"),BA.ObjectToString("M"),BA.ObjectToString("J"),BA.ObjectToString("V"),RemoteObject.createImmutable("S")})));Debug.locals.put("L_es", _l_es);Debug.locals.put("L_es", _l_es);
 BA.debugLineNum = 526;BA.debugLine="Dim L_fr As List = Array As String (\"D\",\"L\",\"M\",\"";
Debug.ShouldStop(8192);
_l_fr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_fr = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("D"),BA.ObjectToString("L"),BA.ObjectToString("M"),BA.ObjectToString("M"),BA.ObjectToString("J"),BA.ObjectToString("V"),RemoteObject.createImmutable("S")})));Debug.locals.put("L_fr", _l_fr);Debug.locals.put("L_fr", _l_fr);
 BA.debugLineNum = 527;BA.debugLine="Dim L_de As List = Array As String (\"S\",\"M\",\"D\",\"";
Debug.ShouldStop(16384);
_l_de = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_de = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("S"),BA.ObjectToString("M"),BA.ObjectToString("D"),BA.ObjectToString("M"),BA.ObjectToString("D"),BA.ObjectToString("F"),RemoteObject.createImmutable("S")})));Debug.locals.put("L_de", _l_de);Debug.locals.put("L_de", _l_de);
 BA.debugLineNum = 528;BA.debugLine="Dim L_pt As List = Array As String (\"D\",\"S\",\"T\",\"";
Debug.ShouldStop(32768);
_l_pt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_pt = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("D"),BA.ObjectToString("S"),BA.ObjectToString("T"),BA.ObjectToString("Q"),BA.ObjectToString("Q"),BA.ObjectToString("S"),RemoteObject.createImmutable("S")})));Debug.locals.put("L_pt", _l_pt);Debug.locals.put("L_pt", _l_pt);
 BA.debugLineNum = 529;BA.debugLine="Dim L_ru As List = Array As String (\"В\",\"П\",\"В\",\"";
Debug.ShouldStop(65536);
_l_ru = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_ru = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("В"),BA.ObjectToString("П"),BA.ObjectToString("В"),BA.ObjectToString("С"),BA.ObjectToString("Ч"),BA.ObjectToString("П"),RemoteObject.createImmutable("С")})));Debug.locals.put("L_ru", _l_ru);Debug.locals.put("L_ru", _l_ru);
 BA.debugLineNum = 530;BA.debugLine="Dim L_ko As List = Array As String (\"일\",\"월\",\"화\",\"";
Debug.ShouldStop(131072);
_l_ko = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_ko = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("일"),BA.ObjectToString("월"),BA.ObjectToString("화"),BA.ObjectToString("수"),BA.ObjectToString("목"),BA.ObjectToString("금"),RemoteObject.createImmutable("토")})));Debug.locals.put("L_ko", _l_ko);Debug.locals.put("L_ko", _l_ko);
 BA.debugLineNum = 531;BA.debugLine="Dim S As String";
Debug.ShouldStop(262144);
_s = RemoteObject.createImmutable("");Debug.locals.put("S", _s);
 BA.debugLineNum = 533;BA.debugLine="If Lingua.StartsWith(\"it\") Then";
Debug.ShouldStop(1048576);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("it"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 534;BA.debugLine="S=L_it.Get(d)";
Debug.ShouldStop(2097152);
_s = BA.ObjectToString(_l_it.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 535;BA.debugLine="Else If Lingua.StartsWith(\"fr\") Then";
Debug.ShouldStop(4194304);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("fr"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 536;BA.debugLine="S=L_fr.Get(d)";
Debug.ShouldStop(8388608);
_s = BA.ObjectToString(_l_fr.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 537;BA.debugLine="Else If Lingua.StartsWith(\"ru\") Then";
Debug.ShouldStop(16777216);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ru"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 538;BA.debugLine="S=L_ru.Get(d)";
Debug.ShouldStop(33554432);
_s = BA.ObjectToString(_l_ru.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 539;BA.debugLine="Else If Lingua.StartsWith(\"es\") Then";
Debug.ShouldStop(67108864);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("es"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 540;BA.debugLine="S=L_es.Get(d-1)";
Debug.ShouldStop(134217728);
_s = BA.ObjectToString(_l_es.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_d,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 541;BA.debugLine="Else If Lingua.StartsWith(\"de\") Then";
Debug.ShouldStop(268435456);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("de"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 542;BA.debugLine="S=L_de.Get(d)";
Debug.ShouldStop(536870912);
_s = BA.ObjectToString(_l_de.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 543;BA.debugLine="Else If Lingua.StartsWith(\"pt\") Then";
Debug.ShouldStop(1073741824);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("pt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 544;BA.debugLine="S=L_pt.Get(d)";
Debug.ShouldStop(-2147483648);
_s = BA.ObjectToString(_l_pt.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 545;BA.debugLine="Else If Lingua.StartsWith(\"ko\") Then";
Debug.ShouldStop(1);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ko"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 546;BA.debugLine="S=L_ko.Get(d)";
Debug.ShouldStop(2);
_s = BA.ObjectToString(_l_ko.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }else {
 BA.debugLineNum = 548;BA.debugLine="S=L_en.Get(d)";
Debug.ShouldStop(8);
_s = BA.ObjectToString(_l_en.runMethod(false,"Get",(Object)(_d)));Debug.locals.put("S", _s);
 }}}}}}}
;
 BA.debugLineNum = 551;BA.debugLine="Return S";
Debug.ShouldStop(64);
if (true) return _s;
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nomemese(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("NomeMese (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,554);
if (RapidSub.canDelegate("nomemese")) { return __ref.runUserSub(false, "sdcalendardialog","nomemese", __ref, _m);}
RemoteObject _l_it = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_en = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_fr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_ru = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_es = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_de = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_pt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l_ko = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("M", _m);
 BA.debugLineNum = 554;BA.debugLine="private Sub NomeMese(M As Int) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 555;BA.debugLine="Dim L_it As List = Array As String (\"Gennaio\",\"Fe";
Debug.ShouldStop(1024);
_l_it = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_it = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Gennaio"),BA.ObjectToString("Febbraio"),BA.ObjectToString("Marzo"),BA.ObjectToString("Aprile"),BA.ObjectToString("Maggio"),BA.ObjectToString("Giugno"),BA.ObjectToString("Luglio"),BA.ObjectToString("Agosto"),BA.ObjectToString("Settembre"),BA.ObjectToString("Ottobre"),BA.ObjectToString("Novembre"),RemoteObject.createImmutable("Dicembre")})));Debug.locals.put("L_it", _l_it);Debug.locals.put("L_it", _l_it);
 BA.debugLineNum = 556;BA.debugLine="Dim L_en As List = Array As String (\"January\",\"Fe";
Debug.ShouldStop(2048);
_l_en = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_en = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("January"),BA.ObjectToString("February"),BA.ObjectToString("March"),BA.ObjectToString("April"),BA.ObjectToString("May"),BA.ObjectToString("June"),BA.ObjectToString("July"),BA.ObjectToString("August"),BA.ObjectToString("September"),BA.ObjectToString("October"),BA.ObjectToString("November"),RemoteObject.createImmutable("December")})));Debug.locals.put("L_en", _l_en);Debug.locals.put("L_en", _l_en);
 BA.debugLineNum = 557;BA.debugLine="Dim L_fr As List = Array As String (\"Janvier\",\"Fé";
Debug.ShouldStop(4096);
_l_fr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_fr = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Janvier"),BA.ObjectToString("Février"),BA.ObjectToString("Mars"),BA.ObjectToString("Avril"),BA.ObjectToString("mai"),BA.ObjectToString("Juin"),BA.ObjectToString("Juillet"),BA.ObjectToString("Août"),BA.ObjectToString("Septembre"),BA.ObjectToString("Octobre"),BA.ObjectToString("Novembre"),RemoteObject.createImmutable("Décembre")})));Debug.locals.put("L_fr", _l_fr);Debug.locals.put("L_fr", _l_fr);
 BA.debugLineNum = 558;BA.debugLine="Dim L_ru As List = Array As String (\"Январь\" , \"Ф";
Debug.ShouldStop(8192);
_l_ru = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_ru = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Январь"),BA.ObjectToString("Февраль"),BA.ObjectToString("Март"),BA.ObjectToString("Апрель"),BA.ObjectToString("Май"),BA.ObjectToString("Июнь"),BA.ObjectToString("Июль"),BA.ObjectToString("Август"),BA.ObjectToString("Сентябрь"),BA.ObjectToString("Октябрь"),BA.ObjectToString("Ноябрь"),RemoteObject.createImmutable("Декабрь")})));Debug.locals.put("L_ru", _l_ru);Debug.locals.put("L_ru", _l_ru);
 BA.debugLineNum = 559;BA.debugLine="Dim L_es As List = Array As String (\"Enero\" , \"Fe";
Debug.ShouldStop(16384);
_l_es = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_es = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Enero"),BA.ObjectToString("Febrero"),BA.ObjectToString("Marcha"),BA.ObjectToString("abril"),BA.ObjectToString("puede"),BA.ObjectToString("Junio​​"),BA.ObjectToString("Julio"),BA.ObjectToString("agosto"),BA.ObjectToString("Septiembre"),BA.ObjectToString("Octubre"),BA.ObjectToString("noviembre"),RemoteObject.createImmutable("diciembre")})));Debug.locals.put("L_es", _l_es);Debug.locals.put("L_es", _l_es);
 BA.debugLineNum = 560;BA.debugLine="Dim L_de As List = Array As String (\"Januar\", \"Fe";
Debug.ShouldStop(32768);
_l_de = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_de = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Januar"),BA.ObjectToString("Februar"),BA.ObjectToString("März"),BA.ObjectToString("April"),BA.ObjectToString("Mai"),BA.ObjectToString("June"),BA.ObjectToString("Juli"),BA.ObjectToString("August"),BA.ObjectToString("September"),BA.ObjectToString("October"),BA.ObjectToString("November"),RemoteObject.createImmutable("December")})));Debug.locals.put("L_de", _l_de);Debug.locals.put("L_de", _l_de);
 BA.debugLineNum = 561;BA.debugLine="Dim L_pt As List = Array As String (\"Janeiro\" , \"";
Debug.ShouldStop(65536);
_l_pt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_pt = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Janeiro"),BA.ObjectToString("fevereiro"),BA.ObjectToString("March"),BA.ObjectToString("Abril"),BA.ObjectToString("pode"),BA.ObjectToString("June"),BA.ObjectToString("Julho"),BA.ObjectToString("August"),BA.ObjectToString("September"),BA.ObjectToString("Outubro"),BA.ObjectToString("November"),RemoteObject.createImmutable("dezembro")})));Debug.locals.put("L_pt", _l_pt);Debug.locals.put("L_pt", _l_pt);
 BA.debugLineNum = 562;BA.debugLine="Dim L_ko As List = Array As String (\"1월\",\"2월\",\"3월";
Debug.ShouldStop(131072);
_l_ko = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l_ko = sdcalendardialog.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("1월"),BA.ObjectToString("2월"),BA.ObjectToString("3월"),BA.ObjectToString("4월"),BA.ObjectToString("5월"),BA.ObjectToString("6월"),BA.ObjectToString("7월"),BA.ObjectToString("8월"),BA.ObjectToString("9월"),BA.ObjectToString("10월"),BA.ObjectToString("11월"),RemoteObject.createImmutable("12월")})));Debug.locals.put("L_ko", _l_ko);Debug.locals.put("L_ko", _l_ko);
 BA.debugLineNum = 563;BA.debugLine="Dim S As String";
Debug.ShouldStop(262144);
_s = RemoteObject.createImmutable("");Debug.locals.put("S", _s);
 BA.debugLineNum = 565;BA.debugLine="If Lingua.StartsWith(\"it\") Then";
Debug.ShouldStop(1048576);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("it"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 566;BA.debugLine="S=L_it.Get(M-1)";
Debug.ShouldStop(2097152);
_s = BA.ObjectToString(_l_it.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 567;BA.debugLine="Else If Lingua.StartsWith(\"fr\") Then";
Debug.ShouldStop(4194304);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("fr"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 568;BA.debugLine="S=L_fr.Get(M-1)";
Debug.ShouldStop(8388608);
_s = BA.ObjectToString(_l_fr.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 569;BA.debugLine="Else If Lingua.StartsWith(\"ru\") Then";
Debug.ShouldStop(16777216);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ru"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 570;BA.debugLine="S=L_ru.Get(M-1)";
Debug.ShouldStop(33554432);
_s = BA.ObjectToString(_l_ru.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 571;BA.debugLine="Else If Lingua.StartsWith(\"es\") Then";
Debug.ShouldStop(67108864);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("es"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 572;BA.debugLine="S=L_es.Get(M-1)";
Debug.ShouldStop(134217728);
_s = BA.ObjectToString(_l_es.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 573;BA.debugLine="Else If Lingua.StartsWith(\"de\") Then";
Debug.ShouldStop(268435456);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("de"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 574;BA.debugLine="S=L_de.Get(M-1)";
Debug.ShouldStop(536870912);
_s = BA.ObjectToString(_l_de.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 575;BA.debugLine="Else If Lingua.StartsWith(\"pt\") Then";
Debug.ShouldStop(1073741824);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("pt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 576;BA.debugLine="S=L_pt.Get(M-1)";
Debug.ShouldStop(-2147483648);
_s = BA.ObjectToString(_l_pt.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else 
{ BA.debugLineNum = 577;BA.debugLine="Else If Lingua.StartsWith(\"ko\") Then";
Debug.ShouldStop(1);
if (__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_lingua").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ko"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 578;BA.debugLine="S=L_ko.Get(M-1)";
Debug.ShouldStop(2);
_s = BA.ObjectToString(_l_ko.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }else {
 BA.debugLineNum = 580;BA.debugLine="S=L_en.Get(M-1)";
Debug.ShouldStop(8);
_s = BA.ObjectToString(_l_en.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("S", _s);
 }}}}}}}
;
 BA.debugLineNum = 583;BA.debugLine="Return S";
Debug.ShouldStop(64);
if (true) return _s;
 BA.debugLineNum = 584;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pan_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("pan_click")) { return __ref.runUserSub(false, "sdcalendardialog","pan_click", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Private Sub Pan_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 142;BA.debugLine="Ret=0";
Debug.ShouldStop(8192);
__ref.setField ("_ret",BA.numberCast(int.class, 0));
 BA.debugLineNum = 143;BA.debugLine="If Show=DialogResponse.POSITIVE Then SetDate(Date";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_show"),BA.numberCast(double.class, sdcalendardialog.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_setdate",(Object)(__ref.getField(true,"_datepicker")));};
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
public static RemoteObject  _prevm_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrevM_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,422);
if (RapidSub.canDelegate("prevm_click")) { return __ref.runUserSub(false, "sdcalendardialog","prevm_click", __ref);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 422;BA.debugLine="Private Sub PrevM_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 423;BA.debugLine="Dim D,M,A As Int";
Debug.ShouldStop(64);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
 BA.debugLineNum = 425;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
Debug.ShouldStop(256);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("D", _d);
 BA.debugLineNum = 426;BA.debugLine="m=DateTime.GetMonth(DateRet)";
Debug.ShouldStop(512);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("M", _m);
 BA.debugLineNum = 427;BA.debugLine="a=DateTime.GetYear(DateRet)";
Debug.ShouldStop(1024);
_a = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("A", _a);
 BA.debugLineNum = 429;BA.debugLine="M=M-1";
Debug.ShouldStop(4096);
_m = RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("M", _m);
 BA.debugLineNum = 430;BA.debugLine="If M=0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_m,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 431;BA.debugLine="M=12";
Debug.ShouldStop(16384);
_m = BA.numberCast(int.class, 12);Debug.locals.put("M", _m);
 BA.debugLineNum = 432;BA.debugLine="a=a-1";
Debug.ShouldStop(32768);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 };
 BA.debugLineNum = 435;BA.debugLine="If (M=2)And(D>28) Then D=28";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_m,BA.numberCast(double.class, 2))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_d,BA.numberCast(double.class, 28)))))) { 
_d = BA.numberCast(int.class, 28);Debug.locals.put("D", _d);};
 BA.debugLineNum = 436;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_m,BA.numberCast(double.class, 30))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 4)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 6)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 9)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 11)))))) { 
_d = BA.numberCast(int.class, 30);Debug.locals.put("D", _d);};
 BA.debugLineNum = 438;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
Debug.ShouldStop(2097152);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyyy"));
 BA.debugLineNum = 439;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
Debug.ShouldStop(4194304);
__ref.setField ("_dateret",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/"),_d,RemoteObject.createImmutable("/"),_a))));
 BA.debugLineNum = 440;BA.debugLine="FillCalendar";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_fillcalendar");
 BA.debugLineNum = 441;BA.debugLine="LMounth.Text=NomeMese(M)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lmounth").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(_m))));
 BA.debugLineNum = 442;BA.debugLine="LYear.Text=a";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lyear").runMethod(true,"setText",BA.ObjectToCharSequence(_a));
 BA.debugLineNum = 443;BA.debugLine="LDay.Text=d";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lday").runMethod(true,"setText",BA.ObjectToCharSequence(_d));
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prevy_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PrevY_Click (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("prevy_click")) { return __ref.runUserSub(false, "sdcalendardialog","prevy_click", __ref);}
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
 BA.debugLineNum = 470;BA.debugLine="Private Sub PrevY_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 471;BA.debugLine="Dim D,M,A As Int";
Debug.ShouldStop(4194304);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
 BA.debugLineNum = 473;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
Debug.ShouldStop(16777216);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("D", _d);
 BA.debugLineNum = 474;BA.debugLine="m=DateTime.GetMonth(DateRet)";
Debug.ShouldStop(33554432);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("M", _m);
 BA.debugLineNum = 475;BA.debugLine="a=DateTime.GetYear(DateRet)";
Debug.ShouldStop(67108864);
_a = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_dateret")));Debug.locals.put("A", _a);
 BA.debugLineNum = 477;BA.debugLine="a=a-1";
Debug.ShouldStop(268435456);
_a = RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("A", _a);
 BA.debugLineNum = 479;BA.debugLine="If (M=2)And(D>28) Then D=28";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_m,BA.numberCast(double.class, 2))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_d,BA.numberCast(double.class, 28)))))) { 
_d = BA.numberCast(int.class, 28);Debug.locals.put("D", _d);};
 BA.debugLineNum = 480;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_m,BA.numberCast(double.class, 30))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 4)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 6)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 9)) || RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 11)))))) { 
_d = BA.numberCast(int.class, 30);Debug.locals.put("D", _d);};
 BA.debugLineNum = 482;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
Debug.ShouldStop(2);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyyy"));
 BA.debugLineNum = 483;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
Debug.ShouldStop(4);
__ref.setField ("_dateret",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/"),_d,RemoteObject.createImmutable("/"),_a))));
 BA.debugLineNum = 484;BA.debugLine="FillCalendar";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_fillcalendar");
 BA.debugLineNum = 485;BA.debugLine="LYear.Text=a";
Debug.ShouldStop(16);
__ref.getField(false,"_lyear").runMethod(true,"setText",BA.ObjectToCharSequence(_a));
 BA.debugLineNum = 486;BA.debugLine="LDay.Text=d";
Debug.ShouldStop(32);
__ref.getField(false,"_lday").runMethod(true,"setText",BA.ObjectToCharSequence(_d));
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdate(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("SetDate (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setdate")) { return __ref.runUserSub(false, "sdcalendardialog","setdate", __ref, _date);}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _can = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _m = RemoteObject.createImmutable(0);
RemoteObject _y = RemoteObject.createImmutable(0);
Debug.locals.put("Date", _date);
 BA.debugLineNum = 109;BA.debugLine="Public Sub SetDate(Date As Long)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Dim Bm As Bitmap";
Debug.ShouldStop(8192);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("Bm", _bm);
 BA.debugLineNum = 111;BA.debugLine="Dim Can As Canvas";
Debug.ShouldStop(16384);
_can = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("Can", _can);
 BA.debugLineNum = 112;BA.debugLine="Dim D,M,Y As Int";
Debug.ShouldStop(32768);
_d = RemoteObject.createImmutable(0);Debug.locals.put("D", _d);
_m = RemoteObject.createImmutable(0);Debug.locals.put("M", _m);
_y = RemoteObject.createImmutable(0);Debug.locals.put("Y", _y);
 BA.debugLineNum = 114;BA.debugLine="D=DateTime.GetDayOfMonth(Date)";
Debug.ShouldStop(131072);
_d = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date));Debug.locals.put("D", _d);
 BA.debugLineNum = 115;BA.debugLine="M=DateTime.GetMonth(Date)";
Debug.ShouldStop(262144);
_m = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date));Debug.locals.put("M", _m);
 BA.debugLineNum = 116;BA.debugLine="Y=DateTime.GetYear(Date)";
Debug.ShouldStop(524288);
_y = sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date));Debug.locals.put("Y", _y);
 BA.debugLineNum = 117;BA.debugLine="Log(M)";
Debug.ShouldStop(1048576);
sdcalendardialog.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_m)));
 BA.debugLineNum = 119;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
Debug.ShouldStop(4194304);
sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MM/dd/yyyy"));
 BA.debugLineNum = 120;BA.debugLine="DatePicker=DateTime.DateParse(m & \"/\" & d & \"/\" &";
Debug.ShouldStop(8388608);
__ref.setField ("_datepicker",sdcalendardialog.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.concat(_m,RemoteObject.createImmutable("/"),_d,RemoteObject.createImmutable("/"),_y))));
 BA.debugLineNum = 122;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
Debug.ShouldStop(33554432);
_bm.runVoidMethod ("InitializeMutable",(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 123;BA.debugLine="Can.Initialize2(Bm)";
Debug.ShouldStop(67108864);
_can.runVoidMethod ("Initialize2",(Object)((_bm.getObject())));
 BA.debugLineNum = 125;BA.debugLine="If Square Then";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_square").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
Debug.ShouldStop(536870912);
_bm.runVoidMethod ("InitializeMutable",(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 400)))));
 BA.debugLineNum = 127;BA.debugLine="Can.Initialize2(Bm)";
Debug.ShouldStop(1073741824);
_can.runVoidMethod ("Initialize2",(Object)((_bm.getObject())));
 BA.debugLineNum = 128;BA.debugLine="Can.DrawColor(Color)";
Debug.ShouldStop(-2147483648);
_can.runVoidMethod ("DrawColor",(Object)(__ref.getField(true,"_color")));
 BA.debugLineNum = 129;BA.debugLine="Can.DrawText(NomeMese(M),210dip,80dip,Typeface.D";
Debug.ShouldStop(1);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(_m))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210))))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, 60)),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 130;BA.debugLine="Can.DrawText(d,200dip,260dip,Typeface.DEFAULT_BO";
Debug.ShouldStop(2);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_d)),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 260))))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, 180)),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 131;BA.debugLine="Can.DrawText(y,200dip,350dip,Typeface.DEFAULT_BO";
Debug.ShouldStop(4);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_y)),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))))),(Object)(BA.numberCast(float.class, sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, 60)),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 132;BA.debugLine="Pan.SetBackgroundImage(Can.Bitmap)";
Debug.ShouldStop(8);
__ref.getField(false,"_pan").runVoidMethod ("SetBackgroundImageNew",(Object)((_can.runMethod(false,"getBitmap").getObject())));
 }else {
 BA.debugLineNum = 134;BA.debugLine="Pan.Background=Corner(Color)";
Debug.ShouldStop(32);
__ref.getField(false,"_pan").runMethod(false,"setBackground",(__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_corner",(Object)(__ref.getField(true,"_color"))).getObject()));
 BA.debugLineNum = 135;BA.debugLine="Can.Initialize(Pan)";
Debug.ShouldStop(64);
_can.runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_pan").getObject())));
 BA.debugLineNum = 136;BA.debugLine="Can.DrawText(d & \"-\" & NomeMese(M).SubString2(0,";
Debug.ShouldStop(128);
_can.runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_d,RemoteObject.createImmutable("-"),__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_nomemese",(Object)(_m)).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable("-"),_y)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "/+",1, 0))),(Object)(sdcalendardialog.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(BA.numberCast(float.class, __ref.getField(true,"_textsize"))),(Object)(__ref.getField(true,"_textcolor")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 };
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (sdcalendardialog) ","sdcalendardialog",12,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "sdcalendardialog","show", __ref);}
RemoteObject _tit = RemoteObject.createImmutable(0);
 BA.debugLineNum = 332;BA.debugLine="Private Sub Show As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="Dim Tit As Int = GetDeviceLayoutValues.Height - 1";
Debug.ShouldStop(4096);
_tit = RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height"),sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))}, "-",1, 1);Debug.locals.put("Tit", _tit);Debug.locals.put("Tit", _tit);
 BA.debugLineNum = 334;BA.debugLine="Pa.Color=Colors.ARGB(200,0,0,0)";
Debug.ShouldStop(8192);
__ref.getField(false,"_pa").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 336;BA.debugLine="Cale.Initialize(\"Cale\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_cale").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Cale")));
 BA.debugLineNum = 337;BA.debugLine="Cale.Color=Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_cale").runVoidMethod ("setColor",sdcalendardialog.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 339;BA.debugLine="Testa.Initialize(\"Testa\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_testa").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Testa")));
 BA.debugLineNum = 340;BA.debugLine="Testa.Color=Color";
Debug.ShouldStop(524288);
__ref.getField(false,"_testa").runVoidMethod ("setColor",__ref.getField(true,"_color"));
 BA.debugLineNum = 342;BA.debugLine="FillCalendar";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_fillcalendar");
 BA.debugLineNum = 343;BA.debugLine="FillTesta";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.sdcalendardialog.class, "_filltesta");
 BA.debugLineNum = 345;BA.debugLine="If 100%y>100%x Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),BA.numberCast(double.class, sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))))) { 
 BA.debugLineNum = 347;BA.debugLine="Pa.AddView(Testa,50%x-140dip,50%y-265dip,280dip,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_testa").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265)))}, "-",1, 1)),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 348;BA.debugLine="Pa.AddView(Cale,50%x-140dip,50%y-15dip,280dip,28";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cale").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "-",1, 1)),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))));
 BA.debugLineNum = 349;BA.debugLine="MyAct.AddView(Pa,0dip,0dip,100%x,100%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_myact").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pa").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 }else {
 BA.debugLineNum = 352;BA.debugLine="Pa.AddView(Testa,50%x-280dip,50%y-140dip,280dip,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_testa").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "-",1, 1)),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))));
 BA.debugLineNum = 353;BA.debugLine="Pa.AddView(Cale,50%x,50%y-140dip,280dip,280dip)";
Debug.ShouldStop(1);
__ref.getField(false,"_pa").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_cale").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba")),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "-",1, 1)),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))));
 BA.debugLineNum = 354;BA.debugLine="MyAct.AddView(Pa,0dip,0dip,100%x,100%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_myact").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pa").getObject())),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(sdcalendardialog.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(sdcalendardialog.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 357;BA.debugLine="Do While Ret=0";
Debug.ShouldStop(16);
while (RemoteObject.solveBoolean("=",__ref.getField(true,"_ret"),BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 358;BA.debugLine="DoEvents 'ignore";
Debug.ShouldStop(32);
sdcalendardialog.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 359;BA.debugLine="If Pa.Width<>GetDeviceLayoutValues.Width  Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_pa").runMethod(true,"getWidth"),BA.numberCast(double.class, sdcalendardialog.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width")))) { 
 BA.debugLineNum = 360;BA.debugLine="MyAct.Width=GetDeviceLayoutValues.Width";
Debug.ShouldStop(128);
__ref.getField(false,"_myact").runMethod(true,"setWidth",sdcalendardialog.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width"));
 BA.debugLineNum = 361;BA.debugLine="MyAct.Height=GetDeviceLayoutValues.Height-Tit";
Debug.ShouldStop(256);
__ref.getField(false,"_myact").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height"),_tit}, "-",1, 1));
 BA.debugLineNum = 362;BA.debugLine="Pa.Width=GetDeviceLayoutValues.Width";
Debug.ShouldStop(512);
__ref.getField(false,"_pa").runMethod(true,"setWidth",sdcalendardialog.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Width"));
 BA.debugLineNum = 363;BA.debugLine="Pa.Height=GetDeviceLayoutValues.Height-Tit";
Debug.ShouldStop(1024);
__ref.getField(false,"_pa").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {sdcalendardialog.__c.runMethod(false,"GetDeviceLayoutValues",__ref.getField(false, "ba")).getField(true,"Height"),_tit}, "-",1, 1));
 BA.debugLineNum = 365;BA.debugLine="If Pa.Height>Pa.Width Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_pa").runMethod(true,"getHeight"),BA.numberCast(double.class, __ref.getField(false,"_pa").runMethod(true,"getWidth")))) { 
 BA.debugLineNum = 367;BA.debugLine="Testa.Left=Pa.Width/2-140dip";
Debug.ShouldStop(16384);
__ref.getField(false,"_testa").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "/-",1, 0)));
 BA.debugLineNum = 368;BA.debugLine="Testa.Top=Pa.Height/2-265dip";
Debug.ShouldStop(32768);
__ref.getField(false,"_testa").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 265)))}, "/-",1, 0)));
 BA.debugLineNum = 369;BA.debugLine="Testa.Height=250dip";
Debug.ShouldStop(65536);
__ref.getField(false,"_testa").runMethod(true,"setHeight",sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 370;BA.debugLine="Cale.Left=Pa.Width/2-140dip";
Debug.ShouldStop(131072);
__ref.getField(false,"_cale").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "/-",1, 0)));
 BA.debugLineNum = 371;BA.debugLine="Cale.Top=Pa.Height/2-15dip";
Debug.ShouldStop(262144);
__ref.getField(false,"_cale").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "/-",1, 0)));
 }else {
 BA.debugLineNum = 374;BA.debugLine="Testa.Left=Pa.Width/2-280dip";
Debug.ShouldStop(2097152);
__ref.getField(false,"_testa").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getWidth"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))}, "/-",1, 0)));
 BA.debugLineNum = 375;BA.debugLine="Testa.Top=Pa.Height/2-140dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_testa").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "/-",1, 0)));
 BA.debugLineNum = 376;BA.debugLine="Testa.Height=280dip";
Debug.ShouldStop(8388608);
__ref.getField(false,"_testa").runMethod(true,"setHeight",sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280))));
 BA.debugLineNum = 377;BA.debugLine="Cale.Left=Pa.Width/2";
Debug.ShouldStop(16777216);
__ref.getField(false,"_cale").runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 378;BA.debugLine="Cale.Top=Pa.Height/2-140dip";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cale").runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pa").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),sdcalendardialog.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "/-",1, 0)));
 };
 };
 }
;
 BA.debugLineNum = 383;BA.debugLine="Pa.RemoveView";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pa").runVoidMethod ("RemoveView");
 BA.debugLineNum = 384;BA.debugLine="Return Ret";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(true,"_ret");
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}