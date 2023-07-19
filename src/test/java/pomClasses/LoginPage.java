package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a pom class for Login page of ActiTime Application
 * Pom class don't have main method because there we store web elements and their  locators
 * @author YASH
 *
 */
public class LoginPage {
	//Rule 1: Create a separate pom class for every web page
	
	//Rule 2: Identify the web elements of this page using @FindBy, @FindBys, @FindAll
	@FindBy(id = "username")
	private WebElement userNameEdt; //Edt= edit, which means its text field
	
	@FindBy(name = "pwd")
	private WebElement passwordEdt;
	
	@FindBy(id = "loginButton")
	private WebElement loginLnk;//Lnk its a link //Btn button //dropDwn drop down
	
	//Rule 3: Create a constructor to initialize the web elements - mandatory for POM class(learn it)
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //current driver reference
	}

	//Rule 4: Provide getters to Access these web elements -
	              //getter have the return type same as the data type of variable
	              //setters return type is void
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginLnk() {
		return loginLnk;
	}
	
//	After concept 1 & 2 - concept 3
	//To optimize the code use we use business library method
	//if we have the scenario in which we want element from different page then business library method is not possible to create
	//Business Library - method created using the elements related to this page only
	/**
	 * This method will login to app
	 * @param USERNAME
	 * @param PASSSWORD
	 */
	//for this declaration after creating method do - /** then click enter
	public void loginToApp(String USERNAME, String PASSSWORD)
	{
		userNameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSSWORD);
		loginLnk.click();
	}

	//here elements find during compile time so syntactical error is not identified
	
	
	
	
	
	
	
	
	
}
