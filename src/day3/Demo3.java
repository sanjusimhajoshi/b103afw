package day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo3 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://aksharatraining.com/");
	
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().to(new URL("https://www.gmail.com"));
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
