package day24;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo6 {

	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> data=new ArrayList<String[]>();
		
		String[] a= {"UserA","A123","A456"};
		data.add(a);
		
		String[] b= {"UserB","B123"};
		data.add(b);
		
		String[] c= {"UserC","C123","C456","C789"};
		data.add(c);
		return  data.iterator();
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String... others)
	{
		Reporter.log("Create "+un,true);
		for(String e:others)
		{
			Reporter.log(e,true);
		}
		Reporter.log("------",true);
	}
}
