package day17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
//close all the child browsers except parent
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String parent = driver.getWindowHandle();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/Sample11.html");
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		for(String wh:allWHS)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
		

	}

}
