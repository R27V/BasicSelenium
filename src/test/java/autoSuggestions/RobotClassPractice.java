package autoSuggestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class RobotClassPractice {
public static void main(String[] args) throws AWTException {
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops",Keys.ENTER);//Keys comes from Enum block java,special class,static & final
	//Keys Perform only single stroke actions. Double stroke- want to write @(Shift+number2)we have to press same time not possible by Keys
	//To Overcome from Keys we use ROBOT class come from Java.awt package
	//driver.findElement(By.id("nav-search-submit-button")).click();// it is for search but if we don't have search button we use Keys
	
	Robot r = new Robot();
	//r.keyPress(KeyEvent.VK_CAPS_LOCK);
	
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_H);
	r.keyRelease(KeyEvent.VK_H);
	r.keyRelease(KeyEvent.VK_SHIFT);
	
	r.keyPress(KeyEvent.VK_E);
	r.keyRelease(KeyEvent.VK_E);
	
	r.keyPress(KeyEvent.VK_L);
	r.keyRelease(KeyEvent.VK_L);
	
	r.keyPress(KeyEvent.VK_L);
	r.keyRelease(KeyEvent.VK_L);
	
	r.keyPress(KeyEvent.VK_O);
	r.keyRelease(KeyEvent.VK_O);

	
}
}
