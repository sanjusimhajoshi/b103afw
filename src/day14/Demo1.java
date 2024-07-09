package day14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://aksharatraining.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		for(int i=1;i<=5;i++) {
			actions.scrollByAmount(0, 500).perform();
			Thread.sleep(1000);
		}
		
		for(int i=1;i<=5;i++) {
			actions.scrollByAmount(0, -500).perform();
			Thread.sleep(1000);
		}
		
		driver.quit();
	}
}
