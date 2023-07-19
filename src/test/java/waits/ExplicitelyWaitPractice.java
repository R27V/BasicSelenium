package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWaitPractice {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888/");
		
		//Login to Home page
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Wait until the Home Page title is visible
		  WebElement ele = driver.findElement(By.linkText("Organizations"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//check element condition
	    wait.until(ExpectedConditions.visibilityOf(ele));
	    System.out.println("Organizations name is visible");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Organizations")));
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	    //check page condition
		wait.until(ExpectedConditions.titleContains("Home"));
		System.out.println("Title contains Home");
		
		//Whenever condition is not satisfied in Explicitly waits it always throw TimeOutException
		//Explicitly waits always work on condition
		//NoSuchElementException shown in implicitly wait
		
	}
}
