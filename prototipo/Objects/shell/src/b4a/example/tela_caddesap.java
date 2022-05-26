
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class tela_caddesap implements IRemote{
	public static tela_caddesap mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public tela_caddesap() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("tela_caddesap"), "b4a.example.tela_caddesap");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, tela_caddesap.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _txtdatadesap = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpontref = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _cmb_pets = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _calendario = RemoteObject.declareNull("b4a.example.sdcalendardialog");
public static RemoteObject _data = RemoteObject.createImmutable("");
public static RemoteObject _imagechooser = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
public static RemoteObject _petfoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.tela_editarpet _tela_editarpet = null;
public static b4a.example.tela_cadusu _tela_cadusu = null;
public static b4a.example.tela_listarpet _tela_listarpet = null;
public static b4a.example.tela_vizdesap _tela_vizdesap = null;
public static b4a.example.tela_listardesap _tela_listardesap = null;
public static b4a.example.tela_editarperfil _tela_editarperfil = null;
public static b4a.example.tela_cadpet _tela_cadpet = null;
public static b4a.example.tela_feed _tela_feed = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",tela_caddesap.mostCurrent._activity,"calendario",tela_caddesap.mostCurrent._calendario,"cmb_PETS",tela_caddesap.mostCurrent._cmb_pets,"Data",tela_caddesap.mostCurrent._data,"HttpUtils2Service",tela_caddesap.mostCurrent._httputils2service,"ImageChooser",tela_caddesap.mostCurrent._imagechooser,"Main",Debug.moduleToString(b4a.example.main.class),"petFoto",tela_caddesap.mostCurrent._petfoto,"Starter",Debug.moduleToString(b4a.example.starter.class),"Tela_CadPET",Debug.moduleToString(b4a.example.tela_cadpet.class),"Tela_CadUsu",Debug.moduleToString(b4a.example.tela_cadusu.class),"Tela_EditarPerfil",Debug.moduleToString(b4a.example.tela_editarperfil.class),"Tela_EditarPET",Debug.moduleToString(b4a.example.tela_editarpet.class),"Tela_Feed",Debug.moduleToString(b4a.example.tela_feed.class),"Tela_ListarDesap",Debug.moduleToString(b4a.example.tela_listardesap.class),"Tela_ListarPET",Debug.moduleToString(b4a.example.tela_listarpet.class),"Tela_VizDesap",Debug.moduleToString(b4a.example.tela_vizdesap.class),"txtDataDesap",tela_caddesap.mostCurrent._txtdatadesap,"txtPontRef",tela_caddesap.mostCurrent._txtpontref};
}
}