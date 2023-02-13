package one;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_ {
	public static FileInputStream f1;
	public static void main(String[] args)throws EncryptedDocumentException, IOException
	{
		
		 WebDriverManager.chromedriver().setup();
 		 WebDriver driver=new ChromeDriver();
 		 driver.manage().window().maximize();

        driver.get("http://primusbank.qedgetech.com/");
        
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        
		 f1=new FileInputStream("C:\\shailaja\\Selenium Practice\\src\\one\\ExcelFolder\\New Microsoft Excel Worksheet.xlsx");
		 String f2 = WorkbookFactory.create(f1).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();		 
		 driver.findElement(By.name("txtuId")).sendKeys(f2);
	 
		 f1=new FileInputStream("C:\\shailaja\\Selenium Practice\\src\\one\\ExcelFolder\\New Microsoft Excel Worksheet.xlsx");
		 String v2 = WorkbookFactory.create(f1).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();		 
		 driver.findElement(By.name("txtPword")).sendKeys(v2);
	
	
	driver.findElement(By.xpath("//input[@id='login']")).click();
	

	}

}
