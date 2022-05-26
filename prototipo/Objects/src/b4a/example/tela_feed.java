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

public class tela_feed extends Activity implements B4AActivity{
	public static tela_feed mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_feed");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_feed).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_feed");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_feed", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_feed) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_feed) Resume **");
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
		return tela_feed.class;
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
        BA.LogInfo("** Activity (tela_feed) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            tela_feed mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_feed) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _panelmenu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrelat_desap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public b4a.example.slidemenu _sm = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lst_feed = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Activity.LoadLayout(\"Feed\")";
mostCurrent._activity.LoadLayout("Feed",mostCurrent.activityBA);
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Main.CodDesap=0";
mostCurrent._main._coddesap = (int) (0);
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="If Main.logado = True Then";
if (mostCurrent._main._logado==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="btnRelat_Desap.Visible = True";
mostCurrent._btnrelat_desap.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="btnMenu.Visible = True";
mostCurrent._btnmenu.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="btnRelat_Desap.Visible = False";
mostCurrent._btnrelat_desap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="btnMenu.Visible = False";
mostCurrent._btnmenu.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="sm.Initialize(Activity, Me, \"SlideMenu\", 53.5dip,";
mostCurrent._sm._initialize(null,mostCurrent.activityBA,mostCurrent._activity,tela_feed.getObject(),"SlideMenu",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (53.5)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="sm.AddItem(\"Cadastrar PET\",Null, 1)";
mostCurrent._sm._additem(null,"Cadastrar PET",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),(Object)(1));
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="sm.AddItem(\"Visualizar PET\", Null, 2)";
mostCurrent._sm._additem(null,"Visualizar PET",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),(Object)(2));
RDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="sm.AddItem(\"Editar Perfil\", Null,3 )";
mostCurrent._sm._additem(null,"Editar Perfil",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),(Object)(3));
RDebugUtils.currentLine=9175059;
 //BA.debugLineNum = 9175059;BA.debugLine="sm.AddItem(\"Meus Desaparecimentos\", Null,4 )";
mostCurrent._sm._additem(null,"Meus Desaparecimentos",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),(Object)(4));
RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="sm.AddItem(\"Sair\", Null,5)";
mostCurrent._sm._additem(null,"Sair",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),(Object)(5));
RDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="CarregarDesap";
_carregardesap();
RDebugUtils.currentLine=9175067;
 //BA.debugLineNum = 9175067;BA.debugLine="End Sub";
return "";
}
public static void  _carregardesap() throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "carregardesap"))
	 {Debug.delegate(mostCurrent.activityBA, "carregardesap", null); return;}
