package day14;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String before = driver.findElement(By.id("box")).getText();
		System.out.println(before);
		
		WebElement button = driver.findElement(By.xpath("//input[@value='Double Click']"));
		Actions actions=new Actions(driver);
		actions.doubleClick(button).perform();
		Thread.sleep(1000);
		String after = driver.findElement(By.id("box")).getText();
		System.out.println(after);
		//home work print the color of the box before and after
		driver.quit();
		
	}

}







