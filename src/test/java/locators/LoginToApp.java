package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToApp {
	public static void main(String[] args) {
		
		//Step 1. Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Step 2. Maximize the window
		driver.manage().window().maximize();
		
		//Step 3. Load the URL - Demo Vtiger Application
		driver.get("http://localhost:8888");
		
		//Step 4. identify UserName in Demo Vtiger
		WebElement userNameEle = driver.findElement(By.name("user_name"));
		
		//perform action on the web element identified
		userNameEle.sendKeys("admin");
		
		//Step 5. identify Password in Demo Vtiger application
		WebElement passwordEle = driver.findElement(By.name("user_password"));
		
		//perform action on the web element identified
		passwordEle.sendKeys("admin");
		
		//Step 6. identify the login button in Demo Vtiger application
		WebElement loginEle = driver.findElement(By.id("submitButton"));
	    
		loginEle.click();
		
		driver.findElement(By.linkText("Organizations")).click();
	}

}
