package one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_Window
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.com/");
        
     WebElement a = driver.findElement(By.xpath("(//*[@class='navFooterLinkCol navAccessibility'])[1]"));
     List<WebElement> b = a.findElements(By.tagName("a"));
   int c = b.size();
   System.out.println(c);
   
   for(int i=0;i<=c-1;i++)
   {
	  String d = Keys.chord(Keys.CONTROL,Keys.ENTER);
	  b.get(i).sendKeys(d);
   }
   
   
	}

}
