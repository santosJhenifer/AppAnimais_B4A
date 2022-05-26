package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class testhandler extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.testhandler", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.testhandler.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.testhandler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="testhandler";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.testhandler __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="testhandler";
if (Debug.shouldDelegate(ba, "handle", false))
	 {return ((String) Debug.delegate(ba, "handle", new Object[] {_req,_resp}));}
anywheresoftware.b4j.objects.SQL _con = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="resp.ContentType = \"text/html\"";
_resp.setContentType("text/html");
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="resp.Write($\"RemoteServer is running ($DateTime{D";
_resp.Write(("RemoteServer is running ("+__c.SmartStringFormatter("datetime",(Object)(__c.DateTime.getNow()))+")<br/>"));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Try";
try {RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim con As SQL = Main.rdcConnector1.GetConnectio";
_con = _main._rdcconnector1 /*b4j.example.rdcconnector*/ ._getconnection /*anywheresoftware.b4j.objects.SQL*/ (null);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="resp.Write(\"Connection successful.\")";
_resp.Write("Connection successful.");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="con.Close";
_con.Close();
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="resp.Write(\"Error fetching connection.\")";
_resp.Write("Error fetching connection.");
 };
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.testhandler __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="testhandler";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
}