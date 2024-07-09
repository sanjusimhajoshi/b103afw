package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class LoginPage
{
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement goBTN;
	
	LoginPage(WebDriver driver)
	{
		unTB=driver.findElement(By.name("username"));
		pwTB=driver.findElement(By.name("password"));
		goBTN=driver.findElement(By.xpath("//button[text()='Go']"));
	}
	
	void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	void clickGoButton()
	{
		goBTN.click();
	}
}
public class Demo4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName("admin");
		loginPage.setPassword("pointofsale");
		loginPage.clickGoButton();
		
		
	
	}

}
