package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

//home work: verify that both un & pw size is same
public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement unTB = driver.findElement(By.name("username"));
		
		int  h=unTB.getSize().getHeight();
		System.out.println(h);
		
		int  w=unTB.getSize().getWidth();
		System.out.println(w);
		
		Rectangle rect = unTB.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		driver.quit();
		
	
	}

}
