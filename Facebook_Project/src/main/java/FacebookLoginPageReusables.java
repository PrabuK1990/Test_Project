import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageReusables implements FacebookLoginPageControls, FacebookLoginPageInputs {
	
	public WebDriver objFB;
	
	//Set Path for Chrome Driver executable
		public void setProperty_Chrome()
		{
			System.setProperty("webdriver.chrome.driver", "/home/jeli/eclipse-workspace/chromedriver");
		}
		
		//Launch Chrome Browser
		public void chromeBrowser()
		{
			//Create new instance for ChromeDriver class and store it in a object
			//and name it as "naukriLoginPage"
			//Mention Type as "WebDriver"
			
			objFB  = new ChromeDriver();
		}
		
		//Open Facebook Url
		public void getFacebook()
		{
			objFB.get(LoginPageInputs_URL);	
		}
		
		//Maximize the current Browser
		public void maximizeBrowser()
		{
			objFB.manage().window().maximize();
		}
				
		//Enter Email ID in Login Page
		public void loginpageEmailID()
		{
			objFB.findElement(By.xpath(LoginPageControls_EmailID)).sendKeys(LoginPageInputs_EmailID);
		}
		
		//Enter Password in Login Page
		public void loginpagePassword()
		{
			objFB.findElement(By.xpath(LoginPageControls_Password)).sendKeys(LoginPageInputs_Password);
		}
		
		//Click Login Button in Login Page 
		public void loginpageLoginButton()
		{
			objFB.findElement(By.xpath(LoginPageControls_LoginButton)).click();
		}
		
		
		//Wait to display element
		public void waitTimeout()
		{
			try {
				//Wait for 3 seconds
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Close current browsers/Tabs
		public void browserClose()
		{
			objFB.close();
		}
		
		//Close all browsers/Tabs
		public void browserallClose()
		{
			objFB.quit();
		}

}
