package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopUpFutureDate {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		Thread.sleep(2000);
		
		//Navigate to 'From' and 'To' Elements
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		src.sendKeys("Bangalore");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		Thread.sleep(1000);
		
		dst.sendKeys("Mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		Thread.sleep(1000);
		
		//Navigate to any future date in calendar
		//infinite loop
		for(;;)// 1 2 3
		{
			try //not visible - exception - visible then click 
			{
				driver.findElement(By.xpath("//div[@aria-label='Thu Nov 09 2023']")).click();
				break;
			}
			catch(Exception e)
			{ //click on next month
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
