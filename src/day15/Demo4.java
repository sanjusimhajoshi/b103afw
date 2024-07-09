package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {
//popup- iframe
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
//		driver.switchTo().frame(3);
		WebElement frameElement = driver.findElement(By.xpath("(//iframe)[4]"));
		//frame popup
		driver.switchTo().frame(frameElement);
		driver.findElement(By.cssSelector("a.close")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		//HTML popup
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		//HTML popup
		
		for(int i=1;i<=12;i++)
		{
			try {
					WebElement date = driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='15']"));
					Actions actions=new Actions(driver);
					actions.scrollToElement(date).perform();
					Thread.sleep(1000);
					date.click();
					System.out.println("Date is selected");
					break;
			}
			catch (Exception e) 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				Thread.sleep(1000);
				System.out.println("Date not present hence click next:"+i);
			}
		}
		
		
		
		
	}

}
