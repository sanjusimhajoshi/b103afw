package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
//		driver.findElement(By.name("username")).sendKeys("admin");

//		WebElement unTB = driver.findElement(By.name("username"));
//		unTB.sendKeys("admin");
		
		WebElement unTB;//declaration
		
		unTB=driver.findElement(By.name("username"));//init
		
		unTB.sendKeys("admin");//utilization
	}

}
