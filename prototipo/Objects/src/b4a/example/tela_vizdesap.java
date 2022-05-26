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

public class tela_vizdesap extends Activity implements B4AActivity{
	public static tela_vizdesap mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_vizdesap");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_vizdesap).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_vizdesap");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_vizdesap", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_vizdesap) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_vizdesap) Resume **");
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
		return tela_vizdesap.class;
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
        BA.LogInfo("** Activity (tela_vizdesap) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            tela_vizdesap mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_vizdesap) Resume **");
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
public static int _codigodesap = 0;
public anywheresoftware.b4a.objects.ListViewWrapper _lst_desapusu = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.tela_caddesap _tela_caddesap = null;
public b4a.example.tela_editarpet _tela_editarpet = null;
public b4a.example.tela_cadusu _tela_cadusu = null;
public b4a.example.tela_listarpet _tela_listarpet = null;
public b4a.example.tela_listardesap _tela_listardesap = null;
public b4a.example.tela_editarperfil _tela_editarperfil = null;
public b4a.example.tela_cadpet _tela_cadpet = null;
public b4a.example.tela_feed _tela_feed = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Activity.LoadLayout(\"Viz_Desap\")";
mostCurrent._activity.LoadLayout("Viz_Desap",mostCurrent.activityBA);
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="VizDesap_Usu(Main.Usu_Cod)";
_vizdesap_usu(mostCurrent._main._usu_cod);
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="End Sub";
return "";
}
public static void  _vizdesap_usu(int _usu_cod) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "vizdesap_usu"))
	 {Debug.delegate(mostCurrent.activityBA, "vizdesap_usu", new Object[] {_usu_cod}); return;}
ResumableSub_VizDesap_Usu rsub = new ResumableSub_VizDesap_Usu(null,_usu_cod);
rsub.resume(processBA, null);
}
public static class ResumableSub_VizDesap_Usu extends BA.ResumableSub {
public ResumableSub_VizDesap_Usu(b4a.example.tela_vizdesap parent,int _usu_cod) {
this.parent = parent;
this._usu_cod = _usu_cod;
}
b4a.example.tela_vizdesap parent;
int _usu_cod;
b4a.example.dbrequestmanager _req = null;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
b4a.example.main._dbresult _res = null;
Object[] _row = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _obitmap = null;
byte[] _buffer = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"VizDesap_Us";
_cmd = _createcommand("VizDesap_Usu",new Object[]{(Object)(_usu_cod)});
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_vizdesap", "vizdesap_usu"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_vizdesap", "vizdesap_usu"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="req.PrintTable(res)";
_req._printtable(null,_res);
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="lst_desapUsu.Clear";
parent.mostCurrent._lst_desapusu.Clear();
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.Rows;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="Dim oBitMap As Bitmap";
_obitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="Dim buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="buffer = row(12)";
_buffer = (byte[])(_row[(int) (12)]);
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
_obitmap = _req._bytestoimage(null,_buffer);
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="lst_desapUsu.TwoLinesAndBitmap.Label.TextColor=";
parent.mostCurrent._lst_desapusu.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=5439508;
 //BA.debugLineNum = 5439508;BA.debugLine="lst_desapUsu.AddTwoLinesAndBitmap(\"(\"&row(8)&\")";
parent.mostCurrent._lst_desapusu.AddTwoLinesAndBitmap(BA.ObjectToCharSequence("("+BA.ObjectToString(_row[(int) (8)])+") - "+BA.ObjectToString(_row[(int) (14)])+" - "+BA.ObjectToString(_row[(int) (9)])),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(_row[(int) (10)]))),(android.graphics.Bitmap)(_obitmap.getObject()));
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
RDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=5439517;
 //BA.debugLineNum = 5439517;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=5439518;
 //BA.debugLineNum = 5439518;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="End Sub";
return null;
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_vizdesap.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="End Sub";
return null;
}
public static void  _excluirdesap(int _deletebyid) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "excluirdesap"))
	 {Debug.delegate(mostCurrent.activityBA, "excluirdesap", new Object[] {_deletebyid}); return;}
ResumableSub_ExcluirDesap rsub = new ResumableSub_ExcluirDesap(null,_deletebyid);
rsub.resume(processBA, null);
}
public static class ResumableSub_ExcluirDesap extends BA.ResumableSub {
public ResumableSub_ExcluirDesap(b4a.example.tela_vizdesap parent,int _deletebyid) {
this.parent = parent;
this._deletebyid = _deletebyid;
}
b4a.example.tela_vizdesap parent;
int _deletebyid;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"ExcluirDesa";
_cmd = _createcommand("ExcluirDesap",new Object[]{(Object)(_deletebyid)});
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
_j = _createrequest()._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Wait For (j) jobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_vizdesap", "excluirdesap"), (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="ProgressDialogShow(\"Excluindo...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Excluindo..."));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="ToastMessageShow(\"Excluído com sucesso!\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Excluído com sucesso!"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="VizDesap_Usu(Main.Usu_Cod)";
_vizdesap_usu(parent.mostCurrent._main._usu_cod);
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lst_desapusu_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="tela_vizdesap";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lst_desapusu_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lst_desapusu_itemclick", new Object[] {_position,_value}));}
int _result = 0;
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub lst_desapUsu_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="result = Msgbox2(\"Confirmar exclusão\", \"PETS\", \"S";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Confirmar exclusão"),BA.ObjectToCharSequence("PETS"),"Sim","","Não",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"question.png").getObject()),mostCurrent.activityBA);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Try";
try {RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="CodigoDesap = sf.MidExtract(Value,\"(\",\")\")";
_codigodesap = (int)(Double.parseDouble(_sf._vvvv6(BA.ObjectToString(_value),"(",")")));
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="ExcluirDesap(CodigoDesap)";
_excluirdesap(_codigodesap);
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="CodigoDesap=0";
_codigodesap = (int) (0);
 };
 };
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="End Sub";
return "";
}
}