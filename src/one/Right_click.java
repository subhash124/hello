package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action=new Actions(driver);
		
	WebElement right = driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
	action.contextClick(right).build().perform();
	
	 WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
	 
	String z = copy.getText();
	System.out.println(z);
	
	copy.click();
	

	}

}
