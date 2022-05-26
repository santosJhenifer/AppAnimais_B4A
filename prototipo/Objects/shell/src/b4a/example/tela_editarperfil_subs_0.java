package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_editarperfil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"EditarPerfil\")";
Debug.ShouldStop(134217728);
tela_editarperfil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("EditarPerfil")),tela_editarperfil.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="ListarUsu(Main.Usu_Cod)";
Debug.ShouldStop(268435456);
_listarusu(tela_editarperfil.mostCurrent._main._usu_cod);
 BA.debugLineNum = 30;BA.debugLine="CarregarCidades";
Debug.ShouldStop(536870912);
_carregarcidades();
 BA.debugLineNum = 31;BA.debugLine="Main.CodigoCidade=1";
Debug.ShouldStop(1073741824);
tela_editarperfil.mostCurrent._main._codigocidade = BA.NumberToString(1);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,38);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,34);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","activity_resume");}
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _atualizarusu(RemoteObject _nome,RemoteObject _endereco,RemoteObject _login,RemoteObject _senha,RemoteObject _cidade,RemoteObject _foto,RemoteObject _celular,RemoteObject _codigo) throws Exception{
try {
		Debug.PushSubsStack("AtualizarUsu (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,79);
if (RapidSub.canDelegate("atualizarusu")) { b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","atualizarusu", _nome, _endereco, _login, _senha, _cidade, _foto, _celular, _codigo); return;}
ResumableSub_AtualizarUsu rsub = new ResumableSub_AtualizarUsu(null,_nome,_endereco,_login,_senha,_cidade,_foto,_celular,_codigo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AtualizarUsu extends BA.ResumableSub {
public ResumableSub_AtualizarUsu(b4a.example.tela_editarperfil parent,RemoteObject _nome,RemoteObject _endereco,RemoteObject _login,RemoteObject _senha,RemoteObject _cidade,RemoteObject _foto,RemoteObject _celular,RemoteObject _codigo) {
this.parent = parent;
this._nome = _nome;
this._endereco = _endereco;
this._login = _login;
this._senha = _senha;
this._cidade = _cidade;
this._foto = _foto;
this._celular = _celular;
this._codigo = _codigo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_editarperfil parent;
RemoteObject _nome;
RemoteObject _endereco;
RemoteObject _login;
RemoteObject _senha;
RemoteObject _cidade;
RemoteObject _foto;
RemoteObject _celular;
RemoteObject _codigo;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AtualizarUsu (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,79);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Nome", _nome);
Debug.locals.put("endereco", _endereco);
Debug.locals.put("login", _login);
Debug.locals.put("senha", _senha);
Debug.locals.put("cidade", _cidade);
Debug.locals.put("Foto", _foto);
Debug.locals.put("Celular", _celular);
Debug.locals.put("codigo", _codigo);
 BA.debugLineNum = 80;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"AtualizarUs";
Debug.ShouldStop(32768);
_cmd = _createcommand(BA.ObjectToString("AtualizarUsu"),RemoteObject.createNewArray("Object",new int[] {8},new Object[] {(_nome),(_endereco),(_login),(_senha),(_cidade),(_foto),(_celular),(parent.mostCurrent._main._usu_cod)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 81;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(65536);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 82;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_editarperfil.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 84;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Dados Atualizados com sucesso!\", \"PETS\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Dados Atualizados com sucesso!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_editarperfil.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"Verifique os dados informados!\", \"PETS\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Verifique os dados informados!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_editarperfil.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 92;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static RemoteObject  _btnatualizar_click() throws Exception{
try {
		Debug.PushSubsStack("btnAtualizar_Click (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,173);
if (RapidSub.canDelegate("btnatualizar_click")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","btnatualizar_click");}
RemoteObject _foto = null;
 BA.debugLineNum = 173;BA.debugLine="Sub btnAtualizar_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Dim Foto () As Byte";
Debug.ShouldStop(8192);
_foto = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 175;BA.debugLine="Foto = CreateRequest.ImageToBytes(usu_foto.Bitmap";
Debug.ShouldStop(16384);
_foto = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_imagetobytes",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_editarperfil.mostCurrent._usu_foto.runMethod(false,"getBitmap")));Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 177;BA.debugLine="AtualizarUsu(txtNomeUsu.Text, txtEnd.Text, txtLog";
Debug.ShouldStop(65536);
_atualizarusu(tela_editarperfil.mostCurrent._txtnomeusu.runMethod(true,"getText"),tela_editarperfil.mostCurrent._txtend.runMethod(true,"getText"),tela_editarperfil.mostCurrent._txtloginusu.runMethod(true,"getText"),tela_editarperfil.mostCurrent._txtsenhausu.runMethod(true,"getText"),tela_editarperfil.mostCurrent._main._codigocidade,_foto,tela_editarperfil.mostCurrent._txtcelular.runMethod(true,"getText"),tela_editarperfil.mostCurrent._main._usu_cod);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfotousu_click() throws Exception{
try {
		Debug.PushSubsStack("btnFotoUsu_Click (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,140);
if (RapidSub.canDelegate("btnfotousu_click")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","btnfotousu_click");}
 BA.debugLineNum = 140;BA.debugLine="Sub btnFotoUsu_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
Debug.ShouldStop(4096);
tela_editarperfil.mostCurrent._imagechooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("imgChooser")));
 BA.debugLineNum = 142;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
Debug.ShouldStop(8192);
tela_editarperfil.mostCurrent._imagechooser.runVoidMethod ("Show",tela_editarperfil.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Escolha a Foto")));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenu_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,136);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","btnmenu_click");}
 BA.debugLineNum = 136;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Activity.Finish";
Debug.ShouldStop(256);
tela_editarperfil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _carregarcidades() throws Exception{
try {
		Debug.PushSubsStack("CarregarCidades (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,56);
if (RapidSub.canDelegate("carregarcidades")) { b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","carregarcidades"); return;}
ResumableSub_CarregarCidades rsub = new ResumableSub_CarregarCidades(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CarregarCidades extends BA.ResumableSub {
public ResumableSub_CarregarCidades(b4a.example.tela_editarperfil parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_editarperfil parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CarregarCidades (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,56);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 57;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(16777216);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 58;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarCid";
Debug.ShouldStop(33554432);
_cmd = _createcommand(BA.ObjectToString("CarregarCidades"),(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 59;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_editarperfil.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 60;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",tela_editarperfil.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Carregando..."))));
 BA.debugLineNum = 61;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 62;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 63;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_editarperfil.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 66;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 68;BA.debugLine="spinnerCidade.Clear";
Debug.ShouldStop(8);
parent.mostCurrent._spinnercidade.runVoidMethod ("Clear");
 BA.debugLineNum = 69;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(16);
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.getField(false,"Rows");
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 70;BA.debugLine="spinnerCidade.Add(\"(\" & row(0) & \") \" & row(1))";
Debug.ShouldStop(32);
parent.mostCurrent._spinnercidade.runVoidMethod ("Add",(Object)(RemoteObject.concat(RemoteObject.createImmutable("("),_row.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(") "),_row.getArrayElement(false,BA.numberCast(int.class, 1)))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 73;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 75;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 76;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,48);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 48;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(65536);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 50;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(131072);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(262144);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 52;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 53;BA.debugLine="Return cmd";
Debug.ShouldStop(1048576);
if (true) return _cmd;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest() throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,42);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 42;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 44;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_editarperfil.processBA,(Object)(tela_editarperfil.getObject()),(Object)(tela_editarperfil.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 45;BA.debugLine="Return req";
Debug.ShouldStop(4096);
if (true) return _req;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtCelular As EditText";
tela_editarperfil.mostCurrent._txtcelular = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtEnd As EditText";
tela_editarperfil.mostCurrent._txtend = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtLoginUsu As EditText";
tela_editarperfil.mostCurrent._txtloginusu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtNomeUsu As EditText";
tela_editarperfil.mostCurrent._txtnomeusu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtSenhaUsu As EditText";
tela_editarperfil.mostCurrent._txtsenhausu = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private usu_foto As ImageView";
tela_editarperfil.mostCurrent._usu_foto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim ImageChooser As ContentChooser";
tela_editarperfil.mostCurrent._imagechooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 23;BA.debugLine="Private spinnerCidade As Spinner";
tela_editarperfil.mostCurrent._spinnercidade = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgchooser_result(RemoteObject _succes,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("imgChooser_Result (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,145);
if (RapidSub.canDelegate("imgchooser_result")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","imgchooser_result", _succes, _dir, _filename);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _delta = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Succes", _succes);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 145;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="If Succes=True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_succes,tela_editarperfil.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 147;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(262144);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 148;BA.debugLine="b.Initialize(Dir, FileName)";
Debug.ShouldStop(524288);
_b.runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 150;BA.debugLine="usu_foto.Bitmap = b";
Debug.ShouldStop(2097152);
tela_editarperfil.mostCurrent._usu_foto.runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 156;BA.debugLine="Dim Delta, Height, Width As Int";
Debug.ShouldStop(134217728);
_delta = RemoteObject.createImmutable(0);Debug.locals.put("Delta", _delta);
_height = RemoteObject.createImmutable(0);Debug.locals.put("Height", _height);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
 BA.debugLineNum = 157;BA.debugLine="If b.Width / b.Height > usu_foto.Width / usu_fot";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight")}, "/",0, 0),RemoteObject.solve(new RemoteObject[] {tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getWidth"),tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getHeight")}, "/",0, 0))) { 
 BA.debugLineNum = 158;BA.debugLine="Height = b.Height / b.Width * usu_foto.Width";
Debug.ShouldStop(536870912);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getHeight"),_b.runMethod(true,"getWidth"),tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("Height", _height);
 BA.debugLineNum = 159;BA.debugLine="Delta = (usu_foto.Height - Height) / 2";
Debug.ShouldStop(1073741824);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getHeight"),_height}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 160;BA.debugLine="usu_foto.Height = Height";
Debug.ShouldStop(-2147483648);
tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 161;BA.debugLine="usu_foto.Top = usu_foto.Top + Delta";
Debug.ShouldStop(1);
tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getTop"),_delta}, "+",1, 1));
 }else {
 BA.debugLineNum = 163;BA.debugLine="Width = b.Width / b.Height * usu_foto.Height";
Debug.ShouldStop(4);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight"),tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getHeight")}, "/*",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 164;BA.debugLine="Delta = (usu_foto.Width - Width) / 2";
Debug.ShouldStop(8);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getWidth"),_width}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 165;BA.debugLine="usu_foto.Width = Width";
Debug.ShouldStop(16);
tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 166;BA.debugLine="usu_foto.Left = usu_foto.Left + Delta";
Debug.ShouldStop(32);
tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {tela_editarperfil.mostCurrent._usu_foto.runMethod(true,"getLeft"),_delta}, "+",1, 1));
 };
 }else {
 BA.debugLineNum = 169;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
Debug.ShouldStop(256);
tela_editarperfil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Imagem não Selecionada")),(Object)(tela_editarperfil.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listarusu(RemoteObject _codigo) throws Exception{
try {
		Debug.PushSubsStack("ListarUsu (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,96);
if (RapidSub.canDelegate("listarusu")) { b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","listarusu", _codigo); return;}
ResumableSub_ListarUsu rsub = new ResumableSub_ListarUsu(null,_codigo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListarUsu extends BA.ResumableSub {
public ResumableSub_ListarUsu(b4a.example.tela_editarperfil parent,RemoteObject _codigo) {
this.parent = parent;
this._codigo = _codigo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_editarperfil parent;
RemoteObject _codigo;
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.main._dbresult");
RemoteObject _row = null;
RemoteObject _obitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _buffer = null;
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListarUsu (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,96);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 97;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(1);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 98;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ListarUsu\",";
Debug.ShouldStop(2);
_cmd = _createcommand(BA.ObjectToString("ListarUsu"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_codigo)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 99;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_editarperfil.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 100;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 101;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 102;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_editarperfil.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 105;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 106;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(512);
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.getField(false,"Rows");
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 107;BA.debugLine="Dim oBitMap As Bitmap";
Debug.ShouldStop(1024);
_obitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 108;BA.debugLine="Dim buffer() As Byte";
Debug.ShouldStop(2048);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 109;BA.debugLine="buffer = row(6)";
Debug.ShouldStop(4096);
_buffer = (_row.getArrayElement(false,BA.numberCast(int.class, 6)));Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 110;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
Debug.ShouldStop(8192);
_obitmap = _req.runClassMethod (b4a.example.dbrequestmanager.class, "_bytestoimage",(Object)(_buffer));Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 112;BA.debugLine="usu_foto.Bitmap=oBitMap";
Debug.ShouldStop(32768);
parent.mostCurrent._usu_foto.runMethod(false,"setBitmap",(_obitmap.getObject()));
 BA.debugLineNum = 113;BA.debugLine="txtNomeUsu.Text=row(1)";
Debug.ShouldStop(65536);
parent.mostCurrent._txtnomeusu.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 114;BA.debugLine="txtEnd.Text=row(2)";
Debug.ShouldStop(131072);
parent.mostCurrent._txtend.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 115;BA.debugLine="txtLoginUsu.Text=row(3)";
Debug.ShouldStop(262144);
parent.mostCurrent._txtloginusu.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 116;BA.debugLine="txtSenhaUsu.Text=row(4)";
Debug.ShouldStop(524288);
parent.mostCurrent._txtsenhausu.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 4))));
 BA.debugLineNum = 117;BA.debugLine="txtCelular.Text = row(7)";
Debug.ShouldStop(1048576);
parent.mostCurrent._txtcelular.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 7))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 120;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 122;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 123;BA.debugLine="j.Release";
Debug.ShouldStop(67108864);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinnercidade_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinnerCidade_ItemClick (tela_editarperfil) ","tela_editarperfil",8,tela_editarperfil.mostCurrent.activityBA,tela_editarperfil.mostCurrent,127);
if (RapidSub.canDelegate("spinnercidade_itemclick")) { return b4a.example.tela_editarperfil.remoteMe.runUserSub(false, "tela_editarperfil","spinnercidade_itemclick", _position, _value);}
RemoteObject _sf = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 127;BA.debugLine="Sub spinnerCidade_ItemClick (Position As Int, Valu";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 129;BA.debugLine="Dim sf As StringFunctions";
Debug.ShouldStop(1);
_sf = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("sf", _sf);
 BA.debugLineNum = 130;BA.debugLine="Main.CodigoCidade = sf.MidExtract(Value,\"(\",\")\")";
Debug.ShouldStop(2);
tela_editarperfil.mostCurrent._main._codigocidade = _sf.runMethod(true,"_vvvv6",(Object)(BA.ObjectToString(_value)),(Object)(BA.ObjectToString("(")),(Object)(RemoteObject.createImmutable(")")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",tela_editarperfil.processBA, e5.toString()); BA.debugLineNum = 132;BA.debugLine="Main.CodigoCidade=0";
Debug.ShouldStop(8);
tela_editarperfil.mostCurrent._main._codigocidade = BA.NumberToString(0);
 };
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}