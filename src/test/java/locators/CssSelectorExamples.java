package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExamples {

	public static void main(String[] args) {
		
		//Step 1: Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Step 2: Maximize the window
		driver.manage().window().maximize();
		
		//Step 3: Load the URL
		driver.get("https://demo.actitime.com/login.do");
		
		//Step 4: Identify Username Textfield and enter username - CSS Selector with tagname
		  //driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("admin");
		
		//Step 5: Identify Password Textfield and enter password - CSS Selector without tagname
		  //driver.findElement(By.cssSelector("[class = 'textField pwdfield']")).sendKeys("manager");
		
		//Step 6: Identify Login button and click - CSS Selector
		  //driver.findElement(By.cssSelector("[id = 'loginButton']")).click();
		
		
		
		      //Step 4: Identify Username Textfield and enter username - CSS Selector with tagname 
				driver.findElement(By.cssSelector("input[type = 'text']")).sendKeys("admin");
				
				//Step 5: Identify Password Textfield and enter password - CSS Selector without tagname 
				driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager"); //class(.) shortcut
				
				//Step 6: Identify Login button and click - CSS Selector
				driver.findElement(By.cssSelector("#loginButton")).click(); //id(#) shortcut
		
		
	}

}
