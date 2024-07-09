package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa2.topuniversities.com/university-subject-rankings/life-sciences-medicine");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Decline']")).click();
		Thread.sleep(1000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
//		WebElement yearLabel = driver.findElement(By.xpath("//a[contains(.,'Quick View')]"));
//		Actions actions=new Actions(driver);
//		actions.scrollToElement(yearLabel).perform();
		
//		WebElement yearLB = driver.findElement(By.id("qs-ranking-year"));
//		Select select=new Select(yearLB);
//		select.selectByIndex(1);
		
		driver.findElement(By.xpath("//label[text()='Year']/..")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='2022']")).click();
	}

}
