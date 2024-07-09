package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample9.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		SearchContext shadow = driver.findElement(By.id("shadow_host")).getShadowRoot();
		shadow.findElement(By.cssSelector("#t1")).sendKeys("Bhanu");
		Thread.sleep(2000);
		
		driver.quit();
		
	
	}

}
