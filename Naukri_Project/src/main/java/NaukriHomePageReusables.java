import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;

public class NaukriHomePageReusables extends ProjectReusables implements NaukriHomePageControls{
		
	//Enter Email ID in Login Page
	public void homepageEmailID()
	{
			naukri.findElement(By.xpath(HomePageControls_EmailID)).sendKeys(NaukriInputs_UserName);
	}
		
	//Enter Password in Login Page
	public void homepagePassword()
	{
		naukri.findElement(By.xpath(HomePageControls_Password)).sendKeys(NaukriInputs_Password);
	}
		
	//Click Login Button in Login Page 
	public void homepageLoginButton()
	{
		//naukri.findElement(By.xpath(HomePageControls_LoginButton)).sendKeys("\t");
		naukri.findElement(By.xpath(HomePageControls_LoginButton)).click();
	}
	
	//Click on Login Link in Home Page
	public void homepageLoginLink()
	{
		naukri.findElement(By.xpath(HomePageControls_LoginLink)).click();
	}
	
	//Click  Register for free in login Page
	public void homepageFreeRegisterButton()
	{
		naukri.findElement(By.xpath(HomePageControls_Register_for_free_button)).click();
	}
		
	// Click I am experienced in Register Page
	public void homePageControlsIamExpButton()
	{
		naukri.findElement(By.xpath(HomePageControls_I_am_experienced_button)).click();
	}
	
	public void GoToJobPage() {
		naukri.findElement(By.xpath(HomePageControls_JobLink)).click();
	}
	
	public void GoToRecruitersPage() {
		naukri.findElement(By.xpath(HomePageControls_RecruitersLink)).click();
	}
	
	public void GoToCompaniesPage() {
		naukri.findElement(By.xpath(HomePageControls_CompaniesLink)).click();
	}
	
	public void GoToToolsPage() {
		naukri.findElement(By.xpath(HomePageControls_ToolsLink)).click();
	}
	
	public void GoToServicesPage() {
		naukri.findElement(By.xpath(HomePageControls_ServicesLink)).click();
	}
	
	public void GoToMorePage() {
		naukri.findElement(By.xpath(HomePageControls_MoreLink)).click();
	}
	public void InputSkills() {
		naukri.findElement(By.xpath(JobSkills_Input)).sendKeys("");
	}
	
	public void InputLocation() {
		naukri.findElement(By.xpath(JobLocation_Input)).sendKeys("");
	}
	
	public void SearchJobs() {
		naukri.findElement(By.xpath(JobSearch_Button)).click();
	}
	
	//verify error message
	public void verifyErrorMessage(String ElementXPath, String ElementType, String ExpectedErrMsg)
	{
		String actualErrorMsg = naukri.findElement(By.xpath(ElementXPath)).getText();
		System.out.println("-----------------------------------------------------------------------");
		if(ExpectedErrMsg.equals(actualErrorMsg))
		{
			System.out.println("Correct " + ElementType + " Error Message");			
		}
		
		else 
		{
			System.out.println("InCorrect " + ElementType + " Error Message");			
		}
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Expected " + ElementType + " Error Message : " + ExpectedErrMsg);
		System.out.println("Actual " + ElementType + " Error Message : " + actualErrorMsg);
		System.out.println("-----------------------------------------------------------------------");
	}
	
	// To verify email error msg
	public void verifyEmailErrorMessage()
	{		
		verifyErrorMessage(HomePageControls_EmailError, "Email", HomePageInputs_ExpecCombinedErrorMessage);
	}
	// To verify password error msg
	public void verifyPasswordErrorMessage()
	{		
		verifyErrorMessage(HomePageControls_PasswordError, "Password", HomePageInputs_ExpecPasswordErrorMessage);
	}
	
	// To verify combined error msg
	public void verifyCombinedErrorMessage()
	{
		verifyErrorMessage(HomePageControls_CombinedErr, "Combined", HomePageInputs_ExpecCombinedErrorMessage);		
	}
				
}
