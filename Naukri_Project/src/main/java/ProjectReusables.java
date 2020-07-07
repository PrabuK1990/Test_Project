import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectReusables extends LoadExcel implements NaukriHomePageControls{
	
	public static WebDriver naukri;
	
	//Set Path for Chrome Driver executable
	public void setProperty_Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
	}
	
	//Launch Chrome Browser
	public void chromeBrowser()
	{
		//Create new instance for ChromeDriver class and store it in a object
		//and name it as "naukriLoginPage"
		//Mention Type as "WebDriver"
		
		naukri  = new ChromeDriver();
	}
		
	
	//Set Path for Firefox Gecko Driver executable
	public void setProperty_Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
	}
	
	//Launch Firefox Browser
	public void firefoxBrowser()
	{
		//Create new instance for ChromeDriver class and store it in a object
		//and name it as "naukriLoginPage"
		//Mention Type as "WebDriver"
		
		naukri  = new FirefoxDriver();
	}
	
	//Open Naukri Url
	public void naukriUrl()
	{
		naukri.get(NaukriInputs_Url);	
	}

	//Maximize the current Borwser
	public void maximizeBrowser()
	{
			naukri.manage().window().maximize();
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
