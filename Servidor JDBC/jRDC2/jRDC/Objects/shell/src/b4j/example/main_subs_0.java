package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,19);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);}
Debug.locals.put("Args", _args);
 BA.debugLineNum = 19;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="srvr.Initialize(\"\")";
Debug.ShouldStop(524288);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="rdcConnector1.Initialize";
Debug.ShouldStop(1048576);
main._rdcconnector1.runClassMethod (b4j.example.rdcconnector.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 22;BA.debugLine="srvr.Port = rdcConnector1.serverPort";
Debug.ShouldStop(2097152);
main._srvr.runMethod(true,"setPort",main._rdcconnector1.getField(true,"_serverport" /*RemoteObject*/ ));
 BA.debugLineNum = 23;BA.debugLine="srvr.AddHandler(\"/test\", \"TestHandler\", False)";
Debug.ShouldStop(4194304);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/test")),(Object)(BA.ObjectToString("TestHandler")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 24;BA.debugLine="srvr.AddHandler(\"/rdc\", \"RDCHandler\", False)";
Debug.ShouldStop(8388608);
main._srvr.runVoidMethod ("AddHandler",(Object)(BA.ObjectToString("/rdc")),(Object)(BA.ObjectToString("RDCHandler")),(Object)(main.__c.getField(true,"False")));
 BA.debugLineNum = 25;BA.debugLine="srvr.Start";
Debug.ShouldStop(16777216);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 26;BA.debugLine="Log($\"jRDC is running (version = $1.2{VERSION})\"$";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("jRDC is running (version = "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((main._version))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 27;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
rdcconnector.myClass = BA.getDeviceClass ("b4j.example.rdcconnector");
rdchandler.myClass = BA.getDeviceClass ("b4j.example.rdchandler");
testhandler.myClass = BA.getDeviceClass ("b4j.example.testhandler");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Public srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Public rdcConnector1 As RDCConnector";
main._rdcconnector1 = RemoteObject.createNew ("b4j.example.rdcconnector");
 //BA.debugLineNum = 14;BA.debugLine="Public const VERSION As Float = 2.22";
main._version = BA.numberCast(float.class, 2.22);
 //BA.debugLineNum = 15;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 16;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}