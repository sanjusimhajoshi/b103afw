package day14;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.xpath("(//a[text()='Free Ebooks'])[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Free Machine Learning Ebooks']")).click();
		
		}

}







