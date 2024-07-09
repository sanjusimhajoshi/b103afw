package day23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Sample8Page
{
	@FindBy(id="A8")
	private WebElement submitBTN;
	
	private WebDriver driver;
	
	Sample8Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	void click_submit()
	{
		submitBTN.click();
	}
	
	void handle_alert()
	{
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample8.html");
		
		Sample8Page s=new Sample8Page(driver);
		s.click_submit();
		s.handle_alert();
		
		driver.quit();
		

	}

}
