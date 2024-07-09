package day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		LoginPage loginPage=new LoginPage(driver);//FE
		loginPage.setUserName("abcd");
		loginPage.setPassword("xyz");
		loginPage.clickGoButton();//refresh
		
		//to avoid Stale Element exception we are creating new object 
		
		loginPage=new LoginPage(driver);//FE
		loginPage.setUserName("admin");//actions
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
		driver.quit();
		
		

	}

}
