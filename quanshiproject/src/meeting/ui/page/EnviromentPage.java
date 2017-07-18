package meeting.ui.page;

import com.android.uiautomator.core.UiObject;

import meeting.publics.FindAssistant;

public class EnviromentPage {
	//点击logo
	public static UiObject ClickLogoButton(String id){
		 return FindAssistant.ClickById(id);
	}
	//选择环境
	public static UiObject ClickEnviromentButton (String classname,int i){
		 return FindAssistant.ClickByClassName(classname, i);
	}
	
	public static UiObject ClickOkButton(String text){
		return FindAssistant.ClickByText(text);
	}
	

}
