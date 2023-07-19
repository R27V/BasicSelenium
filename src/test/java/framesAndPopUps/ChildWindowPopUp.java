package framesAndPopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://demo.automationtesting.in/Windows.html");
		
	    driver.findElement(By.linkText("Open New Seperate Windows")).click();
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    
	    Thread.sleep(1000);
	    
	    Set<String> windows = driver.getWindowHandles();
	   
	    /* Whenever there is only oe child window associated with the main window
	     * then we can identify the main window ID using getWindowHandle() and eliminate
	     * the main window ID using If condition and easily switch to child window ID */
	    
	/*    String mainID = driver.getWindowHandle();
		System.out.println("main window Id is "+mainID);
	    
	    for(String win:windows)
	    {
	    	if(!win.equals(mainID)) //eliminate the main window ID
	    	{
	    		System.out.println("This is the child ID - "+win);
	    		driver.switchTo().window(win);
	    		break;
	    	}
	    }                                                                             */
		
	    /* When there are mora than one child windows, we cannot switch to particular
	     * child based on only window ID, we should consider title or URL of the
	     * child and switch */
	    
	    for(String win:windows)
	    {
	    	WebDriver currentWindowID = driver.switchTo().window(win);
	    	String currentWinTitle = currentWindowID.getTitle();
	    	if(currentWinTitle.contains("Selenium"))
	    	{
	    		System.out.println(currentWinTitle);
	    		break;
	    	}
	    }
		
	    Thread.sleep(1000);
	    System.out.println("Control is switched to child window");
	    
	    driver.findElement(By.xpath("//span[.='Downloads']")).click();
	    System.out.println("Clicked on Downloads element");
	    Thread.sleep(2000);
	    
	    for(String win:windows)
	    {
	    	WebDriver currentWindowID = driver.switchTo().window(win);
	    	String currentWinTitle = currentWindowID.getTitle();
	    	if(currentWinTitle.contains("Frames"))
	    	{
	    		System.out.println(currentWinTitle);
	    		break;
	    	}
	    }
	    
	    Thread.sleep(1000);
	    System.out.println("Control is switched to parent window");
	    
	    driver.findElement(By.linkText("Register")).click();
	    System.out.println("Clicked on Register element");
	    
	}
}
