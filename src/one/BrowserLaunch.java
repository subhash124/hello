package one;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
		
 System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
 
        //URL
 driver.navigate().to("https://www.gmail.com/");
       
       //click on Help
       driver.findElement(By.xpath("//*[text()='Help']")).click();
       
     //switch selenium focus on Help page
	Set<String> ref= driver.getWindowHandles();
       System.out.println(ref);
       
       Iterator<String> itr=  ref.iterator();
                 String one= itr.next();
                 String two= itr.next();
       
                 driver.switchTo().window(two);
                 
       //click on sign in
       driver.findElement(By.xpath("//*[text()='Sign in']")).click();        
         
   		
	}

}
