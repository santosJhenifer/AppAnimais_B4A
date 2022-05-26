package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sdcalendardialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.sdcalendardialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.sdcalendardialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public long _datepicker = 0L;
public int _color = 0;
public int _textcolor = 0;
public int _textsize = 0;
public String _title = "";
public boolean _square = false;
public String _eventname = "";
public Object _callback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _pa = null;
public anywheresoftware.b4a.objects.PanelWrapper _pan = null;
public anywheresoftware.b4a.objects.PanelWrapper _myact = null;
public long _dateret = 0L;
public int _ret = 0;
public anywheresoftware.b4a.objects.PanelWrapper _cale = null;
public anywheresoftware.b4a.objects.PanelWrapper _testa = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonok = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttocancel = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnow = null;
public anywheresoftware.b4a.objects.LabelWrapper _lday = null;
public anywheresoftware.b4a.objects.LabelWrapper _lyear = null;
public anywheresoftware.b4a.objects.LabelWrapper _lmounth = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_caddesap _tela_caddesap = null;
public b4a.example.tela_editarpet _tela_editarpet = null;
public b4a.example.tela_cadusu _tela_cadusu = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_vizdesap _tela_vizdesap = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_editarperfil _tela_editarperfil = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public String  _buttoncancel_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "buttoncancel_click"))
	 {return ((String) Debug.delegate(ba, "buttoncancel_click", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="private Sub ButtonCancel_Click";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Ret=DialogResponse.NEGATIVE";
__ref._ret = __c.DialogResponse.NEGATIVE;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return "";
}
public String  _buttonok_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "buttonok_click"))
	 {return ((String) Debug.delegate(ba, "buttonok_click", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="private Sub ButtonOk_Click";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="DatePicker=DateRet";
__ref._datepicker = __ref._dateret;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Ret=DialogResponse.POSITIVE";
__ref._ret = __c.DialogResponse.POSITIVE;
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="If SubExists(CallBack,EventName & \"_Click\") Then";
if (__c.SubExists(ba,__ref._callback,__ref._eventname+"_Click")) { 
__c.CallSubNew(ba,__ref._callback,__ref._eventname+"_Click");};
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Public DatePicker As Long";
_datepicker = 0L;
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Public Color As Int = Colors.RGB(0,150,136)";
_color = __c.Colors.RGB((int) (0),(int) (150),(int) (136));
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Public TextColor As Int = Colors.White";
_textcolor = __c.Colors.White;
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="Public TextSize As Int = 16";
_textsize = (int) (16);
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Public Title As String = \"\"";
_title = "";
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="Public Square As Boolean = True";
_square = __c.True;
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Private EventName As String 'ignore";
_eventname = "";
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="Private CallBack As Object 'ignore";
_callback = new Object();
RDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="Private Pa As Panel";
_pa = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="Private Pan As Panel";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9961485;
 //BA.debugLineNum = 9961485;BA.debugLine="Private MyAct As Panel";
_myact = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9961487;
 //BA.debugLineNum = 9961487;BA.debugLine="Private DateRet As Long = 0";
_dateret = (long) (0);
RDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="Private Ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=9961490;
 //BA.debugLineNum = 9961490;BA.debugLine="Private Cale As Panel";
_cale = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9961491;
 //BA.debugLineNum = 9961491;BA.debugLine="Private Testa As Panel";
_testa = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9961492;
 //BA.debugLineNum = 9961492;BA.debugLine="Private ButtonOk As Button";
_buttonok = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=9961493;
 //BA.debugLineNum = 9961493;BA.debugLine="Private ButtoCancel As Button";
_buttocancel = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=9961494;
 //BA.debugLineNum = 9961494;BA.debugLine="Private LabelNow As Label";
_labelnow = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9961495;
 //BA.debugLineNum = 9961495;BA.debugLine="Private LDay As Label";
_lday = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9961496;
 //BA.debugLineNum = 9961496;BA.debugLine="Private LYear As Label";
_lyear = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9961497;
 //BA.debugLineNum = 9961497;BA.debugLine="Private LMounth As Label";
_lmounth = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9961498;
 //BA.debugLineNum = 9961498;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.ColorDrawable  _corner(b4a.example.sdcalendardialog __ref,int _colore) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "corner"))
	 {return ((anywheresoftware.b4a.objects.drawable.ColorDrawable) Debug.delegate(ba, "corner", new Object[] {_colore}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdb = null;
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="private Sub Corner(Colore As Int) As ColorDrawable";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim cdb As ColorDrawable";
_cdb = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="cdb.Initialize(Colore, 20dip)";
_cdb.Initialize(_colore,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Return cdb";
if (true) return _cdb;
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(b4a.example.sdcalendardialog __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _can = null;
int _d = 0;
int _m = 0;
int _y = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _obj = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim Bm As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim Can As Canvas";
_can = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="Dim D,M,Y As Int";
_d = 0;
_m = 0;
_y = 0;
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="mBase.Color=Colors.Transparent";
__ref._mbase.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="Dim Obj As View = mBase";
_obj = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_obj.setObject((android.view.View)(__ref._mbase.getObject()));
RDebugUtils.currentLine=10092554;
 //BA.debugLineNum = 10092554;BA.debugLine="Do While Not(GetType(Obj) = \"android.widget.Frame";
while (__c.Not((__c.GetType((Object)(_obj.getObject()))).equals("android.widget.FrameLayout"))) {
RDebugUtils.currentLine=10092555;
 //BA.debugLineNum = 10092555;BA.debugLine="Obj=Obj.Parent";
_obj.setObject((android.view.View)(_obj.getParent()));
 }
;
RDebugUtils.currentLine=10092557;
 //BA.debugLineNum = 10092557;BA.debugLine="MyAct=Obj";
__ref._myact.setObject((android.view.ViewGroup)(_obj.getObject()));
RDebugUtils.currentLine=10092560;
 //BA.debugLineNum = 10092560;BA.debugLine="Pan.Initialize(\"Pan\")";
__ref._pan.Initialize(ba,"Pan");
RDebugUtils.currentLine=10092561;
 //BA.debugLineNum = 10092561;BA.debugLine="mBase.AddView(Pan,0dip,0dip,mBase.Width,mBase.Hei";
__ref._mbase.AddView((android.view.View)(__ref._pan.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__ref._mbase.getWidth(),__ref._mbase.getHeight());
RDebugUtils.currentLine=10092564;
 //BA.debugLineNum = 10092564;BA.debugLine="If Props.ContainsKey(\"TextColor\") Then TextColor=";
if (_props.ContainsKey((Object)("TextColor"))) { 
__ref._textcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("TextColor"))));};
RDebugUtils.currentLine=10092565;
 //BA.debugLineNum = 10092565;BA.debugLine="If Props.ContainsKey(\"TextSize\") Then TextSize=Pr";
if (_props.ContainsKey((Object)("TextSize"))) { 
__ref._textsize = (int)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));};
RDebugUtils.currentLine=10092566;
 //BA.debugLineNum = 10092566;BA.debugLine="If Props.ContainsKey(\"Color\") Then Color=Props.Ge";
if (_props.ContainsKey((Object)("Color"))) { 
__ref._color = (int)(BA.ObjectToNumber(_props.Get((Object)("Color"))));};
RDebugUtils.currentLine=10092567;
 //BA.debugLineNum = 10092567;BA.debugLine="If Props.ContainsKey(\"DayOfMounth\") Then d=Props.";
if (_props.ContainsKey((Object)("DayOfMounth"))) { 
_d = (int)(BA.ObjectToNumber(_props.Get((Object)("DayOfMounth"))));};
RDebugUtils.currentLine=10092568;
 //BA.debugLineNum = 10092568;BA.debugLine="If Props.ContainsKey(\"Mounth\") Then m=Props.Get(\"";
if (_props.ContainsKey((Object)("Mounth"))) { 
_m = (int)(BA.ObjectToNumber(_props.Get((Object)("Mounth"))));};
RDebugUtils.currentLine=10092569;
 //BA.debugLineNum = 10092569;BA.debugLine="If Props.ContainsKey(\"Year\") Then y=Props.Get(\"Ye";
if (_props.ContainsKey((Object)("Year"))) { 
_y = (int)(BA.ObjectToNumber(_props.Get((Object)("Year"))));};
RDebugUtils.currentLine=10092570;
 //BA.debugLineNum = 10092570;BA.debugLine="If Props.ContainsKey(\"Title\") Then Title=Props.Ge";
if (_props.ContainsKey((Object)("Title"))) { 
__ref._title = BA.ObjectToString(_props.Get((Object)("Title")));};
RDebugUtils.currentLine=10092571;
 //BA.debugLineNum = 10092571;BA.debugLine="If Props.ContainsKey(\"Square\") Then Square=Props.";
if (_props.ContainsKey((Object)("Square"))) { 
__ref._square = BA.ObjectToBoolean(_props.Get((Object)("Square")));};
RDebugUtils.currentLine=10092573;
 //BA.debugLineNum = 10092573;BA.debugLine="If Props.ContainsKey(\"Now\") Then";
if (_props.ContainsKey((Object)("Now"))) { 
RDebugUtils.currentLine=10092574;
 //BA.debugLineNum = 10092574;BA.debugLine="If Props.Get(\"Now\")=True Then";
if ((_props.Get((Object)("Now"))).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=10092575;
 //BA.debugLineNum = 10092575;BA.debugLine="DatePicker=DateTime.Now";
__ref._datepicker = __c.DateTime.getNow();
RDebugUtils.currentLine=10092576;
 //BA.debugLineNum = 10092576;BA.debugLine="D=DateTime.GetDayOfMonth(DatePicker)";
_d = __c.DateTime.GetDayOfMonth(__ref._datepicker);
RDebugUtils.currentLine=10092577;
 //BA.debugLineNum = 10092577;BA.debugLine="M=DateTime.GetMonth(DatePicker)";
_m = __c.DateTime.GetMonth(__ref._datepicker);
RDebugUtils.currentLine=10092578;
 //BA.debugLineNum = 10092578;BA.debugLine="Y=DateTime.GetYear(DatePicker)";
_y = __c.DateTime.GetYear(__ref._datepicker);
 }else {
RDebugUtils.currentLine=10092580;
 //BA.debugLineNum = 10092580;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyyy");
RDebugUtils.currentLine=10092581;
 //BA.debugLineNum = 10092581;BA.debugLine="DatePicker=DateTime.DateParse(m & \"/\" & d & \"/\"";
__ref._datepicker = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_y));
 };
 };
RDebugUtils.currentLine=10092585;
 //BA.debugLineNum = 10092585;BA.debugLine="DateRet=DatePicker";
__ref._dateret = __ref._datepicker;
RDebugUtils.currentLine=10092587;
 //BA.debugLineNum = 10092587;BA.debugLine="If Square Then";
if (__ref._square) { 
RDebugUtils.currentLine=10092588;
 //BA.debugLineNum = 10092588;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
_bm.InitializeMutable(__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=10092589;
 //BA.debugLineNum = 10092589;BA.debugLine="Can.Initialize2(Bm)";
_can.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
RDebugUtils.currentLine=10092590;
 //BA.debugLineNum = 10092590;BA.debugLine="Can.DrawColor(Color)";
_can.DrawColor(__ref._color);
RDebugUtils.currentLine=10092591;
 //BA.debugLineNum = 10092591;BA.debugLine="Can.DrawText(NomeMese(M),210dip,80dip,Typeface.D";
_can.DrawText(ba,__ref._nomemese(null,_m),(float) (__c.DipToCurrent((int) (210))),(float) (__c.DipToCurrent((int) (80))),__c.Typeface.DEFAULT_BOLD,(float) (60),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=10092592;
 //BA.debugLineNum = 10092592;BA.debugLine="Can.DrawText(d,200dip,260dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_d),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (260))),__c.Typeface.DEFAULT_BOLD,(float) (180),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=10092593;
 //BA.debugLineNum = 10092593;BA.debugLine="Can.DrawText(y,200dip,350dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_y),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (350))),__c.Typeface.DEFAULT_BOLD,(float) (60),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=10092594;
 //BA.debugLineNum = 10092594;BA.debugLine="Pan.SetBackgroundImage(Can.Bitmap)";
__ref._pan.SetBackgroundImageNew((android.graphics.Bitmap)(_can.getBitmap().getObject()));
 }else {
RDebugUtils.currentLine=10092596;
 //BA.debugLineNum = 10092596;BA.debugLine="Pan.Background=Corner(Color)";
__ref._pan.setBackground((android.graphics.drawable.Drawable)(__ref._corner(null,__ref._color).getObject()));
RDebugUtils.currentLine=10092597;
 //BA.debugLineNum = 10092597;BA.debugLine="Can.Initialize(Pan)";
_can.Initialize((android.view.View)(__ref._pan.getObject()));
RDebugUtils.currentLine=10092598;
 //BA.debugLineNum = 10092598;BA.debugLine="Can.DrawText(d & \"-\" & NomeMese(M).SubString2(0,";
_can.DrawText(ba,BA.NumberToString(_d)+"-"+__ref._nomemese(null,_m).substring((int) (0),(int) (3))+"-"+BA.NumberToString(_y),(float) (__ref._mbase.getWidth()/(double)2),(float) (__ref._mbase.getHeight()/(double)2+__c.DipToCurrent((int) (5))),__c.Typeface.DEFAULT_BOLD,(float) (__ref._textsize),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
RDebugUtils.currentLine=10092601;
 //BA.debugLineNum = 10092601;BA.debugLine="End Sub";
return "";
}
public String  _nomemese(b4a.example.sdcalendardialog __ref,int _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "nomemese"))
	 {return ((String) Debug.delegate(ba, "nomemese", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.List _l_it = null;
anywheresoftware.b4a.objects.collections.List _l_en = null;
anywheresoftware.b4a.objects.collections.List _l_fr = null;
anywheresoftware.b4a.objects.collections.List _l_ru = null;
anywheresoftware.b4a.objects.collections.List _l_es = null;
anywheresoftware.b4a.objects.collections.List _l_de = null;
anywheresoftware.b4a.objects.collections.List _l_pt = null;
anywheresoftware.b4a.objects.collections.List _l_ko = null;
String _s = "";
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="private Sub NomeMese(M As Int) As String";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Dim L_it As List = Array As String (\"Gennaio\",\"Fe";
_l_it = new anywheresoftware.b4a.objects.collections.List();
_l_it = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"});
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Dim L_en As List = Array As String (\"January\",\"Fe";
_l_en = new anywheresoftware.b4a.objects.collections.List();
_l_en = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"});
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Dim L_fr As List = Array As String (\"Janvier\",\"Fé";
_l_fr = new anywheresoftware.b4a.objects.collections.List();
_l_fr = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Janvier","Février","Mars","Avril","mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"});
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Dim L_ru As List = Array As String (\"Январь\" , \"Ф";
_l_ru = new anywheresoftware.b4a.objects.collections.List();
_l_ru = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"});
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Dim L_es As List = Array As String (\"Enero\" , \"Fe";
_l_es = new anywheresoftware.b4a.objects.collections.List();
_l_es = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Enero","Febrero","Marcha","abril","puede","Junio​​","Julio","agosto","Septiembre","Octubre","noviembre","diciembre"});
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Dim L_de As List = Array As String (\"Januar\", \"Fe";
_l_de = new anywheresoftware.b4a.objects.collections.List();
_l_de = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Januar","Februar","März","April","Mai","June","Juli","August","September","October","November","December"});
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="Dim L_pt As List = Array As String (\"Janeiro\" , \"";
_l_pt = new anywheresoftware.b4a.objects.collections.List();
_l_pt = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Janeiro","fevereiro","March","Abril","pode","June","Julho","August","September","Outubro","November","dezembro"});
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim L_ko As List = Array As String (\"1월\",\"2월\",\"3월";
_l_ko = new anywheresoftware.b4a.objects.collections.List();
_l_ko = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"});
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Dim S As String";
_s = "";
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="If Lingua.StartsWith(\"it\") Then";
if (__ref._lingua(null).startsWith("it")) { 
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="S=L_it.Get(M-1)";
_s = BA.ObjectToString(_l_it.Get((int) (_m-1)));
 }else 
{RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="Else If Lingua.StartsWith(\"fr\") Then";
if (__ref._lingua(null).startsWith("fr")) { 
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="S=L_fr.Get(M-1)";
_s = BA.ObjectToString(_l_fr.Get((int) (_m-1)));
 }else 
{RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="Else If Lingua.StartsWith(\"ru\") Then";
if (__ref._lingua(null).startsWith("ru")) { 
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="S=L_ru.Get(M-1)";
_s = BA.ObjectToString(_l_ru.Get((int) (_m-1)));
 }else 
{RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="Else If Lingua.StartsWith(\"es\") Then";
if (__ref._lingua(null).startsWith("es")) { 
RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="S=L_es.Get(M-1)";
_s = BA.ObjectToString(_l_es.Get((int) (_m-1)));
 }else 
{RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="Else If Lingua.StartsWith(\"de\") Then";
if (__ref._lingua(null).startsWith("de")) { 
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="S=L_de.Get(M-1)";
_s = BA.ObjectToString(_l_de.Get((int) (_m-1)));
 }else 
{RDebugUtils.currentLine=11206677;
 //BA.debugLineNum = 11206677;BA.debugLine="Else If Lingua.StartsWith(\"pt\") Then";
if (__ref._lingua(null).startsWith("pt")) { 
RDebugUtils.currentLine=11206678;
 //BA.debugLineNum = 11206678;BA.debugLine="S=L_pt.Get(M-1)";
_s = BA.ObjectToString(_l_pt.Get((int) (_m-1)));
 }else 
{RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="Else If Lingua.StartsWith(\"ko\") Then";
if (__ref._lingua(null).startsWith("ko")) { 
RDebugUtils.currentLine=11206680;
 //BA.debugLineNum = 11206680;BA.debugLine="S=L_ko.Get(M-1)";
_s = BA.ObjectToString(_l_ko.Get((int) (_m-1)));
 }else {
RDebugUtils.currentLine=11206682;
 //BA.debugLineNum = 11206682;BA.debugLine="S=L_en.Get(M-1)";
_s = BA.ObjectToString(_l_en.Get((int) (_m-1)));
 }}}}}}}
;
RDebugUtils.currentLine=11206685;
 //BA.debugLineNum = 11206685;BA.debugLine="Return S";
if (true) return _s;
RDebugUtils.currentLine=11206686;
 //BA.debugLineNum = 11206686;BA.debugLine="End Sub";
return "";
}
public String  _fillcalendar(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "fillcalendar"))
	 {return ((String) Debug.delegate(ba, "fillcalendar", null));}
int _gday = 0;
int _d = 0;
int _m = 0;
int _a = 0;
int _y = 0;
int _x = 0;
long _datestart = 0L;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lab = null;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="private Sub FillCalendar";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Dim GDay,D,M,A,Y,X As Int";
_gday = 0;
_d = 0;
_m = 0;
_a = 0;
_y = 0;
_x = 0;
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Dim DateStart As Long";
_datestart = 0L;
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Cale.RemoveAllViews";
__ref._cale.RemoveAllViews();
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(__ref._dateret);
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(__ref._dateret);
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(__ref._dateret);
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="GDay=DateTime.GetDayOfWeek(DateRet)";
_gday = __c.DateTime.GetDayOfWeek(__ref._dateret);
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyy\"";
__c.DateTime.setDateFormat("MM/dd/yyy");
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="DateStart=DateTime.DateParse(M & \"/01/\" & A)";
_datestart = __c.DateTime.DateParse(BA.NumberToString(_m)+"/01/"+BA.NumberToString(_a));
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyy\"";
__c.DateTime.setDateFormat("MM/dd/yyy");
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="GDay=DateTime.GetDayOfWeek(DateTime.DateParse(M &";
_gday = __c.DateTime.GetDayOfWeek(__c.DateTime.DateParse(BA.NumberToString(_m)+"/01/"+BA.NumberToString(_a)));
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="For i=0 To 6";
{
final int step12 = 1;
final int limit12 = (int) (6);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="Dim Lab As Label";
_lab = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="Lab.Initialize(\"\")";
_lab.Initialize(ba,"");
RDebugUtils.currentLine=10420244;
 //BA.debugLineNum = 10420244;BA.debugLine="Lab.Text=NomeGiorno(i)";
_lab.setText(BA.ObjectToCharSequence(__ref._nomegiorno(null,_i)));
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="Lab.Color=Colors.Transparent";
_lab.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="If i=0 Then Lab.Textcolor=Colors.Red Else Lab.Te";
if (_i==0) { 
_lab.setTextColor(__c.Colors.Red);}
else {
_lab.setTextColor(__c.Colors.Black);};
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="Lab.Gravity=Gravity.CENTER";
_lab.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="Lab.Typeface=Typeface.DEFAULT_BOLD";
_lab.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="Lab.TextSize=14";
_lab.setTextSize((float) (14));
RDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="Cale.AddView(Lab,i*40dip,0dip,40dip,40dip)";
__ref._cale.AddView((android.view.View)(_lab.getObject()),(int) (_i*__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
 }
};
RDebugUtils.currentLine=10420253;
 //BA.debugLineNum = 10420253;BA.debugLine="Y=40dip";
_y = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=10420254;
 //BA.debugLineNum = 10420254;BA.debugLine="X=(GDay-1)*40dip";
_x = (int) ((_gday-1)*__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10420255;
 //BA.debugLineNum = 10420255;BA.debugLine="For i=1 To 31";
{
final int step25 = 1;
final int limit25 = (int) (31);
_i = (int) (1) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=10420256;
 //BA.debugLineNum = 10420256;BA.debugLine="If DateTime.GetMonth(DateStart)=m Then";
if (__c.DateTime.GetMonth(_datestart)==_m) { 
RDebugUtils.currentLine=10420257;
 //BA.debugLineNum = 10420257;BA.debugLine="Dim Lab As Label";
_lab = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10420259;
 //BA.debugLineNum = 10420259;BA.debugLine="Lab.Initialize(\"Giorno\")";
_lab.Initialize(ba,"Giorno");
RDebugUtils.currentLine=10420260;
 //BA.debugLineNum = 10420260;BA.debugLine="If d=i Then";
if (_d==_i) { 
RDebugUtils.currentLine=10420261;
 //BA.debugLineNum = 10420261;BA.debugLine="Lab.Background=Corner(Color)";
_lab.setBackground((android.graphics.drawable.Drawable)(__ref._corner(null,__ref._color).getObject()));
RDebugUtils.currentLine=10420262;
 //BA.debugLineNum = 10420262;BA.debugLine="Lab.Textcolor=Colors.White";
_lab.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10420263;
 //BA.debugLineNum = 10420263;BA.debugLine="LabelNow=Lab";
__ref._labelnow = _lab;
 }else {
RDebugUtils.currentLine=10420265;
 //BA.debugLineNum = 10420265;BA.debugLine="Lab.Color=Colors.Transparent";
_lab.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10420266;
 //BA.debugLineNum = 10420266;BA.debugLine="Lab.TextColor=Colors.Black";
_lab.setTextColor(__c.Colors.Black);
 };
RDebugUtils.currentLine=10420268;
 //BA.debugLineNum = 10420268;BA.debugLine="Lab.Text=i";
_lab.setText(BA.ObjectToCharSequence(_i));
RDebugUtils.currentLine=10420269;
 //BA.debugLineNum = 10420269;BA.debugLine="Lab.Tag=DateStart";
_lab.setTag((Object)(_datestart));
RDebugUtils.currentLine=10420270;
 //BA.debugLineNum = 10420270;BA.debugLine="Lab.Gravity=Gravity.CENTER";
_lab.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10420271;
 //BA.debugLineNum = 10420271;BA.debugLine="Lab.TextSize=14";
_lab.setTextSize((float) (14));
RDebugUtils.currentLine=10420272;
 //BA.debugLineNum = 10420272;BA.debugLine="Cale.AddView(Lab,X,Y,40dip,40dip)";
__ref._cale.AddView((android.view.View)(_lab.getObject()),_x,_y,__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10420274;
 //BA.debugLineNum = 10420274;BA.debugLine="GDay=GDay+1";
_gday = (int) (_gday+1);
RDebugUtils.currentLine=10420275;
 //BA.debugLineNum = 10420275;BA.debugLine="If GDay>7 Then";
if (_gday>7) { 
RDebugUtils.currentLine=10420276;
 //BA.debugLineNum = 10420276;BA.debugLine="GDay=1";
_gday = (int) (1);
RDebugUtils.currentLine=10420277;
 //BA.debugLineNum = 10420277;BA.debugLine="Y=Y+35dip";
_y = (int) (_y+__c.DipToCurrent((int) (35)));
RDebugUtils.currentLine=10420278;
 //BA.debugLineNum = 10420278;BA.debugLine="X=0dip";
_x = __c.DipToCurrent((int) (0));
 }else {
RDebugUtils.currentLine=10420280;
 //BA.debugLineNum = 10420280;BA.debugLine="X=X+40dip";
_x = (int) (_x+__c.DipToCurrent((int) (40)));
 };
 };
RDebugUtils.currentLine=10420284;
 //BA.debugLineNum = 10420284;BA.debugLine="DateStart=DateStart + DateTime.TicksPerDay";
_datestart = (long) (_datestart+__c.DateTime.TicksPerDay);
 }
};
RDebugUtils.currentLine=10420288;
 //BA.debugLineNum = 10420288;BA.debugLine="ButtonOk.Initialize(\"ButtonOk\")";
__ref._buttonok.Initialize(ba,"ButtonOk");
RDebugUtils.currentLine=10420289;
 //BA.debugLineNum = 10420289;BA.debugLine="ButtonOk.Color=Colors.Transparent";
__ref._buttonok.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10420290;
 //BA.debugLineNum = 10420290;BA.debugLine="ButtonOk.TextColor=Color";
__ref._buttonok.setTextColor(__ref._color);
RDebugUtils.currentLine=10420291;
 //BA.debugLineNum = 10420291;BA.debugLine="ButtonOk.Gravity=Gravity.CENTER";
__ref._buttonok.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10420292;
 //BA.debugLineNum = 10420292;BA.debugLine="ButtonOk.Typeface=Typeface.DEFAULT_BOLD";
__ref._buttonok.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=10420293;
 //BA.debugLineNum = 10420293;BA.debugLine="ButtonOk.Text=\"OK\"";
__ref._buttonok.setText(BA.ObjectToCharSequence("OK"));
RDebugUtils.currentLine=10420294;
 //BA.debugLineNum = 10420294;BA.debugLine="ButtonOk.Textsize=14";
__ref._buttonok.setTextSize((float) (14));
RDebugUtils.currentLine=10420295;
 //BA.debugLineNum = 10420295;BA.debugLine="Cale.AddView(ButtonOk,140dip,240dip,140dip,40dip)";
__ref._cale.AddView((android.view.View)(__ref._buttonok.getObject()),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10420297;
 //BA.debugLineNum = 10420297;BA.debugLine="ButtoCancel.Initialize(\"ButtonCancel\")";
__ref._buttocancel.Initialize(ba,"ButtonCancel");
RDebugUtils.currentLine=10420298;
 //BA.debugLineNum = 10420298;BA.debugLine="ButtoCancel.Color=Colors.Transparent";
__ref._buttocancel.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10420299;
 //BA.debugLineNum = 10420299;BA.debugLine="ButtoCancel.TextColor=Color";
__ref._buttocancel.setTextColor(__ref._color);
RDebugUtils.currentLine=10420300;
 //BA.debugLineNum = 10420300;BA.debugLine="ButtoCancel.Gravity=Gravity.CENTER";
__ref._buttocancel.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10420301;
 //BA.debugLineNum = 10420301;BA.debugLine="ButtoCancel.Typeface=Typeface.DEFAULT_BOLD";
__ref._buttocancel.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=10420302;
 //BA.debugLineNum = 10420302;BA.debugLine="ButtoCancel.Text=\"CANCEL\"";
__ref._buttocancel.setText(BA.ObjectToCharSequence("CANCEL"));
RDebugUtils.currentLine=10420303;
 //BA.debugLineNum = 10420303;BA.debugLine="ButtoCancel.Textsize=14";
__ref._buttocancel.setTextSize((float) (14));
RDebugUtils.currentLine=10420304;
 //BA.debugLineNum = 10420304;BA.debugLine="Cale.AddView(ButtoCancel,0dip,240dip,140dip,40dip";
__ref._cale.AddView((android.view.View)(__ref._buttocancel.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (140)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10420305;
 //BA.debugLineNum = 10420305;BA.debugLine="End Sub";
return "";
}
public String  _nomegiorno(b4a.example.sdcalendardialog __ref,int _d) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "nomegiorno"))
	 {return ((String) Debug.delegate(ba, "nomegiorno", new Object[] {_d}));}
anywheresoftware.b4a.objects.collections.List _l_it = null;
anywheresoftware.b4a.objects.collections.List _l_en = null;
anywheresoftware.b4a.objects.collections.List _l_es = null;
anywheresoftware.b4a.objects.collections.List _l_fr = null;
anywheresoftware.b4a.objects.collections.List _l_de = null;
anywheresoftware.b4a.objects.collections.List _l_pt = null;
anywheresoftware.b4a.objects.collections.List _l_ru = null;
anywheresoftware.b4a.objects.collections.List _l_ko = null;
String _s = "";
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="private Sub NomeGiorno(D As Int) As String";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim L_it As List = Array As String (\"D\",\"L\",\"M\",\"";
_l_it = new anywheresoftware.b4a.objects.collections.List();
_l_it = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","L","M","M","G","V","S"});
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim L_en As List = Array As String (\"S\",\"M\",\"T\",\"";
_l_en = new anywheresoftware.b4a.objects.collections.List();
_l_en = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"S","M","T","W","T","F","S"});
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Dim L_es As List = Array As String (\"D\",\"L\",\"M\",\"";
_l_es = new anywheresoftware.b4a.objects.collections.List();
_l_es = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","L","M","M","J","V","S"});
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Dim L_fr As List = Array As String (\"D\",\"L\",\"M\",\"";
_l_fr = new anywheresoftware.b4a.objects.collections.List();
_l_fr = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","L","M","M","J","V","S"});
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="Dim L_de As List = Array As String (\"S\",\"M\",\"D\",\"";
_l_de = new anywheresoftware.b4a.objects.collections.List();
_l_de = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"S","M","D","M","D","F","S"});
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="Dim L_pt As List = Array As String (\"D\",\"S\",\"T\",\"";
_l_pt = new anywheresoftware.b4a.objects.collections.List();
_l_pt = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"D","S","T","Q","Q","S","S"});
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="Dim L_ru As List = Array As String (\"В\",\"П\",\"В\",\"";
_l_ru = new anywheresoftware.b4a.objects.collections.List();
_l_ru = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"В","П","В","С","Ч","П","С"});
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Dim L_ko As List = Array As String (\"일\",\"월\",\"화\",\"";
_l_ko = new anywheresoftware.b4a.objects.collections.List();
_l_ko = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"일","월","화","수","목","금","토"});
RDebugUtils.currentLine=11141129;
 //BA.debugLineNum = 11141129;BA.debugLine="Dim S As String";
_s = "";
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="If Lingua.StartsWith(\"it\") Then";
if (__ref._lingua(null).startsWith("it")) { 
RDebugUtils.currentLine=11141132;
 //BA.debugLineNum = 11141132;BA.debugLine="S=L_it.Get(d)";
_s = BA.ObjectToString(_l_it.Get(_d));
 }else 
{RDebugUtils.currentLine=11141133;
 //BA.debugLineNum = 11141133;BA.debugLine="Else If Lingua.StartsWith(\"fr\") Then";
if (__ref._lingua(null).startsWith("fr")) { 
RDebugUtils.currentLine=11141134;
 //BA.debugLineNum = 11141134;BA.debugLine="S=L_fr.Get(d)";
_s = BA.ObjectToString(_l_fr.Get(_d));
 }else 
{RDebugUtils.currentLine=11141135;
 //BA.debugLineNum = 11141135;BA.debugLine="Else If Lingua.StartsWith(\"ru\") Then";
if (__ref._lingua(null).startsWith("ru")) { 
RDebugUtils.currentLine=11141136;
 //BA.debugLineNum = 11141136;BA.debugLine="S=L_ru.Get(d)";
_s = BA.ObjectToString(_l_ru.Get(_d));
 }else 
{RDebugUtils.currentLine=11141137;
 //BA.debugLineNum = 11141137;BA.debugLine="Else If Lingua.StartsWith(\"es\") Then";
if (__ref._lingua(null).startsWith("es")) { 
RDebugUtils.currentLine=11141138;
 //BA.debugLineNum = 11141138;BA.debugLine="S=L_es.Get(d-1)";
_s = BA.ObjectToString(_l_es.Get((int) (_d-1)));
 }else 
{RDebugUtils.currentLine=11141139;
 //BA.debugLineNum = 11141139;BA.debugLine="Else If Lingua.StartsWith(\"de\") Then";
if (__ref._lingua(null).startsWith("de")) { 
RDebugUtils.currentLine=11141140;
 //BA.debugLineNum = 11141140;BA.debugLine="S=L_de.Get(d)";
_s = BA.ObjectToString(_l_de.Get(_d));
 }else 
{RDebugUtils.currentLine=11141141;
 //BA.debugLineNum = 11141141;BA.debugLine="Else If Lingua.StartsWith(\"pt\") Then";
if (__ref._lingua(null).startsWith("pt")) { 
RDebugUtils.currentLine=11141142;
 //BA.debugLineNum = 11141142;BA.debugLine="S=L_pt.Get(d)";
_s = BA.ObjectToString(_l_pt.Get(_d));
 }else 
{RDebugUtils.currentLine=11141143;
 //BA.debugLineNum = 11141143;BA.debugLine="Else If Lingua.StartsWith(\"ko\") Then";
if (__ref._lingua(null).startsWith("ko")) { 
RDebugUtils.currentLine=11141144;
 //BA.debugLineNum = 11141144;BA.debugLine="S=L_ko.Get(d)";
_s = BA.ObjectToString(_l_ko.Get(_d));
 }else {
RDebugUtils.currentLine=11141146;
 //BA.debugLineNum = 11141146;BA.debugLine="S=L_en.Get(d)";
_s = BA.ObjectToString(_l_en.Get(_d));
 }}}}}}}
;
RDebugUtils.currentLine=11141149;
 //BA.debugLineNum = 11141149;BA.debugLine="Return S";
if (true) return _s;
RDebugUtils.currentLine=11141150;
 //BA.debugLineNum = 11141150;BA.debugLine="End Sub";
return "";
}
public String  _filltesta(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "filltesta"))
	 {return ((String) Debug.delegate(ba, "filltesta", null));}
anywheresoftware.b4a.objects.LabelWrapper _lab = null;
anywheresoftware.b4a.objects.ButtonWrapper _p2 = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="private Sub FillTesta";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim Lab As Label";
_lab = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="Lab.Initialize(\"\")";
_lab.Initialize(ba,"");
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Lab.Gravity=Gravity.CENTER";
_lab.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Lab.Text=Title";
_lab.setText(BA.ObjectToCharSequence(__ref._title));
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="Lab.TextSize=14";
_lab.setTextSize((float) (14));
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="Lab.Textcolor=Colors.White";
_lab.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="Lab.Color=Colors.ARGB(150,0,0,0)";
_lab.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="Testa.AddView(Lab,0dip,0dip,280dip,30dip)";
__ref._testa.AddView((android.view.View)(_lab.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="LMounth.Initialize(\"\")";
__ref._lmounth.Initialize(ba,"");
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="LMounth.Gravity=Gravity.CENTER";
__ref._lmounth.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="LMounth.Text=NomeMese(DateTime.GetMonth(DateRet))";
__ref._lmounth.setText(BA.ObjectToCharSequence(__ref._nomemese(null,__c.DateTime.GetMonth(__ref._dateret))));
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="LMounth.TextSize=25";
__ref._lmounth.setTextSize((float) (25));
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="LMounth.Textcolor=Colors.White";
__ref._lmounth.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="LMounth.Color=Colors.Transparent";
__ref._lmounth.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="Testa.AddView(LMounth,0dip,30dip,280dip,60dip)";
__ref._testa.AddView((android.view.View)(__ref._lmounth.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=10485788;
 //BA.debugLineNum = 10485788;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=10485789;
 //BA.debugLineNum = 10485789;BA.debugLine="P2.Initialize(\"PrevM\")";
_p2.Initialize(ba,"PrevM");
RDebugUtils.currentLine=10485790;
 //BA.debugLineNum = 10485790;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_left_confirm_gray\"";
__ref._loaddrawablebyname(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_left_confirm_gray");
RDebugUtils.currentLine=10485791;
 //BA.debugLineNum = 10485791;BA.debugLine="Testa.AddView(P2,0dip,35dip,40dip,40dip)";
__ref._testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (35)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10485802;
 //BA.debugLineNum = 10485802;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=10485803;
 //BA.debugLineNum = 10485803;BA.debugLine="P2.Initialize(\"NextM\")";
_p2.Initialize(ba,"NextM");
RDebugUtils.currentLine=10485804;
 //BA.debugLineNum = 10485804;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_right_confirm_gray";
__ref._loaddrawablebyname(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_right_confirm_gray");
RDebugUtils.currentLine=10485805;
 //BA.debugLineNum = 10485805;BA.debugLine="Testa.AddView(P2,240dip,35dip,40dip,40dip)";
__ref._testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (35)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10485808;
 //BA.debugLineNum = 10485808;BA.debugLine="LDay.Initialize(\"\")";
__ref._lday.Initialize(ba,"");
RDebugUtils.currentLine=10485809;
 //BA.debugLineNum = 10485809;BA.debugLine="LDay.Gravity=Gravity.CENTER";
__ref._lday.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10485810;
 //BA.debugLineNum = 10485810;BA.debugLine="LDay.Text=DateTime.GetDayOfMonth(DateRet)";
__ref._lday.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(__ref._dateret)));
RDebugUtils.currentLine=10485811;
 //BA.debugLineNum = 10485811;BA.debugLine="LDay.TextSize=100";
__ref._lday.setTextSize((float) (100));
RDebugUtils.currentLine=10485812;
 //BA.debugLineNum = 10485812;BA.debugLine="LDay.Textcolor=Colors.White";
__ref._lday.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10485813;
 //BA.debugLineNum = 10485813;BA.debugLine="LDay.Typeface=Typeface.SANS_SERIF";
__ref._lday.setTypeface(__c.Typeface.SANS_SERIF);
RDebugUtils.currentLine=10485814;
 //BA.debugLineNum = 10485814;BA.debugLine="LDay.Color=Colors.Transparent";
__ref._lday.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10485815;
 //BA.debugLineNum = 10485815;BA.debugLine="Testa.AddView(LDay,0dip,70dip,280dip,120dip)";
__ref._testa.AddView((android.view.View)(__ref._lday.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (70)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (120)));
RDebugUtils.currentLine=10485818;
 //BA.debugLineNum = 10485818;BA.debugLine="LYear.Initialize(\"\")";
__ref._lyear.Initialize(ba,"");
RDebugUtils.currentLine=10485819;
 //BA.debugLineNum = 10485819;BA.debugLine="LYear.Gravity=Gravity.CENTER";
__ref._lyear.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=10485820;
 //BA.debugLineNum = 10485820;BA.debugLine="LYear.Text=DateTime.GetYear(DateRet)";
__ref._lyear.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(__ref._dateret)));
RDebugUtils.currentLine=10485821;
 //BA.debugLineNum = 10485821;BA.debugLine="LYear.TextSize=30";
__ref._lyear.setTextSize((float) (30));
RDebugUtils.currentLine=10485822;
 //BA.debugLineNum = 10485822;BA.debugLine="LYear.Textcolor=Colors.ARGB(200,255,255,255)";
__ref._lyear.setTextColor(__c.Colors.ARGB((int) (200),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=10485823;
 //BA.debugLineNum = 10485823;BA.debugLine="LYear.Color=Colors.Transparent";
__ref._lyear.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10485824;
 //BA.debugLineNum = 10485824;BA.debugLine="Testa.AddView(LYear,0dip,190dip,280dip,40dip)";
__ref._testa.AddView((android.view.View)(__ref._lyear.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (190)),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10485834;
 //BA.debugLineNum = 10485834;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=10485835;
 //BA.debugLineNum = 10485835;BA.debugLine="P2.Initialize(\"PrevY\")";
_p2.Initialize(ba,"PrevY");
RDebugUtils.currentLine=10485836;
 //BA.debugLineNum = 10485836;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_left_confirm_gray\"";
__ref._loaddrawablebyname(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_left_confirm_gray");
RDebugUtils.currentLine=10485837;
 //BA.debugLineNum = 10485837;BA.debugLine="Testa.AddView(P2,0dip,190dip,40dip,40dip)";
__ref._testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (190)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10485848;
 //BA.debugLineNum = 10485848;BA.debugLine="Dim P2 As Button";
_p2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=10485849;
 //BA.debugLineNum = 10485849;BA.debugLine="P2.Initialize(\"NextY\")";
_p2.Initialize(ba,"NextY");
RDebugUtils.currentLine=10485850;
 //BA.debugLineNum = 10485850;BA.debugLine="LoadDrawableByName(P2,\"jog_tab_right_confirm_gray";
__ref._loaddrawablebyname(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_p2.getObject())),"jog_tab_right_confirm_gray");
RDebugUtils.currentLine=10485851;
 //BA.debugLineNum = 10485851;BA.debugLine="Testa.AddView(P2,240dip,190dip,40dip,40dip)";
__ref._testa.AddView((android.view.View)(_p2.getObject()),__c.DipToCurrent((int) (240)),__c.DipToCurrent((int) (190)),__c.DipToCurrent((int) (40)),__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=10485853;
 //BA.debugLineNum = 10485853;BA.debugLine="End Sub";
return "";
}
public boolean  _loaddrawablebyname(b4a.example.sdcalendardialog __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _control,String _imagename) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "loaddrawablebyname"))
	 {return ((Boolean) Debug.delegate(ba, "loaddrawablebyname", new Object[] {_control,_imagename}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _id_drawable = 0;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub LoadDrawableByName(Control As View, Im";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim R As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Try";
try {RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="R.Target = R.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="R.Target = R.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="R.Target = R.RunMethod(\"getSystem\")";
_r.Target = _r.RunMethod("getSystem");
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim ID_Drawable As Int";
_id_drawable = 0;
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="ID_Drawable = R.RunMethod4(\"getIdentifier\", Arra";
_id_drawable = (int)(BA.ObjectToNumber(_r.RunMethod4("getIdentifier",new Object[]{(Object)(_imagename),(Object)("drawable"),(Object)("android")},new String[]{"java.lang.String","java.lang.String","java.lang.String"})));
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="R.Target = R.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="R.Target = R.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="Control.Background = R.RunMethod2(\"getDrawable\",";
_control.setBackground((android.graphics.drawable.Drawable)(_r.RunMethod2("getDrawable",BA.NumberToString(_id_drawable),"java.lang.int")));
RDebugUtils.currentLine=10682380;
 //BA.debugLineNum = 10682380;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e13) {
			ba.setLastException(e13);RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="LogColor(\"ERROR.LoadDrawableByName:\" & LastExcep";
__c.LogColor("ERROR.LoadDrawableByName:"+__c.LastException(ba).getMessage(),__c.Colors.Red);
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=10682387;
 //BA.debugLineNum = 10682387;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return null;
}
public String  _giorno_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "giorno_click"))
	 {return ((String) Debug.delegate(ba, "giorno_click", null));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="private Sub Giorno_Click";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="LabelNow.Color=Colors.Transparent";
__ref._labelnow.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="LabelNow.TextColor=Colors.Black";
__ref._labelnow.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="LabelNow=Sender";
__ref._labelnow.setObject((android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="LabelNow.Background=Corner(Color)";
__ref._labelnow.setBackground((android.graphics.drawable.Drawable)(__ref._corner(null,__ref._color).getObject()));
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="LabelNow.Textcolor=Colors.White";
__ref._labelnow.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="DateRet=LabelNow.Tag";
__ref._dateret = BA.ObjectToLongNumber(__ref._labelnow.getTag());
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="LDay.Text=LabelNow.Text";
__ref._lday.setText(BA.ObjectToCharSequence(__ref._labelnow.getText()));
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.sdcalendardialog __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="EventName = vEventName";
__ref._eventname = _veventname;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="CallBack = vCallback";
__ref._callback = _vcallback;
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Pa.Initialize(\"Pa\")";
__ref._pa.Initialize(ba,"Pa");
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="End Sub";
return "";
}
public String  _lingua(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "lingua"))
	 {return ((String) Debug.delegate(ba, "lingua", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="private Sub Lingua As String";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="r.Target = r.RunStaticMethod(\"java.util.Locale\",";
_r.Target = _r.RunStaticMethod("java.util.Locale","getDefault",(Object[])(__c.Null),(String[])(__c.Null));
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Return r.RunMethod(\"getLanguage\")";
if (true) return BA.ObjectToString(_r.RunMethod("getLanguage"));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="End Sub";
return "";
}
public String  _nextm_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "nextm_click"))
	 {return ((String) Debug.delegate(ba, "nextm_click", null));}
int _d = 0;
int _m = 0;
int _a = 0;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub NextM_Click";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(__ref._dateret);
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(__ref._dateret);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(__ref._dateret);
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="M=M+1";
_m = (int) (_m+1);
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="If M=13 Then";
if (_m==13) { 
RDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="M=1";
_m = (int) (1);
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="a=a+1";
_a = (int) (_a+1);
 };
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
__ref._dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="FillCalendar";
__ref._fillcalendar(null);
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="LMounth.Text=NomeMese(M)";
__ref._lmounth.setText(BA.ObjectToCharSequence(__ref._nomemese(null,_m)));
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="LYear.Text=a";
__ref._lyear.setText(BA.ObjectToCharSequence(_a));
RDebugUtils.currentLine=10813461;
 //BA.debugLineNum = 10813461;BA.debugLine="LDay.Text=d";
__ref._lday.setText(BA.ObjectToCharSequence(_d));
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="End Sub";
return "";
}
public String  _nexty_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "nexty_click"))
	 {return ((String) Debug.delegate(ba, "nexty_click", null));}
int _d = 0;
int _m = 0;
int _a = 0;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub Nexty_Click";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(__ref._dateret);
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(__ref._dateret);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(__ref._dateret);
RDebugUtils.currentLine=10944519;
 //BA.debugLineNum = 10944519;BA.debugLine="a=a+1";
_a = (int) (_a+1);
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
RDebugUtils.currentLine=10944525;
 //BA.debugLineNum = 10944525;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
__ref._dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
RDebugUtils.currentLine=10944526;
 //BA.debugLineNum = 10944526;BA.debugLine="FillCalendar";
__ref._fillcalendar(null);
RDebugUtils.currentLine=10944527;
 //BA.debugLineNum = 10944527;BA.debugLine="LYear.Text=a";
__ref._lyear.setText(BA.ObjectToCharSequence(_a));
RDebugUtils.currentLine=10944528;
 //BA.debugLineNum = 10944528;BA.debugLine="LDay.Text=d";
__ref._lday.setText(BA.ObjectToCharSequence(_d));
RDebugUtils.currentLine=10944529;
 //BA.debugLineNum = 10944529;BA.debugLine="End Sub";
return "";
}
public String  _pan_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "pan_click"))
	 {return ((String) Debug.delegate(ba, "pan_click", null));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub Pan_Click";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Ret=0";
__ref._ret = (int) (0);
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="If Show=DialogResponse.POSITIVE Then SetDate(Date";
if (__ref._show(null)==__c.DialogResponse.POSITIVE) { 
__ref._setdate(null,__ref._datepicker);};
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="End Sub";
return "";
}
public int  _show(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "show"))
	 {return ((Integer) Debug.delegate(ba, "show", null));}
int _tit = 0;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub Show As Int";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim Tit As Int = GetDeviceLayoutValues.Height - 1";
_tit = (int) (__c.GetDeviceLayoutValues(ba).Height-__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="Pa.Color=Colors.ARGB(200,0,0,0)";
__ref._pa.setColor(__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Cale.Initialize(\"Cale\")";
__ref._cale.Initialize(ba,"Cale");
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Cale.Color=Colors.White";
__ref._cale.setColor(__c.Colors.White);
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="Testa.Initialize(\"Testa\")";
__ref._testa.Initialize(ba,"Testa");
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Testa.Color=Color";
__ref._testa.setColor(__ref._color);
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="FillCalendar";
__ref._fillcalendar(null);
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="FillTesta";
__ref._filltesta(null);
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="If 100%y>100%x Then";
if (__c.PerYToCurrent((float) (100),ba)>__c.PerXToCurrent((float) (100),ba)) { 
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="Pa.AddView(Testa,50%x-140dip,50%y-265dip,280dip,";
__ref._pa.AddView((android.view.View)(__ref._testa.getObject()),(int) (__c.PerXToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (265))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="Pa.AddView(Cale,50%x-140dip,50%y-15dip,280dip,28";
__ref._pa.AddView((android.view.View)(__ref._cale.getObject()),(int) (__c.PerXToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (15))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (280)));
RDebugUtils.currentLine=10551313;
 //BA.debugLineNum = 10551313;BA.debugLine="MyAct.AddView(Pa,0dip,0dip,100%x,100%y)";
__ref._myact.AddView((android.view.View)(__ref._pa.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="Pa.AddView(Testa,50%x-280dip,50%y-140dip,280dip,";
__ref._pa.AddView((android.view.View)(__ref._testa.getObject()),(int) (__c.PerXToCurrent((float) (50),ba)-__c.DipToCurrent((int) (280))),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (280)));
RDebugUtils.currentLine=10551317;
 //BA.debugLineNum = 10551317;BA.debugLine="Pa.AddView(Cale,50%x,50%y-140dip,280dip,280dip)";
__ref._pa.AddView((android.view.View)(__ref._cale.getObject()),__c.PerXToCurrent((float) (50),ba),(int) (__c.PerYToCurrent((float) (50),ba)-__c.DipToCurrent((int) (140))),__c.DipToCurrent((int) (280)),__c.DipToCurrent((int) (280)));
RDebugUtils.currentLine=10551318;
 //BA.debugLineNum = 10551318;BA.debugLine="MyAct.AddView(Pa,0dip,0dip,100%x,100%y)";
__ref._myact.AddView((android.view.View)(__ref._pa.getObject()),__c.DipToCurrent((int) (0)),__c.DipToCurrent((int) (0)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=10551321;
 //BA.debugLineNum = 10551321;BA.debugLine="Do While Ret=0";
while (__ref._ret==0) {
RDebugUtils.currentLine=10551322;
 //BA.debugLineNum = 10551322;BA.debugLine="DoEvents 'ignore";
__c.DoEvents();
RDebugUtils.currentLine=10551323;
 //BA.debugLineNum = 10551323;BA.debugLine="If Pa.Width<>GetDeviceLayoutValues.Width  Then";
if (__ref._pa.getWidth()!=__c.GetDeviceLayoutValues(ba).Width) { 
RDebugUtils.currentLine=10551324;
 //BA.debugLineNum = 10551324;BA.debugLine="MyAct.Width=GetDeviceLayoutValues.Width";
__ref._myact.setWidth(__c.GetDeviceLayoutValues(ba).Width);
RDebugUtils.currentLine=10551325;
 //BA.debugLineNum = 10551325;BA.debugLine="MyAct.Height=GetDeviceLayoutValues.Height-Tit";
__ref._myact.setHeight((int) (__c.GetDeviceLayoutValues(ba).Height-_tit));
RDebugUtils.currentLine=10551326;
 //BA.debugLineNum = 10551326;BA.debugLine="Pa.Width=GetDeviceLayoutValues.Width";
__ref._pa.setWidth(__c.GetDeviceLayoutValues(ba).Width);
RDebugUtils.currentLine=10551327;
 //BA.debugLineNum = 10551327;BA.debugLine="Pa.Height=GetDeviceLayoutValues.Height-Tit";
__ref._pa.setHeight((int) (__c.GetDeviceLayoutValues(ba).Height-_tit));
RDebugUtils.currentLine=10551329;
 //BA.debugLineNum = 10551329;BA.debugLine="If Pa.Height>Pa.Width Then";
if (__ref._pa.getHeight()>__ref._pa.getWidth()) { 
RDebugUtils.currentLine=10551331;
 //BA.debugLineNum = 10551331;BA.debugLine="Testa.Left=Pa.Width/2-140dip";
__ref._testa.setLeft((int) (__ref._pa.getWidth()/(double)2-__c.DipToCurrent((int) (140))));
RDebugUtils.currentLine=10551332;
 //BA.debugLineNum = 10551332;BA.debugLine="Testa.Top=Pa.Height/2-265dip";
__ref._testa.setTop((int) (__ref._pa.getHeight()/(double)2-__c.DipToCurrent((int) (265))));
RDebugUtils.currentLine=10551333;
 //BA.debugLineNum = 10551333;BA.debugLine="Testa.Height=250dip";
__ref._testa.setHeight(__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=10551334;
 //BA.debugLineNum = 10551334;BA.debugLine="Cale.Left=Pa.Width/2-140dip";
__ref._cale.setLeft((int) (__ref._pa.getWidth()/(double)2-__c.DipToCurrent((int) (140))));
RDebugUtils.currentLine=10551335;
 //BA.debugLineNum = 10551335;BA.debugLine="Cale.Top=Pa.Height/2-15dip";
__ref._cale.setTop((int) (__ref._pa.getHeight()/(double)2-__c.DipToCurrent((int) (15))));
 }else {
RDebugUtils.currentLine=10551338;
 //BA.debugLineNum = 10551338;BA.debugLine="Testa.Left=Pa.Width/2-280dip";
__ref._testa.setLeft((int) (__ref._pa.getWidth()/(double)2-__c.DipToCurrent((int) (280))));
RDebugUtils.currentLine=10551339;
 //BA.debugLineNum = 10551339;BA.debugLine="Testa.Top=Pa.Height/2-140dip";
__ref._testa.setTop((int) (__ref._pa.getHeight()/(double)2-__c.DipToCurrent((int) (140))));
RDebugUtils.currentLine=10551340;
 //BA.debugLineNum = 10551340;BA.debugLine="Testa.Height=280dip";
__ref._testa.setHeight(__c.DipToCurrent((int) (280)));
RDebugUtils.currentLine=10551341;
 //BA.debugLineNum = 10551341;BA.debugLine="Cale.Left=Pa.Width/2";
__ref._cale.setLeft((int) (__ref._pa.getWidth()/(double)2));
RDebugUtils.currentLine=10551342;
 //BA.debugLineNum = 10551342;BA.debugLine="Cale.Top=Pa.Height/2-140dip";
__ref._cale.setTop((int) (__ref._pa.getHeight()/(double)2-__c.DipToCurrent((int) (140))));
 };
 };
 }
;
RDebugUtils.currentLine=10551347;
 //BA.debugLineNum = 10551347;BA.debugLine="Pa.RemoveView";
__ref._pa.RemoveView();
RDebugUtils.currentLine=10551348;
 //BA.debugLineNum = 10551348;BA.debugLine="Return Ret";
if (true) return __ref._ret;
RDebugUtils.currentLine=10551349;
 //BA.debugLineNum = 10551349;BA.debugLine="End Sub";
return 0;
}
public String  _setdate(b4a.example.sdcalendardialog __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "setdate"))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _can = null;
int _d = 0;
int _m = 0;
int _y = 0;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Public Sub SetDate(Date As Long)";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim Bm As Bitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim Can As Canvas";
_can = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Dim D,M,Y As Int";
_d = 0;
_m = 0;
_y = 0;
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="D=DateTime.GetDayOfMonth(Date)";
_d = __c.DateTime.GetDayOfMonth(_date);
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="M=DateTime.GetMonth(Date)";
_m = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Y=DateTime.GetYear(Date)";
_y = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Log(M)";
__c.Log(BA.NumberToString(_m));
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
RDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="DatePicker=DateTime.DateParse(m & \"/\" & d & \"/\" &";
__ref._datepicker = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_y));
RDebugUtils.currentLine=10223629;
 //BA.debugLineNum = 10223629;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
_bm.InitializeMutable(__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="Can.Initialize2(Bm)";
_can.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
RDebugUtils.currentLine=10223632;
 //BA.debugLineNum = 10223632;BA.debugLine="If Square Then";
if (__ref._square) { 
RDebugUtils.currentLine=10223633;
 //BA.debugLineNum = 10223633;BA.debugLine="Bm.InitializeMutable(400dip,400dip)";
_bm.InitializeMutable(__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=10223634;
 //BA.debugLineNum = 10223634;BA.debugLine="Can.Initialize2(Bm)";
_can.Initialize2((android.graphics.Bitmap)(_bm.getObject()));
RDebugUtils.currentLine=10223635;
 //BA.debugLineNum = 10223635;BA.debugLine="Can.DrawColor(Color)";
_can.DrawColor(__ref._color);
RDebugUtils.currentLine=10223636;
 //BA.debugLineNum = 10223636;BA.debugLine="Can.DrawText(NomeMese(M),210dip,80dip,Typeface.D";
_can.DrawText(ba,__ref._nomemese(null,_m),(float) (__c.DipToCurrent((int) (210))),(float) (__c.DipToCurrent((int) (80))),__c.Typeface.DEFAULT_BOLD,(float) (60),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=10223637;
 //BA.debugLineNum = 10223637;BA.debugLine="Can.DrawText(d,200dip,260dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_d),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (260))),__c.Typeface.DEFAULT_BOLD,(float) (180),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=10223638;
 //BA.debugLineNum = 10223638;BA.debugLine="Can.DrawText(y,200dip,350dip,Typeface.DEFAULT_BO";
_can.DrawText(ba,BA.NumberToString(_y),(float) (__c.DipToCurrent((int) (200))),(float) (__c.DipToCurrent((int) (350))),__c.Typeface.DEFAULT_BOLD,(float) (60),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=10223639;
 //BA.debugLineNum = 10223639;BA.debugLine="Pan.SetBackgroundImage(Can.Bitmap)";
__ref._pan.SetBackgroundImageNew((android.graphics.Bitmap)(_can.getBitmap().getObject()));
 }else {
RDebugUtils.currentLine=10223641;
 //BA.debugLineNum = 10223641;BA.debugLine="Pan.Background=Corner(Color)";
__ref._pan.setBackground((android.graphics.drawable.Drawable)(__ref._corner(null,__ref._color).getObject()));
RDebugUtils.currentLine=10223642;
 //BA.debugLineNum = 10223642;BA.debugLine="Can.Initialize(Pan)";
_can.Initialize((android.view.View)(__ref._pan.getObject()));
RDebugUtils.currentLine=10223643;
 //BA.debugLineNum = 10223643;BA.debugLine="Can.DrawText(d & \"-\" & NomeMese(M).SubString2(0,";
_can.DrawText(ba,BA.NumberToString(_d)+"-"+__ref._nomemese(null,_m).substring((int) (0),(int) (3))+"-"+BA.NumberToString(_y),(float) (__ref._mbase.getWidth()/(double)2),(float) (__ref._mbase.getHeight()/(double)2+__c.DipToCurrent((int) (5))),__c.Typeface.DEFAULT_BOLD,(float) (__ref._textsize),__ref._textcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
RDebugUtils.currentLine=10223645;
 //BA.debugLineNum = 10223645;BA.debugLine="End Sub";
return "";
}
public String  _prevm_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "prevm_click"))
	 {return ((String) Debug.delegate(ba, "prevm_click", null));}
int _d = 0;
int _m = 0;
int _a = 0;
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub PrevM_Click";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(__ref._dateret);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(__ref._dateret);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(__ref._dateret);
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="M=M-1";
_m = (int) (_m-1);
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="If M=0 Then";
if (_m==0) { 
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="M=12";
_m = (int) (12);
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="a=a-1";
_a = (int) (_a-1);
 };
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
__ref._dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="FillCalendar";
__ref._fillcalendar(null);
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="LMounth.Text=NomeMese(M)";
__ref._lmounth.setText(BA.ObjectToCharSequence(__ref._nomemese(null,_m)));
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="LYear.Text=a";
__ref._lyear.setText(BA.ObjectToCharSequence(_a));
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="LDay.Text=d";
__ref._lday.setText(BA.ObjectToCharSequence(_d));
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="End Sub";
return "";
}
public String  _prevy_click(b4a.example.sdcalendardialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sdcalendardialog";
if (Debug.shouldDelegate(ba, "prevy_click"))
	 {return ((String) Debug.delegate(ba, "prevy_click", null));}
int _d = 0;
int _m = 0;
int _a = 0;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub PrevY_Click";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Dim D,M,A As Int";
_d = 0;
_m = 0;
_a = 0;
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="d=DateTime.GetDayOfMonth(DateRet)";
_d = __c.DateTime.GetDayOfMonth(__ref._dateret);
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="m=DateTime.GetMonth(DateRet)";
_m = __c.DateTime.GetMonth(__ref._dateret);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="a=DateTime.GetYear(DateRet)";
_a = __c.DateTime.GetYear(__ref._dateret);
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="a=a-1";
_a = (int) (_a-1);
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="If (M=2)And(D>28) Then D=28";
if ((_m==2) && (_d>28)) { 
_d = (int) (28);};
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="If (M>30) And (D=4 Or D=6 Or D=9 Or D=11) Then D=";
if ((_m>30) && (_d==4 || _d==6 || _d==9 || _d==11)) { 
_d = (int) (30);};
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="DateRet=DateTime.DateParse(m & \"/\" & d & \"/\" & a)";
__ref._dateret = __c.DateTime.DateParse(BA.NumberToString(_m)+"/"+BA.NumberToString(_d)+"/"+BA.NumberToString(_a));
RDebugUtils.currentLine=10878990;
 //BA.debugLineNum = 10878990;BA.debugLine="FillCalendar";
__ref._fillcalendar(null);
RDebugUtils.currentLine=10878991;
 //BA.debugLineNum = 10878991;BA.debugLine="LYear.Text=a";
__ref._lyear.setText(BA.ObjectToCharSequence(_a));
RDebugUtils.currentLine=10878992;
 //BA.debugLineNum = 10878992;BA.debugLine="LDay.Text=d";
__ref._lday.setText(BA.ObjectToCharSequence(_d));
RDebugUtils.currentLine=10878993;
 //BA.debugLineNum = 10878993;BA.debugLine="End Sub";
return "";
}
}