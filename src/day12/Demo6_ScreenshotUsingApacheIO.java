package day12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6_ScreenshotUsingApacheIO {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("abc");
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(3000);
		String xp="//p[text()='Invalid credentials']";
		File srcFile = driver.findElement(By.xpath(xp)).getScreenshotAs(OutputType.FILE);
		File dstFile =new File("./images/errmsg.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
	}

}







