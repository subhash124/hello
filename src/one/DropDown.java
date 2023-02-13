package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{
	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 // url
		 driver.get("https://www.facebook.com/r.php?locale=en_GB");
		
		WebElement Day= driver.findElement(By.xpath("//*[@id='day']"));		
		Select sel=new Select(Day);
		sel.selectByIndex(03);
		Thread.sleep(1000);
		
		
	//	WebElement month=(driver.findElement(By.xpath("//*[@id='month']")));		
	//	Select sel1=new Select(month);
		Select sel1=new Select((driver.findElement(By.xpath("//*[@id='month']"))));
		sel1.selectByValue("5");
		Thread.sleep(1000);
		
	WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("2020");    
		
		
//		Select sel1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
//		sel1.selectByValue("5");
//		Thread.sleep(1000);
//		
//		WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
//		Select sel2=new Select(year);
//		sel2.selectByVisibleText("2020");
//		Thread.sleep(1000); 
//		
		
		/*driver.findElement(By.xpath("//*[text()='Female']")).click();
		
	boolean selected=driver.findElement(By.xpath("//*[text()='Female']")).isSelected();
		
	boolean enabled=driver.findElement(By.xpath("//*[text()='Messenger']")).isEnabled();
		
	 if(enabled==true)
	 {
		 System.out.println("Link is Available");
	 }
	 
	 else
	 {
		 System.out.println("Link is not Available");
		
	 }
		*/
		
		
	}

}
