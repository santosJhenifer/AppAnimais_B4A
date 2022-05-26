
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class slidemenu {
    public static RemoteObject myClass;
	public slidemenu() {
	}
    public static PCBA staticBA = new PCBA(null, slidemenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mslidepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mbackpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mlistview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _minanimation = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _moutanimation = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
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
		return new Object[] {"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"mBackPanel",_ref.getField(false, "_mbackpanel"),"mEventName",_ref.getField(false, "_meventname"),"mInAnimation",_ref.getField(false, "_minanimation"),"mListView",_ref.getField(false, "_mlistview"),"mModule",_ref.getField(false, "_mmodule"),"mOutAnimation",_ref.getField(false, "_moutanimation"),"mSlidePanel",_ref.getField(false, "_mslidepanel")};
}
}