package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class testhandler_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (testhandler) ","testhandler",3,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "testhandler","handle", __ref, _req, _resp);}
RemoteObject _con = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 10;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="resp.ContentType = \"text/html\"";
Debug.ShouldStop(1024);
_resp.runMethod(true,"setContentType",BA.ObjectToString("text/html"));
 BA.debugLineNum = 12;BA.debugLine="resp.Write($\"RemoteServer is running ($DateTime{D";
Debug.ShouldStop(2048);
_resp.runVoidMethod ("Write",(Object)((RemoteObject.concat(RemoteObject.createImmutable("RemoteServer is running ("),testhandler.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)((testhandler.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(")<br/>")))));
 BA.debugLineNum = 13;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 14;BA.debugLine="Dim con As SQL = Main.rdcConnector1.GetConnectio";
Debug.ShouldStop(8192);
_con = testhandler._main._rdcconnector1 /*RemoteObject*/ .runClassMethod (b4j.example.rdcconnector.class, "_getconnection" /*RemoteObject*/ );Debug.locals.put("con", _con);Debug.locals.put("con", _con);
 BA.debugLineNum = 15;BA.debugLine="resp.Write(\"Connection successful.\")";
Debug.ShouldStop(16384);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("Connection successful.")));
 BA.debugLineNum = 16;BA.debugLine="con.Close";
Debug.ShouldStop(32768);
_con.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e8.toString()); BA.debugLineNum = 18;BA.debugLine="resp.Write(\"Error fetching connection.\")";
Debug.ShouldStop(131072);
_resp.runVoidMethod ("Write",(Object)(RemoteObject.createImmutable("Error fetching connection.")));
 };
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (testhandler) ","testhandler",3,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "testhandler","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}