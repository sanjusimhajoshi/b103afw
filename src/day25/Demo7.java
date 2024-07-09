package day25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 {

	@Test(dependsOnMethods = "getInterview")
	public void createCV()
	{
		Reporter.log("My CV",true);
	
	}
	
	@Test(dependsOnMethods = "createCV")
	public void getInterview()
	{
		Reporter.log("My Interview",true);
	}
}
