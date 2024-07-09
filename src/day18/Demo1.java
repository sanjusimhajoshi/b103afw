package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/Sample3.html");
//		WebElement element = driver.findElement(By.tagName("t"));
//		String url = element.getAttribute("href");
//		System.out.println(url);
		
		List<WebElement> all_elements = driver.findElements(By.tagName("a"));
		int count=all_elements.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			WebElement link1 = all_elements.get(i);
			String url1 = link1.getAttribute("href");
			System.out.println(url1);
		}
		
		driver.quit();

	}

}
