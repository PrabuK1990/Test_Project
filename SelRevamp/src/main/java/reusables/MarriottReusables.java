package reusables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import controls.MarriottLocators;

public class MarriottReusables implements MarriottLocators{
	
	public WebDriver driver;
	public String url;
	public String desti;
	
	public void setProperty() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		System.out.println("Chrome driver path insitialized");
	}
	
	public void launchChromeBrowser() {
		driver = new ChromeDriver();
	}
	
	public void loadInputs() throws IOException {
		String path = System.getProperty("user.dir");
        BufferedReader reader = new BufferedReader(new FileReader(path + "/src/main/java/resources/Inputs.properties"));
        Properties properties = new Properties();
        properties.load(reader);
        url = properties.getProperty("URL");
        desti = properties.getProperty("Destination");
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void enterMarriottUrl() throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
	}
	
	public void enterDestination() throws InterruptedException {
		WebElement dest = driver.findElement(By.name(DestinationTextbox));
		dest.sendKeys(desti);
		Thread.sleep(2000);
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	public void clickFindHotels() {
		driver.findElement(By.xpath(FindHotelsButton)).click();
	}
	
	public void closeCurrentTab() {
		driver.close();
	}
	
	public void closeAllTab() {
		driver.quit();
	}
}
