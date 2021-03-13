package shoeStore_TC;

import org.testng.annotations.Test;

import pages.HomePage;
import utilities.CommonFunctions;

public class TC03_EmailVerificationforHomePage extends CommonFunctions {

	String mail = "kallks";

	@Test
	public void monthWiseValidation() throws InterruptedException {

		HomePage po = new HomePage(driver);

		// Checking Email format with RegEx
		po.checkemailformat(mail);

	}

}
