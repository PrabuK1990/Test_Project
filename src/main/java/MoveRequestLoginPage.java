import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveRequestLoginPage {
	public WebDriver move;//move is a reference variable.
	//Here no object is assigned to this reference variable.
	//An object will be assigned to it in some method.
	//To this reference an object of webdriver or it's sub class can
	//be assigned
	
	//Location to the chrome driver executable file path
	public void setPath()
	{
		System.setProperty("webdriver.chrome.driver", "/home/jeli/Downloads/chromedriver/chromedriver");
	}
	
	//Object Creation(here move) for Chrome Driver class
	//and launch browser
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
	public void clickRequestLoginButton()
	{
		//move.findElement(By.name("commit")).click();
		move.findElement(By.xpath("//a[@href='http://moveoutdoor.com.au/get-in-touch']")).click();
	}
	
	//Close the browser
	public void closeBrowser()
	{
		move.close();
	}

}
