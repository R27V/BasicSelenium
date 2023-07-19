package framesAndPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Login to Home page
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		
		//navigate to Task
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(1000);
		
		//check the check box
		driver.findElement(By.xpath("(//div[@class='img'])[2]")).click();
		Thread.sleep(1000);
		
		//click on delete button
		//driver.findElement(By.xpath("//div[@class='delete button']")).click();
		
		//click on copy button
		driver.findElement(By.xpath("//div[@class='copyTo button']")).click();
		Thread.sleep(2000);
		
		//Handle the hidden division PopUp
		//driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("(//div[.='Copy']/following-sibling::div[.='Cancel'])[3]")).click();
		
		
		
	}
}
