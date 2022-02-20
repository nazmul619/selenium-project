package testNGProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperties {

	public static void main(String[] args) throws IOException {
		
		Properties pro = new Properties();
		pro.put("username", "palash");
		pro.put("password", "12345");
		
		FileOutputStream fos= new FileOutputStream("C:\\Users\\nazmu\\eclipse-workspace_selenium\\practiceProject\\src\\test\\java\\testNGProject\\data.properties",true);
		pro.store(fos, "this is my property file");
		System.out.println("file created");
		
		FileInputStream fis = new FileInputStream("FileOutputStream fos= new FileOutputStream(\"C:\\\\Users\\\\nazmu\\\\eclipse-workspace_selenium\\\\practiceProject\\\\src\\\\test\\\\java\\\\testNGProject\\\\data.properties\",true);");
		pro.load(fis);
		System.out.println("read");
	}

}
