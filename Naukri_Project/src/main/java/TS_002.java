import org.openqa.selenium.chrome.ChromeDriver;

public class TS_002 {

	public static void main(String[] args) {
		
		System.out.println("Scenario 2 : To Verify Register Functionality");
		
		//Create new instance of 3 reusables and store it in projectReusables, naukriHomePageReusables and naukriRegisterPageReusables
		
		ProjectReusables projectReusables = new ProjectReusables();
		NaukriHomePageReusables	naukriHomePageReusables = new NaukriHomePageReusables();
		NaukriRegisterPageReusables	naukriRegisterPageReusables = new NaukriRegisterPageReusables();
		
		projectReusables.setProperty_Chrome();
		projectReusables.chromeBrowser();
		projectReusables.naukriUrl();
		projectReusables.waitTimeout();
		projectReusables.maximizeBrowser();
		naukriHomePageReusables.homepageFreeRegisterButton();
		projectReusables.waitTimeout();
		naukriHomePageReusables.homePageControlsIamExpButton();
		projectReusables.waitTimeout();
		naukriRegisterPageReusables.registerPageControlsName();
		naukriRegisterPageReusables.registerPageControlsEmailId();
		naukriRegisterPageReusables.registerPageControlsCreatePassword();
		naukriRegisterPageReusables.registerPageControlsEnterMobileNumber();
		naukriRegisterPageReusables.registerPageControlsTotalExp();
		naukriRegisterPageReusables.registerPageControlsRegisterNow();
		projectReusables.waitTimeout();
		projectReusables.browserallClose();
		
		System.out.println("Register Page Verified Succesfully");
		
	}

}
