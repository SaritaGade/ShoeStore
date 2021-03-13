package shoeStore_TC;

import org.testng.annotations.Test;

import pages.BrandPage;
import pages.HomePage;
import utilities.CommonFunctions;

public class TC01_ChooseBrand extends CommonFunctions {

	String brandName = "Jimmy Choo";

	@Test
	public void chooseBrand() throws InterruptedException {

		HomePage po = new HomePage(driver);
		// Choosing Brand name from drop down
		po.chooseBrand_drpdown(brandName);
		// Validating Brand Result after search
		BrandPage bp = new BrandPage(driver);
		// Validating Banner for the brands page
		bp.brandResults(brandName);
		// Validating Brand names for each product listed for the brand
		bp.checkBrandNames(brandName);

	}

}
