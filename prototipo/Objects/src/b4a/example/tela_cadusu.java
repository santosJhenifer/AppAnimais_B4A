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

public class tela_cadusu extends Activity implements B4AActivity{
	public static tela_cadusu mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_cadusu");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_cadusu).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_cadusu");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_cadusu", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_cadusu) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_cadusu) Resume **");
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
		return tela_cadusu.class;
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
        BA.LogInfo("** Activity (tela_cadusu) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            tela_cadusu mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_cadusu) Resume **");
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
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnercidade = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcodusu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtend = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtloginusu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnomeusu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsenhausu = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _usu_foto = null;
public anywheresoftware.b4a.phone.Phone.ContentChooser _imagechooser = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcelular = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_caddesap _tela_caddesap = null;
public b4a.example.tela_editarpet _tela_editarpet = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_vizdesap _tela_vizdesap = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_editarperfil _tela_editarperfil = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Activity.LoadLayout(\"Cad_Usu\")";
mostCurrent._activity.LoadLayout("Cad_Usu",mostCurrent.activityBA);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="CarregarCidades";
_carregarcidades();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Main.CodigoCidade=1'temporario, para deixar a cid";
mostCurrent._main._codigocidade = BA.NumberToString(1);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="End Sub";
return "";
}
public static void  _carregarcidades() throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "carregarcidades"))
	 {Debug.delegate(mostCurrent.activityBA, "carregarcidades", null); return;}
