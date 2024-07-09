package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo10 {
//print the list box items without repeating them
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample15.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select=new Select(listBox);
		String allItems = select.getWrappedElement().getText();
		System.out.println(allItems);
		
		System.out.println("---");
		
		LinkedHashSet<String> allOptions=new LinkedHashSet<String>();
		List<WebElement> options = select.getOptions();
		for(WebElement option:options)
		{
			String text=option.getText();
			allOptions.add(text);
		}
		
		System.out.println(allOptions);
		
		
		driver.quit();
		
	}

}
