package takeScreenshotInterface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//load the URL
		driver.get("http://localhost:8888/");
		
		//login to the application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		System.out.println("Home page displayed");
		
		//take screen shot of home page- take Scren shot is interface behave same like Javascript 
		//Step1: cast the Takescreenshot interface to the driver
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//Step2: call get screenshot as method
		  File srcLocation = ts.getScreenshotAs(OutputType.FILE);
		
		//Step3:create a folder to store the screen shots
		File dstLocation = new File(".\\ScreenShots\\ScreenShot1.png");//screenshot1 is file name given by us
		
		//Step4: copy the screenshot from source to destination
		//for copy paste we have to use new tool Apache commons IO
		Files.copy(srcLocation, dstLocation);//Files class is used from (Apache) commons io
		
		System.out.println("Screenshot taken");
		
		
	}
}
