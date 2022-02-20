package testNGProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Globalvalue_Property_File {
	@Test
	public void InvokePropertyFile() throws IOException {
		/*System.setProperty("webdriver.chrome.driver", ".//driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");*/

		Properties pro = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\nazmu\\eclipse-workspace_selenium\\practiceProject\\src\\test\\java\\testNGProject\\data.properties");
		pro.load(fis);
		pro.getProperty("browser"); // get the value
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("url"));
		
	}

}


