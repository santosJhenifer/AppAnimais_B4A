
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class sdcalendardialog {
    public static RemoteObject myClass;
	public sdcalendardialog() {
	}
    public static PCBA staticBA = new PCBA(null, sdcalendardialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _datepicker = RemoteObject.createImmutable(0L);
public static RemoteObject _color = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _textsize = RemoteObject.createImmutable(0);
public static RemoteObject _title = RemoteObject.createImmutable("");
public static RemoteObject _square = RemoteObject.createImmutable(false);
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pa = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _myact = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateret = RemoteObject.createImmutable(0L);
public static RemoteObject _ret = RemoteObject.createImmutable(0);
public static RemoteObject _cale = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _testa = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _buttonok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _buttocancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelnow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lday = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lmounth = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.tela_caddesap _tela_caddesap = null;
public static b4a.example.tela_editarpet _tela_editarpet = null;
public static b4a.example.tela_cadusu _tela_cadusu = null;
public static b4a.example.tela_listarpet _tela_listarpet = null;
public static b4a.example.tela_vizdesap _tela_vizdesap = null;
public static b4a.example.tela_listardesap _tela_listardesap = null;
public static b4a.example.tela_editarperfil _tela_editarperfil = null;
public static b4a.example.tela_cadpet _tela_cadpet = null;
public static b4a.example.tela_feed _tela_feed = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ButtoCancel",_ref.getField(false, "_buttocancel"),"ButtonOk",_ref.getField(false, "_buttonok"),"Cale",_ref.getField(false, "_cale"),"CallBack",_ref.getField(false, "_callback"),"Color",_ref.getField(false, "_color"),"DatePicker",_ref.getField(false, "_datepicker"),"DateRet",_ref.getField(false, "_dateret"),"EventName",_ref.getField(false, "_eventname"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"LabelNow",_ref.getField(false, "_labelnow"),"LDay",_ref.getField(false, "_lday"),"LMounth",_ref.getField(false, "_lmounth"),"LYear",_ref.getField(false, "_lyear"),"mBase",_ref.getField(false, "_mbase"),"MyAct",_ref.getField(false, "_myact"),"Pa",_ref.getField(false, "_pa"),"Pan",_ref.getField(false, "_pan"),"Ret",_ref.getField(false, "_ret"),"Square",_ref.getField(false, "_square"),"Testa",_ref.getField(false, "_testa"),"TextColor",_ref.getField(false, "_textcolor"),"TextSize",_ref.getField(false, "_textsize"),"Title",_ref.getField(false, "_title")};
}
}