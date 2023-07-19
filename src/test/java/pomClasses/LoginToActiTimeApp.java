package pomClasses;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToActiTimeApp {

	//public static void main(String[] args) throws Throwable {
	
	@Test
	public void loginTest() throws Throwable {
		
		
		//Step 1: Launch the Browser
		WebDriver driver = new ChromeDriver();
				
		//Step 2: Maximize the window
		driver.manage().window().maximize();
		
		//Step 3: wait for 10 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Step 4: Load the URL - Demo Actitime
		driver.get("https://demo.actitime.com/login.do");
				
		/*		//Step 4: Identify the Usename Textfield and enter username - ID locator
				driver.findElement(By.id("username")).sendKeys("admin");
				
				//Step 5: Identify the Password Textfield and enter password - Name locator
				driver.findElement(By.name("pwd")).sendKeys("manager");
				
				//Step 6: Identify the Login button and click - ClassName locator
				driver.findElement(By.className("initial")).click();
				
			   //Step 7: tagName locator - it is not used because there are multiple tags of same tagname are present in one webpage.
				driver.findElement(By.tagName("a")).click();
		Everything is hard coded here*/
		
/*  //Concept 1 -Login to Application usin POM CLASS - pom classes are always handle through object creation it has non-static data
		//calling the Getter method
		LoginPage lp = new LoginPage(driver);
		 lp.getUserNameEdt().sendKeys("admin");
		lp.getPasswordEdt().sendKeys("manager");
		lp.getLoginLnk().click();
		
		System.out.println("Login Successfully");
	                                 Run- application is login	*/
	//concept 2
		//Read username and password from property file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		Properties p = new Properties();
		p.load(fis);
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		//Login using POM CLASS- calling Getters method
/*		LoginPage lp = new LoginPage(driver);
		lp.getUserNameEdt().sendKeys(USERNAME);
		lp.getPasswordEdt().sendKeys(PASSWORD);
		lp.getLoginLnk().click();
		
		System.out.println("Login Successfully");              */
		
 //Concept 3- to optimize the code we use BUSINESS Library to create method and call it instead of getter method
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		
		System.out.println("Login Successfully");
		
		//TestNG assert concept
		//Validate for Title
		
		String expectedTitle = "actiTIME -  Enter Time-Track";
		Thread.sleep(2000);
		String actualTitle = driver.getTitle();
		
		//Assert.assertEquals(actualTitle, expectedTitle); //double argument
		
		assertTrue(actualTitle.contains("actiTIME")); //Single argument
		System.out.println("assert passed");
	}
}
