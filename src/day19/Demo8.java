package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo8 {
//write a code to search for given option in list box
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/B103_Selenium/share/pages/sample14.html");
		WebElement listBox = driver.findElement(By.id("A1"));
		Select select=new Select(listBox);
		String toSearch="Drinks";//HW take it from user(use scanner class)
		List<WebElement> allOptions = select.getOptions();
		String msg=" Not present";
		for(WebElement option:allOptions)
		{
			String item=option.getText();
			if(item.equals(toSearch)) // make it Case in sensitive
			{
				msg=" present";
				break;
			}
		}
		System.out.println(toSearch+msg);
		driver.quit();
		}

}
