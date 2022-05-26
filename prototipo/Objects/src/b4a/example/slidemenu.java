package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class slidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.slidemenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.slidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _actionitem{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper Image;
public Object Value;
public void Initialize() {
IsInitialized = true;
Text = "";
Image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Value = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _mslidepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbackpanel = null;
public Object _mmodule = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.ListViewWrapper _mlistview = null;
public anywheresoftware.b4a.objects.AnimationWrapper _minanimation = null;
public anywheresoftware.b4a.objects.AnimationWrapper _moutanimation = null;
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
public b4a.example.tela_feed _tela_feed = null;
public String  _initialize(b4a.example.slidemenu __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,int _top,int _width) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_top,_width}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub Initialize(Activity As Activity, Module As Obj";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="mModule = Module";
__ref._mmodule = _module;
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
__ref._mslidepanel.Initialize(ba,"mSlidePanel");
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="mListView.Initialize(\"mListView\")";
__ref._mlistview.Initialize(ba,"mListView");
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
__ref._mlistview.getTwoLinesAndBitmap().SecondLabel.setVisible(__c.False);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
__ref._mlistview.getTwoLinesAndBitmap().setItemHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
__ref._mlistview.getTwoLinesAndBitmap().Label.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
__ref._mlistview.getTwoLinesAndBitmap().Label.setHeight(__ref._mlistview.getTwoLinesAndBitmap().getItemHeight());
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
__ref._mlistview.getTwoLinesAndBitmap().Label.setTop((int) (0));
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
__ref._mlistview.getTwoLinesAndBitmap().ImageView.SetLayout(__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="mListView.Color = Colors.DarkGray";
__ref._mlistview.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=11403280;
 //BA.debugLineNum = 11403280;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
__ref._minanimation.InitializeTranslate(ba,"",(float) (-_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=11403281;
 //BA.debugLineNum = 11403281;BA.debugLine="mInAnimation.Duration = 200";
__ref._minanimation.setDuration((long) (200));
RDebugUtils.currentLine=11403282;
 //BA.debugLineNum = 11403282;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
__ref._moutanimation.InitializeTranslate(ba,"Out",(float) (_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=11403283;
 //BA.debugLineNum = 11403283;BA.debugLine="mOutAnimation.Duration = 200";
__ref._moutanimation.setDuration((long) (200));
RDebugUtils.currentLine=11403285;
 //BA.debugLineNum = 11403285;BA.debugLine="Activity.AddView(mSlidePanel, 0, Top, Width, 100%";
_activity.AddView((android.view.View)(__ref._mslidepanel.getObject()),(int) (0),_top,_width,(int) (__c.PerYToCurrent((float) (100),ba)-_top));
RDebugUtils.currentLine=11403287;
 //BA.debugLineNum = 11403287;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
__ref._mbackpanel.Initialize(ba,"mBackPanel");
RDebugUtils.currentLine=11403288;
 //BA.debugLineNum = 11403288;BA.debugLine="mBackPanel.Color = Colors.Transparent";
__ref._mbackpanel.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=11403289;
 //BA.debugLineNum = 11403289;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
_activity.AddView((android.view.View)(__ref._mbackpanel.getObject()),(int) (-__c.PerXToCurrent((float) (100),ba)),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=11403291;
 //BA.debugLineNum = 11403291;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
__ref._mslidepanel.AddView((android.view.View)(__ref._mlistview.getObject()),(int) (0),(int) (0),__ref._mslidepanel.getWidth(),__ref._mslidepanel.getHeight());
RDebugUtils.currentLine=11403292;
 //BA.debugLineNum = 11403292;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel.setVisible(__c.False);
RDebugUtils.currentLine=11403293;
 //BA.debugLineNum = 11403293;BA.debugLine="End Sub";
return "";
}
public String  _additem(b4a.example.slidemenu __ref,String _text,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,Object _returnvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "additem"))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_text,_image,_returnvalue}));}
b4a.example.slidemenu._actionitem _item = null;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub AddItem(Text As String, Image As Bitmap";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Dim item As ActionItem";
_item = new b4a.example.slidemenu._actionitem();
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="item.Text = Text";
_item.Text = _text;
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="item.Image = Image";
_item.Image = _image;
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="item.Value = ReturnValue";
_item.Value = _returnvalue;
RDebugUtils.currentLine=11468807;
 //BA.debugLineNum = 11468807;BA.debugLine="If Not(Image.IsInitialized) Then";
if (__c.Not(_image.IsInitialized())) { 
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Null,";
__ref._mlistview.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(__c.Null),_returnvalue);
 }else {
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Image,";
__ref._mlistview.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(_image.getObject()),_returnvalue);
 };
RDebugUtils.currentLine=11468812;
 //BA.debugLineNum = 11468812;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(b4a.example.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "isvisible"))
	 {return ((Boolean) Debug.delegate(ba, "isvisible", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub isVisible As Boolean";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Return mSlidePanel.Visible";
if (true) return __ref._mslidepanel.getVisible();
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return false;
}
public String  _hide(b4a.example.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "hide"))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="If isVisible = False Then Return";
if (__ref._isvisible(null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="mBackPanel.Left = -mBackPanel.Width";
__ref._mbackpanel.setLeft((int) (-__ref._mbackpanel.getWidth()));
RDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="mSlidePanel.Left = -mSlidePanel.Width";
__ref._mslidepanel.setLeft((int) (-__ref._mslidepanel.getWidth()));
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="mOutAnimation.Start(mSlidePanel)";
__ref._moutanimation.Start((android.view.View)(__ref._mslidepanel.getObject()));
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="End Sub";
return "";
}
public String  _show(b4a.example.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "show"))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="If isVisible = True Then Return";
if (__ref._isvisible(null)==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="mBackPanel.BringToFront";
__ref._mbackpanel.BringToFront();
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="mSlidePanel.BringToFront";
__ref._mslidepanel.BringToFront();
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="mBackPanel.Left = 0";
__ref._mbackpanel.setLeft((int) (0));
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="mSlidePanel.Left = 0";
__ref._mslidepanel.setLeft((int) (0));
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="mSlidePanel.Visible = True";
__ref._mslidepanel.setVisible(__c.True);
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="mInAnimation.Start(mSlidePanel)";
__ref._minanimation.Start((android.view.View)(__ref._mslidepanel.getObject()));
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Type ActionItem (Text As String, Image As Bitmap,";
;
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Private mSlidePanel As Panel";
_mslidepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Private mBackPanel As Panel";
_mbackpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="Private mListView As ListView";
_mlistview = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="Private mInAnimation As Animation";
_minanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="Private mOutAnimation As Animation";
_moutanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="End Sub";
return "";
}
public String  _mbackpanel_touch(b4a.example.slidemenu __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mbackpanel_touch"))
	 {return ((String) Debug.delegate(ba, "mbackpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub mBackPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Hide";
__ref._hide(null);
 };
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="End Sub";
return "";
}
public String  _mlistview_itemclick(b4a.example.slidemenu __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mlistview_itemclick"))
	 {return ((String) Debug.delegate(ba, "mlistview_itemclick", new Object[] {_position,_value}));}
String _subname = "";
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub mListView_ItemClick (Position As Int,";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim subname As String";
_subname = "";
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Hide";
__ref._hide(null);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="subname = mEventName & \"_Click\"";
_subname = __ref._meventname+"_Click";
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="If SubExists(mModule, subname) Then";
if (__c.SubExists(ba,__ref._mmodule,_subname)) { 
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="CallSub2(mModule, subname, Value)";
__c.CallSubNew2(ba,__ref._mmodule,_subname,_value);
 };
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="End Sub";
return "";
}
public String  _out_animationend(b4a.example.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "out_animationend"))
	 {return ((String) Debug.delegate(ba, "out_animationend", null));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub Out_AnimationEnd";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel.setVisible(__c.False);
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return "";
}
}