package day25;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {

	@Test
	public void editCustomer()
	{
		Reporter.log("edit customer",true);
	}
	
	@Test(priority = 1)
	public void deleteCustomer()
	{
		Reporter.log("delete customer",true);
	}
}
