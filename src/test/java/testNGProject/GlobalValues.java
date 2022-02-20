package testNGProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		/* Properties class - scan and extract the value from .properties file*/
		Properties pro = new Properties();
		
		/* create file object for this location by class FileInputStream */
		FileInputStream fis = new FileInputStream("C:\\Users\\nazmu\\eclipse-workspace_selenium\\practiceProject\\src\\test\\java\\data.properties");
		pro.load(fis); /* load -> read mode  /* InputStream */
		
		pro.getProperty("browser");  /* get the value */
		System.out.println(pro.getProperty("browser"));
		
		pro.setProperty("browser", "chrome"); /* set the value */
		System.out.println(pro.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\nazmu\\eclipse-workspace_selenium\\practiceProject\\src\\test\\java\\data.properties");
		pro.store(fos, null); /*  .store -> write mode*/
		
	}

}
