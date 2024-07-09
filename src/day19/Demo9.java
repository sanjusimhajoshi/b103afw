package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9 {
//write a code to print content of list box is sorted order
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B103_Selenium/share/pages/sample14.html");
		WebElement listBox = driver.findElement(By.id("A1"));
	
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		
		List<String> allItems=new ArrayList<String>();
		for(WebElement option:allOptions)
		{
			String item=option.getText();
			allItems.add(item);
		}
		
		System.out.println(allItems);
		Collections.sort(allItems);  //reverse order
		System.out.println(allItems);
		
		driver.quit();
		}

}
