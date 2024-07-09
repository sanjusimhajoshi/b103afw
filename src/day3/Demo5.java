package day3;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://aksharatraining.com");
		Thread.sleep(3000);
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		System.out.println(d.width);
		System.out.println(d.height);

		Dimension newSize=new Dimension(1300, 900);
		driver.manage().window().setSize(newSize);
		Thread.sleep(4000);
		driver.quit();
	}

}
