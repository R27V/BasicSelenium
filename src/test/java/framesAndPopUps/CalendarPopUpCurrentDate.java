package framesAndPopUps;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopUpCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		
		Date d = new Date(); // by default format Wed Jul 12 22:18:57 IST 2023 -day mon date hr:min:sec IST Year
		System.out.println(d);//by default date object represent String so both are correct d or d.toString() 
	//But we need date format Day Month Date Year - we use split() method -
		//based on space we splitting whole string its return type is String[] or string array	
		String[] dArr = d.toString().split(" ");
		String currentDate = dArr[0]+" "+dArr[1]+" "+dArr[2]+" "+dArr[5];
		System.out.println(currentDate);
		Thread.sleep(1000);
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		
		//Navigate to 'From' and 'To' Elements
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		src.sendKeys("Bangaluru");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		
		Thread.sleep(2000);
		
		dst.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		//navigate to desired date in calendar
		Thread.sleep(1000);
                                                 //Dynamic Xpath		
		driver.findElement(By.xpath("//div[@aria-label='"+currentDate+"']")).click();
		                             //div[@aria-label='Wed Jul 12 2023']
		                             //div[@aria-label='Thu Jul 13 2023']
		
		//Here whenever variable'currentDate' is updated, Xpath is updated during runtime
		//so xpath generated during run time called Dymanic Xpath 
		//to write variable in between "+Variable+"
		
		
	}
}
