
public class TS_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Scenario 1 : To Verify Login Functionality of Facebook");
		
		FacebookLoginPageReusables TS_002 = new FacebookLoginPageReusables();
		
		TS_002.setProperty_Chrome();
		TS_002.chromeBrowser();
		TS_002.getFacebook();
		TS_002.maximizeBrowser();
		TS_002.loginpageEmailID();
		TS_002.loginpagePassword();
		TS_002.loginpageLoginButton();
		//TS_002.waitTimeout();
		//TS_002.browserClose();
	}

}
