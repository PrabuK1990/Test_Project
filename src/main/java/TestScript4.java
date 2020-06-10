
public class TestScript4 {

	public static void main(String[] args) {
		
		MoveLoginPage_Reusables loginPage = new MoveLoginPage_Reusables();
		
		loginPage.setPathFirefoxDriver();
		loginPage.firefoxBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.clickResetPasswordButton();
		loginPage.closeallBrowser();
		
		System.out.println("Scenraio 4 : Set Firefox Path, Firefox Browser Launch, Enter Url, Maximize Window, Close pop-up, Click Reset Password Button and Close All Browser");
	
	}

}
