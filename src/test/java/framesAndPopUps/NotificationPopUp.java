package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp {

	public static void main(String[] args) {
		
		//Browser setting
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		//Launch the browser
		WebDriver driver = new ChromeDriver(op);
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL
		driver.get("https://yatra.com");
	}
}
