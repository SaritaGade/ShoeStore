package shoeStore_TC;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonFunctions;

public class LaunchBrowserTest extends CommonFunctions {

	@Test
	public void launchBrowser() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Shoe Store: Welcome to the Shoe Store");

	}
}
