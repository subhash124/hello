package one;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle_AnotherWindow 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.oyorooms.com/");
		
		String b = driver.getTitle();
		System.out.println(b);
		
		Thread.sleep(3000);
		
	WebElement c = driver.findElement(By.xpath("(//*[@class='footerDestinations__link'])[1]"));  
	String d = Keys.chord(Keys.CONTROL,Keys.ENTER);  
	c.sendKeys(d);
      
	Set<String> k = driver.getWindowHandles();
	Iterator<String> s = k.iterator();
	String one = s.next();
	String two = s.next();
    driver.switchTo().window(two);

String f = driver.getTitle();
System.out.println(f);

driver.switchTo().window(one);
String f1 = driver.getTitle();
System.out.println(f1);
	}

}
