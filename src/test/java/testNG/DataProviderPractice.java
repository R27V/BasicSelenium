package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

	@Test(dataProvider = "getData")
	public void dataProviderDemo(String name, int price) //capture the data from Data Provider
	{
	    System.out.println("Phone is -> "+name+" and Price is ->"+price);	
	}
	
	@DataProvider
	public Object[][] getData() //Working based on rows and columns
	{                           //row-3  column-2
		Object[][] data = new Object[3][2];
		
		data[0][0] = "iPhone"; // first data set
		data[0][1] = 25000 ;
		
		data[1][0] = "Samsung"; // second data set
		data[1][1] = 20000 ;
		
		data[2][0] = "Vivo"; // third data set
		data[2][1] = 10000 ;
		
		return data;
	}
}
