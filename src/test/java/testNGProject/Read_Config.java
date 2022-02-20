package testNGProject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_Config {
static Properties pro;
	
	public Read_Config()  // constructor
	{
		File src = new File(".//Configuration//data.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e) {
			System.out.println(" Exception is " + e.getMessage());
		}
	}
	
	/*  To read to config.properties -- create method for each properties */
	
	public static String getApplicationURL()
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getChromePath()
	{
		String chrome = pro.getProperty("chrome");
		return chrome;
	}
	public String getFireFoxPath()
	{
		String firefox = pro.getProperty("firefox");
		return firefox;
	}
}

