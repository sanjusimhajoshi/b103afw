package day22b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
class E
{
	@FindBy(name="username")
	private WebElement unTB;
	
	
	void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
}
public class Demo12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://pos.aksharatraining.in/pos/public/");
		E e1=new E();
		PageFactory.initElements(driver,e1);
		e1.setUserName("bhanu");
	}

}
