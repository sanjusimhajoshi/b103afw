package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		//enter the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//enter un
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//enter pw
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//click login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//verify that home page is displayed
		Thread.sleep(5000);
		//expected value
		String exepctedURL="dashboard";
		System.out.println("Expected URL is:"+exepctedURL);
		
		//actual value
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL is:"+actualURL);
		
		//status
		if(actualURL.contains(exepctedURL))
		{
			System.out.println("PASS: Home page is displayed");
		}
		else
		{
			System.out.println("FAIL:Home page is NOT displayed");
		}
		driver.quit();
	}

}
