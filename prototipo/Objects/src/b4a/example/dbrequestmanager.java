package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dbrequestmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.dbrequestmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.dbrequestmanager.class).invoke(this, new Object[] {null});
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
public Object _mtarget = null;
public String _link = "";
public float _version = 0f;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_caddesap _tela_caddesap = null;
public b4a.example.tela_editarpet _tela_editarpet = null;
public b4a.example.tela_cadusu _tela_cadusu = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_vizdesap _tela_vizdesap = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_editarperfil _tela_editarperfil = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public String  _initialize(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.BA _ba,Object _target,String _connectorlink) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_connectorlink}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Initialize (Target As Object, Connector";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="mTarget = Target";
__ref._mtarget = _target;
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="link = ConnectorLink";
__ref._link = _connectorlink;
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.samples.httputils2.httpjob  _executequery(b4a.example.dbrequestmanager __ref,b4a.example.main._dbcommand _command,int _limit,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executequery"))
	 {return ((anywheresoftware.b4a.samples.httputils2.httpjob) Debug.delegate(ba, "executequery", new Object[] {_command,_limit,_tag}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub ExecuteQuery(Command As DBCommand, Limi";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim data() As Byte = ser.ConvertObjectToBytes(Cre";
_data = _ser.ConvertObjectToBytes((Object)(__c.createMap(new Object[] {(Object)("command"),(Object)(_command),(Object)("limit"),(Object)(_limit),(Object)("version"),(Object)(__ref._version)}).getObject()));
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Return SendJob(CreateJob, data, Tag, \"query2\")";
if (true) return __ref._sendjob(null,__ref._createjob(null),_data,_tag,"query2");
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="End Sub";
return null;
}
public void  _handlejobasync(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job,String _eventname) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "handlejobasync"))
	 {Debug.delegate(ba, "handlejobasync", new Object[] {_job,_eventname}); return;}
ResumableSub_HandleJobAsync rsub = new ResumableSub_HandleJobAsync(this,__ref,_job,_eventname);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleJobAsync extends BA.ResumableSub {
public ResumableSub_HandleJobAsync(b4a.example.dbrequestmanager parent,b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job,String _eventname) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._eventname = _eventname;
this.__ref = parent;
}
b4a.example.dbrequestmanager __ref;
b4a.example.dbrequestmanager parent;
anywheresoftware.b4a.samples.httputils2.httpjob _job;
String _eventname;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
boolean _success = false;
Object _newobject = null;
b4a.example.main._dbresult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
_data = parent.__c.Bit.InputStreamToBytes((java.io.InputStream)(_job._getinputstream().getObject()));
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="ser.ConvertBytesToObjectAsync(data, \"ser\")";
_ser.ConvertBytesToObjectAsync(ba,_data,"ser");
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Wait For (ser) ser_BytesToObject (Success As Bool";
parent.__c.WaitFor("ser_bytestoobject", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dbrequestmanager", "handlejobasync"), (Object)(_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[1];
_newobject = (Object) result[2];
;
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="If Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="Log(\"Error reading response: \" & LastException)";
parent.__c.Log("Error reading response: "+BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Dim res As DBResult = NewObject";
_res = (b4a.example.main._dbresult)(_newobject);
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="res.Tag = Job.Tag";
_res.Tag = _job._tag;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="CallSubDelayed2(mTarget, EventName & \"_result\", r";
parent.__c.CallSubDelayed2(ba,__ref._mtarget,_eventname+"_result",(Object)(_res));
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _printtable(b4a.example.dbrequestmanager __ref,b4a.example.main._dbresult _table) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "printtable"))
	 {return ((String) Debug.delegate(ba, "printtable", new Object[] {_table}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _col = null;
Object[] _row = null;
Object _record = null;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub PrintTable(Table As DBResult)";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Log(\"Tag: \" & Table.Tag & \", Columns: \" & Table.C";
__c.Log("Tag: "+BA.ObjectToString(_table.Tag)+", Columns: "+BA.NumberToString(_table.Columns.getSize())+", Rows: "+BA.NumberToString(_table.Rows.getSize()));
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="For Each col In Table.Columns.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _table.Columns.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_col = group4.Get(index4);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="sb.Append(col).Append(TAB)";
_sb.Append(BA.ObjectToString(_col)).Append(__c.TAB);
 }
};
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="Log(sb.ToString)";
__c.Log(_sb.ToString());
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="For Each row() As Object In Table.Rows";
{
final anywheresoftware.b4a.BA.IterableList group8 = _table.Rows;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (Object[])(group8.Get(index8));
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="For Each record As Object In row";
{
final Object[] group11 = _row;
final int groupLen11 = group11.length
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_record = group11[index11];
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="sb.Append(record).Append(TAB)";
_sb.Append(BA.ObjectToString(_record)).Append(__c.TAB);
 }
};
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="Log(sb.ToString)";
__c.Log(_sb.ToString());
 }
};
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="End Sub";
return "";
}
public byte[]  _imagetobytes(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "imagetobytes"))
	 {return ((byte[]) Debug.delegate(ba, "imagetobytes", new Object[] {_image}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub ImageToBytes(Image As Bitmap) As Byte()";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.samples.httputils2.httpjob  _executebatch(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executebatch"))
	 {return ((anywheresoftware.b4a.samples.httputils2.httpjob) Debug.delegate(ba, "executebatch", new Object[] {_listofcommands,_tag}));}
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Public Sub ExecuteBatch(ListOfCommands As List, Ta";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Dim j As HttpJob = CreateJob";
_j = __ref._createjob(null);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="ExecuteBatchImpl(j, ListOfCommands, Tag)";
__ref._executebatchimpl(null,_j,_listofcommands,_tag);
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _bytestoimage(b4a.example.dbrequestmanager __ref,byte[] _bytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "bytestoimage"))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Bitmap";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.dbrequestmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Private link As String";
_link = "";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Private VERSION As Float = 2";
_version = (float) (2);
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.samples.httputils2.httpjob  _createjob(b4a.example.dbrequestmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "createjob"))
	 {return ((anywheresoftware.b4a.samples.httputils2.httpjob) Debug.delegate(ba, "createjob", null));}
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub CreateJob As HttpJob";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="j.Initialize(\"DBRequest\", mTarget)";
_j._initialize(ba,"DBRequest",__ref._mtarget);
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="End Sub";
return null;
}
public void  _executebatchimpl(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executebatchimpl"))
	 {Debug.delegate(ba, "executebatchimpl", new Object[] {_job,_listofcommands,_tag}); return;}
ResumableSub_ExecuteBatchImpl rsub = new ResumableSub_ExecuteBatchImpl(this,__ref,_job,_listofcommands,_tag);
rsub.resume(ba, null);
}
public static class ResumableSub_ExecuteBatchImpl extends BA.ResumableSub {
public ResumableSub_ExecuteBatchImpl(b4a.example.dbrequestmanager parent,b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job,anywheresoftware.b4a.objects.collections.List _listofcommands,Object _tag) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._listofcommands = _listofcommands;
this._tag = _tag;
this.__ref = parent;
}
b4a.example.dbrequestmanager __ref;
b4a.example.dbrequestmanager parent;
anywheresoftware.b4a.samples.httputils2.httpjob _job;
anywheresoftware.b4a.objects.collections.List _listofcommands;
Object _tag;
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
boolean _success = false;
byte[] _bytes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dbrequestmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="ser.ConvertObjectToBytesAsync(CreateMap(\"commands";
_ser.ConvertObjectToBytesAsync(ba,(Object)(parent.__c.createMap(new Object[] {(Object)("commands"),(Object)(_listofcommands.getObject()),(Object)("version"),(Object)(__ref._version)}).getObject()),"ser");
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Wait For (ser) ser_ObjectToBytes (Success As Bool";
parent.__c.WaitFor("ser_objecttobytes", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dbrequestmanager", "executebatchimpl"), (Object)(_ser));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[1];
_bytes = (byte[]) result[2];
;
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="If Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Log(\"Error building command: \" & LastException)";
parent.__c.Log("Error building command: "+BA.ObjectToString(parent.__c.LastException(parent.getActivityBA())));
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="Dim ser As B4XSerializator = Sender";
_ser = (anywheresoftware.b4a.randomaccessfile.B4XSerializator)(parent.__c.Sender(parent.getActivityBA()));
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="SendJob(Job, Bytes, Tag, \"batch2\")";
__ref._sendjob(null,_job,_bytes,_tag,"batch2");
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.samples.httputils2.httpjob  _sendjob(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.samples.httputils2.httpjob _j,byte[] _data,Object _tag,String _method) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "sendjob"))
	 {return ((anywheresoftware.b4a.samples.httputils2.httpjob) Debug.delegate(ba, "sendjob", new Object[] {_j,_data,_tag,_method}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub SendJob(j As HttpJob, Data() As Byte,";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="j.Tag = Tag";
_j._tag = _tag;
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="j.PostBytes(link & \"?method=\" & Method , Data)";
_j._postbytes(__ref._link+"?method="+_method,_data);
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Return j";
if (true) return _j;
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.samples.httputils2.httpjob  _executecommand(b4a.example.dbrequestmanager __ref,b4a.example.main._dbcommand _command,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "executecommand"))
	 {return ((anywheresoftware.b4a.samples.httputils2.httpjob) Debug.delegate(ba, "executecommand", new Object[] {_command,_tag}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub ExecuteCommand(Command As DBCommand, Ta";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return ExecuteBatch(Array As DBCommand(Command),";
if (true) return __ref._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new b4a.example.main._dbcommand[]{_command}),_tag);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return null;
}
public byte[]  _filetobytes(b4a.example.dbrequestmanager __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "filetobytes"))
	 {return ((byte[]) Debug.delegate(ba, "filetobytes", new Object[] {_dir,_filename}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub FileToBytes(Dir As String, FileName As";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Dim In As InputStream = File.OpenInput(Dir, FileN";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="End Sub";
return null;
}
public b4a.example.main._dbresult  _handlejob(b4a.example.dbrequestmanager __ref,anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="dbrequestmanager";
if (Debug.shouldDelegate(ba, "handlejob"))
	 {return ((b4a.example.main._dbresult) Debug.delegate(ba, "handlejob", new Object[] {_job}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _ser = null;
byte[] _data = null;
b4a.example.main._dbresult _res = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub HandleJob(Job As HttpJob) As DBResult";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim ser As B4XSerializator";
_ser = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Dim data() As Byte = Bit.InputStreamToBytes(Job.G";
_data = __c.Bit.InputStreamToBytes((java.io.InputStream)(_job._getinputstream().getObject()));
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Dim res As DBResult = ser.ConvertBytesToObject(da";
_res = (b4a.example.main._dbresult)(_ser.ConvertBytesToObject(_data));
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="res.Tag = Job.Tag";
_res.Tag = _job._tag;
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="End Sub";
return null;
}
}