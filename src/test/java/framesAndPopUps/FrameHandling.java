package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Handle the Frame
		driver.switchTo().frame(0);
		System.out.println();
		
		//Drag and Drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println("Drag and drop successfully done");
		
		//Switch control back to the home page
		driver.switchTo().defaultContent();
		System.out.println("switched the control to main page");
		
		//click on Accept link
		driver.findElement(By.linkText("Accept")).click();
		System.out.println("Click on accept link");
		
	}
}
