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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (tela_caddesap.mostCurrent != null);
vis = vis | (tela_editarpet.mostCurrent != null);
vis = vis | (tela_cadusu.mostCurrent != null);
vis = vis | (tela_listarpet.mostCurrent != null);
vis = vis | (tela_vizdesap.mostCurrent != null);
vis = vis | (tela_listardesap.mostCurrent != null);
vis = vis | (tela_editarperfil.mostCurrent != null);
vis = vis | (tela_cadpet.mostCurrent != null);
vis = vis | (tela_feed.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (tela_caddesap.previousOne != null) {
				__a = tela_caddesap.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_caddesap.mostCurrent == null ? null : tela_caddesap.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_editarpet.previousOne != null) {
				__a = tela_editarpet.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_editarpet.mostCurrent == null ? null : tela_editarpet.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_cadusu.previousOne != null) {
				__a = tela_cadusu.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_cadusu.mostCurrent == null ? null : tela_cadusu.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_listarpet.previousOne != null) {
				__a = tela_listarpet.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_listarpet.mostCurrent == null ? null : tela_listarpet.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_vizdesap.previousOne != null) {
				__a = tela_vizdesap.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_vizdesap.mostCurrent == null ? null : tela_vizdesap.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_listardesap.previousOne != null) {
				__a = tela_listardesap.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_listardesap.mostCurrent == null ? null : tela_listardesap.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_editarperfil.previousOne != null) {
				__a = tela_editarperfil.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_editarperfil.mostCurrent == null ? null : tela_editarperfil.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_cadpet.previousOne != null) {
				__a = tela_cadpet.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_cadpet.mostCurrent == null ? null : tela_cadpet.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tela_feed.previousOne != null) {
				__a = tela_feed.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tela_feed.mostCurrent == null ? null : tela_feed.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public static class _dbresult{
public boolean IsInitialized;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Columns;
public anywheresoftware.b4a.objects.collections.List Rows;
public void Initialize() {
IsInitialized = true;
Tag = new Object();
Columns = new anywheresoftware.b4a.objects.collections.Map();
Rows = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _dbcommand{
public boolean IsInitialized;
public String Name;
public Object[] Parameters;
public void Initialize() {
IsInitialized = true;
Name = "";
Parameters = new Object[0];
{
int d0 = Parameters.length;
for (int i0 = 0;i0 < d0;i0++) {
Parameters[i0] = new Object();
}
}
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _rdclink = "";
public static String _item_name = "";
public static String _exportrdclink = "";
public static boolean _logado = false;
public static String _codigocidade = "";
public static int _usu_cod = 0;
public static int _coddesap = 0;
public static int _codigopet = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _edtlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtsenha = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtesq = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"Login\")";
mostCurrent._activity.LoadLayout("Login",mostCurrent.activityBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="logado = False";
_logado = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _btncadastrar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncadastrar_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncadastrar_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub btnCadastrar_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="StartActivity(\"Tela_CadUsu\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Tela_CadUsu"));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public static String  _btncancel_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncancel_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncancel_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub btnCancel_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="edtEsq.Text = \"\"";
mostCurrent._edtesq.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Panel4.Visible = False";
mostCurrent._panel4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="End Sub";
return "";
}
public static String  _btnentrar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnentrar_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnentrar_click", null));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub btnEntrar_Click";
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="LocalizarUsuario(edtLogin.Text, edtSenha.Text)";
_localizarusuario(mostCurrent._edtlogin.getText(),mostCurrent._edtsenha.getText());
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="End Sub";
return "";
}
public static void  _localizarusuario(String _login,String _senha) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "localizarusuario"))
	 {Debug.delegate(mostCurrent.activityBA, "localizarusuario", new Object[] {_login,_senha}); return;}
ResumableSub_LocalizarUsuario rsub = new ResumableSub_LocalizarUsuario(null,_login,_senha);
rsub.resume(processBA, null);
}
public static class ResumableSub_LocalizarUsuario extends BA.ResumableSub {
public ResumableSub_LocalizarUsuario(b4a.example.main parent,String _login,String _senha) {
this.parent = parent;
this._login = _login;
this._senha = _senha;
}
b4a.example.main parent;
String _login;
String _senha;
b4a.example.dbrequestmanager _req = null;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
b4a.example.main._dbresult _res = null;
boolean _login_ok = false;
Object[] _row = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"LocalizarUs";
_cmd = _createcommand("LocalizarUsuario",new Object[]{(Object)(_login),(Object)(_senha)});
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "localizarusuario"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_j._success) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "localizarusuario"), (Object)(_req));
this.state = 24;
return;
case 24:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="req.PrintTable(res)";
_req._printtable(null,_res);
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Dim login_ok As Boolean";
_login_ok = false;
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="If res.Rows.Size =1 Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_res.Rows.getSize()==1) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="login_ok=True";
_login_ok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 10;
group12 = _res.Rows;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index12 < groupLen12) {
this.state = 9;
_row = (Object[])(group12.Get(index12));}
if (true) break;

