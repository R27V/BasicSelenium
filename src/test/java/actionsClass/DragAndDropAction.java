package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
public static void main(String[] args) throws InterruptedException {
	
	//Step1: Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3: Load the URL
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	//Action 10. dragAndDrop(WebElement source, WebElement target) - Drag & Drop Operations done on the same page
	//Action 11. dragAndDrop(WebElement source, int xOffset, int yOffset)
	WebElement capital = driver.findElement(By.id("box3"));
	
	WebElement country = driver.findElement(By.id("box103"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(capital, country).perform();
	Thread.sleep(1000);
	
	System.out.println("Drag and Drop successfully");
	
    WebElement cap1 = driver.findElement(By.id("box6"));
	WebElement count1 = driver.findElement(By.id("box106"));
	act.dragAndDrop(cap1, count1).perform();
	Thread.sleep(1000);
	
	
	
	
}
}
