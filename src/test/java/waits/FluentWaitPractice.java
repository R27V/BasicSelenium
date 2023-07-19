package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitPractice {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("http://localhost:8888/");
		
		//Login to Home page
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Fluent wait - mainly use to change polling time which is by default is 500ms
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(200));
		wait.withTimeout(Duration.ofSeconds(5));
		wait.ignoring(NoSuchElementException.class); //to ignore the exceptions
		wait.ignoring(NoAlertPresentException.class);
		
		wait.until(ExpectedConditions.urlContains("Home"));
		System.out.println("Polling every 200ms to wait for the URL");
		
		
		
		
		
	}
}
