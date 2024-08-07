package day19;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo14 {
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
		
		System.out.println(map);
		
		
		driver.quit();
		
	}

}
