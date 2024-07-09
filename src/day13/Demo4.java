package day13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
//scroll to specific element
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String xp="//h2[text()='What People Are Saying About Us']";
		WebElement element = driver.findElement(By.xpath(xp));
		int y=element.getLocation().getY();
		
		j.executeScript("window.scrollTo(0,"+y+")");//scroll down 5 times 500px 
	}

}







