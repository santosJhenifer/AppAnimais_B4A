
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class rdcconnector {
    public static RemoteObject myClass;
	public rdcconnector() {
	}
    public static PCBA staticBA = new PCBA(null, rdcconnector.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pool = RemoteObject.declareNull("anywheresoftware.b4j.object.ConnectionPool");
public static RemoteObject _debugqueries = RemoteObject.createImmutable(false);
public static RemoteObject _commands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _serverport = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"commands",_ref.getField(false, "_commands"),"DebugQueries",_ref.getField(false, "_debugqueries"),"pool",_ref.getField(false, "_pool"),"serverPort",_ref.getField(false, "_serverport")};
}
}