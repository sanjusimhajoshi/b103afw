package day29;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dstFile =new File("./target/google.png");
		FileUtils.copyFile(srcFile, dstFile);
		driver.quit();
		
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./target/myreport.html");
		extent.attachReporter(spark);
		
		ExtentTest test1 = extent.createTest("ValidLogin");
		test1.info("enter the url");
		test1.addScreenCaptureFromPath("./google.png", "Google");
	
		
		
		extent.flush();
		
	}

}
