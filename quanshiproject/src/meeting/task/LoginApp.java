package meeting.task;

import meeting.publics.FindAssistant;
import meeting.ui.constant.LoginPageContant;

import android.renderscript.Element;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;

public class LoginApp {
	public static UiObject clickInputusename(){
		return FindAssistant.ClickById(LoginPageContant.userNameId);
	}
	
	public static UiObject clickInputusepwd(){
		return FindAssistant.ClickById(LoginPageContant.userPwdId);
	}
	public static UiObject clickLoginbutton(){
		return FindAssistant.ClickById(LoginPageContant.loginButtonId);
	}
	public static void loginApp() throws UiObjectNotFoundException{
		//点击输入框，输入用户名
		UiObject usernaemUiObject=clickInputusename();
		if(usernaemUiObject.getText()==null){
			usernaemUiObject.setText("zhenzhen.zong@quanshi.cn");
			
		}else{
			usernaemUiObject.clearTextField();
		 	sleep(500);
		 	usernaemUiObject.clearTextField();
		 	sleep(500);
		 	usernaemUiObject.clearTextField();
		 	sleep(500);
		 	usernaemUiObject.setText("zhenzhen.zong@quanshi.cn");
		}
		
		UiObject usepwdObject = clickInputusepwd();
		if(usepwdObject.getText()==null){
			
			
			usepwdObject.setText("q111111");
		}else{
			//pwdObject.clearTextField();
			 FindAssistant.getDevice().click(640, 671);
         
			 usepwdObject.setText("q111111");
			
		}
		//收起键盘
		FindAssistant.getDevice().click(700,1205);
		clickLoginbutton();
		UiObject joinbutobject = new UiObject(new UiSelector().text("立即入会"));
		if(joinbutobject.exists()){
			System.out.println("denglu登录成功");
			
		}
		else {
			System.out.println("sss登录失败");
		}
		
	}

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
