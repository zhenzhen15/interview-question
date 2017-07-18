package meeting.test;

import meeting.tool.UiAutomatorTool;

public class LoginAppCaseTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UiAutomatorTool("quanshi","meeting.cases.LoginAppCase" ,"testloginApp","1");
		String name = "宗珍珍";
		System.out.println("我们");
		System.out.println(name);
	}

}
