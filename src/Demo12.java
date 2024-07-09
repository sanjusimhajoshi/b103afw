package day24;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo12 extends BaseTest
{

	@Test
	public void testB()
	{
		Reporter.log("TEstB...",true);
	}
	
	@Test
	public void testC()
	{
		Reporter.log("TEstC...",true);
	}
}
