package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//auto suggestion
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		String xp="//span[contains(text(),'selenium')]";
		List<WebElement> all_auto = driver.findElements(By.xpath(xp));
		//select 1st auto suggestion 
//		all_auto.get(0).click();
		//select 5th auto suggestion 
//		all_auto.get(4).click();
		//select last auto suggestion 
//		int count=all_auto.size();
//		all_auto.get(count-1).click();
		
		for(WebElement auto:all_auto)
		{
			String text=auto.getText();
			if(text.equalsIgnoreCase("selenium grid"))
			{
				auto.click();
				break;
			}
		}
		
	}

}
