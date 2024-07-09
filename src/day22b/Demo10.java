package day22b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		LoginPage loginPage=new LoginPage(driver);//FE
		loginPage.setUserName("abcd");
		loginPage.setPassword("xyz");
		loginPage.clickGoButton();//refresh
		loginPage.setUserName("admin");//actions
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
		
		driver.quit();
		
		

	}

}
