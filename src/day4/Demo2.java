package day4;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement unTB = driver.switchTo().activeElement();
		unTB.sendKeys("Admin");
		Thread.sleep(1000);
		
		unTB.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement pwTB = driver.switchTo().activeElement();
		pwTB.sendKeys("admin123");
		pwTB.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		WebElement loginBTN = driver.switchTo().activeElement();
		loginBTN.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("dashboard"))
		{
			System.out.println("Pass: Home page is displayed");
		}
		else
		{
			System.out.println("Fail: Home page is NOT displayed");
		}
		driver.quit();
		
	}

}
