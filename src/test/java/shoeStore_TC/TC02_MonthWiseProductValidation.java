package shoeStore_TC;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.MonthPage;
import utilities.CommonFunctions;

public class TC02_MonthWiseProductValidation extends CommonFunctions {

	String month = "April";

	@Test
	public void monthWiseValidation() throws InterruptedException {

		HomePage po = new HomePage(driver);
		// Choosing Month name from drop down	
		po.navigationlink(month);

		//Creating an object for Month page Class
		MonthPage mp = new MonthPage(driver);
		
		//Validating Month for the brands page
		mp.monthResults(month);
		
		// Validating Month names for each product listed for the brand
		mp.checkMonthNames(month);

	}
}
