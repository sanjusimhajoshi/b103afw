package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
//tagName id name cn lt plt
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample4.html");
		driver.findElement(By.tagName("input")).sendKeys("bhanu");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("akshara");

	}

}
