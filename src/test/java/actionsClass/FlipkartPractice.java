package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPractice {
public static void main(String[] args) throws InterruptedException {
	
	//Launch the browser
	WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//Navigate to flipkart.com
	driver.get("https://www.flipkart.com/");
	
	//close the popUp
	Actions act = new Actions(driver);
	act.moveByOffset(10, 10).click().perform();
	
	//Click on appliances
	WebElement appliances = driver.findElement(By.xpath("//div[.='Appliances']"));
	act.moveToElement(appliances).click().perform();
	Thread.sleep(1000);
	
	//navigate to home and furniture
	WebElement home = driver.findElement(By.xpath("//span[.='Home & Furniture']"));
	act.moveToElement(home).perform();
	Thread.sleep(1000);
	
	//navigate to paintings
	WebElement paintings = driver.findElement(By.xpath("//a[.='Paintings']"));
	act.moveToElement(paintings).click().perform();
	Thread.sleep(1000);
	
	//click on price high to low
	WebElement price = driver.findElement(By.xpath("//div[.='Price -- High to Low']"));
	act.moveToElement(price).click().perform();
	Thread.sleep(1000);
	
	//select the first element and click
	WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'HandPainted Artwork Painting Canvas 42 inch x 60 inch P...')]"));
	act.moveToElement(ele).click().perform();
	
	//Product is open on other webpage so add to cart element is not found.
	WebElement cart =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	act.moveToElement(cart).click().perform();
	
}
}
