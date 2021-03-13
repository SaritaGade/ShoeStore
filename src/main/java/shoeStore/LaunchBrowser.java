package shoeStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\pkothari\\eclipse-workspace\\ShoeStore\\Data\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rb-shoe-store.herokuapp.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
 