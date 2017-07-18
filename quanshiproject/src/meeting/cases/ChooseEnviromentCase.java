package meeting.cases;

import java.io.IOException;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import meeting.publics.StartApp;
import meeting.task.HomePageLogin;
import meeting.task.SettingEnviroment;

public class ChooseEnviromentCase extends UiAutomatorTestCase {
	public void testChooseEnviromet() throws IOException{
		//启动app
		StartApp.startApp();
		//点击登录
		HomePageLogin.homePageLogin();
		sleep(500);
		
		//环境选择
		SettingEnviroment.chooseEnviroment();
		
	}

}
