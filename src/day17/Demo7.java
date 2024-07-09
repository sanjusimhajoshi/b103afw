package day17;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
/*Automate below steps
 * 1. open chrome browser and goto google.com, print the title
 * 2. open another chrome browser , goto fb.com print the title
 * 3. close fb browser
 * 4. close google browser
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://www.google.com");
		System.out.println(driver1.getTitle());
		Thread.sleep(1000);
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().setPosition(new Point(400,10));
		driver2.get("http://www.fb.com");
		System.out.println(driver2.getTitle());
		Thread.sleep(1000);
		driver2.quit();
		Thread.sleep(1000);
		driver1.quit();
	}

}
