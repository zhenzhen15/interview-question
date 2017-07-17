package meeting.task;

import android.R.bool;
import meeting.ui.constant.HomePageContant;
import meeting.ui.page.HomePage;

public class HomePageLogin {

	/**
	 * @param args
	 * @return 
	 */
	public static void homePageLogin() {
		HomePage.loginButton(HomePageContant.loginButtonid);
	
	}
	public static void homePageRegist(){
		HomePage.loginButton(HomePageContant.registButtonid);
		
	}
}
