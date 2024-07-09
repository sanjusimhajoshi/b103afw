package day20;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample15.html");
		
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select=new Select(listBox);
		List<WebElement> allOptions = select.getOptions();
		
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		
		for(WebElement option:allOptions)
		{
			String text=option.getText();
			if(map.containsKey(text))
			{
				Integer count = map.get(text);
				count++;
				map.put(text, count);
			}
			else
			{
				map.put(text, 1);
			}
			
		}
		
		driver.quit();
		//print the content of list box along with its occurrence
		for( String key:map.keySet())
		{
			Integer value = map.get(key);
			System.out.println(key+"->"+value);
		}
		System.out.println("-------------");
		//print only duplicate options present in list box
		for( String key:map.keySet())
		{
			Integer value = map.get(key);
			if(value>1)
			{
				System.out.println(key+"->"+value);
			}
		}
		System.out.println("-------------");
		//print only unique options present in list box
		for( String key:map.keySet())
		{
			Integer value = map.get(key);
			if(value==1)
			{
				System.out.println(key);
			}
		}
		System.out.println("-------------");
		//print the list box items without repeating them
		for( String key:map.keySet())
		{
			System.out.println(key);
		}
	}

}
