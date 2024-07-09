package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Page Object Model class--> POM class
class C
{
	@FindBy(name="username")
	private WebElement unTB;
	
	C(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	void setUserName()
	{
		unTB.sendKeys("admin");
	}
}
public class Demo9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		C c1=new C(driver);
		c1.setUserName();

	}

}
