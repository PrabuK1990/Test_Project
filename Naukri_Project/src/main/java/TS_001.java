import java.io.IOException;

public class TS_001 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Scenario 1 : To Verify Login Functionality");
		
		//-------------------------------------------------------------------------------
		//Create new instance for NaukriLoginPageReusables class and store it in an object
		//and name it as "ts_001"
		//Mention Type as "NaukriLoginPageReusables"
		//-------------------------------------------------------------------------------
		//Webdriver NaukriLoginPageReusables = new ChromeDriver();
		
		LoadExcel excel = new LoadExcel();
		ProjectReusables projectReusables = new ProjectReusables();
		NaukriHomePageReusables naukriHomePageReusables = new NaukriHomePageReusables();
		
		excel.loadExcelFile();
		projectReusables.setProperty_Chrome();
		projectReusables.chromeBrowser();
		projectReusables.maximizeBrowser();
		projectReusables.naukriUrl();
		projectReusables.waitTimeout();
		naukriHomePageReusables.homepageLoginLink();
		projectReusables.waitTimeout();
		naukriHomePageReusables.homepageEmailID();
		naukriHomePageReusables.homepagePassword();
		naukriHomePageReusables.homepageLoginButton();
		
		
		//-------------------------------------------------------------------------------
		//Using ts_001 object call setProperty_Chrome, chromeBrowser and naukriUrl
		//-------------------------------------------------------------------------------
		

		System.out.println("Login Page Verified Succesfully");
	}

}
