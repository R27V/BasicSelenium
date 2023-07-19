package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction_ContextClick {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement ele = driver.findElement(By.xpath("//span[.='right click me']"));
	
	WebElement edit = driver.findElement(By.xpath("//span[.='Edit']"));
	
	//Actions 12.contextClick()
	//Actions 13.contextClick(WebElement target)
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(1000);
	
	act.contextClick(edit).perform();
	Thread.sleep(1000);
	
}
}
