package day25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo4 {

	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
	@Test
	public void createCustomer()
	{
		Reporter.log("click new customer",true);
		Reporter.log("enter customer details",true);
		Reporter.log("click create customer",true);
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals("abc","xyz");//compare 
		
		Reporter.log("End of create customer",true);
		softAssert.assertAll();//report
	}
	
	@Test
	public void createUser()
	{
		Reporter.log("click new User",true);
		Reporter.log("enter User details",true);
		Reporter.log("click create User",true);
	}
}
