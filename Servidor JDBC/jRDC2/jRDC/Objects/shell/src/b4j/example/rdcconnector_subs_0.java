package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class rdcconnector_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private pool As ConnectionPool";
rdcconnector._pool = RemoteObject.createNew ("anywheresoftware.b4j.object.ConnectionPool");__ref.setField("_pool",rdcconnector._pool);
 //BA.debugLineNum = 4;BA.debugLine="Private DebugQueries As Boolean";
rdcconnector._debugqueries = RemoteObject.createImmutable(false);__ref.setField("_debugqueries",rdcconnector._debugqueries);
 //BA.debugLineNum = 5;BA.debugLine="Private commands As Map";
rdcconnector._commands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_commands",rdcconnector._commands);
 //BA.debugLineNum = 6;BA.debugLine="Public serverPort As Int";
rdcconnector._serverport = RemoteObject.createImmutable(0);__ref.setField("_serverport",rdcconnector._serverport);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcommand(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetCommand (rdcconnector) ","rdcconnector",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("getcommand")) { return __ref.runUserSub(false, "rdcconnector","getcommand", __ref, _key);}
Debug.locals.put("Key", _key);
 BA.debugLineNum = 27;BA.debugLine="Public Sub GetCommand(Key As String) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If commands.ContainsKey(\"sql.\" & Key) = False The";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_commands" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((RemoteObject.concat(RemoteObject.createImmutable("sql."),_key)))),rdcconnector.__c.getField(true,"False"))) { 
 BA.debugLineNum = 29;BA.debugLine="Log(\"*** Command not found: \" & Key)";
Debug.ShouldStop(268435456);
rdcconnector.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("*** Command not found: "),_key)));
 };
 BA.debugLineNum = 31;BA.debugLine="Return commands.Get(\"sql.\" & Key)";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToString(__ref.getField(false,"_commands" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.concat(RemoteObject.createImmutable("sql."),_key)))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getconnection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetConnection (rdcconnector) ","rdcconnector",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("getconnection")) { return __ref.runUserSub(false, "rdcconnector","getconnection", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Public Sub GetConnection As SQL";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="If DebugQueries Then LoadSQLCommands(LoadConfigMa";
Debug.ShouldStop(4);
if (__ref.getField(true,"_debugqueries" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.rdcconnector.class, "_loadsqlcommands" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.rdcconnector.class, "_loadconfigmap" /*RemoteObject*/ )));};
 BA.debugLineNum = 36;BA.debugLine="Return pool.GetConnection";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_pool" /*RemoteObject*/ ).runMethod(false,"GetConnection");
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (rdcconnector) ","rdcconnector",1,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "rdcconnector","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _config = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim config As Map = LoadConfigMap";
Debug.ShouldStop(1024);
_config = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_config = __ref.runClassMethod (b4j.example.rdcconnector.class, "_loadconfigmap" /*RemoteObject*/ );Debug.locals.put("config", _config);Debug.locals.put("config", _config);
 BA.debugLineNum = 12;BA.debugLine="pool.Initialize(config.Get(\"DriverClass\"), config";
Debug.ShouldStop(2048);
__ref.getField(false,"_pool" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.ObjectToString(_config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DriverClass")))))),(Object)(BA.ObjectToString(_config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("JdbcUrl")))))),(Object)(BA.ObjectToString(_config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("User")))))),(Object)(BA.ObjectToString(_config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Password")))))));
 BA.debugLineNum = 15;BA.debugLine="DebugQueries = True";
Debug.ShouldStop(16384);
__ref.setField ("_debugqueries" /*RemoteObject*/ ,rdcconnector.__c.getField(true,"True"));
 BA.debugLineNum = 19;BA.debugLine="serverPort = config.Get(\"ServerPort\")";
Debug.ShouldStop(262144);
__ref.setField ("_serverport" /*RemoteObject*/ ,BA.numberCast(int.class, _config.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ServerPort"))))));
 BA.debugLineNum = 20;BA.debugLine="LoadSQLCommands(config)";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.rdcconnector.class, "_loadsqlcommands" /*RemoteObject*/ ,(Object)(_config));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadconfigmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadConfigMap (rdcconnector) ","rdcconnector",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("loadconfigmap")) { return __ref.runUserSub(false, "rdcconnector","loadconfigmap", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Private Sub LoadConfigMap As Map";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Return File.ReadMap(File.DirAssets, \"config.prope";
Debug.ShouldStop(8388608);
if (true) return rdcconnector.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(rdcconnector.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("config.properties")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadsqlcommands(RemoteObject __ref,RemoteObject _config) throws Exception{
try {
		Debug.PushSubsStack("LoadSQLCommands (rdcconnector) ","rdcconnector",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("loadsqlcommands")) { return __ref.runUserSub(false, "rdcconnector","loadsqlcommands", __ref, _config);}
RemoteObject _newcommands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("config", _config);
 BA.debugLineNum = 40;BA.debugLine="Private Sub LoadSQLCommands(config As Map)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Dim newCommands As Map";
Debug.ShouldStop(256);
_newcommands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newCommands", _newcommands);
 BA.debugLineNum = 42;BA.debugLine="newCommands.Initialize";
Debug.ShouldStop(512);
_newcommands.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="For Each k As String In config.Keys";
Debug.ShouldStop(1024);
{
final RemoteObject group3 = _config.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 44;BA.debugLine="If k.StartsWith(\"sql.\") Then";
Debug.ShouldStop(2048);
if (_k.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("sql."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 45;BA.debugLine="newCommands.Put(k, config.Get(k))";
Debug.ShouldStop(4096);
_newcommands.runVoidMethod ("Put",(Object)((_k)),(Object)(_config.runMethod(false,"Get",(Object)((_k)))));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 48;BA.debugLine="commands = newCommands";
Debug.ShouldStop(32768);
__ref.setField ("_commands" /*RemoteObject*/ ,_newcommands);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}