package testscripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusables.MarriottReusables;

public class FindHotelsE2e extends MarriottReusables {
	
	@BeforeTest
	public void startSession() throws InterruptedException, IOException {
		setProperty();
		launchChromeBrowser();
		loadInputs();
		maximizeBrowser();
		enterMarriottUrl();
	}
	
	@Test
	public void testScript001() throws InterruptedException {
		enterDestination();
		clickFindHotels();
	}
	
	@AfterTest
	public void closeSession() {
		closeCurrentTab();
	}

}
