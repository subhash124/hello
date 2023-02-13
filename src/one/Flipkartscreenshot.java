package one;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkartscreenshot 
{
	
	public static void main(String[] args) throws IOException 
	{
	
 System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\New folder\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 
	 
 driver.get("https://www.flipkart.com");
 
 
 
File z = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
File z1= new File("C:\\shailaja\\demo\\src\\file\\ddd\\img1.png");
 
 FileHandler.copy(z, z1);
 
 
  
	}
	
}




