package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		//Remove adds or PopUps
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		System.out.println("Advertisement is removed by moved by offset");
		Thread.sleep(1000);
		
		 WebElement from = driver.findElement(By.id("fromCity"));
		 act.moveToElement(from).click().perform();
		 
		// WebElement fromCity = driver.findElement(By.xpath("//input[@id = 'fromCity']"));
		 act.moveToElement(from).sendKeys("Bangalore").perform();
		 
		 WebElement selectedCity = driver.findElement(By.xpath("//p[. = 'Bengaluru, India']"));
		 act.moveToElement(selectedCity).click().perform();
		 Thread.sleep(2000);
		 
		 WebElement To = driver.findElement(By.xpath("//input[@id  = 'toCity']"));
		 act.moveToElement(To).click().perform();
		 
		// WebElement toCity = driver.findElement(By.xpath("//input[@placeholder = 'To']"));
		 //act.moveToElement(toCity).sendKeys("Chennai").perform();
		 act.moveToElement(To).sendKeys("Chennai").perform();
		 
		 WebElement selectedToCity = driver.findElement(By.xpath("//p[. = 'Chennai, India']"));
		 act.moveToElement(selectedToCity).click().perform();
		 Thread.sleep(2000);
		 
		// driver.findElement(By.id("departure")).click();
		driver.findElement(By.xpath("//div[@aria-label = 'Thu Aug 03 2023']")).click();
		
		
		
	}
}
