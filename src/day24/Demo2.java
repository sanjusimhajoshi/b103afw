package day24;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {

	@DataProvider
	public String[] getData()
	{
		String[] data= {"UserA","UserB","UserC","UserD"};
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un)
	{
		Reporter.log("Create "+un,true);
	}
}
