package day24;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo7 {
	
	@BeforeClass
	public void openApp()
	{
		 Reporter.log("Open App",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		 Reporter.log("Close App",true);
	}
	
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
	  public void testA() 
	  {
		  Reporter.log("create User",true);
	  }
	  
	  @Test(invocationCount = 2)
	  public void testB() 
	  {
		  Reporter.log("delete User",true);
	  }
}
