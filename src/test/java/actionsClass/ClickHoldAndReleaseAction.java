package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndReleaseAction {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/buttons");
	
	WebElement ele = driver.findElement(By.xpath("//button[.='Click Me']"));
	
	//Actions 14. clickAndHold()
	//Actions 15. clickAndHold(WebElement target)
	Actions act = new Actions(driver);
	act.clickAndHold(ele).perform();
	System.out.println("element clicked and held");
	Thread.sleep(1000);
	
	//Actions 16. release()
	//Actions 17. release(WebElement target)
	act.release(ele).perform();
	System.out.println("element released");
	
	////Actions 18. keyDown()
	//Actions 19. keyUp()
	//Actions 20. build() return Action Interface
	//Actions 21. perform() return void

	
}
}
