package day28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/POS.xlsx"));
		Sheet loginSheet=wb.getSheet("login");
		String un=loginSheet.getRow(1).getCell(0).getStringCellValue();
		String pw=loginSheet.getRow(1).getCell(1).getStringCellValue();	
		String eURL=loginSheet.getRow(1).getCell(2).getStringCellValue();	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pos.aksharatraining.in/pos/public/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("login-button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		try 
		{
				wait.until(ExpectedConditions.urlContains(eURL));
				loginSheet.getRow(1).getCell(4).setCellValue("PASS");
		}
		catch (Exception e) 
		{
			
				loginSheet.getRow(1).getCell(4).setCellValue("FAIL");
		}
		String aURL=driver.getCurrentUrl();
		loginSheet.getRow(1).getCell(3).setCellValue(aURL);
		wb.write(new FileOutputStream("./data/POS_RES.xlsx"));
		wb.close();
		driver.quit();
	}

}
