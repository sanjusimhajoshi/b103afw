package day22b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
class D
{
	@FindBy(name="username")
	private WebElement unTB;
	
	void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
}
// When we do not initialize POM or if we do not add PageFactory.initElements --> we get null pointer exception 
public class Demo11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		D d1=new D();
		d1.setUserName("bhanu");
	}

}
