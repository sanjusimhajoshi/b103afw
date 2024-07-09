package day12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo5_Screenshot {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(3000);
		String xp="//p[text()='Invalid credentials']";
		File a = driver.findElement(By.xpath(xp)).getScreenshotAs(OutputType.FILE);
		System.out.println(a.getAbsolutePath());
		Thread.sleep(30000);
		driver.quit();
	}

}
