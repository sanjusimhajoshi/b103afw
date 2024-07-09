package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://pos.aksharatraining.in/pos/public/");
		
		
		
		WebElement unTB=driver.findElement(By.name("username"));//init
		
		driver.navigate().refresh();
		
		unTB.sendKeys("admin");//utilization
		
		
		
	}

}
