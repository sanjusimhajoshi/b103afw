package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample8.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		boolean status = driver.findElement(By.id("A1")).isEnabled();
		System.out.println(status);//true--> enabled

		System.out.println(driver.findElement(By.id("A4")).isEnabled());//false-disabled
		
		
		System.out.println(driver.findElement(By.id("A1")).isDisplayed());//true---Visible
		System.out.println(driver.findElement(By.id("A3")).isDisplayed());//false--Not visible
		
		System.out.println(driver.findElement(By.id("A5")).isSelected());//true---selected
		System.out.println(driver.findElement(By.id("A6")).isSelected());//false--Not selected
		
		
		
		Thread.sleep(1000);
		driver.quit();
		

	}

}
