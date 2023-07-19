package framesAndPopUps;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws IOException {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
//		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		//Click on upload resume
//		driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		
		//To scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
		//Upload the file using AutoIT
//		Runtime.getRuntime().exec("C:\\Users\\YASH\\OneDrive\\Documents\\resumeAuto.exe");
//  	Runtime.getRuntime().exec("C:\\Users\\YASH\\OneDrive\\Documents\\resumeAuto2.exe");
//		System.out.println("File uploading complete");
		
		
		//Upload file without using AutoIT but there must be [type = 'file'] key- value present
		driver.get("https://www.foundit.in/seeker/registration");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		ele.sendKeys("C:\\Users\\YASH\\Downloads\\Satendra's Resume.pdf");
		System.out.println("file uploaded");
		
		
	}
}
