package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetMethod {
public static void main(String[] args) throws InterruptedException {
	
	//Step1: Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3: Load the URL
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	
	//Action 3. moveByOffset(intXoffset,intYoffset)
	//move By offset values - they always start from top-left corner of web page or top-let corner of web element
	Actions act = new Actions(driver); //make object of action once and using for different no. of methods,
		//action class works on page it is analyzing the driver reference but in 
		//Select every time object is created because it works on web element which is always new.
	act.moveByOffset(10,10).click().perform();
	System.out.println("moved by offset");
	Thread.sleep(1000);
	
	//mouse hovering action -Action 1. moveToElement(WebElement target)
	WebElement ele = driver.findElement(By.xpath("//div[.='Home & Furniture']"));
	act.moveToElement(ele).perform();
	System.out.println("mouse hover to Home & Furniture Web Element");
	
	
}
}
