package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActiTime {

	public static void main(String[] args) {
	
		//Step 1: Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Step 2: Maximize the window
		driver.manage().window().maximize();
		
		//Step 3: Load the URL - Demo Actitime
		driver.get("https://demo.actitime.com/login.do");
		
		//Step 4: Identify the Usename Textfield and enter username - ID locator
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//Step 5: Identify the Password Textfield and enter password - Name locator
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//Step 6: Identify the Login button and click - ClassName locator
		driver.findElement(By.className("initial")).click();
		
	   //Step 7: tagName locator - it is not used because there are multiple tags of same tagname are present in one webpage.
		driver.findElement(By.tagName("a")).click();

	}

}
