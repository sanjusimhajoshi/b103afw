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

public class Demo9 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample10.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='sample10b.html']"));
		WebElement frameElement = driver.findElement(By.id("t1"));
		driver.switchTo().frame(frameElement);//using element WebElement
		driver.findElement(By.id("t2")).sendKeys("A");
		driver.switchTo().defaultContent();//exit from frame--> main page
		driver.findElement(By.id("t1")).sendKeys("A");
		
		
//		driver.switchTo().frame(1);//using index --> int
//		driver.findElement(By.id("t2")).sendKeys("B");
//		driver.switchTo().defaultContent();//exit from frame--> main page
//		driver.findElement(By.id("t1")).sendKeys("B");
		
//		driver.switchTo().frame("p1");//using id/name --->String
//		driver.findElement(By.id("t2")).sendKeys("C");
//		driver.switchTo().defaultContent();//exit from frame--> main page
//		driver.findElement(By.id("t1")).sendKeys("C");

		}

}







