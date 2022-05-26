package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class rdchandler_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private DateTimeMethods As Map";
rdchandler._datetimemethods = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_datetimemethods",rdchandler._datetimemethods);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _executebatch2(RemoteObject __ref,RemoteObject _con,RemoteObject _in,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("ExecuteBatch2 (rdchandler) ","rdchandler",2,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("executebatch2")) { return __ref.runUserSub(false, "rdchandler","executebatch2", __ref, _con, _in, _resp);}
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _commands = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _res = RemoteObject.declareNull("b4j.example.main._dbresult");
RemoteObject _cmd = RemoteObject.declareNull("b4j.example.main._dbcommand");
RemoteObject _data = null;
Debug.locals.put("con", _con);
Debug.locals.put("in", _in);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 97;BA.debugLine="Private Sub ExecuteBatch2(con As SQL, in As InputS";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(2);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 99;BA.debugLine="Dim m As Map = ser.ConvertBytesToObject(Bit.Input";
Debug.ShouldStop(4);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_ser.runMethod(false,"ConvertBytesToObject",(Object)(rdchandler.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((_in.getObject()))))));Debug.locals.put("m", _m);
 BA.debugLineNum = 100;BA.debugLine="Dim commands As List = m.Get(\"commands\")";
Debug.ShouldStop(8);
_commands = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_commands.setObject(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("commands")))));Debug.locals.put("commands", _commands);
 BA.debugLineNum = 101;BA.debugLine="Dim res As DBResult";
Debug.ShouldStop(16);
_res = RemoteObject.createNew ("b4j.example.main._dbresult");Debug.locals.put("res", _res);
 BA.debugLineNum = 102;BA.debugLine="res.Initialize";
Debug.ShouldStop(32);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="res.columns = CreateMap(\"AffectedRows (N/A)\": 0)";
Debug.ShouldStop(64);
_res.setField ("Columns" /*RemoteObject*/ ,rdchandler.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("AffectedRows (N/A)")),RemoteObject.createImmutable((0))})));
 BA.debugLineNum = 104;BA.debugLine="res.Rows.Initialize";
Debug.ShouldStop(128);
_res.getField(false,"Rows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="res.Tag = Null";
Debug.ShouldStop(256);
_res.setField ("Tag" /*RemoteObject*/ ,rdchandler.__c.getField(false,"Null"));
 BA.debugLineNum = 106;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 107;BA.debugLine="con.BeginTransaction";
Debug.ShouldStop(1024);
_con.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 108;BA.debugLine="For Each cmd As DBCommand In commands";
Debug.ShouldStop(2048);
{
final RemoteObject group11 = _commands;
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_cmd = (group11.runMethod(false,"Get",index11));Debug.locals.put("cmd", _cmd);
Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 109;BA.debugLine="con.ExecNonQuery2(Main.rdcConnector1.GetCommand";
Debug.ShouldStop(4096);
_con.runVoidMethod ("ExecNonQuery2",(Object)(rdchandler._main._rdcconnector1 /*RemoteObject*/ .runClassMethod (b4j.example.rdcconnector.class, "_getcommand" /*RemoteObject*/ ,(Object)(_cmd.getField(true,"Name" /*RemoteObject*/ )))),(Object)(rdchandler.__c.runMethod(false, "ArrayToList", (Object)(_cmd.getField(false,"Parameters" /*RemoteObject*/ )))));
 }
}Debug.locals.put("cmd", _cmd);
;
 BA.debugLineNum = 112;BA.debugLine="res.Rows.Add(Array As Object(0))";
Debug.ShouldStop(32768);
_res.getField(false,"Rows" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))}))));
 BA.debugLineNum = 113;BA.debugLine="con.TransactionSuccessful";
Debug.ShouldStop(65536);
_con.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 115;BA.debugLine="con.Rollback";
Debug.ShouldStop(262144);
_con.runVoidMethod ("Rollback");
 BA.debugLineNum = 116;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
