package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws IOException {
		
		//Step1: Open file in java readable format - . specifies current project which is by default understood by jvm
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		//Step2: Create an object of properties class
		Properties p = new Properties();
		
		//Step3: Load the file input streams to properties
		p.load(fis);
		
		//Step4: Use the key to get the value
		String value = p.getProperty("username");
		String value1 = p.getProperty("password");
		String value2 = p.getProperty("browser");
		String value3 = p.getProperty("url");
		String valueNot = p.getProperty("name");//if any key-value is not present it not give error - gives NULL
		
		//Step5: use the value
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(valueNot);
		
		
		
	}
}
