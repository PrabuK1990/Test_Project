
public class TestScript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveRequestLoginPage rqstloginPage = new MoveRequestLoginPage();
		
		rqstloginPage.setPath();
		rqstloginPage.chromeBrowser();
		rqstloginPage.getUrl();
		rqstloginPage.maximizeWindow();
		rqstloginPage.popupClose();
		rqstloginPage.clickRequestLoginButton();
		rqstloginPage.closeBrowser();
	}

}
