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

public class tela_cadpet extends Activity implements B4AActivity{
	public static tela_cadpet mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.tela_cadpet");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (tela_cadpet).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.tela_cadpet");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.tela_cadpet", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (tela_cadpet) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (tela_cadpet) Resume **");
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
		return tela_cadpet.class;
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
        BA.LogInfo("** Activity (tela_cadpet) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            tela_cadpet mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (tela_cadpet) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtnomepet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtracapet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcorpet = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpetdescricao = null;
public anywheresoftware.b4a.phone.Phone.ContentChooser _imagechooser = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _fotopet = null;
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
public b4a.example.tela_feed _tela_feed = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Activity.LoadLayout(\"Cad_PET\")";
mostCurrent._activity.LoadLayout("Cad_PET",mostCurrent.activityBA);
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="tela_cadpet";
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public static String  _btncadastrarpet_click() throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncadastrarpet_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncadastrarpet_click", null));}
byte[] _foto = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub btnCadastrarPET_Click";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim Foto () As Byte";
_foto = new byte[(int) (0)];
;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Foto = CreateRequest.ImageToBytes(FotoPET.Bitmap)";
_foto = _createrequest()._imagetobytes(null,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._fotopet.getBitmap())));
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="InserirPET(txtNomePET.Text, txtRacaPET.Text, txtC";
_inserirpet(mostCurrent._txtnomepet.getText(),mostCurrent._txtracapet.getText(),mostCurrent._txtcorpet.getText(),mostCurrent._main._usu_cod,"Não",mostCurrent._txtpetdescricao.getText(),_foto);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="End Sub";
return "";
}
public static b4a.example.dbrequestmanager  _createrequest() throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequest"))
	 {return ((b4a.example.dbrequestmanager) Debug.delegate(mostCurrent.activityBA, "createrequest", null));}
b4a.example.dbrequestmanager _req = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.dbrequestmanager();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="req.Initialize(Me, Main.exportrdcLink)";
_req._initialize(null,processBA,tela_cadpet.getObject(),mostCurrent._main._exportrdclink);
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="End Sub";
return null;
}
public static void  _inserirpet(String _nome,String _raca,String _cor,int _usuario,String _doacao,String _descricao,byte[] _foto) throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "inserirpet"))
	 {Debug.delegate(mostCurrent.activityBA, "inserirpet", new Object[] {_nome,_raca,_cor,_usuario,_doacao,_descricao,_foto}); return;}
ResumableSub_InserirPET rsub = new ResumableSub_InserirPET(null,_nome,_raca,_cor,_usuario,_doacao,_descricao,_foto);
rsub.resume(processBA, null);
}
public static class ResumableSub_InserirPET extends BA.ResumableSub {
public ResumableSub_InserirPET(b4a.example.tela_cadpet parent,String _nome,String _raca,String _cor,int _usuario,String _doacao,String _descricao,byte[] _foto) {
this.parent = parent;
this._nome = _nome;
this._raca = _raca;
this._cor = _cor;
this._usuario = _usuario;
this._doacao = _doacao;
this._descricao = _descricao;
this._foto = _foto;
}
b4a.example.tela_cadpet parent;
String _nome;
String _raca;
String _cor;
int _usuario;
String _doacao;
String _descricao;
byte[] _foto;
b4a.example.main._dbcommand _cmd = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="tela_cadpet";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InserirPET\"";
_cmd = _createcommand("InserirPET",new Object[]{(Object)(_nome),(Object)(_raca),(Object)(_cor),(Object)(_usuario),(Object)(_doacao),(Object)(_descricao),(Object)(_foto)});
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Dim j As HttpJob = CreateRequest.ExecuteBatch(Arr";
_j = _createrequest()._executebatch(null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "tela_cadpet", "inserirpet"), (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (anywheresoftware.b4a.samples.httputils2.httpjob) result[0];
;
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="Msgbox(\"Inserido com sucesso!\", \"PETS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Inserido com sucesso!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="Msgbox(\"Verifique os Valores Informados!\", \"PETS";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Verifique os Valores Informados!"),BA.ObjectToCharSequence("PETS"),mostCurrent.activityBA);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="j.Release";
_j._release();
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnfotopet_click() throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfotopet_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfotopet_click", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub btnFotoPET_Click";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="ImageChooser.Initialize(\"imgChooser\")";
mostCurrent._imagechooser.Initialize("imgChooser");
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="ImageChooser.Show(\"image/*\",\"Escolha a Foto\")";
mostCurrent._imagechooser.Show(processBA,"image/*","Escolha a Foto");
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="End Sub";
return "";
}
public static String  _btnmenu_click() throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmenu_click"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmenu_click", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub btnMenu_Click";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return "";
}
public static b4a.example.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcommand"))
	 {return ((b4a.example.main._dbcommand) Debug.delegate(mostCurrent.activityBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.main._dbcommand _cmd = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.main._dbcommand();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="cmd.Name = Name";
_cmd.Name = _name;
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters = _parameters;};
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="End Sub";
return null;
}
public static String  _imgchooser_result(boolean _succes,String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="tela_cadpet";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgchooser_result"))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgchooser_result", new Object[] {_succes,_dir,_filename}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
int _delta = 0;
int _height = 0;
int _width = 0;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub imgChooser_Result(Succes As Boolean, Dir As St";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="If Succes=True Then";
if (_succes==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="b.Initialize(Dir, FileName)";
_b.Initialize(_dir,_filename);
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="FotoPET.Bitmap = b";
mostCurrent._fotopet.setBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="Dim Delta, Height, Width As Int";
_delta = 0;
_height = 0;
_width = 0;
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="If b.Width / b.Height > FotoPET.Width / FotoPET.";
if (_b.getWidth()/(double)_b.getHeight()>mostCurrent._fotopet.getWidth()/(double)mostCurrent._fotopet.getHeight()) { 
RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="Height = b.Height / b.Width * FotoPET.Width";
_height = (int) (_b.getHeight()/(double)_b.getWidth()*mostCurrent._fotopet.getWidth());
RDebugUtils.currentLine=7995406;
 //BA.debugLineNum = 7995406;BA.debugLine="Delta = (FotoPET.Height - Height) / 2";
_delta = (int) ((mostCurrent._fotopet.getHeight()-_height)/(double)2);
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="FotoPET.Height = Height";
mostCurrent._fotopet.setHeight(_height);
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="FotoPET.Top = FotoPET.Top + Delta";
mostCurrent._fotopet.setTop((int) (mostCurrent._fotopet.getTop()+_delta));
 }else {
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="Width = b.Width / b.Height * FotoPET.Height";
_width = (int) (_b.getWidth()/(double)_b.getHeight()*mostCurrent._fotopet.getHeight());
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="Delta = (FotoPET.Width - Width) / 2";
_delta = (int) ((mostCurrent._fotopet.getWidth()-_width)/(double)2);
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="FotoPET.Width = Width";
mostCurrent._fotopet.setWidth(_width);
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="FotoPET.Left = FotoPET.Left + Delta";
mostCurrent._fotopet.setLeft((int) (mostCurrent._fotopet.getLeft()+_delta));
 };
 }else {
RDebugUtils.currentLine=7995416;
 //BA.debugLineNum = 7995416;BA.debugLine="ToastMessageShow(\"Imagem não Selecionada\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Imagem não Selecionada"),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="End Sub";
return "";
}
}