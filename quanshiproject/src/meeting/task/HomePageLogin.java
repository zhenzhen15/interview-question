package meeting.task;

import com.android.uiautomator.core.UiObject;

import android.R.bool;
import meeting.ui.constant.HomePageContant;
import meeting.ui.page.HomePage;

public class HomePageLogin {

	/**
	 * @param args
	 * @return 
	 */
	public static UiObject homePageLogin() {
	   return	HomePage.loginButton(HomePageContant.loginButtonid);
	
	}
	public static UiObject homePageRegist(){
	    return	HomePage.loginButton(HomePageContant.registButtonid);
		
	}
}