rdchandler.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(rdchandler.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 117;BA.debugLine="resp.SendError(500, LastException.Message)";
Debug.ShouldStop(1048576);
_resp.runVoidMethodAndSync ("SendError",(Object)(BA.numberCast(int.class, 500)),(Object)(rdchandler.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 119;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(res";
Debug.ShouldStop(4194304);
_data = _ser.runMethod(false,"ConvertObjectToBytes",(Object)((_res)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 120;BA.debugLine="resp.OutputStream.WriteBytes(data, 0, data.Length";
Debug.ShouldStop(8388608);
_resp.runMethod(false,"getOutputStream").runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 121;BA.debugLine="Return $\"batch (size=${commands.Size})\"$";
Debug.ShouldStop(16777216);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable("batch (size="),rdchandler.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_commands.runMethod(true,"getSize")))),RemoteObject.createImmutable(")")));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executequery2(RemoteObject __ref,RemoteObject _con,RemoteObject _in,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("ExecuteQuery2 (rdchandler) ","rdchandler",2,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("executequery2")) { return __ref.runUserSub(false, "rdchandler","executequery2", __ref, _con, _in, _resp);}
RemoteObject _ser = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cmd = RemoteObject.declareNull("b4j.example.main._dbcommand");
RemoteObject _limit = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _jrs = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsmd = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cols = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("b4j.example.main._dbresult");
int _i = 0;
RemoteObject _row = null;
RemoteObject _ct = RemoteObject.createImmutable(0);
RemoteObject _sqltime = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _data = null;
Debug.locals.put("con", _con);
Debug.locals.put("in", _in);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 51;BA.debugLine="Private Sub ExecuteQuery2 (con As SQL, in As Input";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim ser As B4XSerializator";
Debug.ShouldStop(524288);
_ser = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");Debug.locals.put("ser", _ser);
 BA.debugLineNum = 53;BA.debugLine="Dim m As Map = ser.ConvertBytesToObject(Bit.Input";
Debug.ShouldStop(1048576);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(_ser.runMethod(false,"ConvertBytesToObject",(Object)(rdchandler.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((_in.getObject()))))));Debug.locals.put("m", _m);
 BA.debugLineNum = 54;BA.debugLine="Dim cmd As DBCommand = m.Get(\"command\")";
Debug.ShouldStop(2097152);
_cmd = (_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("command")))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 55;BA.debugLine="Dim limit As Int = m.Get(\"limit\")";
Debug.ShouldStop(4194304);
_limit = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("limit")))));Debug.locals.put("limit", _limit);Debug.locals.put("limit", _limit);
 BA.debugLineNum = 56;BA.debugLine="Dim rs As ResultSet = con.ExecQuery2(Main.rdcConn";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = _con.runMethod(false,"ExecQuery2",(Object)(rdchandler._main._rdcconnector1 /*RemoteObject*/ .runClassMethod (b4j.example.rdcconnector.class, "_getcommand" /*RemoteObject*/ ,(Object)(_cmd.getField(true,"Name" /*RemoteObject*/ )))),(Object)(rdchandler.__c.runMethod(false, "ArrayToList", (Object)(_cmd.getField(false,"Parameters" /*RemoteObject*/ )))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 57;BA.debugLine="If limit <= 0 Then limit = 0x7fffffff 'max int";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("k",_limit,BA.numberCast(double.class, 0))) { 
_limit = BA.numberCast(int.class, 0x7fffffff);Debug.locals.put("limit", _limit);};
 BA.debugLineNum = 58;BA.debugLine="Dim jrs As JavaObject = rs";
Debug.ShouldStop(33554432);
_jrs = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jrs.setObject(_rs.getObject());Debug.locals.put("jrs", _jrs);
 BA.debugLineNum = 59;BA.debugLine="Dim rsmd As JavaObject = jrs.RunMethod(\"getMetaDa";
Debug.ShouldStop(67108864);
_rsmd = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_rsmd.setObject(_jrs.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMetaData")),(Object)((rdchandler.__c.getField(false,"Null")))));Debug.locals.put("rsmd", _rsmd);
 BA.debugLineNum = 60;BA.debugLine="Dim cols As Int = rs.ColumnCount";
Debug.ShouldStop(134217728);
_cols = _rs.runMethod(true,"getColumnCount");Debug.locals.put("cols", _cols);Debug.locals.put("cols", _cols);
 BA.debugLineNum = 61;BA.debugLine="Dim res As DBResult";
Debug.ShouldStop(268435456);
_res = RemoteObject.createNew ("b4j.example.main._dbresult");Debug.locals.put("res", _res);
 BA.debugLineNum = 62;BA.debugLine="res.Initialize";
Debug.ShouldStop(536870912);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="res.columns.Initialize";
Debug.ShouldStop(1073741824);
_res.getField(false,"Columns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="res.Tag = Null 'without this the Tag properly wil";
Debug.ShouldStop(-2147483648);
_res.setField ("Tag" /*RemoteObject*/ ,rdchandler.__c.getField(false,"Null"));
 BA.debugLineNum = 65;BA.debugLine="For i = 0 To cols - 1";
Debug.ShouldStop(1);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_cols,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="res.columns.Put(rs.GetColumnName(i), i)";
Debug.ShouldStop(2);
_res.getField(false,"Columns" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _i))))),(Object)(RemoteObject.createImmutable((_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="res.Rows.Initialize";
Debug.ShouldStop(8);
_res.getField(false,"Rows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="Do While rs.NextRow And limit > 0";
Debug.ShouldStop(16);
while (RemoteObject.solveBoolean(".",_rs.runMethod(true,"NextRow")) && RemoteObject.solveBoolean(">",_limit,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 70;BA.debugLine="Dim row(cols) As Object";
Debug.ShouldStop(32);
_row = RemoteObject.createNewArray ("Object", new int[] {_cols.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("row", _row);
 BA.debugLineNum = 71;BA.debugLine="For i = 0 To cols - 1";
Debug.ShouldStop(64);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_cols,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 72;BA.debugLine="Dim ct As Int = rsmd.RunMethod(\"getColumnType\",";
Debug.ShouldStop(128);
_ct = BA.numberCast(int.class, _rsmd.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getColumnType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}))));Debug.locals.put("ct", _ct);Debug.locals.put("ct", _ct);
 BA.debugLineNum = 74;BA.debugLine="If ct = -2 Or ct = 2004 Or ct = -3 Or ct = -4 T";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_ct,BA.numberCast(double.class, -(double) (0 + 2))) || RemoteObject.solveBoolean("=",_ct,BA.numberCast(double.class, 2004)) || RemoteObject.solveBoolean("=",_ct,BA.numberCast(double.class, -(double) (0 + 3))) || RemoteObject.solveBoolean("=",_ct,BA.numberCast(double.class, -(double) (0 + 4)))) { 
 BA.debugLineNum = 75;BA.debugLine="row(i) = rs.GetBlob2(i)";
Debug.ShouldStop(1024);
_row.setArrayElement ((_rs.runMethod(false,"GetBlob2",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }else 
{ BA.debugLineNum = 76;BA.debugLine="Else if ct = 2 Or ct = 3 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_ct,BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",_ct,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 77;BA.debugLine="row(i) = rs.GetDouble2(i)";
Debug.ShouldStop(4096);
_row.setArrayElement ((_rs.runMethod(true,"GetDouble2",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }else 
{ BA.debugLineNum = 78;BA.debugLine="Else If DateTimeMethods.ContainsKey(ct) Then";
Debug.ShouldStop(8192);
if (__ref.getField(false,"_datetimemethods" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_ct))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="Dim SQLTime As JavaObject = jrs.RunMethodJO(Da";
Debug.ShouldStop(16384);
_sqltime = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sqltime = _jrs.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString(__ref.getField(false,"_datetimemethods" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_ct))))),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))})));Debug.locals.put("SQLTime", _sqltime);Debug.locals.put("SQLTime", _sqltime);
 BA.debugLineNum = 80;BA.debugLine="If SQLTime.IsInitialized Then";
