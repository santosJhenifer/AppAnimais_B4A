package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static class _dbcommand{
public boolean IsInitialized;
public String Name;
public Object[] Parameters;
public void Initialize() {
IsInitialized = true;
Name = "";
Parameters = new Object[0];
{
int d0 = Parameters.length;
for (int i0 = 0;i0 < d0;i0++) {
Parameters[i0] = new Object();
}
}
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dbresult{
public boolean IsInitialized;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Columns;
public anywheresoftware.b4a.objects.collections.List Rows;
public void Initialize() {
IsInitialized = true;
Tag = new Object();
Columns = new anywheresoftware.b4a.objects.collections.Map();
Rows = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static b4j.example.rdcconnector _rdcconnector1 = null;
public static float _version = 0f;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="srvr.Initialize(\"\")";
_srvr.Initialize(ba,"");
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="rdcConnector1.Initialize";
_rdcconnector1._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="srvr.Port = rdcConnector1.serverPort";
_srvr.setPort(_rdcconnector1._serverport /*int*/ );
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="srvr.AddHandler(\"/test\", \"TestHandler\", False)";
_srvr.AddHandler("/test","TestHandler",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="srvr.AddHandler(\"/rdc\", \"RDCHandler\", False)";
_srvr.AddHandler("/rdc","RDCHandler",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="srvr.Start";
_srvr.Start();
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Log($\"jRDC is running (version = $1.2{VERSION})\"$";
anywheresoftware.b4a.keywords.Common.Log(("jRDC is running (version = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_version))+")"));
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="End Sub";
return "";
}
}