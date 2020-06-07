public class TestScript1 {
//main method
	public static void main(String[] args) {
		
		MoveLoginPage loginPage = new MoveLoginPage();
		
		loginPage.setPath();
		loginPage.chromeBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.LoginButton();
		loginPage.closeallBrowser();
		
		System.out.println("Scenraio 1 : Set Path, Browser Launch, Enter Url, Maximize Window, Close pop-up, Login Button Displayed, Login Click Button and Close All Browser");
	}
}
