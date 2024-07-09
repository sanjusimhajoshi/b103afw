package day23b;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {

	@Test(priority = -1)
	public void registerUser()
	{
		Reporter.log("Register User",true);
	}
	
	final int i=2;
	
	@Test(priority = i)
	public void deleteUser()
	{
		Reporter.log("Delete User",true);
	}
}
