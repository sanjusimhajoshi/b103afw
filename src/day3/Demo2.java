package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		
		String htmlCode = driver.getPageSource();
		System.out.println(htmlCode);
		
		driver.quit();
	}

}
