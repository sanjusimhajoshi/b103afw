package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//count and print all the links present in google.com
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		int count=all_links.size();
		System.out.println(count);
		for(WebElement link:all_links)
		{
			System.out.println(link.getText());
		}
		driver.quit();
	}

}
