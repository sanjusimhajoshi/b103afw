package day17;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
/*Automate below steps--Selenium4
 * 1. open chrome browser and goto google.com, print the title
 * 2. open another chrome browser , goto fb.com print the title
 * 3. close fb browser
 * 4. close google browser
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		//open new window as child for the current browser and switch to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("http://www.fb.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);
		driver.quit();
	}

}