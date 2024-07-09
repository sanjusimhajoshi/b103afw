package day23b;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void testB()
	{
		System.out.println("Bhanu this TestA...");//print only in console
		Reporter.log("Bhanu This is TestA ha ha ha");//print only in report
		Reporter.log("Bhanu This is TestA bye",true);//print in both C & R
		Reporter.log("Bhanu This is TestA tata",false);//print only in report
	}
}
