package day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo11 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");
		

	}

}
