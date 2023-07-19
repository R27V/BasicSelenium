package javaScriptExecutorInterface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {
public static void main(String[] args) throws InterruptedException {
	
	//
	WebDriver driver = new ChromeDriver();
	
	//
	driver.manage().window().maximize();
	
	//
	driver.get("https://www.selenium.dev/downloads/");
	
	//1. Using scrollBy action
	//Scroll down action 
	//JavascriptExecutor -Interface inside Selenium- how to use methods of interface -by type casting or overriding never create an object
	//JavascriptExecutor or takeScreenshot by reference variable we use JavascriptExecutor insides method
	//Here we upcast the driver to the JavascriptExecutor Interface
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,2000);", "");
	Thread.sleep(3000);
	
	//Scroll Up action
	js.executeScript("window.scrollBy(0,-2000);", "");
	Thread.sleep(4000);
	
	//Scroll Right action
	js.executeScript("window.scrollBy(700,0);", "");
	Thread.sleep(3000);
	
	//Scroll left action
	js.executeScript("window.scrollBy(-700,0)", "");
	Thread.sleep(3000);
	
	//2. Using scrollTo action
	//Scroll until bottom of the page
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);", "");
	Thread.sleep(3000);
	
	//Scroll back until top of the page
	js.executeScript("window.scrollTo(0,-document.body.scrollHeight);", "");
	
}
}
