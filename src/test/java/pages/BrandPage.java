package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonFunctions;

public class BrandPage extends CommonFunctions {

	
	@FindBy(xpath = "//div[@class='title']")
	private WebElement banner;
	
	@FindBy(xpath = "//tr/td[text()='Brand']/following-sibling::td")
	private List<WebElement> brandnames;

	
	public BrandPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public void brandResults(String expectedBrand) {
		String actualBrand = banner.getText();
		//System.out.println(expectedBrand+"'s Shoes");
		//System.out.println(actualBrand);
		Assert.assertEquals(actualBrand, expectedBrand+"'s Shoes");	
	}
	
	public void checkBrandNames(String expectedBrand) {
		int count = 1;
		for (WebElement brandname : brandnames) {
			System.out.println("Number of Brands checking :"+ count);
			String actualBrand = brandname.getText();
			Assert.assertEquals(actualBrand, expectedBrand);
			System.out.println("Number of Brands checked :"+ count);
			count++;
			
			}
		}


}
