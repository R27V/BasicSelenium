package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitelyWaitPractice {

	public static void main(String[] args) {
		
		//Step1: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Step2: Maximize the window
		driver.manage().window().maximize();
		
		//Step3: Wait for 10 sec - manage method interface helps to take internal mehods like option, timeout 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Duration is a class in java.time package & this class have many methods like nanosec, sec,min,hr etc
		
		//Step4: load the URL
		driver.get("http://localhost:8888/");
		
		//Step5: Identify the elements
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Step6: Click on organizations link
		driver.findElement(By.linkText("Organizations")).click();
		
		
		
	}
}
