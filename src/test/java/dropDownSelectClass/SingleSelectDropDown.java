package dropDownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	
	//Step1:Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3:Load the URL
	driver.get("https://demoqa.com/select-menu");
	
	//Step4: Locate the dropDown
	WebElement singleSelectDropdown = driver.findElement(By.id("oldSelectMenu"));
	
	//Step5: To Handle the Dropdown create Object of Select Class
	Select sel = new Select(singleSelectDropdown);
	
	//Step6: Select option inside the dropdown - Using Index
	sel.selectByIndex(4); //usage of index is not a feasable option because index got change if we add new colour
	System.out.println("index 4 selected");
	Thread.sleep(2000);
	
	//for identifying uniquely go for value or Visible text
	//Select option inside the dropdown - Using Value
	sel.selectByValue("9");
	System.out.println("Value Selected");
	Thread.sleep(2000);
	
	//Select option inside the dropdown - Using Visible Text
	sel.selectByVisibleText("Magenta");
	System.out.println("Visible Text is selected");
	
	//Check if dropDown list is  multiSelect dropDown or singleSelect dropDown
	boolean status = sel.isMultiple();	
	if(status==true)
	{
		System.out.println("Yes!! It is Multi Select Dropdown");
	}
	else
	{
		System.out.println("No!! It is Single Select Dropdown");
	}
	
	//Check all the Options in dropdown list
	List<WebElement> listOp = sel.getOptions();
	int count= 0;
	
	for(WebElement ele:listOp)
	{
		count++;
		System.out.println(ele.getText());
	}
	System.out.println(count);
	
	
	
}
}
