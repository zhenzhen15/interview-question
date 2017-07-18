package meeting.cases;

import java.io.IOException;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import meeting.publics.StartApp;
import meeting.task.HomePageLogin;

public class HomePgeCase extends UiAutomatorTestCase {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public  void TestHomePageLoginCase() throws IOException{
		StartApp.startApp();
		HomePageLogin.homePageLogin();
		
	}

}
