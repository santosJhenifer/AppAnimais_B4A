package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class rdchandler extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.rdchandler", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.rdchandler.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _datetimemethods = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.rdchandler __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdchandler";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Private DateTimeMethods As Map";
_datetimemethods = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="End Sub";
return "";
}
public String  _executebatch2(b4j.example.rdchandler __ref,anywheresoftware.b4j.objects.SQL _con,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdchandler";
if (Debug.shouldDelegate(ba, "executebatch2", false))
	 {return ((String) Debug.delegate(ba, "executebatch2", new Object[] {_con,_in,_resp}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _commands = null;
b4j.example.main._dbresult _res = null;
b4j.example.main._dbcommand _cmd = null;
byte[] _data = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub ExecuteBatch2(con As SQL, in As InputS";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim m As Map = ser.ConvertBytesToObject(Bit.Input";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ser.ConvertBytesToObject(__c.Bit.InputStreamToBytes((java.io.InputStream)(_in.getObject())))));
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Dim commands As List = m.Get(\"commands\")";
_commands = new anywheresoftware.b4a.objects.collections.List();
_commands.setObject((java.util.List)(_m.Get((Object)("commands"))));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Dim res As DBResult";
_res = new b4j.example.main._dbresult();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="res.columns = CreateMap(\"AffectedRows (N/A)\": 0)";
_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("AffectedRows (N/A)"),(Object)(0)});
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="res.Rows.Initialize";
_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="res.Tag = Null";
_res.Tag /*Object*/  = __c.Null;
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Try";
try {RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="con.BeginTransaction";
_con.BeginTransaction();
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="For Each cmd As DBCommand In commands";
{
final anywheresoftware.b4a.BA.IterableList group11 = _commands;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_cmd = (b4j.example.main._dbcommand)(group11.Get(index11));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="con.ExecNonQuery2(Main.rdcConnector1.GetCommand";
_con.ExecNonQuery2(_main._rdcconnector1 /*b4j.example.rdcconnector*/ ._getcommand /*String*/ (null,_cmd.Name /*String*/ ),anywheresoftware.b4a.keywords.Common.ArrayToList(_cmd.Parameters /*Object[]*/ ));
 }
};
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="res.Rows.Add(Array As Object(0))";
_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new Object[]{(Object)(0)}));
RDebugUtils.currentLine=786448;
 //BA.debugLineNum = 786448;BA.debugLine="con.TransactionSuccessful";
_con.TransactionSuccessful();
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="con.Rollback";
_con.Rollback();
RDebugUtils.currentLine=786451;
 //BA.debugLineNum = 786451;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=786452;
 //BA.debugLineNum = 786452;BA.debugLine="resp.SendError(500, LastException.Message)";
_resp.SendError((int) (500),__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(res";
_data = _ser.ConvertObjectToBytes((Object)(_res));
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="resp.OutputStream.WriteBytes(data, 0, data.Length";
_resp.getOutputStream().WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=786456;
 //BA.debugLineNum = 786456;BA.debugLine="Return $\"batch (size=${commands.Size})\"$";
if (true) return ("batch (size="+__c.SmartStringFormatter("",(Object)(_commands.getSize()))+")");
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="End Sub";
return "";
}
public String  _executequery2(b4j.example.rdchandler __ref,anywheresoftware.b4j.objects.SQL _con,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdchandler";
if (Debug.shouldDelegate(ba, "executequery2", false))
	 {return ((String) Debug.delegate(ba, "executequery2", new Object[] {_con,_in,_resp}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.example.main._dbcommand _cmd = null;
int _limit = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4j.object.JavaObject _jrs = null;
anywheresoftware.b4j.object.JavaObject _rsmd = null;
int _cols = 0;
b4j.example.main._dbresult _res = null;
int _i = 0;
Object[] _row = null;
int _ct = 0;
anywheresoftware.b4j.object.JavaObject _sqltime = null;
byte[] _data = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub ExecuteQuery2 (con As SQL, in As Input";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim m As Map = ser.ConvertBytesToObject(Bit.Input";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_ser.ConvertBytesToObject(__c.Bit.InputStreamToBytes((java.io.InputStream)(_in.getObject())))));
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Dim cmd As DBCommand = m.Get(\"command\")";
_cmd = (b4j.example.main._dbcommand)(_m.Get((Object)("command")));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Dim limit As Int = m.Get(\"limit\")";
_limit = (int)(BA.ObjectToNumber(_m.Get((Object)("limit"))));
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Dim rs As ResultSet = con.ExecQuery2(Main.rdcConn";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = _con.ExecQuery2(_main._rdcconnector1 /*b4j.example.rdcconnector*/ ._getcommand /*String*/ (null,_cmd.Name /*String*/ ),anywheresoftware.b4a.keywords.Common.ArrayToList(_cmd.Parameters /*Object[]*/ ));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="If limit <= 0 Then limit = 0x7fffffff 'max int";
if (_limit<=0) { 
_limit = (int) (0x7fffffff);};
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Dim jrs As JavaObject = rs";
_jrs = new anywheresoftware.b4j.object.JavaObject();
_jrs.setObject((java.lang.Object)(_rs.getObject()));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim rsmd As JavaObject = jrs.RunMethod(\"getMetaDa";
_rsmd = new anywheresoftware.b4j.object.JavaObject();
_rsmd.setObject((java.lang.Object)(_jrs.RunMethod("getMetaData",(Object[])(__c.Null))));
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Dim cols As Int = rs.ColumnCount";
_cols = _rs.getColumnCount();
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Dim res As DBResult";
_res = new b4j.example.main._dbresult();
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="res.columns.Initialize";
_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="res.Tag = Null 'without this the Tag properly wil";
_res.Tag /*Object*/  = __c.Null;
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="For i = 0 To cols - 1";
{
final int step14 = 1;
final int limit14 = (int) (_cols-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="res.columns.Put(rs.GetColumnName(i), i)";
_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rs.GetColumnName(_i)),(Object)(_i));
 }
};
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="res.Rows.Initialize";
_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="Do While rs.NextRow And limit > 0";
while (_rs.NextRow() && _limit>0) {
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="Dim row(cols) As Object";
_row = new Object[_cols];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="For i = 0 To cols - 1";
{
final int step20 = 1;
final int limit20 = (int) (_cols-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="Dim ct As Int = rsmd.RunMethod(\"getColumnType\",";
_ct = (int)(BA.ObjectToNumber(_rsmd.RunMethod("getColumnType",new Object[]{(Object)(_i+1)})));
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="If ct = -2 Or ct = 2004 Or ct = -3 Or ct = -4 T";
if (_ct==-2 || _ct==2004 || _ct==-3 || _ct==-4) { 
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="row(i) = rs.GetBlob2(i)";
_row[_i] = (Object)(_rs.GetBlob2(_i));
 }else 
{RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="Else if ct = 2 Or ct = 3 Then";
if (_ct==2 || _ct==3) { 
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="row(i) = rs.GetDouble2(i)";
_row[_i] = (Object)(_rs.GetDouble2(_i));
 }else 
{RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Else If DateTimeMethods.ContainsKey(ct) Then";
if (__ref._datetimemethods /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_ct))) { 
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="Dim SQLTime As JavaObject = jrs.RunMethodJO(Da";
_sqltime = new anywheresoftware.b4j.object.JavaObject();
_sqltime = _jrs.RunMethodJO(BA.ObjectToString(__ref._datetimemethods /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_ct))),new Object[]{(Object)(_i+1)});
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="If SQLTime.IsInitialized Then";
if (_sqltime.IsInitialized()) { 
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="row(i) = SQLTime.RunMethod(\"getTime\", Null)";
_row[_i] = _sqltime.RunMethod("getTime",(Object[])(__c.Null));
 }else {
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="row(i) = Null";
_row[_i] = __c.Null;
 };
 }else {
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="row(i) = jrs.RunMethod(\"getObject\", Array(i +";
_row[_i] = _jrs.RunMethod("getObject",new Object[]{(Object)(_i+1)});
 }}}
;
 }
};
RDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="res.Rows.Add(row)";
_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_row));
 }
