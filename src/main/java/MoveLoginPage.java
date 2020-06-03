import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveLoginPage {
	
	public WebDriver move;
	
	//Location to the chrome driver executable file path
	public void setPath()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vidhya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	}
	
	//Object Creation for Chrome Driver class and launch browser
	public void chromeBrowser()
	{
		move = new ChromeDriver();
	}
	
	//Enter Url in the browser
	public void getUrl()
	{
		move.get("https://ams.moveoutdoor.com.au/");
	}
	
	//Maximize the browser
	public void maximizeWindow()
	{
		move.manage().window().maximize();
	}

	//Close browser pop-up
	public void popupClose()
	{
		move.findElement(By.xpath("//input[@class='close']")).click();
	}
	
	//Enter Email Id into email field
	public void enterEmail()
	{
		move.findElement(By.id("contact_email")).sendKeys("banaja@gmail.com");
	}
	
	//Enter Password into Password field
	public void enterPassword()
	{
		move.findElement(By.id("contact_password")).sendKeys("banaja123");
	}
	
	//Click on login Button
	public void clickLoginButton()
	{
		move.findElement(By.name("commit")).click();
	}
	
	//Close the browser
	public void closeBrowser()
	{
		move.close();
	}
}
