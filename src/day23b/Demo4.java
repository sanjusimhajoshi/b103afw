package day23b;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test //Test Method
	public void testC()
	{
		Reporter.log("TestC ...",true);
	}
	
	@Test //Test Method
	public void testA()
	{
		Reporter.log("TestA ...",true);
	}
	
	@Test //Test Method
	public void testB()
	{
		Reporter.log("TestB ...",true);
	}
	
	
}
