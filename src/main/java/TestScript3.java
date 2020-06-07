
public class TestScript3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		MoveResetPasswordPage loginPage = new MoveResetPasswordPage();
		
		loginPage.setPath();
		loginPage.chromeBrowser();
		loginPage.getUrl();
		loginPage.maximizeWindow();
		loginPage.popupClose();
		loginPage.clickResetPasswordButton();
		//loginPage.closeBrowser();
	}

}
