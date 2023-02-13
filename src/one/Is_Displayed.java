package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //url
		 driver.get("https://www.facebook.com/r.php?locale=en_GB");
		 Thread.sleep(3000);
   
		 //DISPLAY LOGO
		 
	boolean display=driver.findElement(By.xpath("//*[@alt='Facebook']")).isDisplayed();
		 
		 if(display==true)
		 {
			 System.out.println("Logo is displayed");
		 }
		 
		 else
		 {
			 System.out.println("Logo is not Available");
			
		 }
		 
		 
		 //ENABLE LINK...?
		 
	boolean enable=driver.findElement(By.xpath("//*[@class='_9bq5']")).isEnabled();
	 if(enable==false)
	 {
		 System.out.println("Link is Available");
	 }
	 
	 else
	 {
		 System.out.println("Link is not Available");
		
	 }
	 
	 
	 //SELECTED....?
		 
	driver.findElement(By.xpath("(//*[@name='sex'])[1]")).click();
	
	boolean selected=driver.findElement(By.xpath("(//*[@name='sex'])[1]")).isSelected(); 
	
	 if(selected==true)
	 {
		 System.out.println(" is selected ");
	 }
	 
	 else
	 {
		 System.out.println(" is  not selected ");
		
	 }
	
	}

}
