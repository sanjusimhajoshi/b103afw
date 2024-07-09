package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//select all the checkboxes present on the page
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample12.html");
		List<WebElement> all_CB = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=all_CB.size();
		System.out.println();
		
		for(WebElement cb:all_CB)
		{
			cb.click();
			Thread.sleep(1000);
		}
		
		for(int i=count-1;i>=0;i--)
		{
			all_CB.get(i).click();
			Thread.sleep(1000);
		}
		
		for(int i=0;i<count;i=i+2)
		{
			all_CB.get(i).click();
			Thread.sleep(1000);
		}
		
	}

}
