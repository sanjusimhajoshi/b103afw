package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class B
{
	private WebElement unTB;
	
	B(WebDriver driver)
	{
		unTB=driver.findElement(By.name("username"));
	}
	
	void setUserName()
	{
		unTB.sendKeys("admin");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		B b1=new B(driver);
		b1.setUserName();
		
		
	
	}

}
