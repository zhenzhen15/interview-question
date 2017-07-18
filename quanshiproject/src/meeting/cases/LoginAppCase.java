package meeting.cases;

import java.io.IOException;

import meeting.publics.StartApp;
import meeting.task.HomePageLogin;
import meeting.task.LoginApp;
import meeting.task.SettingEnviroment;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class LoginAppCase extends UiAutomatorTestCase{
	public void testloginApp() throws IOException, UiObjectNotFoundException{
		StartApp.startApp();
		HomePageLogin.homePageLogin();
		SettingEnviroment.chooseEnviroment();
		LoginApp.loginApp();
	}

}
