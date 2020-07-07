
public class ts_004 {

	public static void main(String[] args) {

		ProjectReusables projectReusables = new ProjectReusables();
		try
		{
			projectReusables.loadExcelFile();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		NaukriHomePageReusables	naukriHomePage	= new NaukriHomePageReusables();
		
		for (int i=0; i < 2; i++) {
			if (i==0) {
				projectReusables.setProperty_Chrome();
				projectReusables.chromeBrowser();
			}
			else {
				projectReusables.setProperty_Firefox();
				projectReusables.firefoxBrowser();
			}
			projectReusables.naukriUrl();
			projectReusables.waitTimeout();
			projectReusables.maximizeBrowser();
			naukriHomePage.homepageLoginLink();
			projectReusables.waitTimeout();
			
			//naukriHomePage.homepageLoginButton();
			//projectReusables.waitTimeout();
			//naukriHomePage.verifyEmailErrorMessage();
			//naukriHomePage.verifyPasswordErrorMessage();
			//projectReusables.waitTimeout();
			
			//Input email/user ID
			naukriHomePage.homepageEmailID();
			
			//Input Invalid Password
			naukriHomePage.homepagePassword();
			
			//Click Login Button
			naukriHomePage.homepageLoginButton();
			
			//wait for result
			projectReusables.waitTimeout();
			
			//Verify combined error
			naukriHomePage.verifyCombinedErrorMessage();
			
			projectReusables.waitTimeout();
			projectReusables.browserallClose();
		}		
	}
}
