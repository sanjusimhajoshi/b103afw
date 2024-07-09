package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		FirefoxDriver driver=new FirefoxDriver();
		
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();

	}

}
