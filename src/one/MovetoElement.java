package one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		driver.findElement(By.id("login_Layer")).click();
		
		driver.findElement(By.id("usernameField")).sendKeys("shailaja2595@gmail.com");
		
		driver.findElement(By.id("passwordField")).sendKeys("Shailaja@2595");

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
	
	
		Actions ac=new Actions(driver);
		WebElement x = driver.findElement(By.xpath("//div[text()='Jobs']"));
		//ac.moveToElement(x).build().perform();
		
		ac.moveToElement(driver.findElement(By.xpath("//div[text()='Jobs']"))).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Application status']")).click();
		
	
       
	}

}
