package meeting.ui.page;

import android.R.bool;
import meeting.publics.FindAssistant;

public class HomePage {

	/**
	 * @param args
	 */
	 
	public static  void loginButton(String id){
		 FindAssistant.ClickById(id);
		
		
	}
	public static boolean registerButton(String id){
		return FindAssistant.ClickById(id);
		
	}
	
	
}
