package autoSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodaysDealsSearchAndCaptureAmazon {

	public static void main(String[] args) {
		
		//Step:1 Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Step:2 Maximize the window
		driver.manage().window().maximize();
		
		//Step:3 Navigate to Amazon
		driver.get("https://www.amazon.in/");
		
		//Step:4 Search for Todays deals
		driver.findElement(By.xpath("//a[contains(text(),'See all deals')]")).click();
		driver.findElement(By.className("GridPresets-module__gridPresetsLargeItem_2xPgV2VoJCncjGPj18in1h GridPresets-module__selectedPreset_-JsFklJdPGF-wQYPAy4H2")).click();
		
		//Scroll & AJAX application, dynamic application
		
		
		
	}
}
