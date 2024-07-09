package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("abcd");
		loginPage.setPassword("xyz");
		loginPage.clickGoButton();
		
		loginPage.setUserName("admin");
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
		
		

	}

}
