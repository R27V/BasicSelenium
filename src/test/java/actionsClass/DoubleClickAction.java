package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
public static void main(String[] args) throws InterruptedException {
	
	//Step1: Launch the browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3: Load the URL
	driver.get("https://demoapp.skillrary.com/product.php?product=java");
	
	WebElement add = driver.findElement(By.id("add"));
	
	WebElement minus = driver.findElement(By.id("minus"));
	
	//Action 4. doubleClick() - Double Click Action
	//Action 5. doubleClick(WebElement target)
	Actions act = new Actions(driver);
	act.doubleClick(add).perform();
	System.out.println("item added");
	
	Thread.sleep(2000);
	act.doubleClick(minus).perform();
	System.out.println("item removed");
	
	
	
}
}
