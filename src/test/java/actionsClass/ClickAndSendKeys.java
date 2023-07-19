package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeys {
public static void main(String[] args) {
	
	//Step1: Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3: Load the URL
	driver.get("http://localhost:8888/");
	
	WebElement un = driver.findElement(By.name("user_name"));
	WebElement submit = driver.findElement(By.id("submitButton"));
	
	//Action 6. SendKeys() -Sendkeys() and click() operations are used by actions class and web element both
	//Action 7. SendKeys(WebElement target, "CharSequence")
	Actions act = new Actions(driver);
	//act.sendKeys("admin").perform();
	act.sendKeys(un,"admin",Keys.TAB,"admin").perform();//SendKeys accept parameter from Keys class
     //here in a single line from one webElement move to other WebElement
	
	//Action 8. click()
	//Action 9. click(WebElement target)
    act.click(submit).perform();
}
}
