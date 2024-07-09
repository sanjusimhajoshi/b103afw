package day17;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String parentTAB=driver.getWindowHandle();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(1000);
		Set<String> allTABS = driver.getWindowHandles();
		System.out.println(allTABS.size());
		
		for(String tab:allTABS)
		{
			driver.switchTo().window(tab);
			System.out.println(driver.getTitle());
		}
		
		Thread.sleep(1000);
		driver.findElement(By.id("Form_submitForm_action_request")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentTAB);
		driver.close();
	}
}