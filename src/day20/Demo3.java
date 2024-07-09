package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
//print listbox content without using getOptions/Select class
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B103_Selenium/share/pages/sample13.html");
		Thread.sleep(1000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//option"));
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		driver.quit();
	}

}
