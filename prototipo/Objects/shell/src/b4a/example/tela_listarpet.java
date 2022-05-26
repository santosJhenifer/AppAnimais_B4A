
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

public class tela_listarpet implements IRemote{
	public static tela_listarpet mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public tela_listarpet() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("tela_listarpet"), "b4a.example.tela_listarpet");
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
		pcBA = new PCBA(this, tela_listarpet.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pet_cod = RemoteObject.createImmutable(0);
public static RemoteObject _lst_pet = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.tela_caddesap _tela_caddesap = null;
public static b4a.example.tela_editarpet _tela_editarpet = null;
public static b4a.example.tela_cadusu _tela_cadusu = null;
public static b4a.example.tela_vizdesap _tela_vizdesap = null;
public static b4a.example.tela_listardesap _tela_listardesap = null;
public static b4a.example.tela_editarperfil _tela_editarperfil = null;
public static b4a.example.tela_cadpet _tela_cadpet = null;
public static b4a.example.tela_feed _tela_feed = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",tela_listarpet.mostCurrent._activity,"HttpUtils2Service",tela_listarpet.mostCurrent._httputils2service,"lst_PET",tela_listarpet.mostCurrent._lst_pet,"Main",Debug.moduleToString(b4a.example.main.class),"pet_cod",tela_listarpet._pet_cod,"Starter",Debug.moduleToString(b4a.example.starter.class),"Tela_CadDesap",Debug.moduleToString(b4a.example.tela_caddesap.class),"Tela_CadPET",Debug.moduleToString(b4a.example.tela_cadpet.class),"Tela_CadUsu",Debug.moduleToString(b4a.example.tela_cadusu.class),"Tela_EditarPerfil",Debug.moduleToString(b4a.example.tela_editarperfil.class),"Tela_EditarPET",Debug.moduleToString(b4a.example.tela_editarpet.class),"Tela_Feed",Debug.moduleToString(b4a.example.tela_feed.class),"Tela_ListarDesap",Debug.moduleToString(b4a.example.tela_listardesap.class),"Tela_VizDesap",Debug.moduleToString(b4a.example.tela_vizdesap.class)};
}
}