

public class TestScript1 {
//main method
	public static void main(String[] args) {
		
		MoveLoginPage_Reusables loginPage = new MoveLoginPage_Reusables();
		
		loginPage.setPathChromeDriver();
		loginPage.chromeBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.enterEmail();
		loginPage.enterPassword();
		loginPage.LoginButton();
		loginPage.closeallBrowser();
		
		System.out.println("Scenraio 1 : Set Path, Browser Launch, Enter Url, Maximize Window, Close pop-up, Enter Email, Enter Password, Login Click Button and Close All Browser");
	}
}
