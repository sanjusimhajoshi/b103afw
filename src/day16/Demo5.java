package day16;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://eprocure.gov.in/eprocure/app");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("PageLink_5")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("DirectLink_13")).click();
		//Homework: verify that file is download 
		
	}
	

}







