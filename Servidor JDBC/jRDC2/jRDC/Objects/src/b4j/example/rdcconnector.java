package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class rdcconnector extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.rdcconnector", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.rdcconnector.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.ConnectionPool _pool = null;
public boolean _debugqueries = false;
public anywheresoftware.b4a.objects.collections.Map _commands = null;
public int _serverport = 0;
public b4j.example.main _main = null;
public String  _initialize(b4j.example.rdcconnector __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="rdcconnector";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4a.objects.collections.Map _config = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim config As Map = LoadConfigMap";
_config = new anywheresoftware.b4a.objects.collections.Map();
_config = __ref._loadconfigmap /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="pool.Initialize(config.Get(\"DriverClass\"), config";
__ref._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .Initialize(BA.ObjectToString(_config.Get((Object)("DriverClass"))),BA.ObjectToString(_config.Get((Object)("JdbcUrl"))),BA.ObjectToString(_config.Get((Object)("User"))),BA.ObjectToString(_config.Get((Object)("Password"))));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="DebugQueries = True";
__ref._debugqueries /*boolean*/  = __c.True;
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="serverPort = config.Get(\"ServerPort\")";
__ref._serverport /*int*/  = (int)(BA.ObjectToNumber(_config.Get((Object)("ServerPort"))));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="LoadSQLCommands(config)";
__ref._loadsqlcommands /*String*/ (null,_config);
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.rdcconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdcconnector";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Private pool As ConnectionPool";
_pool = new anywheresoftware.b4j.object.ConnectionPool();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Private DebugQueries As Boolean";
_debugqueries = false;
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Private commands As Map";
_commands = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Public serverPort As Int";
_serverport = 0;
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="End Sub";
return "";
}
public String  _getcommand(b4j.example.rdcconnector __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdcconnector";
if (Debug.shouldDelegate(ba, "getcommand", false))
	 {return ((String) Debug.delegate(ba, "getcommand", new Object[] {_key}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Public Sub GetCommand(Key As String) As String";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If commands.ContainsKey(\"sql.\" & Key) = False The";
if (__ref._commands /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("sql."+_key))==__c.False) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Log(\"*** Command not found: \" & Key)";
__c.Log("*** Command not found: "+_key);
 };
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Return commands.Get(\"sql.\" & Key)";
if (true) return BA.ObjectToString(__ref._commands /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("sql."+_key)));
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.SQL  _getconnection(b4j.example.rdcconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdcconnector";
if (Debug.shouldDelegate(ba, "getconnection", false))
	 {return ((anywheresoftware.b4j.objects.SQL) Debug.delegate(ba, "getconnection", null));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub GetConnection As SQL";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="If DebugQueries Then LoadSQLCommands(LoadConfigMa";
if (__ref._debugqueries /*boolean*/ ) { 
__ref._loadsqlcommands /*String*/ (null,__ref._loadconfigmap /*anywheresoftware.b4a.objects.collections.Map*/ (null));};
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Return pool.GetConnection";
if (true) return __ref._pool /*anywheresoftware.b4j.object.ConnectionPool*/ .GetConnection();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="End Sub";
return null;
}
public String  _loadsqlcommands(b4j.example.rdcconnector __ref,anywheresoftware.b4a.objects.collections.Map _config) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdcconnector";
if (Debug.shouldDelegate(ba, "loadsqlcommands", false))
	 {return ((String) Debug.delegate(ba, "loadsqlcommands", new Object[] {_config}));}
anywheresoftware.b4a.objects.collections.Map _newcommands = null;
String _k = "";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub LoadSQLCommands(config As Map)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim newCommands As Map";
_newcommands = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="newCommands.Initialize";
_newcommands.Initialize();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="For Each k As String In config.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _config.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="If k.StartsWith(\"sql.\") Then";
if (_k.startsWith("sql.")) { 
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="newCommands.Put(k, config.Get(k))";
_newcommands.Put((Object)(_k),_config.Get((Object)(_k)));
 };
 }
};
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="commands = newCommands";
__ref._commands /*anywheresoftware.b4a.objects.collections.Map*/  = _newcommands;
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _loadconfigmap(b4j.example.rdcconnector __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdcconnector";
if (Debug.shouldDelegate(ba, "loadconfigmap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "loadconfigmap", null));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub LoadConfigMap As Map";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Return File.ReadMap(File.DirAssets, \"config.prope";
if (true) return __c.File.ReadMap(__c.File.getDirAssets(),"config.properties");
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return null;
}
}