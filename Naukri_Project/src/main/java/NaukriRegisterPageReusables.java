import org.openqa.selenium.By;

public class NaukriRegisterPageReusables extends ProjectReusables {
		
		// Enter Name in Register page 
		public void 
		registerPageControlsName()
		{
			naukri.findElement(By.xpath(RegisterPageControls_NameTextBox)).sendKeys("RegisterPageControls_Name");
		}
		
		// Enter Email in Register page
		public void registerPageControlsEmailId()
		{
			naukri.findElement(By.xpath(RegisterPageControls_Email_TextBox)).sendKeys("RegisterPageControls_EmailTextBox");
		}
		
		// Create password in Register page
		public void registerPageControlsCreatePassword()
		{
		naukri.findElement(By.xpath(RegisterPageControls_Password_TestBox)).sendKeys("RegisterPageControls_Password");
		}
		
		// Enter moblile number in Register Page
		public void registerPageControlsEnterMobileNumber()
		{
			naukri.findElement(By.xpath(RegisterPageControls_Enter_MobileNumber)).sendKeys("RegisterPageControls_EnterMobileNumber");
		}
		
		// Enter total experience in Register Page
		public void registerPageControlsTotalExp()
		{
			naukri.findElement(By.xpath(RegisterPageControls_TotalExp_Dropdown)).sendKeys("RegisterPageControls_TotalExp");
		}
		
		// Click on Upload Resume button in Register Page
		public void registerPageControlsUploadResume()
		{
			naukri.findElement(By.xpath(RegisterPageControls_Click_UploadResume)).click();
		}
		
		// Click on Register now button in Register Page
		public void registerPageControlsRegisterNow()
		{		
		naukri.findElement(By.xpath(RegisterPageControls_RegisterNowButton)).submit();
		}

}
