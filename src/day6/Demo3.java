package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

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
		
		driver.findElement(By.tagName("A")).click();
		
		goBack(driver);
		
		driver.findElement(By.id("A1")).click();
		
		goBack(driver);
		
		driver.findElement(By.name("n1")).click();//CS
		
		goBack(driver);
		
		driver.findElement(By.className("C1")).click();
		
		goBack(driver);
		
		driver.findElement(By.linkText("Bhanuprakasha")).click();//CS
		
		goBack(driver);
		
		driver.findElement(By.partialLinkText("bhanu")).click();//CS
		
		goBack(driver);
		
		driver.quit();
	}

}
