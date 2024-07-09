package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement unTB = driver.findElement(By.name("username"));
		int x_un = unTB.getLocation().getX();
		System.out.println(x_un);
		
		int y_un = unTB.getLocation().getY();
		System.out.println(y_un);
		
		WebElement pwTB = driver.findElement(By.name("password"));
		
		int x_pw = pwTB.getLocation().getX();
		System.out.println(x_pw);
		
		int y_pw = pwTB.getLocation().getY();
		System.out.println(y_pw);
		
		if(x_un==x_pw)
		{
			System.out.println("Pass: UN & PW are aligned");
		}
		else
		{
			System.out.println("Fail: UN & PW are NOT aligned");
		}
		
		if(y_un<y_pw)
		{
			System.out.println("Pass: Un is above Pwd");
		}
		else
		{
			System.out.println("Fail: Un is Not above Pwd");
		}
		driver.quit();
		
	
	}

}
