
public class TS_001 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 1 : To Verify Url");
		
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

		System.out.println("Url Verified Succesfully");
	}

}
