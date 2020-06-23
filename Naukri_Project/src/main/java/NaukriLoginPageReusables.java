import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLoginPageReusables {
	
	public WebDriver naukriLoginPage;
	
	//Set Path for Chrome Driver exe
	public void setProperty_Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "/home/jeli/Downloads/chromedriver");
	}
	
	//Launch Chrome Browser
	public void chromeBrowser()
	{
		//Create new instance for ChromeDriver class and store it in a object
		//and name it as "naukriLoginPage"
		//Mention Type as "WebDriver"
		
		naukriLoginPage  = new ChromeDriver();
	}
	
	//Open Naukri Url
	public void naukriUrl()
	{
		naukriLoginPage.get("https://www.naukri.com/");	
	}
}
