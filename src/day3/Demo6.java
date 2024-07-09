package day3;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://aksharatraining.com");
		Thread.sleep(3000);
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		System.out.println(p.x);
		System.out.println(p.y);
		
		int x=50;
		int y=50;
		for(int i=1;i<=10;i++) {
			Point p2=new Point(x,y);
			driver.manage().window().setPosition(p2);
			x+=50;
			y+=50;
			Thread.sleep(1000);
		}
		
		for(int i=1;i<=10;i++) {
			Point p2=new Point(x,y);
			driver.manage().window().setPosition(p2);
			x+=50;
			y-=50;
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
