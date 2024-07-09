package day25;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void testLogin()
	{
		Reporter.log("open the browser",true);
		Reporter.log("enter the url",true);
		Reporter.log("enter un & pw",true);
		Reporter.log("click login",true);
		String actual ="Login";
		String expected="Home";
//		if(actual.equals(expected))
//		{
//			Reporter.log("Pass HP is displayed",true);
//		}
//		else
//		{
//			Reporter.log("Fail HP is Not displayed",true);
//			Assert.fail();
//		}
		Assert.assertEquals(actual, expected);
		
	}
}
