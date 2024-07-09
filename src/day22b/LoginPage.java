package day22b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM Class
public class LoginPage //page class
{
	@FindBy(name="username")
	private WebElement unTB;
	
	@FindBy(name="password")
	private WebElement pwTB;
	
	@FindBy(xpath = "//button[text()='Go']")
	private WebElement goBTN;
	
	LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
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