package day14;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
//scroll and click on the element - scrolling is automatic in selenium 3
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement contact_us = driver.findElement(By.xpath("//span[text()='Contact us']"));
		Actions actions=new Actions(driver);
		actions.scrollToElement(contact_us).perform();
		contact_us.click();
	}

}







