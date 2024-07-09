package day7;

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
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample3.html");
		driver.findElement(By.xpath("./html/body/a")).click();
		goBack(driver);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		goBack(driver);
		try {
		driver.findElement(By.xpath("/html/body/a[3]")).click();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		goBack(driver);
		try {
		driver.findElement(By.xpath("/html/body/a[0]")).click();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		goBack(driver);
		try 
		{
			driver.findElement(By.xpath("/html/body/a[0]")).click();
		}
		catch (Exception e) {
				System.out.println(e.getMessage());
		}
		driver.quit();
	}

}
