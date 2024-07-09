package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		WebElement listBox = driver.findElement(By.id("APjFqb"));
		Select select=new Select(listBox);
		select.selectByIndex(0);
	}

}
