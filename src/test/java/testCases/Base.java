package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilites.ReadConfig;

public class Base {

	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username= readconfig.getUserName();
	public String password= readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
    
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {
		
		logger = logger.getLogger("nopEcommerce");
	    PropertyConfigurator.configure("Log4j.properties");	
	    
	    if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		    driver = new ChromeDriver();		
	    }
	    else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getFireFoxPath());
		    driver = new ChromeDriver();		
	    }
	    else {
			System.out.println("Invalid browser selection");
		    
	    }
	 
	}
	
	@AfterClass
	public void tearDown()
	{
	//	driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public static String randomstring() {
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		return(generatedString1);
	}
	public static String randomeNum() {
		String generatedString2=RandomStringUtils.randomNumeric(4);
		return(generatedString2);
	}
}
