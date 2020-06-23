import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLoginPageReusables implements NaukriLoginPageControls, NaukriLoginPageInputs{
	
	public WebDriver naukri;
	
	//Set Path for Chrome Driver exe
	public void setProperty_Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vidhya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	//Launch Chrome Browser
	public void chromeBrowser()
	{
		//Create new instance for ChromeDriver class and store it in a object
		//and name it as "naukriLoginPage"
		//Mention Type as "WebDriver"
		
		naukri  = new ChromeDriver();
	}
	
	//Open Naukri Url
	public void naukriUrl()
	{
		naukri.get("https://www.naukri.com/");	
	}
	
	//Maximize the current Borwser
	public void maximizeBrowser()
	{
		naukri.manage().window().maximize();
	}
	
	//Click on Login Link in Home Page
	public void homepageLoginLink()
	{
		naukri.findElement(By.xpath(HomePageControls_LoginLink)).click();
	}
	
	//Enter Email ID in Login Page
	public void loginpageEmailID()
	{
		naukri.findElement(By.xpath(LoginPageControls_EmailID)).sendKeys(LoginPageInputs_EmailID);
	}
	
	//Enter Password in Login Page
	public void loginpagePassword()
	{
		naukri.findElement(By.xpath(LoginPageControls_Password)).sendKeys(LoginPageInputs_Password);
	}
	
	//Click Login Button in Login Page 
	public void loginpageLoginButton()
	{
		naukri.findElement(By.xpath(LoginPageControls_LoginButton)).click();
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
		naukri.close();
	}
	
	//Close all browsers/Tabs
	public void browserallClose()
	{
		naukri.quit();
	}
}
