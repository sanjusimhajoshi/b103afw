package day16;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/Sample11.html?");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("A5")).click();
		Thread.sleep(1000);
		
		String w = driver.getWindowHandle();
		System.out.println(w);
		
		Set<String> a = driver.getWindowHandles();
		System.out.println(a);
		driver.quit();
		
	}
	

}







