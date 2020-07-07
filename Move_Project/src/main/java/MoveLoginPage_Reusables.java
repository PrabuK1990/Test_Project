import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoveLoginPage_Reusables implements MoveLoginPage_Controls, MoveLoginPage_Inputs{
	
	public WebDriver move;
	
	//Location to the chrome driver executable file path
	public void setPathChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "/home/jeli/Downloads/chromedriver");
	}
	
	//Location to the firefox driver executable file path
	public void setPathFirefoxDriver()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vidhya\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	}
	
	//Object Creation(here move) for Chrome Driver class and launch browser
	public void chromeBrowser()
	{
		move = new ChromeDriver();
	}
	
	//Object Creation(here move) for firefox Driver class and launch browser
	public void firefoxBrowser()
	{
		move = new FirefoxDriver();
	}
	
	//Enter Url in the browser
	public void getUrl()
	{
		move.get(MoveLoginPage_URL);
	}
	
	//Maximize the browser
	public void maximizeWindow()
	{
		move.manage().window().maximize();
	}

	//Close browser pop-up
	public void popupClose()
	{
		move.findElement(By.xpath(MoveLoginPage_PopupClose)).click();
	}
	
	//Enter Email Id into email field
	public void enterEmail()
	{
		move.findElement(By.id(MoveLoginPage_EmailIDField)).sendKeys(MoveLoginPage_EmailId);
	}
	
	//Enter Password into Password field
	public void enterPassword()
	{
		move.findElement(By.id(MoveLoginPage_PasswordField)).sendKeys(MoveLoginPage_Password);
	}
	
	//Login Button
	public void LoginButton()
	{
		move.findElement(By.name(MoveLoginPage_LoginButton)).click();	
	}
	
	//To click the reset password button
	public void clickResetPasswordButton()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		move.findElement(By.xpath(MoveLoginPage_ResetPasswordButton)).click();
	}
	
	//Click on login Button
	public void clickRequestLoginButton()
	{
		//move.findElement(By.name("commit")).click();
		move.findElement(By.xpath(MoveLoginPage_RequestLoginButton)).click();
	}
	
	//Close the browser
	public void closeBrowser()
	{
		move.close();
	}
	
	//Close the browser
	public void closeallBrowser()
	{
		move.quit();
	}
}

