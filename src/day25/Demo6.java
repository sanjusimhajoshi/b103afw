package day25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo6 {

	@Test(priority = 2)
	public void createCustomer()
	{
		Reporter.log("create customer",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "createCustomer",priority = 1)
	public void deleteCustomer()
	{
		Reporter.log("delete customer",true);
	}
}
