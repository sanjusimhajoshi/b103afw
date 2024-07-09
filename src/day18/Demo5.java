package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(1000);
		String xp="//span[contains(text(),'selenium')]";
		List<WebElement> all_auto = driver.findElements(By.xpath(xp));
		int count=all_auto.size();
		System.out.println(count);
		
		for(WebElement auto:all_auto)
		{
			System.out.println(auto.getText());
		}
		
		driver.quit();
	}

}
