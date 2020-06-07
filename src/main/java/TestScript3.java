
public class TestScript3 {

	public static void main(String[] args) {
		
		MoveLoginPage_Reusables loginPage = new MoveLoginPage_Reusables();
		
		loginPage.setPath();
		loginPage.chromeBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.clickResetPasswordButton();
		loginPage.closeallBrowser();
		
		System.out.println("Scenraio 3 : Set Path, Browser Launch, Enter Url, Maximize Window, Close pop-up, Click Reset Password Button and Close All Browser");
	}

}
