package WebElementsInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAllCheckBoxes {
	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Step 2: Maximize the window
		driver.manage().window().maximize();
		
		//Step 3: Load the URL
		driver.get("http://localhost:8888");
		
		//Step 4. identify UserName in Demo Vtiger
		WebElement userNameEle = driver.findElement(By.name("user_name"));
				
		//perform action on the web element identified
		userNameEle.sendKeys("admin");
				
		//Step 5. identify Password in Demo Vtiger application
		WebElement passwordEle = driver.findElement(By.name("user_password"));
				
		//perform action on the web element identified
		passwordEle.sendKeys("admin");
				
		//Step 6: Click on login Button
		driver.findElement(By.id("submitButton")).click();
		
		//Step 7: Click on Organization link
		driver.findElement(By.linkText("Organizations")).click();
		
		//step 8: Identify all the check boxes
		 List<WebElement> list = driver.findElements(By.xpath("//input[@name = 'selected_id']"));
		
		//Step 9: Navigate through the list and click on each web element
		for(WebElement element:list)
		{
			element.click();
			Thread.sleep(1000);
		}
		
	}

}
