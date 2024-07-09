package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/Sample3.html");

		
		List<WebElement> all_elements = driver.findElements(By.tagName("a"));
		
		for(WebElement element:all_elements)
		{
			System.out.println(element.getAttribute("href"));
		}
		
		
		driver.quit();

	}

}
