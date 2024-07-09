package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//auto suggestion- without collections
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		String xp="//span[contains(text(),'selenium')]";
		
		//select 1st auto suggestion 
//		driver.findElement(By.xpath(xp)).click();
		
//		select 5th auto suggestion 
//		driver.findElement(By.xpath("(//span[contains(text(),'selenium')])[5]")).click();
		//select last auto suggestion 
//		driver.findElement(By.xpath("(//span[contains(text(),'selenium')])[last()]")).click();
		
		
		driver.findElement(By.xpath("//span[contains(.,'grid')]")).click();

		
	}

}
