package day15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
//popup- iframe
	public static void main(String[] args) throws InterruptedException {
		
		LocalDate d=LocalDate.now();
		System.out.println(d);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM YYYY");
		String monthYear = d.format(format);
		System.out.println(monthYear);
		
		format = DateTimeFormatter.ofPattern("dd");
		String day = d.format(format);
		System.out.println(day);
		
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
					String xp="//div[text()='"+monthYear+"']/../..//p[text()='"+day+"']";
					System.out.println(xp);
					WebElement date = driver.findElement(By.xpath(xp));
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
