import org.openqa.selenium.By;

public class NaukriHomePageReusables extends ProjectReusables {
	
	//Enter Email ID in Login Page
	public void homepageEmailID()
	{
			naukri.findElement(By.xpath(HomePageControls_EmailID)).sendKeys(HomePageInputs_EmailID);
	}
		
	//Enter Password in Login Page
	public void homepagePassword()
	{
		naukri.findElement(By.xpath(HomePageControls_Password)).sendKeys(HomePageInputs_Password);
	}
		
	//Click Login Button in Login Page 
	public void homepageLoginButton()
	{
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
	
	}
