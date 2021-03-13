package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonFunctions;

public class HomePage extends CommonFunctions {

	@FindBy(xpath = "//a[(text()='Home')]")
	private WebElement homeButton_link;

	@FindBy(xpath = "//select")
	private WebElement chooseBrand_drpdown;

	@FindBy(id = "promo_code_input")
	private WebElement promotioncode_link;

	@FindBy(id = "promo_code_submit")
	private WebElement submitpromotioncode_button;

	@FindBy(xpath = "//li")
	private List<WebElement> navigationbar_link;

	@FindBy(id = "search_button")
	private WebElement searchBranddrpdwn_link;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_textbox;

	@FindBy(xpath = "//input[@id='remind_email_submit']")
	private WebElement emailSubmit_button;

	@FindBy(xpath = "//div[@id='flash']//div")
	private WebElement successError_toastmsg;
//**-----------------------------**--------------------------------------**-----------	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void click_homebutton() {
		homeButton_link.click();
	}

	public void chooseBrand_drpdown(String brand) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		cf.selectbytextdrpdown(chooseBrand_drpdown, brand);
		searchBranddrpdwn_link.click();

	}

	public void navigationlink(String link) {

		for (WebElement explinkname : navigationbar_link) {
			String expectedlink = explinkname.getText();
			if (expectedlink.equalsIgnoreCase(link)) {
				explinkname.click();
				break;
			}
		}
	}

	public void checkemailformat(String mail) {
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		email_textbox.sendKeys(mail);
		emailSubmit_button.click();
		boolean result = mail.matches(regex);
		if (result) {
			String banner = successError_toastmsg.getText();
			Assert.assertEquals(banner, "Thanks! We will notify you of our new shoes at this email: " + mail);
		} else {
			String banner = successError_toastmsg.getText();
			Assert.assertEquals(banner, "Invalid email format. Ex. name@example.com");
		}

	}
}