case 26:
//C
this.state = 25;
index12++;
if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="Usu_Cod= row(0)";
parent._usu_cod = (int)(BA.ObjectToNumber(_row[(int) (0)]));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="login_ok=False";
_login_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="If login_ok = True Then";
if (true) break;

case 17:
//if
this.state = 22;
if (_login_ok==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="logado = True";
parent._logado = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=458785;
 //BA.debugLineNum = 458785;BA.debugLine="StartActivity(\"Tela_Feed\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Tela_Feed"));
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="edtLogin.Text=\"\"";
parent.mostCurrent._edtlogin.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="edtSenha.Text=\"\"";
parent.mostCurrent._edtsenha.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="logado = False";
parent._logado = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="Msgbox(\"Usuário ou senha Incorreta\",\"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Usuário ou senha Incorreta"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=458795;
 //BA.debugLineNum = 458795;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnesqueceu_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnesqueceu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnesqueceu_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub btnEsqueceu_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Panel4. Visible = True";
mostCurrent._panel4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _btnok_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnok_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnok_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub btnOK_Click";
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="EsqueceuSenha(edtEsq.Text)";
_esqueceusenha(mostCurrent._edtesq.getText());
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public static void  _esqueceusenha(String _login) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "esqueceusenha"))
	 {Debug.delegate(mostCurrent.activityBA, "esqueceusenha", new Object[] {_login}); return;}
ResumableSub_EsqueceuSenha rsub = new ResumableSub_EsqueceuSenha(null,_login);
rsub.resume(processBA, null);
}
public static class ResumableSub_EsqueceuSenha extends BA.ResumableSub {
public ResumableSub_EsqueceuSenha(b4a.example.main parent,String _login) {
this.parent = parent;
this._login = _login;
}
b4a.example.main parent;
String _login;
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
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"EsqueceuSen";
_cmd = _createcommand("EsqueceuSenha",new Object[]{(Object)(_login)});
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "esqueceusenha"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_j._success) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "esqueceusenha"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="req.PrintTable(res)";
_req._printtable(null,_res);
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="If res.Rows.Size =1 Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_res.Rows.getSize()==1) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=786449;
 //BA.debugLineNum = 786449;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 10;
group10 = _res.Rows;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=786450;
 //BA.debugLineNum = 786450;BA.debugLine="Msgbox(\"Sua senha é \" & row(4), \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Sua senha é "+BA.ObjectToString(_row[(int) (4)])),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=786454;
 //BA.debugLineNum = 786454;BA.debugLine="edtEsq.Text = \"\"";
parent.mostCurrent._edtesq.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=786455;
 //BA.debugLineNum = 786455;BA.debugLine="Panel4.Visible = False";
parent.mostCurrent._panel4.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=786457;
 //BA.debugLineNum = 786457;BA.debugLine="Msgbox(\"login não encontrado\",\"Pets\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("login não encontrado"),BA.ObjectToCharSequence("Pets"),mostCurrent.activityBA);
RDebugUtils.currentLine=786458;
 //BA.debugLineNum = 786458;BA.debugLine="edtEsq.RequestFocus";
parent.mostCurrent._edtesq.RequestFocus();
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=786462;
 //BA.debugLineNum = 786462;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=786464;
 //BA.debugLineNum = 786464;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=786465;
 //BA.debugLineNum = 786465;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=786469;
 //BA.debugLineNum = 786469;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnvizu_desap_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnvizu_desap_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnvizu_desap_click", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnVizu_Desap_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="StartActivity(\"Tela_Feed\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Tela_Feed"));
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="End Sub";
return null;
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="req.Initialize(Me, rdcLink)";
_req._initialize(null,processBA,main.getObject(),_rdclink);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="End Sub";
return null;
}
}