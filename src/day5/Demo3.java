package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//scenario: locator is matching with 0 element on the page
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///Users/ssimha/Documents/B-103/sample1.html");
		
		WebElement element = driver.findElement(By.tagName("Z"));
		
		element.click();

	}

}
