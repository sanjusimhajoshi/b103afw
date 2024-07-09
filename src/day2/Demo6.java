package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo6 {

	public static void test(RemoteWebDriver driver) throws InterruptedException
	{
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
				
		Thread.sleep(3000);
				
		//close the browser
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		Demo6.test(driver);
		
		//EdgeDriver driver2=new EdgeDriver();
		//Demo6.test(driver2);
		
		FirefoxDriver driver3=new FirefoxDriver();
		Demo5.test(driver3);

	}

}
