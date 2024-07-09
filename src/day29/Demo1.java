package day29;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {

	@BeforeMethod
	public void m1()
	{
		Reporter.log("BM...",true);
	}
	
	@AfterMethod
	public void m2()
	{
		Reporter.log("AM...",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("testa...",true);
	}
}