Debug.ShouldStop(32768);
if (_sqltime.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="row(i) = SQLTime.RunMethod(\"getTime\", Null)";
Debug.ShouldStop(65536);
_row.setArrayElement (_sqltime.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTime")),(Object)((rdchandler.__c.getField(false,"Null")))),BA.numberCast(int.class, _i));
 }else {
 BA.debugLineNum = 83;BA.debugLine="row(i) = Null";
Debug.ShouldStop(262144);
_row.setArrayElement (rdchandler.__c.getField(false,"Null"),BA.numberCast(int.class, _i));
 };
 }else {
 BA.debugLineNum = 86;BA.debugLine="row(i) = jrs.RunMethod(\"getObject\", Array(i +";
Debug.ShouldStop(2097152);
_row.setArrayElement (_jrs.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getObject")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}))),BA.numberCast(int.class, _i));
 }}}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="res.Rows.Add(row)";
Debug.ShouldStop(16777216);
_res.getField(false,"Rows" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_row)));
 }
;
 BA.debugLineNum = 91;BA.debugLine="rs.Close";
Debug.ShouldStop(67108864);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 92;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(res";
Debug.ShouldStop(134217728);
_data = _ser.runMethod(false,"ConvertObjectToBytes",(Object)((_res)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 93;BA.debugLine="resp.OutputStream.WriteBytes(data, 0, data.Length";
Debug.ShouldStop(268435456);
_resp.runMethod(false,"getOutputStream").runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 94;BA.debugLine="Return \"query: \" & cmd.Name";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("query: "),_cmd.getField(true,"Name" /*RemoteObject*/ ));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handle(RemoteObject __ref,RemoteObject _req,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("Handle (rdchandler) ","rdchandler",2,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("handle")) { return __ref.runUserSub(false, "rdchandler","handle", __ref, _req, _resp);}
RemoteObject _start = RemoteObject.createImmutable(0L);
RemoteObject _q = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _con = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
Debug.locals.put("req", _req);
Debug.locals.put("resp", _resp);
 BA.debugLineNum = 16;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Dim start As Long = DateTime.Now";
Debug.ShouldStop(65536);
_start = rdchandler.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 18;BA.debugLine="Dim q As String";
Debug.ShouldStop(131072);
_q = RemoteObject.createImmutable("");Debug.locals.put("q", _q);
 BA.debugLineNum = 19;BA.debugLine="Dim in As InputStream = req.InputStream";
Debug.ShouldStop(262144);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_in = _req.runMethod(false,"getInputStream");Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 20;BA.debugLine="Dim method As String = req.GetParameter(\"method\")";
Debug.ShouldStop(524288);
_method = _req.runMethod(true,"GetParameter",(Object)(RemoteObject.createImmutable("method")));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 21;BA.debugLine="Dim con As SQL";
Debug.ShouldStop(1048576);
_con = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");Debug.locals.put("con", _con);
 BA.debugLineNum = 22;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 24;BA.debugLine="con = Main.rdcConnector1.GetConnection";
Debug.ShouldStop(8388608);
_con = rdchandler._main._rdcconnector1 /*RemoteObject*/ .runClassMethod (b4j.example.rdcconnector.class, "_getconnection" /*RemoteObject*/ );Debug.locals.put("con", _con);
 BA.debugLineNum = 25;BA.debugLine="If method = \"query2\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_method,BA.ObjectToString("query2"))) { 
 BA.debugLineNum = 26;BA.debugLine="q = ExecuteQuery2(con, in, resp)";
Debug.ShouldStop(33554432);
_q = __ref.runClassMethod (b4j.example.rdchandler.class, "_executequery2" /*RemoteObject*/ ,(Object)(_con),(Object)(_in),(Object)(_resp));Debug.locals.put("q", _q);
 }else 
{ BA.debugLineNum = 35;BA.debugLine="Else if method = \"batch2\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_method,BA.ObjectToString("batch2"))) { 
 BA.debugLineNum = 36;BA.debugLine="q = ExecuteBatch2(con, in, resp)";
Debug.ShouldStop(8);
_q = __ref.runClassMethod (b4j.example.rdchandler.class, "_executebatch2" /*RemoteObject*/ ,(Object)(_con),(Object)(_in),(Object)(_resp));Debug.locals.put("q", _q);
 }else {
 BA.debugLineNum = 38;BA.debugLine="Log(\"Unknown method: \" & method)";
Debug.ShouldStop(32);
rdchandler.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Unknown method: "),_method)));
 BA.debugLineNum = 39;BA.debugLine="resp.SendError(500, \"unknown method\")";
Debug.ShouldStop(64);
_resp.runVoidMethodAndSync ("SendError",(Object)(BA.numberCast(int.class, 500)),(Object)(RemoteObject.createImmutable("unknown method")));
 }}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 42;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
rdchandler.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(rdchandler.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 43;BA.debugLine="resp.SendError(500, LastException.Message)";
Debug.ShouldStop(1024);
_resp.runVoidMethodAndSync ("SendError",(Object)(BA.numberCast(int.class, 500)),(Object)(rdchandler.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 45;BA.debugLine="If con <> Null And con.IsInitialized Then con.Clo";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("N",_con) && RemoteObject.solveBoolean(".",_con.runMethod(true,"IsInitialized"))) { 
_con.runVoidMethod ("Close");};
 BA.debugLineNum = 46;BA.debugLine="Log($\"Command: ${q}, took: ${DateTime.Now - start";
Debug.ShouldStop(8192);
rdchandler.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Command: "),rdchandler.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_q))),RemoteObject.createImmutable(", took: "),rdchandler.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((RemoteObject.solve(new RemoteObject[] {rdchandler.__c.getField(false,"DateTime").runMethod(true,"getNow"),_start}, "-",1, 2)))),RemoteObject.createImmutable("ms, client="),rdchandler.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req.runMethod(true,"getRemoteAddress")))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Initialize (rdchandler) ","rdchandler",2,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "rdchandler","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="DateTimeMethods = CreateMap(91: \"getDate\", 92: \"g";
Debug.ShouldStop(4096);
__ref.setField ("_datetimemethods" /*RemoteObject*/ ,rdchandler.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((91)),RemoteObject.createImmutable(("getDate")),RemoteObject.createImmutable((92)),RemoteObject.createImmutable(("getTime")),RemoteObject.createImmutable((93)),(RemoteObject.createImmutable("getTimestamp"))})));
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}