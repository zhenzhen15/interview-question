package meeting.task;

import meeting.ui.constant.EnviromentPageContant;
import meeting.ui.page.EnviromentPage;

import com.android.uiautomator.core.UiObject;

	public class SettingEnviroment {
	//点击logo
	public static UiObject ClickLogoButton(){
		return EnviromentPage.ClickLogoButton(EnviromentPageContant.logobuttonid);
				
	}
	public static UiObject ChooseEviroment(){
		return EnviromentPage.ClickEnviromentButton(EnviromentPageContant.enviromentlistclass, EnviromentPageContant.i);
	}
	public static  UiObject clickOkButton(){
		return EnviromentPage.ClickOkButton(EnviromentPageContant.confim);
		
	}
	public  static void chooseEnviroment(){
		ClickLogoButton();
		ChooseEviroment();
		clickOkButton();
	}
	

}
