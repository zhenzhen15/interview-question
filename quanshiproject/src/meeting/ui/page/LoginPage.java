package meeting.ui.page;

import com.android.uiautomator.core.UiObject;

import meeting.publics.FindAssistant;

public class LoginPage {

	/**
	 * @param args
	 */
	public static UiObject username(String id) {
		 return FindAssistant.ClickById(id);
		
	}
	public static UiObject userpwd(String id) {
		 return FindAssistant.ClickById(id);
		
	}
	public static UiObject clickLoginButton(String id) {
		return FindAssistant.ClickById(id);
		
	}
	public void inputusername(String text){
		
	}
}
