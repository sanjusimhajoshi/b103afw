package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	public static void test(ChromeDriver driver) throws InterruptedException
	{
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
				
		Thread.sleep(3000);
				
		//close the browser
		driver.close();
	}
	
	public static void test(EdgeDriver driver) throws InterruptedException
	{
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
				
		Thread.sleep(3000);
				
		//close the browser
		driver.close();
	}
	
	public static void test(FirefoxDriver driver) throws InterruptedException
	{
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
				
		Thread.sleep(2000);
				
		//close the browser
		driver.close();
		
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		Demo5.test(driver);
		
		EdgeDriver driver2=new EdgeDriver();
		Demo5.test(driver2);
		
//		FirefoxDriver driver3=new FirefoxDriver();
//		Demo5.test(driver3);

	}

}
