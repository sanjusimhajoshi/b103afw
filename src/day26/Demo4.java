package day26;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test
	public void testA() throws MalformedURLException
	{
		URL remoteURL=new URL("http://192.168.1.2:4444");
		ChromeOptions options=new ChromeOptions();
		WebDriver driver=new RemoteWebDriver(remoteURL,options);
		driver.get("https://aksharatraining.com/");
		Reporter.log(driver.getTitle(),true);
		driver.quit();
	}
}
