package day17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/Sample11.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS = driver.getWindowHandles();
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals("Akshara"))
			{
				driver.findElement(By.id("t1")).sendKeys("Akshara");
				break;
			}
		}
		
		
	
		

	}

}
