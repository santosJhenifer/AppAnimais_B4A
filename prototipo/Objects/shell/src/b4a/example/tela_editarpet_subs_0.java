package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tela_editarpet_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"EditarPET\")";
Debug.ShouldStop(33554432);
tela_editarpet.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("EditarPET")),tela_editarpet.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="ListarEditPET(Main.CodigoPet)";
Debug.ShouldStop(67108864);
_listareditpet(tela_editarpet.mostCurrent._main._codigopet);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _atualizarpet(RemoteObject _nome,RemoteObject _raca,RemoteObject _cor,RemoteObject _usuario,RemoteObject _foto,RemoteObject _doacao,RemoteObject _descricao) throws Exception{
try {
		Debug.PushSubsStack("AtualizarPET (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,53);
if (RapidSub.canDelegate("atualizarpet")) { b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","atualizarpet", _nome, _raca, _cor, _usuario, _foto, _doacao, _descricao); return;}
ResumableSub_AtualizarPET rsub = new ResumableSub_AtualizarPET(null,_nome,_raca,_cor,_usuario,_foto,_doacao,_descricao);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AtualizarPET extends BA.ResumableSub {
public ResumableSub_AtualizarPET(b4a.example.tela_editarpet parent,RemoteObject _nome,RemoteObject _raca,RemoteObject _cor,RemoteObject _usuario,RemoteObject _foto,RemoteObject _doacao,RemoteObject _descricao) {
this.parent = parent;
this._nome = _nome;
this._raca = _raca;
this._cor = _cor;
this._usuario = _usuario;
this._foto = _foto;
this._doacao = _doacao;
this._descricao = _descricao;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_editarpet parent;
RemoteObject _nome;
RemoteObject _raca;
RemoteObject _cor;
RemoteObject _usuario;
RemoteObject _foto;
RemoteObject _doacao;
RemoteObject _descricao;
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AtualizarPET (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,53);
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
Debug.locals.put("Foto", _foto);
Debug.locals.put("doacao", _doacao);
Debug.locals.put("descricao", _descricao);
 BA.debugLineNum = 54;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"AtualizarPE";
Debug.ShouldStop(2097152);
_cmd = _createcommand(BA.ObjectToString("AtualizarPET"),RemoteObject.createNewArray("Object",new int[] {8},new Object[] {(_nome),(_raca),(_cor),(_usuario),(_foto),(_doacao),(_descricao),(parent.mostCurrent._main._codigopet)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 55;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
Debug.ShouldStop(4194304);
_j = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_executebatch",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cmd)})))),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 56;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_editarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 57;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"Atualizado com sucesso!\", \"PETS\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Atualizado com sucesso!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_editarpet.mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 61;BA.debugLine="Msgbox(\"Verifique os Valores Informados!\", \"PETS";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Verifique os Valores Informados!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PETS"))),tela_editarpet.mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="j.Release";
Debug.ShouldStop(-2147483648);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btnAtualizar_Click (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,136);
if (RapidSub.canDelegate("btnatualizar_click")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","btnatualizar_click");}
RemoteObject _foto = null;
 BA.debugLineNum = 136;BA.debugLine="Sub btnAtualizar_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim Foto () As Byte";
Debug.ShouldStop(256);
_foto = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 138;BA.debugLine="Foto = CreateRequest.ImageToBytes(imgPET.Bitmap)";
Debug.ShouldStop(512);
_foto = _createrequest().runClassMethod (b4a.example.dbrequestmanager.class, "_imagetobytes",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), tela_editarpet.mostCurrent._imgpet.runMethod(false,"getBitmap")));Debug.locals.put("Foto", _foto);
 BA.debugLineNum = 140;BA.debugLine="AtualizarPET(txtNomePET.Text, txtRacaPET.Text, tx";
Debug.ShouldStop(2048);
_atualizarpet(tela_editarpet.mostCurrent._txtnomepet.runMethod(true,"getText"),tela_editarpet.mostCurrent._txtracapet.runMethod(true,"getText"),tela_editarpet.mostCurrent._txtcorpet.runMethod(true,"getText"),tela_editarpet.mostCurrent._main._usu_cod,_foto,BA.ObjectToString("Não"),tela_editarpet.mostCurrent._txtpetdescricao.runMethod(true,"getText"));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btnFotoPET_Click (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,102);
if (RapidSub.canDelegate("btnfotopet_click")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","btnfotopet_click");}
 BA.debugLineNum = 102;BA.debugLine="Sub btnFotoPET_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
Debug.ShouldStop(64);
tela_editarpet.mostCurrent._imagechooser.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("imgChooser")));
 BA.debugLineNum = 104;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
Debug.ShouldStop(128);
tela_editarpet.mostCurrent._imagechooser.runVoidMethod ("Show",tela_editarpet.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Escolha a Foto")));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnMenu_Click (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,98);
if (RapidSub.canDelegate("btnmenu_click")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","btnmenu_click");}
 BA.debugLineNum = 98;BA.debugLine="Sub btnMenu_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
tela_editarpet.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("CreateCommand (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,45);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 45;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(8192);
_cmd = RemoteObject.createNew ("b4a.example.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 47;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(16384);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(32768);
_cmd.setField ("Name",_name);
 BA.debugLineNum = 49;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters",_parameters);};
 BA.debugLineNum = 50;BA.debugLine="Return cmd";
Debug.ShouldStop(131072);
if (true) return _cmd;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("CreateRequest (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,39);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","createrequest");}
RemoteObject _req = RemoteObject.declareNull("b4a.example.dbrequestmanager");
 BA.debugLineNum = 39;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(128);
_req = RemoteObject.createNew ("b4a.example.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 41;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_initialize",tela_editarpet.processBA,(Object)(tela_editarpet.getObject()),(Object)(tela_editarpet.mostCurrent._main._exportrdclink));
 BA.debugLineNum = 42;BA.debugLine="Return req";
Debug.ShouldStop(512);
if (true) return _req;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 16;BA.debugLine="Private imgPET As ImageView";
tela_editarpet.mostCurrent._imgpet = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtCorPET As EditText";
tela_editarpet.mostCurrent._txtcorpet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txtNomePET As EditText";
tela_editarpet.mostCurrent._txtnomepet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private txtPetDescricao As EditText";
tela_editarpet.mostCurrent._txtpetdescricao = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtRacaPET As EditText";
tela_editarpet.mostCurrent._txtracapet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim ImageChooser As ContentChooser";
tela_editarpet.mostCurrent._imagechooser = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgchooser_result(RemoteObject _succes,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("imgChooser_Result (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,107);
if (RapidSub.canDelegate("imgchooser_result")) { return b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","imgchooser_result", _succes, _dir, _filename);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _delta = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
Debug.locals.put("Succes", _succes);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 107;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="If Succes=True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_succes,tela_editarpet.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 109;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(4096);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 110;BA.debugLine="b.Initialize(Dir, FileName)";
Debug.ShouldStop(8192);
_b.runVoidMethod ("Initialize",(Object)(_dir),(Object)(_filename));
 BA.debugLineNum = 112;BA.debugLine="imgPET.Bitmap = b";
Debug.ShouldStop(32768);
tela_editarpet.mostCurrent._imgpet.runMethod(false,"setBitmap",(_b.getObject()));
 BA.debugLineNum = 118;BA.debugLine="Dim Delta, Height, Width As Int";
Debug.ShouldStop(2097152);
_delta = RemoteObject.createImmutable(0);Debug.locals.put("Delta", _delta);
_height = RemoteObject.createImmutable(0);Debug.locals.put("Height", _height);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
 BA.debugLineNum = 119;BA.debugLine="If b.Width / b.Height > imgPET.Width / imgPET.He";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight")}, "/",0, 0),RemoteObject.solve(new RemoteObject[] {tela_editarpet.mostCurrent._imgpet.runMethod(true,"getWidth"),tela_editarpet.mostCurrent._imgpet.runMethod(true,"getHeight")}, "/",0, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="Height = b.Height / b.Width * imgPET.Width";
Debug.ShouldStop(8388608);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getHeight"),_b.runMethod(true,"getWidth"),tela_editarpet.mostCurrent._imgpet.runMethod(true,"getWidth")}, "/*",0, 0));Debug.locals.put("Height", _height);
 BA.debugLineNum = 121;BA.debugLine="Delta = (imgPET.Height - Height) / 2";
Debug.ShouldStop(16777216);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_editarpet.mostCurrent._imgpet.runMethod(true,"getHeight"),_height}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 122;BA.debugLine="imgPET.Height = Height";
Debug.ShouldStop(33554432);
tela_editarpet.mostCurrent._imgpet.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 123;BA.debugLine="imgPET.Top = imgPET.Top + Delta";
Debug.ShouldStop(67108864);
tela_editarpet.mostCurrent._imgpet.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {tela_editarpet.mostCurrent._imgpet.runMethod(true,"getTop"),_delta}, "+",1, 1));
 }else {
 BA.debugLineNum = 125;BA.debugLine="Width = b.Width / b.Height * imgPET.Height";
Debug.ShouldStop(268435456);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_b.runMethod(true,"getWidth"),_b.runMethod(true,"getHeight"),tela_editarpet.mostCurrent._imgpet.runMethod(true,"getHeight")}, "/*",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 126;BA.debugLine="Delta = (imgPET.Width - Width) / 2";
Debug.ShouldStop(536870912);
_delta = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tela_editarpet.mostCurrent._imgpet.runMethod(true,"getWidth"),_width}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 127;BA.debugLine="imgPET.Width = Width";
Debug.ShouldStop(1073741824);
tela_editarpet.mostCurrent._imgpet.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 128;BA.debugLine="imgPET.Left = imgPET.Left + Delta";
Debug.ShouldStop(-2147483648);
tela_editarpet.mostCurrent._imgpet.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {tela_editarpet.mostCurrent._imgpet.runMethod(true,"getLeft"),_delta}, "+",1, 1));
 };
 }else {
 BA.debugLineNum = 131;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
Debug.ShouldStop(4);
tela_editarpet.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Imagem não Selecionada")),(Object)(tela_editarpet.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listareditpet(RemoteObject _codigo) throws Exception{
try {
		Debug.PushSubsStack("ListarEditPET (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,69);
if (RapidSub.canDelegate("listareditpet")) { b4a.example.tela_editarpet.remoteMe.runUserSub(false, "tela_editarpet","listareditpet", _codigo); return;}
ResumableSub_ListarEditPET rsub = new ResumableSub_ListarEditPET(null,_codigo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListarEditPET extends BA.ResumableSub {
public ResumableSub_ListarEditPET(b4a.example.tela_editarpet parent,RemoteObject _codigo) {
this.parent = parent;
this._codigo = _codigo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.tela_editarpet parent;
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
		Debug.PushSubsStack("ListarEditPET (tela_editarpet) ","tela_editarpet",3,tela_editarpet.mostCurrent.activityBA,tela_editarpet.mostCurrent,69);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 70;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
Debug.ShouldStop(32);
_req = _createrequest();Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 71;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ListarEditP";
Debug.ShouldStop(64);
_cmd = _createcommand(BA.ObjectToString("ListarEditPET"),RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_codigo)}));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 72;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", tela_editarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req.runClassMethod (b4a.example.dbrequestmanager.class, "_executequery",(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 73;BA.debugLine="If j.Success Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 74;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(512);
_req.runClassMethod (b4a.example.dbrequestmanager.class, "_handlejobasync",(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 75;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", tela_editarpet.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 78;BA.debugLine="Log(res.Columns)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_res.getField(false,"Columns"))));
 BA.debugLineNum = 79;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 80;BA.debugLine="Dim oBitMap As Bitmap";
Debug.ShouldStop(32768);
_obitmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 81;BA.debugLine="Dim buffer() As Byte";
Debug.ShouldStop(65536);
_buffer = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 82;BA.debugLine="buffer = row(5)";
Debug.ShouldStop(131072);
_buffer = (_row.getArrayElement(false,BA.numberCast(int.class, 5)));Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 83;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
Debug.ShouldStop(262144);
_obitmap = _req.runClassMethod (b4a.example.dbrequestmanager.class, "_bytestoimage",(Object)(_buffer));Debug.locals.put("oBitMap", _obitmap);
 BA.debugLineNum = 85;BA.debugLine="imgPET.Bitmap=oBitMap";
Debug.ShouldStop(1048576);
parent.mostCurrent._imgpet.runMethod(false,"setBitmap",(_obitmap.getObject()));
 BA.debugLineNum = 86;BA.debugLine="txtNomePET.Text=row(1)";
Debug.ShouldStop(2097152);
parent.mostCurrent._txtnomepet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 87;BA.debugLine="txtRacaPET.Text=row(2)";
Debug.ShouldStop(4194304);
parent.mostCurrent._txtracapet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 2))));
 BA.debugLineNum = 88;BA.debugLine="txtCorPET.Text=row(3)";
Debug.ShouldStop(8388608);
parent.mostCurrent._txtcorpet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 3))));
 BA.debugLineNum = 89;BA.debugLine="txtPetDescricao.Text=row(7)";
Debug.ShouldStop(16777216);
parent.mostCurrent._txtpetdescricao.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_row.getArrayElement(false,BA.numberCast(int.class, 7))));
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
 BA.debugLineNum = 92;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage"))));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 94;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 95;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runVoidMethod ("_release");
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}