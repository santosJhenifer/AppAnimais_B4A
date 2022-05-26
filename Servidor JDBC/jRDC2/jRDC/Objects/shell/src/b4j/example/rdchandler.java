
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class rdchandler {
    public static RemoteObject myClass;
	public rdchandler() {
	}
    public static PCBA staticBA = new PCBA(null, rdchandler.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _datetimemethods = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateTimeMethods",_ref.getField(false, "_datetimemethods")};
}
}