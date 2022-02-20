package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.LoginPage;

public class TC_LoginTest_001 extends Base{

	@Test
	public void LoginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("URL is opened.....");

		/* we need to call action method -- so create object for LoginPage */
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("User provided"); // logger msg
		
		lp.setPassword(password);
		logger.info("password provided");
		
		lp.clickLogin();
		logger.info("Login in Clicked");
		
		lp.clickLogout();
		logger.info("Logout in Clicked");
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) {
			Thread.sleep(5000);
			lp.clickLogout();
			Assert.assertTrue(true);
			logger.info("Login Passed");//logger msg
			
		} else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Failed");//logger msg
		}
	}
}





