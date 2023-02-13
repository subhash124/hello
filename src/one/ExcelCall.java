package one;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelCall {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		 String y = Excel.tc(0,0);
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(y);
		 
		 String y1 = Excel.tc(0,2);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(y1);
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 
	}

}
