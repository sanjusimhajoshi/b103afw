package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
/* cssSelector syntax : tag[AN='AV']
 * is it case sensitive? Yes
 * can i use double quote? Yes
 * in Browser--> a[id='a1']  a[id="a1"]
 * in selenium (eclipse) --> "a[id='a1']"    , "a[id=\"a1\"]"
 * 
 */
	public static void goBack(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///Users/ssimha/Documents/B-103/Html%20files/sample2.html");
		
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("a#a1")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("#a1")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("a[class='c1']")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector("a.c1")).click();
		
		goBack(driver);
		
		driver.findElement(By.cssSelector(".c1")).click();
		
		driver.quit();
	}
	
}
