package day24;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo4 {

	@DataProvider
	public Iterator<String> getData()
	{
		ArrayList<String> data=new ArrayList<String>();
		data.add("UserA");
		data.add("UserB");
		data.add("UserC");
		return  data.iterator();
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un)
	{
		Reporter.log("Create "+un,true);
	}
}
