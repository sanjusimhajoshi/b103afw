package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo7 {
//NSEE
/*Solutions
 * 1. implicitlyWait
 * 2. explicit wait
 * 3. Thread.sleep(n);
 * 4. FluentWait
 * 5. custom wait
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		for(int i=1;i<=100;i++)
		{
			try 
			{
				driver.findElement(By.name("username")).sendKeys("Admin");
				System.out.println("element is present:"+i);
				break;
			}
			catch (NoSuchElementException e) 
			{
				System.out.println("element is NOT present:"+i);
			}
		
		}
	}

}
