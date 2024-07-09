package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo7 {
//write a code to select all the options present in listbox
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B103_Selenium/share/pages/sample14.html");
		Thread.sleep(1000);
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select=new Select(listBox);
		int count=select.getOptions().size();
		for(int i=0;i<count;i++)
		{
			select.selectByIndex(i);
		}
		
		}

}
