package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeBrowser {

	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

}
