package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class DriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser launched");
		
		driver.get("https://flipkart.com");
		
		//8. To maximise the Browser
		  // Options op = driver.manage();
		   //Window win = op.window();
		   //win.maximize();
		// we don't need op, win variable it is only wasting time bcoz just for refernce purpose we use it
		// so i will not store anything 
		//directly call it this concept is using (.) operator and switching from one interface to another is called method chaining.
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		
		//9. Navigate methods comes from navigation Interface
		//Refresh the page- reload the page
		driver.navigate().refresh();
		
	   //Come back to previous page
		driver.navigate().back();
		
	  //Navigate to next Page
		driver.navigate().forward();
		
	  //Load URL through Navigation Interface- reload the url
		driver.navigate().to("https://flipkart.com"); //to(String url) used
		// to(String url) & to(URL url) - same method name two different arguments is method overloading.
		//to(URL url) is a class present in java.net package - use when remote driver is start using
		
		//looks like navigate.to() method & driver.get() method is same but not both were load the url
		//driver.get()- is always a fresh start & it is not navigate through the history
		//driver.navigate.to()- it is navigate through the history, it store the history in the cache memory or provide the cookies.
		
		
		// get the Session ID
		SessionId id1 = ((RemoteWebDriver)driver).getSessionId();
		System.out.println("Session ID for the current Browser is ->" +id1);
		
		  //5. To capture the Session ID or Window handle
		  String id = driver.getWindowHandle(); // getWindowHandle() coming from web driver interface and return String
		  System.out.println("Window handle of current page is ->" +id);

	}

}
