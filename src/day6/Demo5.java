package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
//tag[AN='Av']
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
		
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("a[href='https://aksharatraining.com/']")).click();
		
		driver.quit();
	}

}
