package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitPractice {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://localhost:8888/");
		
		//identify elements in application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
		//click on login
		WebElement login = driver.findElement(By.id("submitButton"));
		
		// Custom wait - call the method
		waitAndClick(login);
		
	}
	
	//similarly custom wait is also use for sendKeys etc
	//This is static method mainly it is utility we write in another class as non static method then call it as new classname(); by creating object
	//static member of same class - directly access with member name
	public static void waitAndClick(WebElement element) throws InterruptedException
	{
		int count = 0;
		while(count<10)
		{
			try 
			{
				element.click();// if Exception comes then it go to catch block
				break;
			}
			catch(Exception e)
			{
				Thread.sleep(1000);//polling 1 sec
				count++;
			}
		}
			
	}
}
