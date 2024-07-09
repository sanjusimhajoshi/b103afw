package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
//handling sync - solution-2-> implicitlyWait
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Duration defaultTime = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(defaultTime);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//wait upto 5s
		Duration customTime = driver.manage().timeouts().getImplicitWaitTimeout();
		System.out.println(customTime);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.quit();
	}

}
