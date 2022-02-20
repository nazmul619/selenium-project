package testNGProject;



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

public class Base_Class {

	Read_Config readconfig = new Read_Config();
	
	public String url = Read_Config.getApplicationURL();
	public static WebDriver driver;
	
	
    
	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) {
		
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
	
}
