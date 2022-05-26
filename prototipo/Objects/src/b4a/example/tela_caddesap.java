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

public class tela_caddesap extends Activity implements B4AActivity{
	public static tela_caddesap mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_caddesap");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_caddesap).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_caddesap");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_caddesap", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_caddesap) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_caddesap) Resume **");
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
		return tela_caddesap.class;
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
        BA.LogInfo("** Activity (tela_caddesap) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            tela_caddesap mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_caddesap) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtdatadesap = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpontref = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _cmb_pets = null;
public b4a.example.sdcalendardialog _calendario = null;
public static String _data = "";
public anywheresoftware.b4a.phone.Phone.ContentChooser _imagechooser = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _petfoto = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_editarpet _tela_editarpet = null;
public b4a.example.tela_cadusu _tela_cadusu = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_vizdesap _tela_vizdesap = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_editarperfil _tela_editarperfil = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Activity.LoadLayout(\"CadDesap\")";
mostCurrent._activity.LoadLayout("CadDesap",mostCurrent.activityBA);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="CarregarPETS(Main.Usu_Cod)";
_carregarpets(mostCurrent._main._usu_cod);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Main.CodigoPet=1";
mostCurrent._main._codigopet = (int) (1);
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
public static void  _carregarpets(int _usu_cod) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "carregarpets"))
	 {Debug.delegate(mostCurrent.activityBA, "carregarpets", new Object[] {_usu_cod}); return;}
ResumableSub_CarregarPETS rsub = new ResumableSub_CarregarPETS(null,_usu_cod);
rsub.resume(processBA, null);
}
public static class ResumableSub_CarregarPETS extends BA.ResumableSub {
public ResumableSub_CarregarPETS(b4a.example.tela_caddesap parent,int _usu_cod) {
this.parent = parent;
this._usu_cod = _usu_cod;
}
b4a.example.tela_caddesap parent;
int _usu_cod;
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
RDebugUtils.currentModule="tela_caddesap";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarPET";
_cmd = _createcommand("CarregarPETS",new Object[]{(Object)(_usu_cod)});
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_caddesap", "carregarpets"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_caddesap", "carregarpets"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="cmb_PETS.Clear";
parent.mostCurrent._cmb_pets.Clear();
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="cmb_PETS.Add(\"[\" & row(0) & \"] \" & row(1))";
parent.mostCurrent._cmb_pets.Add("["+BA.ObjectToString(_row[(int) (0)])+"] "+BA.ObjectToString(_row[(int) (1)]));
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
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=1900565;
 //BA.debugLineNum = 1900565;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public static String  _btncaddesap_click() throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncaddesap_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncaddesap_click", null));}
byte[] _foto = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub btnCadDesap_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim Foto () As Byte";
_foto = new byte[(int) (0)];
;
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Foto = CreateRequest.ImageToBytes(petFoto.Bitmap)";
_foto = _createrequest()._imagetobytes(null,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._petfoto.getBitmap())));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="InserirDesap(txtPontRef.Text, Data,Main.CodigoPet";
_inserirdesap(mostCurrent._txtpontref.getText(),mostCurrent._data,mostCurrent._main._codigopet,_foto);
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return "";
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_caddesap.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="End Sub";
return null;
}
public static void  _inserirdesap(String _ponto_ref,String _desap_data,int _pet,byte[] _fotopet) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "inserirdesap"))
	 {Debug.delegate(mostCurrent.activityBA, "inserirdesap", new Object[] {_ponto_ref,_desap_data,_pet,_fotopet}); return;}
