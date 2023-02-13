package one;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 
		 driver.switchTo().frame(0);
		WebElement f = driver.findElement(By.id("draggable"));
		
		WebElement f1 = driver.findElement(By.id("droppable"));
		
		Actions act =new Actions(driver);
		
		act.clickAndHold(f).moveToElement(f1).release().build().perform();
		 
	}

}
