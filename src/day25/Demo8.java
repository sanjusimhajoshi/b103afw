package day25;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Demo8 {

	@Parameters({"city","area"})
	@Test
	public void testA(@Optional("Delhi")String c,@Optional("Chandni Chowk")String a)
	{
		Reporter.log("hi:"+c+"->"+a,true);
	}
}