ResumableSub_InserirDesap rsub = new ResumableSub_InserirDesap(null,_ponto_ref,_desap_data,_pet,_fotopet);
rsub.resume(processBA, null);
}
public static class ResumableSub_InserirDesap extends BA.ResumableSub {
public ResumableSub_InserirDesap(b4a.example.tela_caddesap parent,String _ponto_ref,String _desap_data,int _pet,byte[] _fotopet) {
this.parent = parent;
this._ponto_ref = _ponto_ref;
this._desap_data = _desap_data;
this._pet = _pet;
this._fotopet = _fotopet;
}
b4a.example.tela_caddesap parent;
String _ponto_ref;
String _desap_data;
int _pet;
byte[] _fotopet;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_caddesap";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InserirDesa";
_cmd = _createcommand("InserirDesap",new Object[]{(Object)(_ponto_ref),(Object)(_desap_data),(Object)(_pet),(Object)(_fotopet)});
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
_j = _createrequest()._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_caddesap", "inserirdesap"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Msgbox(\"Publicado com sucesso!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Publicado com sucesso!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Msgbox(\"Verifique os Valores Informados!\", \"PETS";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Verifique os Valores Informados!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _btnpetfoto_click() throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpetfoto_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpetfoto_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btnPETfoto_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
mostCurrent._imagechooser.Initialize("imgChooser");
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
mostCurrent._imagechooser.Show(processBA,"image/*","Escolha a Foto");
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="End Sub";
return "";
}
public static String  _calendario_click() throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calendario_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calendario_click", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub calendario_Click";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Try";
try {RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Data = DateTime.GetYear(calendario.DatePicker) &";
mostCurrent._data = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(mostCurrent._calendario._datepicker))+"-"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(mostCurrent._calendario._datepicker))+"-"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(mostCurrent._calendario._datepicker));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Data = DateTime.GetDayOfMonth(DateTime.Now) & \"/";
mostCurrent._data = BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"/"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"/"+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 };
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="End Sub";
return "";
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="End Sub";
return null;
}
public static String  _cmb_pets_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cmb_pets_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cmb_pets_itemclick", new Object[] {_position,_value}));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub cmb_PETS_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Try";
try {RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Main.CodigoPet = sf.MidExtract(Value,\"[\",\"]\")";
mostCurrent._main._codigopet = (int)(Double.parseDouble(_sf._vvvv6(BA.ObjectToString(_value),"[","]")));
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Main.CodigoPet=0";
mostCurrent._main._codigopet = (int) (0);
 };
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="End Sub";
return "";
}
public static String  _imgchooser_result(boolean _succes,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="tela_caddesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgchooser_result"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgchooser_result", new Object[] {_succes,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
int _delta = 0;
int _height = 0;
int _width = 0;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If Succes=True Then";
if (_succes==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="b.Initialize(Dir, FileName)";
_b.Initialize(_dir,_filename);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="petFoto.Bitmap = b";
mostCurrent._petfoto.setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="Dim Delta, Height, Width As Int";
_delta = 0;
_height = 0;
_width = 0;
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="If b.Width / b.Height > petFoto.Width /petFoto.H";
if (_b.getWidth()/(double)_b.getHeight()>mostCurrent._petfoto.getWidth()/(double)mostCurrent._petfoto.getHeight()) { 
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="Height = b.Height / b.Width * petFoto.Width";
_height = (int) (_b.getHeight()/(double)_b.getWidth()*mostCurrent._petfoto.getWidth());
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="Delta = (petFoto.Height - Height) / 2";
_delta = (int) ((mostCurrent._petfoto.getHeight()-_height)/(double)2);
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="petFoto.Height = Height";
mostCurrent._petfoto.setHeight(_height);
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="petFoto.Top = petFoto.Top + Delta";
mostCurrent._petfoto.setTop((int) (mostCurrent._petfoto.getTop()+_delta));
 }else {
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="Width = b.Width / b.Height * petFoto.Height";
_width = (int) (_b.getWidth()/(double)_b.getHeight()*mostCurrent._petfoto.getHeight());
RDebugUtils.currentLine=2228243;
 //BA.debugLineNum = 2228243;BA.debugLine="Delta = (petFoto.Width - Width) / 2";
_delta = (int) ((mostCurrent._petfoto.getWidth()-_width)/(double)2);
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="petFoto.Width = Width";
mostCurrent._petfoto.setWidth(_width);
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="petFoto.Left = petFoto.Left + Delta";
mostCurrent._petfoto.setLeft((int) (mostCurrent._petfoto.getLeft()+_delta));
 };
 }else {
RDebugUtils.currentLine=2228248;
 //BA.debugLineNum = 2228248;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Imagem não Selecionada"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2228250;
 //BA.debugLineNum = 2228250;BA.debugLine="End Sub";
return "";
}
}