package day24;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo10 extends Demo8{
	
	 @Test(invocationCount = 2)
	  public void testB() 
	  {
		  Reporter.log("delete User",true);
	  }
}
