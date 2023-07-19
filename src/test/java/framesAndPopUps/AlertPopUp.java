package framesAndPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("https://demoqa.com/alerts");
		
		//Handle Alert PopUp - Ok button -click Ok
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Click on Alert PopUp");
		Thread.sleep(1000);
		
		//Get text from Alert PopUp
		driver.findElement(By.id("alertButton")).click();
		Alert alert1 = driver.switchTo().alert();
		String text = alert1.getText();
		System.out.println(text);
		alert1.accept();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(1000);
		
		//Dismiss the confirmation PopUp
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		String successMsg = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		System.out.println(successMsg);
		
		//Enter data into Prompt PopUP
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(1000);
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("Renu");
		al.accept();
		
		String msg = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println(msg);
		
	}
}
