package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUntilElementRef {
public static void main(String[] args) throws InterruptedException {
	
	//Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//Load the URL
	driver.get("https://www.selenium.dev/downloads/");
	
	WebElement scrollUntil = driver.findElement(By.xpath("//h2[.='Selenium Level Sponsors']"));
	WebElement clickOn = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
	
	Thread.sleep(1000);
	
	//Scroll until the element reference
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//int yAxis = scrollUntil.getRect().getY();
	
	//3. using scrollIntoView() action
	   js.executeScript("arguments[0].scrollIntoView();", scrollUntil);
	// In Javascript arguments is in array form it thinks there are multiple elements so it take first matching element
	Thread.sleep(1000);
	
	//used scrollBy action
	//js.executeScript("window.scrollBy(0,"+yAxis+")", scrollUntil);
	                 //window.scrollBy(0,657); but in js if we use argument inside the string then it behave to concatenate so we +arg+ format
	Thread.sleep(1000);
	clickOn.click();
	 
	
}
}
