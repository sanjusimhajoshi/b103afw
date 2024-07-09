package day26;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {

	@Parameters({"browser","gridURL"})
	@Test
	public void test(String browser,String gridURL) throws MalformedURLException
	{
		WebDriver driver;
		
		if(browser.equals("chrome"))
		{
			Reporter.log("Opening chrome browser",true);
			URL remoteURL=new URL(gridURL);
			ChromeOptions options=new ChromeOptions();
			driver=new RemoteWebDriver(remoteURL,options);
			driver.manage().window().setPosition(new Point(600, 10));
		}
		else
		{
			Reporter.log("Opening Edge browser",true);
			URL remoteURL=new URL(gridURL);
			EdgeOptions options=new EdgeOptions();
			driver=new RemoteWebDriver(remoteURL,options);
		}
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		for(int i=1;i<=20;i++)
		{
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("username")).clear();
		}
		driver.quit();
	}
}
