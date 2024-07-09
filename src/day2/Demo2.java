package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		ChromeDriver driver=new ChromeDriver();
		
		//enter the url in the address bar & get response
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		
		//close the browser
		driver.close();

	}

}
