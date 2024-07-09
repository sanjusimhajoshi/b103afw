package day13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		int y=500;
		for(int i=1;i<=5;i++) {
			j.executeScript("window.scrollTo(0,"+y+")");//scroll down 5 times 500px 
			y=y+500;
			Thread.sleep(1000);
		}
		
		for(int i=1;i<=5;i++) {
			y-=500;
			j.executeScript("window.scrollTo(0,"+y+")");//scroll up 5 times 500px 
			Thread.sleep(1000);
		}
	}

}







