package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B103_Selenium/share/pages/sample4.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bhanu");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ABC");

	}

}
