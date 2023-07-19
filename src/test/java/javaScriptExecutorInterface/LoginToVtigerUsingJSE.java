package javaScriptExecutorInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToVtigerUsingJSE {
	
     public static void main(String[] args) throws InterruptedException {
	
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//Load the url
	driver.get("http://localhost:8888/");
	Thread.sleep(1000);
	
	//Identify the elements
	WebElement userEle = driver.findElement(By.name("user_name"));
	
	WebElement passEle = driver.findElement(By.name("user_password"));
	
	WebElement loginBtn = driver.findElement(By.id("submitButton"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].value='admin'", userEle);
	js.executeScript("arguments[0].value='admin'", passEle);
	js.executeScript("arguments[0].click()", loginBtn);
	Thread.sleep(1000);
	
	//get the title of the page
	String title = js.executeScript("return document.title", "").toString();
	System.out.println(title);
	//By default execute Script method is returning object so we convert it into String.
	
}
}
