package framesAndPopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		
		// App URL :- https://the-internet.herokuapp.com/basic_auth
		// App authentication username - admin
		// App authentication password - admin
		
		// After authentication URL look like
		// https://admin:admin@the-internet.herokuapp.com/basic_auth
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		                  // admin:admin credentials given by developer i.e username & password
		//This popUp used very rarely
	}
}