ResumableSub_CarregarCidades rsub = new ResumableSub_CarregarCidades(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CarregarCidades extends BA.ResumableSub {
public ResumableSub_CarregarCidades(b4a.example.tela_cadusu parent) {
this.parent = parent;
}
b4a.example.tela_cadusu parent;
b4a.example.dbrequestmanager _req = null;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
b4a.example.main._dbresult _res = null;
Object[] _row = null;
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_cadusu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarCid";
_cmd = _createcommand("CarregarCidades",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_cadusu", "carregarcidades"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_cadusu", "carregarcidades"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="spinnerCidade.Clear";
parent.mostCurrent._spinnercidade.Clear();
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.Rows;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="spinnerCidade.Add(\"[\" & row(0) & \"] \" & row(1))";
parent.mostCurrent._spinnercidade.Add("["+BA.ObjectToString(_row[(int) (0)])+"] "+BA.ObjectToString(_row[(int) (1)]));
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
RDebugUtils.currentLine=3670033;
 //BA.debugLineNum = 3670033;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_cadusu";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _btncadastro_click() throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncadastro_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncadastro_click", null));}
byte[] _foto = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub btnCadastro_Click";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Try";
try {RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim Foto () As Byte";
_foto = new byte[(int) (0)];
;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Foto = CreateRequest.ImageToBytes(usu_foto.Bitma";
_foto = _createrequest()._imagetobytes(null,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._usu_foto.getBitmap())));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="InserirUsuario(txtNomeUsu.Text,txtEnd.Text,txtLo";
_inserirusuario(mostCurrent._txtnomeusu.getText(),mostCurrent._txtend.getText(),mostCurrent._txtloginusu.getText(),mostCurrent._txtsenhausu.getText(),mostCurrent._main._codigocidade,_foto,mostCurrent._txtcelular.getText());
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Msgbox2(\"Verifique os Valores Informados!\", \"PET";
anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Verifique os Valores Informados!"),BA.ObjectToCharSequence("PETS"),"OK","","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="End Sub";
return "";
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_cadusu.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="End Sub";
return null;
}
public static void  _inserirusuario(String _nome,String _endereco,String _login,String _senha,String _cidade,byte[] _foto,String _celular) throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "inserirusuario"))
	 {Debug.delegate(mostCurrent.activityBA, "inserirusuario", new Object[] {_nome,_endereco,_login,_senha,_cidade,_foto,_celular}); return;}
ResumableSub_InserirUsuario rsub = new ResumableSub_InserirUsuario(null,_nome,_endereco,_login,_senha,_cidade,_foto,_celular);
rsub.resume(processBA, null);
}
public static class ResumableSub_InserirUsuario extends BA.ResumableSub {
public ResumableSub_InserirUsuario(b4a.example.tela_cadusu parent,String _nome,String _endereco,String _login,String _senha,String _cidade,byte[] _foto,String _celular) {
this.parent = parent;
this._nome = _nome;
this._endereco = _endereco;
this._login = _login;
this._senha = _senha;
this._cidade = _cidade;
this._foto = _foto;
this._celular = _celular;
}
b4a.example.tela_cadusu parent;
String _nome;
String _endereco;
String _login;
String _senha;
String _cidade;
byte[] _foto;
String _celular;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_cadusu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InserirUsua";
_cmd = _createcommand("InserirUsuario",new Object[]{(Object)(_nome),(Object)(_endereco),(Object)(_login),(Object)(_senha),(Object)(_cidade),(Object)(_foto),(Object)(_celular)});
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
_j = _createrequest()._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_cadusu", "inserirusuario"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="Msgbox(\"Inserido com sucesso!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Inserido com sucesso!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Main.logado=True";
parent.mostCurrent._main._logado = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="StartActivity(\"Tela_Feed\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Tela_Feed"));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Msgbox(\"Login já exixtente!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Login já exixtente!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="txtLoginUsu.Text = \"\"";
parent.mostCurrent._txtloginusu.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="txtLoginUsu.RequestFocus";
parent.mostCurrent._txtloginusu.RequestFocus();
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnfotousu_click() throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfotousu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfotousu_click", null));}
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub btnFotoUsu_Click";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
mostCurrent._imagechooser.Initialize("imgChooser");
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
mostCurrent._imagechooser.Show(processBA,"image/*","Escolha a Foto");
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="End Sub";
return null;
}
public static String  _imgchooser_result(boolean _succes,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgchooser_result"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgchooser_result", new Object[] {_succes,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
int _delta = 0;
int _height = 0;
int _width = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If Succes=True Then";
if (_succes==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="b.Initialize(Dir, FileName)";
_b.Initialize(_dir,_filename);
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="usu_foto.Bitmap = b";
mostCurrent._usu_foto.setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="Dim Delta, Height, Width As Int";
_delta = 0;
_height = 0;
_width = 0;
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="If b.Width / b.Height > usu_foto.Width /usu_foto";
if (_b.getWidth()/(double)_b.getHeight()>mostCurrent._usu_foto.getWidth()/(double)mostCurrent._usu_foto.getHeight()) { 
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="Height = b.Height / b.Width * usu_foto.Width";
_height = (int) (_b.getHeight()/(double)_b.getWidth()*mostCurrent._usu_foto.getWidth());
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="Delta = (usu_foto.Height - Height) / 2";
_delta = (int) ((mostCurrent._usu_foto.getHeight()-_height)/(double)2);
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="usu_foto.Height = Height";
mostCurrent._usu_foto.setHeight(_height);
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="usu_foto.Top = usu_foto.Top + Delta";
mostCurrent._usu_foto.setTop((int) (mostCurrent._usu_foto.getTop()+_delta));
 }else {
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="Width = b.Width / b.Height * usu_foto.Height";
_width = (int) (_b.getWidth()/(double)_b.getHeight()*mostCurrent._usu_foto.getHeight());
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="Delta = (usu_foto.Width - Width) / 2";
_delta = (int) ((mostCurrent._usu_foto.getWidth()-_width)/(double)2);
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="usu_foto.Width = Width";
mostCurrent._usu_foto.setWidth(_width);
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="usu_foto.Left = usu_foto.Left + Delta";
mostCurrent._usu_foto.setLeft((int) (mostCurrent._usu_foto.getLeft()+_delta));
 };
 }else {
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Imagem não Selecionada"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="End Sub";
return "";
}
public static String  _spinnercidade_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="tela_cadusu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnercidade_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnercidade_itemclick", new Object[] {_position,_value}));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub spinnerCidade_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Try";
try {RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Main.CodigoCidade = sf.MidExtract(Value,\"[\",\"]\")";
mostCurrent._main._codigocidade = _sf._vvvv6(BA.ObjectToString(_value),"[","]");
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="Main.CodigoCidade=0";
mostCurrent._main._codigocidade = BA.NumberToString(0);
 };
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="End Sub";
return "";
}
}