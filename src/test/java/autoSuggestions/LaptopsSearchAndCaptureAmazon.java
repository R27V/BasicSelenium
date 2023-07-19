package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopsSearchAndCaptureAmazon {

	public static void main(String[] args) {
		
		//Step:1 Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Step:2 Maximize the window
		driver.manage().window().maximize();
		
		//Step:3 Navigate to Amazon
		driver.get("https://www.amazon.in/");
		
		//Step:4 Search for laptops
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops",Keys.ENTER);//Keys comes from Enum block java,special class,static & final
		//Keys Perform only single stroke actions. Double stroke- want to write @(Shift+number2)we have to press same time not possible by Keys
		//To Overcome from Keys we use ROBOT class come from Java.awt package
		//driver.findElement(By.id("nav-search-submit-button")).click();// it is for search but if we don't have search button we use Keys
		
		//Step:5 
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		 for(WebElement element:list)
		 {
			// System.out.println(element.getText());
			 
			 String laptopName = element.getText();
			 //System.out.println(value);
			   if(laptopName.contains("HP"))
			   {
				  //System.out.println(laptopName);
			      System.out.println(element.getText());; 
			     // element.click();
			     //break;
			   }
		 }
	}
}
