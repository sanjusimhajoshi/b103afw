package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample1.html");
		driver.findElement(By.xpath("/html/body/input")).sendKeys("Bhanu");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Akshara");
		driver.findElement(By.xpath("/html/body/input[3]")).click();
		
	}

}
