package day25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo9 {

	
	@Test
	public void createUser()
	{
		Reporter.log("Create User",true);
	}
	
	
	@Test
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
		Assert.fail();
	}
	
	@Test
	public void createProduct()
	{
		Reporter.log("Create Product",true);
	}
	
	
	@Test
	public void deleteProduct()
	{
		Reporter.log("Delete Product",true);
		Assert.fail();
	}
	
}
