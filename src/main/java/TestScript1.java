public class TestScript1 {
//main method
	public static void main(String[] args) {
		
		MoveLoginPage loginPage = new MoveLoginPage();
		
		loginPage.setPath();
		loginPage.chromeBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.clickLoginButton();
		loginPage.closeBrowser();
	}
}
