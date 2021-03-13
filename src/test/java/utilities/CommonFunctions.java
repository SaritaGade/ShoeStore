package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonFunctions {

	public static WebDriver driver = null;

	public void selectbyvaluedrpdown(WebElement element, String value) {
		Select drpdown = new Select(element);
		drpdown.selectByValue(value);
	}

	public void selectbytextdrpdown(WebElement element, String text) {
		Select drpdown = new Select(element);
		drpdown.selectByVisibleText(text);
	}

	@BeforeTest
	public static void getdriver() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath + "\\Data\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://rb-shoe-store.herokuapp.com/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public static void teardown() {
		driver.close();
	}

}
