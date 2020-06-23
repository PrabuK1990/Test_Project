
public class TS_001 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 1 : To Verify Login Functionality");
		
		//-------------------------------------------------------------------------------
		//Create new instance for NaukriLoginPageReusables class and store it in a object
		//and name it as "ts_001"
		//Mention Type as "NaukriLoginPageReusables"
		//-------------------------------------------------------------------------------
		//Webdriver NaukriLoginPageReusables = new ChromeDriver();
		
		NaukriLoginPageReusables ts_001 = new NaukriLoginPageReusables();
		
		//-------------------------------------------------------------------------------
		//Using ts_001 object call setProperty_Chrome, chromeBrowser and naukriUrl
		//-------------------------------------------------------------------------------
		
		ts_001.setProperty_Chrome();
		ts_001.chromeBrowser();
		ts_001.naukriUrl();	
		ts_001.waitTimeout();
		ts_001.maximizeBrowser();
		ts_001.homepageLoginLink();
		ts_001.waitTimeout();
		ts_001.loginpageEmailID();
		ts_001.loginpagePassword();
		ts_001.loginpageLoginButton();
		ts_001.waitTimeout();
		ts_001.browserallClose();
		

		System.out.println("Login Functionality Verified Succesfully");
	}

}
