package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class tela_editarpet extends Activity implements B4AActivity{
	public static tela_editarpet mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_editarpet");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_editarpet).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_editarpet");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_editarpet", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_editarpet) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_editarpet) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return tela_editarpet.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (tela_editarpet) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            tela_editarpet mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_editarpet) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgpet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcorpet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnomepet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpetdescricao = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtracapet = null;
public anywheresoftware.b4a.phone.Phone.ContentChooser _imagechooser = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_caddesap _tela_caddesap = null;
public b4a.example.tela_cadusu _tela_cadusu = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_vizdesap _tela_vizdesap = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_editarperfil _tela_editarperfil = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Activity.LoadLayout(\"EditarPET\")";
mostCurrent._activity.LoadLayout("EditarPET",mostCurrent.activityBA);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="ListarEditPET(Main.CodigoPet)";
_listareditpet(mostCurrent._main._codigopet);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="End Sub";
return "";
}
public static void  _listareditpet(int _codigo) throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listareditpet"))
	 {Debug.delegate(mostCurrent.activityBA, "listareditpet", new Object[] {_codigo}); return;}
ResumableSub_ListarEditPET rsub = new ResumableSub_ListarEditPET(null,_codigo);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListarEditPET extends BA.ResumableSub {
public ResumableSub_ListarEditPET(b4a.example.tela_editarpet parent,int _codigo) {
this.parent = parent;
this._codigo = _codigo;
}
b4a.example.tela_editarpet parent;
int _codigo;
b4a.example.dbrequestmanager _req = null;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
b4a.example.main._dbresult _res = null;
Object[] _row = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _obitmap = null;
byte[] _buffer = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_editarpet";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ListarEditP";
_cmd = _createcommand("ListarEditPET",new Object[]{(Object)(_codigo)});
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarpet", "listareditpet"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarpet", "listareditpet"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Dim oBitMap As Bitmap";
_obitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="Dim buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="buffer = row(5)";
_buffer = (byte[])(_row[(int) (5)]);
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
_obitmap = _req._bytestoimage(null,_buffer);
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="imgPET.Bitmap=oBitMap";
parent.mostCurrent._imgpet.setBitmap((android.graphics.Bitmap)(_obitmap.getObject()));
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="txtNomePET.Text=row(1)";
parent.mostCurrent._txtnomepet.setText(BA.ObjectToCharSequence(_row[(int) (1)]));
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="txtRacaPET.Text=row(2)";
parent.mostCurrent._txtracapet.setText(BA.ObjectToCharSequence(_row[(int) (2)]));
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="txtCorPET.Text=row(3)";
parent.mostCurrent._txtcorpet.setText(BA.ObjectToCharSequence(_row[(int) (3)]));
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="txtPetDescricao.Text=row(7)";
parent.mostCurrent._txtpetdescricao.setText(BA.ObjectToCharSequence(_row[(int) (7)]));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_editarpet";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public static void  _atualizarpet(String _nome,String _raca,String _cor,int _usuario,byte[] _foto,String _doacao,String _descricao) throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "atualizarpet"))
	 {Debug.delegate(mostCurrent.activityBA, "atualizarpet", new Object[] {_nome,_raca,_cor,_usuario,_foto,_doacao,_descricao}); return;}
ResumableSub_AtualizarPET rsub = new ResumableSub_AtualizarPET(null,_nome,_raca,_cor,_usuario,_foto,_doacao,_descricao);
rsub.resume(processBA, null);
}
public static class ResumableSub_AtualizarPET extends BA.ResumableSub {
public ResumableSub_AtualizarPET(b4a.example.tela_editarpet parent,String _nome,String _raca,String _cor,int _usuario,byte[] _foto,String _doacao,String _descricao) {
this.parent = parent;
this._nome = _nome;
this._raca = _raca;
this._cor = _cor;
this._usuario = _usuario;
this._foto = _foto;
this._doacao = _doacao;
this._descricao = _descricao;
}
b4a.example.tela_editarpet parent;
String _nome;
String _raca;
String _cor;
int _usuario;
byte[] _foto;
String _doacao;
String _descricao;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_editarpet";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"AtualizarPE";
_cmd = _createcommand("AtualizarPET",new Object[]{(Object)(_nome),(Object)(_raca),(Object)(_cor),(Object)(_usuario),(Object)(_foto),(Object)(_doacao),(Object)(_descricao),(Object)(parent.mostCurrent._main._codigopet)});
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
_j = _createrequest()._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarpet", "atualizarpet"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Msgbox(\"Atualizado com sucesso!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Atualizado com sucesso!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Msgbox(\"Verifique os Valores Informados!\", \"PETS";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Verifique os Valores Informados!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="End Sub";
return null;
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_editarpet.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return null;
}
public static String  _btnatualizar_click() throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnatualizar_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnatualizar_click", null));}
byte[] _foto = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub btnAtualizar_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim Foto () As Byte";
_foto = new byte[(int) (0)];
;
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Foto = CreateRequest.ImageToBytes(imgPET.Bitmap)";
_foto = _createrequest()._imagetobytes(null,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._imgpet.getBitmap())));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="AtualizarPET(txtNomePET.Text, txtRacaPET.Text, tx";
_atualizarpet(mostCurrent._txtnomepet.getText(),mostCurrent._txtracapet.getText(),mostCurrent._txtcorpet.getText(),mostCurrent._main._usu_cod,_foto,"Não",mostCurrent._txtpetdescricao.getText());
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="End Sub";
return "";
}
public static String  _btnfotopet_click() throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfotopet_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfotopet_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub btnFotoPET_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
mostCurrent._imagechooser.Initialize("imgChooser");
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
mostCurrent._imagechooser.Show(processBA,"image/*","Escolha a Foto");
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _imgchooser_result(boolean _succes,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="tela_editarpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgchooser_result"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgchooser_result", new Object[] {_succes,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
int _delta = 0;
int _height = 0;
int _width = 0;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If Succes=True Then";
if (_succes==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="b.Initialize(Dir, FileName)";
_b.Initialize(_dir,_filename);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="imgPET.Bitmap = b";
mostCurrent._imgpet.setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Dim Delta, Height, Width As Int";
_delta = 0;
_height = 0;
_width = 0;
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="If b.Width / b.Height > imgPET.Width / imgPET.He";
if (_b.getWidth()/(double)_b.getHeight()>mostCurrent._imgpet.getWidth()/(double)mostCurrent._imgpet.getHeight()) { 
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Height = b.Height / b.Width * imgPET.Width";
_height = (int) (_b.getHeight()/(double)_b.getWidth()*mostCurrent._imgpet.getWidth());
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="Delta = (imgPET.Height - Height) / 2";
_delta = (int) ((mostCurrent._imgpet.getHeight()-_height)/(double)2);
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="imgPET.Height = Height";
mostCurrent._imgpet.setHeight(_height);
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="imgPET.Top = imgPET.Top + Delta";
mostCurrent._imgpet.setTop((int) (mostCurrent._imgpet.getTop()+_delta));
 }else {
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="Width = b.Width / b.Height * imgPET.Height";
_width = (int) (_b.getWidth()/(double)_b.getHeight()*mostCurrent._imgpet.getHeight());
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="Delta = (imgPET.Width - Width) / 2";
_delta = (int) ((mostCurrent._imgpet.getWidth()-_width)/(double)2);
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="imgPET.Width = Width";
mostCurrent._imgpet.setWidth(_width);
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="imgPET.Left = imgPET.Left + Delta";
mostCurrent._imgpet.setLeft((int) (mostCurrent._imgpet.getLeft()+_delta));
 };
 }else {
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Imagem não Selecionada"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="End Sub";
return "";
}
}