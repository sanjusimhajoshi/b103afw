package day14;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(block1).pause(Duration.ofSeconds(2)).moveToElement(block3).pause(Duration.ofSeconds(2)).release().perform();
	}

}






