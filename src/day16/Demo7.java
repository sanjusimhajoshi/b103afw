package day16;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
		String w = driver.getWindowHandle();
		System.out.println();
		Set<String> a = driver.getWindowHandles();
		System.out.println(a);
		driver.quit();
		

	}

}
