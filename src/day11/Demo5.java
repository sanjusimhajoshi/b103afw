package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample2.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement link = driver.findElement(By.id("a1"));
		
		String tag = link.getTagName();
		System.out.println(tag);
		
		System.out.println(link.getAttribute("id"));
		System.out.println(link.getAttribute("name"));
		System.out.println(link.getAttribute("class"));
		System.out.println(link.getAttribute("href"));
		System.out.println("*"+link.getAttribute("type")+"*");//empty string 
		System.out.println("*"+link.getAttribute("hidden")+"*");//default value
		
		System.out.println(link.getText());
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
