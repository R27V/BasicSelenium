package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElements {
public static void main(String[] args) throws InterruptedException {
	
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//Load the URL
	driver.get("https://demoapp.skillrary.com/");
	
	//Identify disabled element
	WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
	Thread.sleep(1000);
	
	//Enter data into disabled text field using JavaScript Executor(JSE)
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].value='QSPIDER'", disabledTextField);
	//This is script to enter value- learn it
	
	//js.executeScript("agruments[0].click()", disabledTextField);
	//This is script to click
	
	
}
}
