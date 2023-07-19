package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//To launch Chrome Browser- no internet is necessary
		//ChromeDriver driver = new ChromeDriver(); // browser specific class
		// System.out.println("Chroe Browser Launched");

		
		//Upcast the chromeDriver to web driver interface
		WebDriver driver = new ChromeDriver(); //used bcoz easy to change only browser object
		System.out.println("Chrome Browser launched");
		
		
		//assume 
		//WebDriver driver = null; // not launching the browser so these task cannot be performed
		                         // NullPointerException this exception is giver, driver deafult value is NULL
		                         // If we use any method we have to launch the browser by giving a valid reference to driver
		                         //  after this only diver having the valid sessionID and it perform these task(methods)
		
		//1. To Load URL- internet is necessary
		driver.get("https://flipkart.com"); //url is only way to access web application.
		//get()- augment is accepting (String Url) & returning void by default means only load the url
		// if the address is wrong it through 404 error
	     System.out.println("Gmail is loaded");
		
		//2. To capture the Page Title
		  String title= driver.getTitle(); // getTitle coming from web driver interface and return String
		  System.out.println("Page title is ->" +title);
		 
	   //3. To Capture the current URL - needed because of the url keeps on changing whenever we click on any web element.
		  String url = driver.getCurrentUrl(); // getCurrentUrl() coming from web driver interface and return String
		  System.out.println("Current URL is ->" +url);
		
	   //4. To capture the source code of the current web page.
		  String sourceCode = driver.getPageSource(); // getPageSource() coming from web driver interface and return String
		 // System.out.println("page source is ->" +sourceCode);
		  
	  //5. To capture the Session ID or Window handle
		  String id = driver.getWindowHandle(); // getWindowHandle() coming from web driver interface and return String
		  System.out.println("Window handle of current page is ->" +id);
		  
	//6. To close the Browser - close only the current Browser tab/page/window.
		  Thread.sleep(2000);
		  driver.close();  // close only the current Browser tab/page/window.
		  System.out.println("Browser is closed");
		  
	//7. To close the Browser - close all the current Browser tab/page/window which are associated with execution 
		  driver.quit(); 
	}

}
