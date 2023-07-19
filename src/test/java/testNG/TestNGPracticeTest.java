package testNG;

import org.testng.annotations.Test;


public class TestNGPracticeTest {

	@Test(priority=1)
	public void createCustomer()
	{ 
		System.out.println("Customer is created");
	}
	
	@Test(priority=1)
	public void modifyCustomer()
	{
		System.out.println("Customer is modified");
	}
	
	@Test(priority=-2)
	public void deleteCustomer()
	{
		System.out.println("Customer is deleted");
	}
	
//default execution order is ASCII- capital letter having less value compare to small letter
//to overcome this Priority is used it's default value is zero. negative value is also accepted. 
//lower priority executed first.	
//if two value having same priority value then it follow ASCII order to execute	
}

// All the annotations might return void but data provider annotation returns two dimensional array
