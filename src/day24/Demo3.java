package day24;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo3 {

	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		data[0][0]="UserA";
		data[0][1]="A123";
		
		data[1][0]="UserB";
		data[1][1]="B123";
		
		data[2][0]="UserC";
		data[2][1]="C123";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void createUser(String un,String pw)
	{
		Reporter.log("Create "+un+" "+pw,true);
	}
}
