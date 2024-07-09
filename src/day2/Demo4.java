package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		SafariDriver driver=new SafariDriver();
		
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();

	}

}
