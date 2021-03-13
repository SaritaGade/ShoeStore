package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonFunctions;

public class MonthPage extends CommonFunctions {

	
	@FindBy(xpath = "//div[@class='title']")
	private WebElement banner;
	
	@FindBy(xpath = "//tr/td[text()='Release Month']/following-sibling::td")
	private List<WebElement> monthnames;

	
	public MonthPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void monthResults(String expectedMonth) {
		String actualMonth = banner.getText();
		Assert.assertEquals(actualMonth, expectedMonth+"'s Shoes");
		System.out.println("Passed");
	}
	
	public void checkMonthNames(String expectedMonth) {
		int count = 1;
		for (WebElement monthname : monthnames) {
			System.out.println("Number of months checking :"+ count);
			String actualMonth = monthname.getText();
			Assert.assertEquals(actualMonth, expectedMonth);
			System.out.println("Number of months checked :"+ count);
			count++;
			
			}
		}
}
