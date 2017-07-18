package meeting.ui.page;

import com.android.uiautomator.core.UiObject;

import android.R.bool;
import meeting.publics.FindAssistant;

public class HomePage {

	/**
	 * @param args
	 */
	 
	public static  UiObject loginButton(String id){
		return FindAssistant.ClickById(id);
		
		
	}
	public static UiObject registerButton(String id){
		return FindAssistant.ClickById(id);
		
	}
	
	
}