ResumableSub_CarregarDesap rsub = new ResumableSub_CarregarDesap(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CarregarDesap extends BA.ResumableSub {
public ResumableSub_CarregarDesap(b4a.example.tela_feed parent) {
this.parent = parent;
}
b4a.example.tela_feed parent;
b4a.example.dbrequestmanager _req = null;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
b4a.example.main._dbresult _res = null;
Object[] _row = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _obitmap = null;
byte[] _buffer = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_feed";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim req As DBRequestManager = CreateRequest";
_req = _createrequest();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"CarregarDes";
_cmd = _createcommand("CarregarDesap",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_feed", "carregardesap"), (Object)(_req._executequery(null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="ProgressDialogShow(\"Carregando...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Carregando..."));
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync(null,_j,"req");
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_feed", "carregardesap"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.main._dbresult) result[0];
;
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="req.PrintTable(res)";
_req._printtable(null,_res);
RDebugUtils.currentLine=9502730;
 //BA.debugLineNum = 9502730;BA.debugLine="Log(res.Columns)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_res.Columns));
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="lst_Feed.Clear";
parent.mostCurrent._lst_feed.Clear();
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group12 = _res.Rows;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index12 < groupLen12) {
this.state = 6;
_row = (Object[])(group12.Get(index12));}
if (true) break;

case 14:
//C
this.state = 13;
index12++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=9502735;
 //BA.debugLineNum = 9502735;BA.debugLine="Dim oBitMap As Bitmap";
_obitmap = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=9502736;
 //BA.debugLineNum = 9502736;BA.debugLine="Dim buffer() As Byte";
_buffer = new byte[(int) (0)];
;
RDebugUtils.currentLine=9502738;
 //BA.debugLineNum = 9502738;BA.debugLine="buffer = row(4)";
_buffer = (byte[])(_row[(int) (4)]);
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="oBitMap = req.BytesToImage(buffer)";
_obitmap = _req._bytestoimage(null,_buffer);
RDebugUtils.currentLine=9502741;
 //BA.debugLineNum = 9502741;BA.debugLine="lst_Feed.TwoLinesAndBitmap.Label.TextColor=Colo";
parent.mostCurrent._lst_feed.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="lst_Feed.AddTwoLinesAndBitmap(\"(\" &row(0)& \") -";
parent.mostCurrent._lst_feed.AddTwoLinesAndBitmap(BA.ObjectToCharSequence("("+BA.ObjectToString(_row[(int) (0)])+") - "+anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(_row[(int) (2)]))),BA.ObjectToCharSequence(BA.ObjectToString(_row[(int) (1)])+"         Veja mais..."),(android.graphics.Bitmap)(_obitmap.getObject()));
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
RDebugUtils.currentLine=9502747;
 //BA.debugLineNum = 9502747;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("ERROR: "+_j._errormessage);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9502749;
 //BA.debugLineNum = 9502749;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=9502750;
 //BA.debugLineNum = 9502750;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=9502751;
 //BA.debugLineNum = 9502751;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK And sm.isVisib";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK && mostCurrent._sm._isvisible(null)) { 
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="sm.Hide";
mostCurrent._sm._hide(null);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_MENU Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_MENU) { 
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="If sm.isVisible Then sm.Hide Else sm.Show";
if (mostCurrent._sm._isvisible(null)) { 
mostCurrent._sm._hide(null);}
else {
mostCurrent._sm._show(null);};
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_feed";
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="CarregarDesap";
_carregardesap();
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="sm.Show";
mostCurrent._sm._show(null);
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="End Sub";
return "";
}
public static String  _btnrelat_desap_click() throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnrelat_desap_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnrelat_desap_click", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub btnRelat_Desap_Click";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="StartActivity(\"Tela_CadDesap\")";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)("Tela_CadDesap"));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="End Sub";
return "";
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_feed.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="End Sub";
return null;
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="End Sub";
return null;
}
public static String  _lst_feed_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lst_feed_itemclick"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lst_feed_itemclick", new Object[] {_position,_value}));}
adr.stringfunctions.stringfunctions _sf = null;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub lst_Feed_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Try";
try {RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Dim sf As StringFunctions";
_sf = new adr.stringfunctions.stringfunctions();
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Main.CodDesap = sf.MidExtract(Value,\"(\",\")\")";
mostCurrent._main._coddesap = (int)(Double.parseDouble(_sf._vvvv6(BA.ObjectToString(_value),"(",")")));
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="StartActivity(Tela_ListarDesap)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._tela_listardesap.getObject()));
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Main.CodDesap=0";
mostCurrent._main._coddesap = (int) (0);
 };
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="End Sub";
return "";
}
public static String  _lst_feed_scrollchanged(int _position) throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lst_feed_scrollchanged"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lst_feed_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub lst_Feed_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return "";
}
public static String  _slidemenu_click(Object _item) throws Exception{
RDebugUtils.currentModule="tela_feed";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slidemenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "slidemenu_click", new Object[] {_item}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub SlideMenu_Click(Item As Object)";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If Item =1 Then";
if ((_item).equals((Object)(1))) { 
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="StartActivity(Tela_CadPET)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._tela_cadpet.getObject()));
 }else 
{RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Else If Item =2 Then";
if ((_item).equals((Object)(2))) { 
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="StartActivity(Tela_ListarPET)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._tela_listarpet.getObject()));
 }else 
{RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Else If Item =3 Then";
if ((_item).equals((Object)(3))) { 
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="StartActivity(Tela_EditarPerfil)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._tela_editarperfil.getObject()));
 }else 
{RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="Else If Item =4 Then";
if ((_item).equals((Object)(4))) { 
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="StartActivity(Tela_VizDesap)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._tela_vizdesap.getObject()));
 }else 
{RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="Else If Item =5 Then";
if ((_item).equals((Object)(5))) { 
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }}}}}
;
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="End Sub";
return "";
}
}