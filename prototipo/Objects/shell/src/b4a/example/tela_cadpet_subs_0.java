package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_cadpet_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"Cad_PET\")";
Debug.ShouldStop(33554432);
tela_cadpet.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Cad_PET")),tela_cadpet.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","activity_resume");}
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
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
public static RemoteObject  _btncadastrarpet_click() throws Exception{
try {
		Debug.PushSubsStack("btnCadastrarPET_Click (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,66);
if (RapidSub.canDelegate("btncadastrarpet_click")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","btncadastrarpet_click");}
RemoteObject _foto = null;
 BA.debugLineNum = 66;BA.debugLine="Sub btnCadastrarPET_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="Dim Foto () As Byte";
Debug.ShouldStop(8);
_foto = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 69;BA.debugLine="Foto = CreateRequest.ImageToBytes(FotoPET.Bitmap)";
Debug.ShouldStop(16);
_foto = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_imagetobytes",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_cadpet.mostCurrent._fotopet.runMethod(false,"getBitmap")));Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 71;BA.debugLine="InserirPET(txtNomePET.Text, txtRacaPET.Text, txtC";
Debug.ShouldStop(64);
_inserirpet(tela_cadpet.mostCurrent._txtnomepet.runMethod(true,"getText"),tela_cadpet.mostCurrent._txtracapet.runMethod(true,"getText"),tela_cadpet.mostCurrent._txtcorpet.runMethod(true,"getText"),tela_cadpet.mostCurrent._main._usu_cod,BA.ObjectToString("Não"),tela_cadpet.mostCurrent._txtpetdescricao.runMethod(true,"getText"),_foto);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfotopet_click() throws Exception{
try {
		Debug.PushSubsStack("btnFotoPET_Click (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,76);
if (RapidSub.canDelegate("btnfotopet_click")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","btnfotopet_click");}
 BA.debugLineNum = 76;BA.debugLine="Sub btnFotoPET_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
Debug.ShouldStop(4096);
tela_cadpet.mostCurrent._imagechooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("imgChooser")));
 BA.debugLineNum = 78;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
Debug.ShouldStop(8192);
tela_cadpet.mostCurrent._imagechooser.runVoidMethod ("Show",tela_cadpet.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Escolha a Foto")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnMenu_Click (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,111);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","btnmenu_click");}
 BA.debugLineNum = 111;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
tela_cadpet.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,44);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 44;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(4096);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 46;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(8192);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(16384);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 48;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 49;BA.debugLine="Return cmd";
Debug.ShouldStop(65536);
if (true) return _cmd;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("CreateRequest (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,38);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 38;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(64);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 40;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_cadpet.processBA,(Object)(tela_cadpet.getObject()),(Object)(tela_cadpet.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 41;BA.debugLine="Return req";
Debug.ShouldStop(256);
if (true) return _req;
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 16;BA.debugLine="Private txtNomePET As EditText";
tela_cadpet.mostCurrent._txtnomepet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtRacaPET As EditText";
tela_cadpet.mostCurrent._txtracapet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtCorPET As EditText";
tela_cadpet.mostCurrent._txtcorpet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtPetDescricao As EditText";
tela_cadpet.mostCurrent._txtpetdescricao = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim ImageChooser As ContentChooser";
tela_cadpet.mostCurrent._imagechooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 21;BA.debugLine="Private FotoPET As ImageView";
tela_cadpet.mostCurrent._fotopet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgchooser_result(RemoteObject _succes,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("imgChooser_Result (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,83);
if (RapidSub.canDelegate("imgchooser_result")) { return b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","imgchooser_result", _succes, _dir, _filename);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _delta = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Succes", _succes);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 83;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If Succes=True Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_succes,tela_cadpet.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 85;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(1048576);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 86;BA.debugLine="b.Initialize(Dir, FileName)";
Debug.ShouldStop(2097152);
_b.runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 88;BA.debugLine="FotoPET.Bitmap = b";
Debug.ShouldStop(8388608);
tela_cadpet.mostCurrent._fotopet.runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 94;BA.debugLine="Dim Delta, Height, Width As Int";
Debug.ShouldStop(536870912);
_delta = RemoteObject.createImmutable(0);Debug.locals.put("Delta", _delta);
_height = RemoteObject.createImmutable(0);Debug.locals.put("Height", _height);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
 BA.debugLineNum = 95;BA.debugLine="If b.Width / b.Height > FotoPET.Width / FotoPET.";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight")}, "/",0, 0),RemoteObject.solve(new RemoteObject[] {tela_cadpet.mostCurrent._fotopet.runMethod(true,"getWidth"),tela_cadpet.mostCurrent._fotopet.runMethod(true,"getHeight")}, "/",0, 0))) { 
 BA.debugLineNum = 96;BA.debugLine="Height = b.Height / b.Width * FotoPET.Width";
Debug.ShouldStop(-2147483648);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getHeight"),_b.runMethod(true,"getWidth"),tela_cadpet.mostCurrent._fotopet.runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("Height", _height);
 BA.debugLineNum = 97;BA.debugLine="Delta = (FotoPET.Height - Height) / 2";
Debug.ShouldStop(1);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_cadpet.mostCurrent._fotopet.runMethod(true,"getHeight"),_height}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 98;BA.debugLine="FotoPET.Height = Height";
Debug.ShouldStop(2);
tela_cadpet.mostCurrent._fotopet.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 99;BA.debugLine="FotoPET.Top = FotoPET.Top + Delta";
Debug.ShouldStop(4);
tela_cadpet.mostCurrent._fotopet.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {tela_cadpet.mostCurrent._fotopet.runMethod(true,"getTop"),_delta}, "+",1, 1));
 }else {
 BA.debugLineNum = 101;BA.debugLine="Width = b.Width / b.Height * FotoPET.Height";
Debug.ShouldStop(16);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight"),tela_cadpet.mostCurrent._fotopet.runMethod(true,"getHeight")}, "/*",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 102;BA.debugLine="Delta = (FotoPET.Width - Width) / 2";
Debug.ShouldStop(32);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_cadpet.mostCurrent._fotopet.runMethod(true,"getWidth"),_width}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 103;BA.debugLine="FotoPET.Width = Width";
Debug.ShouldStop(64);
tela_cadpet.mostCurrent._fotopet.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 104;BA.debugLine="FotoPET.Left = FotoPET.Left + Delta";
Debug.ShouldStop(128);
tela_cadpet.mostCurrent._fotopet.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {tela_cadpet.mostCurrent._fotopet.runMethod(true,"getLeft"),_delta}, "+",1, 1));
 };
 }else {
 BA.debugLineNum = 107;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
Debug.ShouldStop(1024);
tela_cadpet.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Imagem não Selecionada")),(Object)(tela_cadpet.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _inserirpet(RemoteObject _nome,RemoteObject _raca,RemoteObject _cor,RemoteObject _usuario,RemoteObject _doacao,RemoteObject _descricao,RemoteObject _foto) throws Exception{
try {
		Debug.PushSubsStack("InserirPET (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,52);
if (RapidSub.canDelegate("inserirpet")) { b4a.example.tela_cadpet.remoteMe.runUserSub(false, "tela_cadpet","inserirpet", _nome, _raca, _cor, _usuario, _doacao, _descricao, _foto); return;}
ResumableSub_InserirPET rsub = new ResumableSub_InserirPET(null,_nome,_raca,_cor,_usuario,_doacao,_descricao,_foto);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InserirPET extends BA.ResumableSub {
public ResumableSub_InserirPET(b4a.example.tela_cadpet parent,RemoteObject _nome,RemoteObject _raca,RemoteObject _cor,RemoteObject _usuario,RemoteObject _doacao,RemoteObject _descricao,RemoteObject _foto) {
this.parent = parent;
this._nome = _nome;
this._raca = _raca;
this._cor = _cor;
this._usuario = _usuario;
this._doacao = _doacao;
this._descricao = _descricao;
this._foto = _foto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_cadpet parent;
RemoteObject _nome;
RemoteObject _raca;
RemoteObject _cor;
RemoteObject _usuario;
RemoteObject _doacao;
RemoteObject _descricao;
RemoteObject _foto;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InserirPET (tela_cadpet) ","tela_cadpet",9,tela_cadpet.mostCurrent.activityBA,tela_cadpet.mostCurrent,52);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Nome", _nome);
Debug.locals.put("raca", _raca);
Debug.locals.put("cor", _cor);
Debug.locals.put("usuario", _usuario);
Debug.locals.put("doacao", _doacao);
Debug.locals.put("descricao", _descricao);
Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 53;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InserirPET\"";
Debug.ShouldStop(1048576);
_cmd = _createcommand(BA.ObjectToString("InserirPET"),RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_nome),(_raca),(_cor),(_usuario),(_doacao),(_descricao),(_foto)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 54;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(2097152);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 55;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_cadpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 56;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 57;BA.debugLine="Msgbox(\"Inserido com sucesso!\", \"PETS\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Inserido com sucesso!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_cadpet.mostCurrent.activityBA);
 BA.debugLineNum = 58;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"Verifique os Valores Informados!\", \"PETS";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Verifique os Valores Informados!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_cadpet.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 63;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}