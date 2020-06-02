import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vidhya\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			//Object Creation for Chrome Driver class and launch browser
			WebDriver move = new ChromeDriver();
			
			//Enter Url in the browser
			move.get("https://ams.moveoutdoor.com.au/");
			
			//Maximize the browser
			move.manage().window().maximize();
			
			//Close the browser
			move.close();
			
			//Print message for our understanding
			System.out.println("Launch browser, Enter Url, Maximize browser and close browser");
	}
}
