package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoultEarphoneSearchAndCaptureAmazon {
	public static void main(String[] args) {
		
		//Step:1 Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Step:2 Maximize the window
		driver.manage().window().maximize();
		
		//Step:3 Navigate to Amazon
		driver.get("https://www.amazon.in/");
		
		//Step:4 Search for Bluetooth EarPhones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth EarPhones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Step:5 
		List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Boult')]"));
				
		for(WebElement element:list)
		{
		 String value = element.getText();
		 System.out.println(value);
		 // System.out.println(element.getText());
		
		}
	}

}
