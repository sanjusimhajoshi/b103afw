package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		SearchContext shadowRoot = driver.findElement(By.xpath("//book-app")).getShadowRoot();
		shadowRoot.findElement(By.cssSelector("#input")).sendKeys("java");
		shadowRoot.findElement(By.cssSelector("#input")).sendKeys(Keys.ENTER);
	
		driver.quit();
	}

}
