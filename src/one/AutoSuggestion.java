package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("kapil");
			Thread.sleep(5000);
		
         List<WebElement> list = driver.findElements(By.xpath("//*[@class='G43f7e']/li"));
         
         for(WebElement a:list)
         {
        	 System.out.println(a.getText());
        	 
        	 if(a.getText().equalsIgnoreCase("Kapil Sharma"))
        	 {
        		 a.click();
        		 break;
        	 }
         }
	}

}