;
RDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(res";
_data = _ser.ConvertObjectToBytes((Object)(_res));
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="resp.OutputStream.WriteBytes(data, 0, data.Length";
_resp.getOutputStream().WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=720939;
 //BA.debugLineNum = 720939;BA.debugLine="Return \"query: \" & cmd.Name";
if (true) return "query: "+_cmd.Name /*String*/ ;
RDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="End Sub";
return "";
}
public String  _handle(b4j.example.rdchandler __ref,anywheresoftware.b4j.object.JServlet.ServletRequestWrapper _req,anywheresoftware.b4j.object.JServlet.ServletResponseWrapper _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="rdchandler";
if (Debug.shouldDelegate(ba, "handle", false))
	 {return ((String) Debug.delegate(ba, "handle", new Object[] {_req,_resp}));}
long _start = 0L;
String _q = "";
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
String _method = "";
anywheresoftware.b4j.objects.SQL _con = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Handle(req As ServletRequest, resp As ServletR";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim start As Long = DateTime.Now";
_start = __c.DateTime.getNow();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim q As String";
_q = "";
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim in As InputStream = req.InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = _req.getInputStream();
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim method As String = req.GetParameter(\"method\")";
_method = _req.GetParameter("method");
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Dim con As SQL";
_con = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Try";
try {RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="con = Main.rdcConnector1.GetConnection";
_con = _main._rdcconnector1 /*b4j.example.rdcconnector*/ ._getconnection /*anywheresoftware.b4j.objects.SQL*/ (null);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="If method = \"query2\" Then";
if ((_method).equals("query2")) { 
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="q = ExecuteQuery2(con, in, resp)";
_q = __ref._executequery2 /*String*/ (null,_con,_in,_resp);
 }else 
{RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="Else if method = \"batch2\" Then";
if ((_method).equals("batch2")) { 
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="q = ExecuteBatch2(con, in, resp)";
_q = __ref._executebatch2 /*String*/ (null,_con,_in,_resp);
 }else {
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="Log(\"Unknown method: \" & method)";
__c.Log("Unknown method: "+_method);
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="resp.SendError(500, \"unknown method\")";
_resp.SendError((int) (500),"unknown method");
 }}
;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="resp.SendError(500, LastException.Message)";
_resp.SendError((int) (500),__c.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="If con <> Null And con.IsInitialized Then con.Clo";
if (_con!= null && _con.IsInitialized()) { 
_con.Close();};
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="Log($\"Command: ${q}, took: ${DateTime.Now - start";
__c.Log(("Command: "+__c.SmartStringFormatter("",(Object)(_q))+", took: "+__c.SmartStringFormatter("",(Object)(__c.DateTime.getNow()-_start))+"ms, client="+__c.SmartStringFormatter("",(Object)(_req.getRemoteAddress()))+""));
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.rdchandler __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="rdchandler";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="DateTimeMethods = CreateMap(91: \"getDate\", 92: \"g";
__ref._datetimemethods /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)(91),(Object)("getDate"),(Object)(92),(Object)("getTime"),(Object)(93),(Object)("getTimestamp")});
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
}