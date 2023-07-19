package dropDownSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
public static void main(String[] args) throws InterruptedException {
	
	//Step1: Launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//Step2: Maximize the window
	driver.manage().window().maximize();
	
	//Step3: Load the URL
	driver.get("https://demoqa.com/select-menu");
	
	//Step4: Identify the web element for drop down
	WebElement multiSelectDropdown = driver.findElement(By.id("cars"));
	
	//Check if dropDown list is  multiSelect dropDown or not
	Select sel = new Select(multiSelectDropdown);
	boolean value = sel.isMultiple();
	if(value==true)
	{
		System.out.println("Yes!! It is Multi Select Dropdown");
	}
	else
	{
		System.out.println("No!! It is Single Select Dropdown");
	}
	
    //Select Audi and Volvo options from drop down list
	sel.selectByValue("audi");
	System.out.println("Audi is Selected");
	Thread.sleep(2000);
	
	sel.selectByIndex(1);
	System.out.println("Saab is Selected");
	Thread.sleep(1000);
	
	sel.selectByVisibleText("Volvo");
	System.out.println("Volvo is Selected");
	Thread.sleep(2000);
	
	//deSelect Saab from selected options in drop down list
	sel.deselectByIndex(1);
	System.out.println("Saab is removed from selected list");
	
	//deSelect all the selected options
//	sel.deselectAll();
//	System.out.println("All selected options are deselected");
	
	//Get All Selected Options
	List<WebElement> allSel = sel.getAllSelectedOptions();
	
	for(WebElement ele:allSel)
	{
		System.out.println(ele.getText());
	}
	
	//Get First Selected Option
	WebElement first = sel.getFirstSelectedOption();
	System.out.println("First Selected Option -"+first.getText());
	
	//Get Wrapped element - give you all the elements inside the base element -comes in updated version
	WebElement allElements = sel.getWrappedElement();
	System.out.println(allElements.getText());
	System.out.println(allElements.getTagName());
	
	
	
  }
}