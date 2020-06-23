
public class TestScript2 {

	public static void main(String[] args) {

		MoveLoginPage_Reusables loginPage = new MoveLoginPage_Reusables();
		
		loginPage.setPathChromeDriver();
		loginPage.chromeBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.clickRequestLoginButton();
		loginPage.closeallBrowser();
		
		System.out.println("Scenraio 2 : Set Path, Browser Launch, Enter Url, Maximize Window, Close pop-up, Click Request Login Button and Close All Browser");
	}

}
