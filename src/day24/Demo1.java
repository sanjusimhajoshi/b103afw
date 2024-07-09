package day24;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	final int i=3;
	@Test(invocationCount = i)
	public void testA()
	{
		Reporter.log("TestA....",true);
	}
	
	@Test
	public void testB()
	{
		for(int i=1;i<=3;i++)
		{
			Reporter.log("TestB....",true);
		}
	}
}
