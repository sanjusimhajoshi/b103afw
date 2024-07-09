package day14;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.switchTo().frame(0);//using index --> int
		driver.findElement(By.id("t2")).sendKeys("B");
		driver.switchTo().parentFrame();//exit from frame--> main page
		driver.findElement(By.id("t1")).sendKeys("B");
		
	

		}

}







