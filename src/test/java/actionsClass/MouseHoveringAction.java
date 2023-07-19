//Why Action class having the WebDriver reference - because it operates on a particular page
package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAction {
public static void main(String[] args) throws InterruptedException {
	
	//Step1: Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3: Load the URL
	driver.get("https://www.flipkart.com/");
	
	//Step4: close the pop up by 2 methods
	//driver.findElement(By.xpath("//button[.='✕']")).click(); - 1st method to close pop up	
	//Action 3. moveByOffset(intXoffset,intYoffset)- 2nd method to close pop up
	//move By offset values - they always start from top-left corner of web page or top-let corner of web element
	Actions act = new Actions(driver); //make object of action once and using for different no. of methods,
	//action class works on page it is analysing the driver reference but in 
	//Select every time object is created because it works on web element which is always new.
	act.moveByOffset(10,10).click().perform();
	System.out.println("moved by offset");
	
	//mouse hovering action -Action 1. moveToElement(WebElement target)
	//mouse hovering action -Action 2. moveToElement(WebElement target, int xOffset, int yOffset)
	WebElement element = driver.findElement(By.xpath("//div[.='Electronics']"));
	act.moveToElement(element).perform();
	System.out.println("mouse hovering done");
	Thread.sleep(1000);
	
	WebElement ele = driver.findElement(By.xpath("//a[.='Gaming']"));
	act.moveToElement(ele).perform();
	System.out.println("mouse hover to Gaming");
	Thread.sleep(1000);
	
	WebElement gamePad = driver.findElement(By.xpath("//a[.='Gamepads']"));
	act.moveToElement(gamePad).click().perform();
	System.out.println("mouse hover to Gamepads");
	
	Thread.sleep(5000);
	driver.quit();
	
	
}
}
