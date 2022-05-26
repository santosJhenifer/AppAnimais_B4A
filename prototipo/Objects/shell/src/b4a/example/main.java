
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _item_name = RemoteObject.createImmutable("");
public static RemoteObject _exportrdclink = RemoteObject.createImmutable("");
public static RemoteObject _logado = RemoteObject.createImmutable(false);
public static RemoteObject _codigocidade = RemoteObject.createImmutable("");
public static RemoteObject _usu_cod = RemoteObject.createImmutable(0);
public static RemoteObject _coddesap = RemoteObject.createImmutable(0);
public static RemoteObject _codigopet = RemoteObject.createImmutable(0);
public static RemoteObject _edtlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edtsenha = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edtesq = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
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
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"CodDesap",main._coddesap,"CodigoCidade",main._codigocidade,"CodigoPet",main._codigopet,"edtEsq",main.mostCurrent._edtesq,"edtLogin",main.mostCurrent._edtlogin,"edtSenha",main.mostCurrent._edtsenha,"exportrdcLink",main._exportrdclink,"HttpUtils2Service",main.mostCurrent._httputils2service,"item_name",main._item_name,"logado",main._logado,"Panel4",main.mostCurrent._panel4,"rdcLink",main._rdclink,"Starter",Debug.moduleToString(b4a.example.starter.class),"Tela_CadDesap",Debug.moduleToString(b4a.example.tela_caddesap.class),"Tela_CadPET",Debug.moduleToString(b4a.example.tela_cadpet.class),"Tela_CadUsu",Debug.moduleToString(b4a.example.tela_cadusu.class),"Tela_EditarPerfil",Debug.moduleToString(b4a.example.tela_editarperfil.class),"Tela_EditarPET",Debug.moduleToString(b4a.example.tela_editarpet.class),"Tela_Feed",Debug.moduleToString(b4a.example.tela_feed.class),"Tela_ListarDesap",Debug.moduleToString(b4a.example.tela_listardesap.class),"Tela_ListarPET",Debug.moduleToString(b4a.example.tela_listarpet.class),"Tela_VizDesap",Debug.moduleToString(b4a.example.tela_vizdesap.class),"Usu_Cod",main._usu_cod};
}
}