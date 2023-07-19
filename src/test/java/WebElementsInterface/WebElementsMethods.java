package WebElementsInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//2. Maximize the window
		driver.manage().window().maximize();
		
		//3. Load the URL
		driver.get("https://demo.actitime.com/login.do");
		
		//WebElement method - 1.sendKeys()
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(2000); //compile time exception handled by jvm & runtime by us
		
		//WebElement method - 2.clear()
		driver.findElement(By.id("username")).clear();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//WebElement method - 3.click
		 //driver.findElement(By.className("initial")).click();
		
		//WebElement method - 4.getAttribute() - if there is no attribute value then it return 'null'
		String attribute = driver.findElement(By.className("initial")).getAttribute("href");
		System.out.println("Attribute value is "+attribute);
		
		//WebElement method - 5.getTagname()
		String tag = driver.findElement(By.className("initial")).getTagName();
		System.out.println("TagName of web element is "+tag);
		
		//WebElement method - 6.getText()
		String text = driver.findElement(By.id("loginButton")).getText();
		System.out.println("Visible text of web element is "+text);
		
		//WebElement method - 7.getLocation() - get the position of the web element
		//Point  position = driver.findElement(By.className("initial")).getLocation(); // Point is class having 2 methods getX() & getY()
		Point  position = driver.findElement(By.id("loginButton")).getLocation();
		int posX = position.getX();
		System.out.println("Xth position is "+posX);
		int posY = position.getY(); 
		System.out.println("Yth position is "+posY);
		
	    //WebElement method - 8.getSize() - Dimensions of the web element
		Dimension size = driver.findElement(By.id("loginButton")).getSize(); //Dimension is class having 2 static methods getHeight() & getWidth()
		int height = size.getHeight();
		System.out.println("Element height is "+height);
		int width = size.getWidth();
		System.out.println("Element width is "+width);
		
		//WebElement method - 9.getRect() - Position & dimension of web element, it is like a wrapper class of both poit & dimension
		Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
		int x = rect.getX();
		System.out.println("X using Rect "+x);
		int y = rect.getY();
		System.out.println("Y using Rect "+y);
		int h = rect.getHeight();
		System.out.println("Height using Rect "+h);
		int w = rect.getWidth();
		System.out.println("Width using Rect "+w);
		
		//WebElement method - 10.getCSSValue() - To get the CSS value for css properties
		String cssValue = driver.findElement(By.id("loginButton")).getCssValue("color");
		System.out.println("CSS value is "+cssValue);
		
		//WebElement method - 11.getAriaRole() - To get the element design type
		String role = driver.findElement(By.id("loginButton")).getAriaRole();
		System.out.println("Aria role is " +role);		
		
		String roleUserName = driver.findElement(By.className("textField")).getAriaRole();
		System.out.println("Aria role of userName is "+roleUserName);
		
		//WebElement method - 12.getAccessibleName - To get the element accessibility Name
		String accessibleName = driver.findElement(By.className("textField")).getAccessibleName();
		System.out.println("Accessible Name is " +accessibleName);
		
		String accessibleNameBtn = driver.findElement(By.id("loginButton")).getAccessibleName();
		System.out.println("Accessible Name is " +accessibleNameBtn);
		
		driver.get("http://localhost:8888");
		String name = driver.findElement(By.name("user_name")).getAccessibleName();
		System.out.println("Accessible name is " +name);
		
		//WebElement method - 13.isDisplayed() - To check if the element is displayed/present in the current DOM
		boolean elementDisplayed = driver.findElement(By.name("user_name")).isDisplayed();
		if(elementDisplayed==true)
		{
			driver.findElement(By.name("user_name")).sendKeys("admin");
			System.out.println("Element is Displayed");
		}
		else
		{
		    System.out.println("element not present");
		}
		
		//WebElement method - 14.isEnabled() - To check if the element is enabled in the web page.		
		boolean enable = driver.findElement(By.name("user_name")).isEnabled();
		if(enable==true)
		{
			driver.findElement(By.name("user_password")).clear();
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("element not found");
		}
		
		//WebElement method - 15.isSelected() - To Check if the element is selected or not(use for checkbox,radio button etc.)
		boolean selected = driver.findElement(By.name("user_name")).isSelected();
		if(selected==true)
		{
			System.out.println("Element is Selected");
		}
		else
		{
			System.out.println("Element is not Selected");
		}
		
		//Selenium 4.1
		//WebElement method - 16.getDOMAttribute() - To get the DOM Attribute value -if the attribute is not present it give NULL value
		//it is same as getAttribute but DOM is able to capture dynamic element, now a days applications built on Ajax.
		String domAttribute =  driver.findElement(By.name("user_name")).getDomAttribute("type");
		System.out.println("DOM Attribute value is "+domAttribute);
		
		//WebElement method - 17.getDOMProperty() - To get the DOM Property value for a property name- 
		//attribute were present all the time suppose in user name textfield write admin then it capture in property value
		//and if textfield is empty it returns NULL.(key:value)
		//getAttribute, getDOMAttribute, getAccessible name work on attribute
		driver.findElement(By.name("user_name")).clear(); //value is not present so it shows nothing.
		driver.findElement(By.name("user_name")).sendKeys("admin");
		String propertyValue = driver.findElement(By.name("user_name")).getDomProperty("value");
		System.out.println("DOMProperty value is "+propertyValue);
		
		//WebElement method - 18.submit() - it is same as click() but in for this type = 'Submit' is mandatory to have
		driver.findElement(By.id("submitButton")).submit();
		System.out.println("Submit method worked");
		
		//WebElement method - 19.getShadowRoot()- to get the access of shadowDOM
		//in normalDOM '#shadow-root(open)' present means there is shadowDOM or hiddenDOM
		 SearchContext shadow = driver.findElement(By.name("user_name")).getShadowRoot();
			//shadow.findElement(null) -return SearchContext Interface and we use any locator as normalDOM properties	
		
		
		}
}
