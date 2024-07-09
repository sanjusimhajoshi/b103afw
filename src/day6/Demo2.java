package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample2.html");
		
		driver.findElement(By.linkText("Bhanuprakasha")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("Bhanu")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("prakash")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("Bhanuprakash")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("asha")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("anu")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("akash")).click();
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("anup")).click();
		
		driver.quit();
	}

}
