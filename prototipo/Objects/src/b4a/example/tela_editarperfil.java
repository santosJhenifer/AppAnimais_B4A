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

public class tela_editarperfil extends Activity implements B4AActivity{
	public static tela_editarperfil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_editarperfil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_editarperfil).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_editarperfil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_editarperfil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_editarperfil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_editarperfil) Resume **");
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
		return tela_editarperfil.class;
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
        BA.LogInfo("** Activity (tela_editarperfil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            tela_editarperfil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_editarperfil) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtcelular = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtend = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtloginusu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnomeusu = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsenhausu = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _usu_foto = null;
public anywheresoftware.b4a.phone.Phone.ContentChooser _imagechooser = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnercidade = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_caddesap _tela_caddesap = null;
public b4a.example.tela_editarpet _tela_editarpet = null;
public b4a.example.tela_cadusu _tela_cadusu = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_vizdesap _tela_vizdesap = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Activity.LoadLayout(\"EditarPerfil\")";
mostCurrent._activity.LoadLayout("EditarPerfil",mostCurrent.activityBA);
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="ListarUsu(Main.Usu_Cod)";
_listarusu(mostCurrent._main._usu_cod);
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="CarregarCidades";
_carregarcidades();
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Main.CodigoCidade=1";
mostCurrent._main._codigocidade = BA.NumberToString(1);
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return "";
}
public static void  _listarusu(int _codigo) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listarusu"))
	 {Debug.delegate(mostCurrent.activityBA, "listarusu", new Object[] {_codigo}); return;}
ResumableSub_ListarUsu rsub = new ResumableSub_ListarUsu(null,_codigo);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListarUsu extends BA.ResumableSub {
public ResumableSub_ListarUsu(b4a.example.tela_editarperfil parent,int _codigo) {
this.parent = parent;
this._codigo = _codigo;
}
b4a.example.tela_editarperfil parent;
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
RDebugUtils.currentModule="tela_editarperfil";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ListarUsu\",";
_cmd = _createcommand("ListarUsu",new Object[]{(Object)(_codigo)});
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarperfil", "listarusu"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarperfil", "listarusu"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="Dim oBitMap As Bitmap";
_obitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="Dim buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="buffer = row(6)";
_buffer = (byte[])(_row[(int) (6)]);
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
_obitmap = _req._bytestoimage(null,_buffer);
RDebugUtils.currentLine=6946832;
 //BA.debugLineNum = 6946832;BA.debugLine="usu_foto.Bitmap=oBitMap";
parent.mostCurrent._usu_foto.setBitmap((android.graphics.Bitmap)(_obitmap.getObject()));
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="txtNomeUsu.Text=row(1)";
parent.mostCurrent._txtnomeusu.setText(BA.ObjectToCharSequence(_row[(int) (1)]));
RDebugUtils.currentLine=6946834;
 //BA.debugLineNum = 6946834;BA.debugLine="txtEnd.Text=row(2)";
parent.mostCurrent._txtend.setText(BA.ObjectToCharSequence(_row[(int) (2)]));
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="txtLoginUsu.Text=row(3)";
parent.mostCurrent._txtloginusu.setText(BA.ObjectToCharSequence(_row[(int) (3)]));
RDebugUtils.currentLine=6946836;
 //BA.debugLineNum = 6946836;BA.debugLine="txtSenhaUsu.Text=row(4)";
parent.mostCurrent._txtsenhausu.setText(BA.ObjectToCharSequence(_row[(int) (4)]));
RDebugUtils.currentLine=6946837;
 //BA.debugLineNum = 6946837;BA.debugLine="txtCelular.Text = row(7)";
parent.mostCurrent._txtcelular.setText(BA.ObjectToCharSequence(_row[(int) (7)]));
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
RDebugUtils.currentLine=6946840;
 //BA.debugLineNum = 6946840;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=6946842;
 //BA.debugLineNum = 6946842;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6946843;
 //BA.debugLineNum = 6946843;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=6946844;
 //BA.debugLineNum = 6946844;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _carregarcidades() throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "carregarcidades"))
	 {Debug.delegate(mostCurrent.activityBA, "carregarcidades", null); return;}
ResumableSub_CarregarCidades rsub = new ResumableSub_CarregarCidades(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CarregarCidades extends BA.ResumableSub {
public ResumableSub_CarregarCidades(b4a.example.tela_editarperfil parent) {
this.parent = parent;
}
b4a.example.tela_editarperfil parent;
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
RDebugUtils.currentModule="tela_editarperfil";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarCid";
_cmd = _createcommand("CarregarCidades",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarperfil", "carregarcidades"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarperfil", "carregarcidades"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="spinnerCidade.Clear";
parent.mostCurrent._spinnercidade.Clear();
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=6815758;
 //BA.debugLineNum = 6815758;BA.debugLine="spinnerCidade.Add(\"(\" & row(0) & \") \" & row(1))";
parent.mostCurrent._spinnercidade.Add("("+BA.ObjectToString(_row[(int) (0)])+") "+BA.ObjectToString(_row[(int) (1)]));
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
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6815764;
 //BA.debugLineNum = 6815764;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=6815765;
 //BA.debugLineNum = 6815765;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public static void  _atualizarusu(String _nome,String _endereco,String _login,String _senha,String _cidade,byte[] _foto,String _celular,int _codigo) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "atualizarusu"))
	 {Debug.delegate(mostCurrent.activityBA, "atualizarusu", new Object[] {_nome,_endereco,_login,_senha,_cidade,_foto,_celular,_codigo}); return;}
ResumableSub_AtualizarUsu rsub = new ResumableSub_AtualizarUsu(null,_nome,_endereco,_login,_senha,_cidade,_foto,_celular,_codigo);
rsub.resume(processBA, null);
}
public static class ResumableSub_AtualizarUsu extends BA.ResumableSub {
public ResumableSub_AtualizarUsu(b4a.example.tela_editarperfil parent,String _nome,String _endereco,String _login,String _senha,String _cidade,byte[] _foto,String _celular,int _codigo) {
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
b4a.example.tela_editarperfil parent;
String _nome;
String _endereco;
String _login;
String _senha;
String _cidade;
byte[] _foto;
String _celular;
int _codigo;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"AtualizarUs";
_cmd = _createcommand("AtualizarUsu",new Object[]{(Object)(_nome),(Object)(_endereco),(Object)(_login),(Object)(_senha),(Object)(_cidade),(Object)(_foto),(Object)(_celular),(Object)(parent.mostCurrent._main._usu_cod)});
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
_j = _createrequest()._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_editarperfil", "atualizarusu"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Msgbox(\"Dados Atualizados com sucesso!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Dados Atualizados com sucesso!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Msgbox(\"Verifique os dados informados!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Verifique os dados informados!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="End Sub";
return null;
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_editarperfil.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return null;
}
public static String  _btnatualizar_click() throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnatualizar_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnatualizar_click", null));}
byte[] _foto = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub btnAtualizar_Click";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim Foto () As Byte";
_foto = new byte[(int) (0)];
;
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Foto = CreateRequest.ImageToBytes(usu_foto.Bitmap";
_foto = _createrequest()._imagetobytes(null,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._usu_foto.getBitmap())));
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="AtualizarUsu(txtNomeUsu.Text, txtEnd.Text, txtLog";
_atualizarusu(mostCurrent._txtnomeusu.getText(),mostCurrent._txtend.getText(),mostCurrent._txtloginusu.getText(),mostCurrent._txtsenhausu.getText(),mostCurrent._main._codigocidade,_foto,mostCurrent._txtcelular.getText(),mostCurrent._main._usu_cod);
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="End Sub";
return "";
}
public static String  _btnfotousu_click() throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfotousu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfotousu_click", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub btnFotoUsu_Click";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
mostCurrent._imagechooser.Initialize("imgChooser");
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
mostCurrent._imagechooser.Show(processBA,"image/*","Escolha a Foto");
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public static String  _imgchooser_result(boolean _succes,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgchooser_result"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgchooser_result", new Object[] {_succes,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
int _delta = 0;
int _height = 0;
int _width = 0;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="If Succes=True Then";
if (_succes==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="b.Initialize(Dir, FileName)";
_b.Initialize(_dir,_filename);
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="usu_foto.Bitmap = b";
mostCurrent._usu_foto.setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="Dim Delta, Height, Width As Int";
_delta = 0;
_height = 0;
_width = 0;
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="If b.Width / b.Height > usu_foto.Width / usu_fot";
if (_b.getWidth()/(double)_b.getHeight()>mostCurrent._usu_foto.getWidth()/(double)mostCurrent._usu_foto.getHeight()) { 
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Height = b.Height / b.Width * usu_foto.Width";
_height = (int) (_b.getHeight()/(double)_b.getWidth()*mostCurrent._usu_foto.getWidth());
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="Delta = (usu_foto.Height - Height) / 2";
_delta = (int) ((mostCurrent._usu_foto.getHeight()-_height)/(double)2);
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="usu_foto.Height = Height";
mostCurrent._usu_foto.setHeight(_height);
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="usu_foto.Top = usu_foto.Top + Delta";
mostCurrent._usu_foto.setTop((int) (mostCurrent._usu_foto.getTop()+_delta));
 }else {
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="Width = b.Width / b.Height * usu_foto.Height";
_width = (int) (_b.getWidth()/(double)_b.getHeight()*mostCurrent._usu_foto.getHeight());
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="Delta = (usu_foto.Width - Width) / 2";
_delta = (int) ((mostCurrent._usu_foto.getWidth()-_width)/(double)2);
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="usu_foto.Width = Width";
mostCurrent._usu_foto.setWidth(_width);
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="usu_foto.Left = usu_foto.Left + Delta";
mostCurrent._usu_foto.setLeft((int) (mostCurrent._usu_foto.getLeft()+_delta));
 };
 }else {
RDebugUtils.currentLine=7208984;
 //BA.debugLineNum = 7208984;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Imagem não Selecionada"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=7208986;
 //BA.debugLineNum = 7208986;BA.debugLine="End Sub";
return "";
}
public static String  _spinnercidade_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="tela_editarperfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinnercidade_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinnercidade_itemclick", new Object[] {_position,_value}));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub spinnerCidade_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Try";
try {RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Main.CodigoCidade = sf.MidExtract(Value,\"(\",\")\")";
mostCurrent._main._codigocidade = _sf._vvvv6(BA.ObjectToString(_value),"(",")");
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Main.CodigoCidade=0";
mostCurrent._main._codigocidade = BA.NumberToString(0);
 };
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="End Sub";
return "";
}
}