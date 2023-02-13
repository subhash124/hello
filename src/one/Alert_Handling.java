package one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\New folder\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	      driver.get("https://demoqa.com/alerts");
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	//       driver.findElement(By.id("confirmButton")).click();
	      
	         WebElement ref = driver.findElement(By.id("confirmButton"));
	      JavascriptExecutor executor = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", ref);
	    
	      Alert ss=driver.switchTo().alert();
	              Thread.sleep(3000);
	            ss.accept();
	              Thread.sleep(3000);
	              
	           // driver.findElement(By.id("promtButton")).click();
	              
	      WebElement ref1 = driver.findElement(By.id("promtButton"));
	      JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	      executor.executeScript("arguments[0].click();", ref1);
	               
	            Thread.sleep(3000);
	          System.out.println(ss.getText());
	              
	           ss.sendKeys("Shailaja");
	            Thread.sleep(3000);
	           ss.accept();
	            Thread.sleep(3000);
	            
	            driver.close();             
	            
	            
	}

}


//COMMANDS FOR ALERT HANDLING

//driver.switchTo().alert();
//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
//driver.switchTo().alert().getText();
//driver.switchTo().alert().sendKeys("Text");






