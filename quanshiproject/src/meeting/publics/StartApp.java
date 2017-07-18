package meeting.publics;

import java.io.IOException;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class StartApp  extends UiAutomatorTestCase{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public  static void startApp() throws IOException{
		
		Runtime.getRuntime().exec("am start -S com.gnet.onemeeting/com.gnet.onemeeting.LaunchActivity");
		sleep(5000);
		
	}
	public static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
