package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	int row = driver.findElements(By.xpath("//*[@id=\"customers\"]//tr")).size();
	int clm = driver.findElements(By.xpath("//*[@id=\"customers\"]//th")).size();
	for(int i=1; i<row; i++)
	{
		for(int j=1; j<=clm; j++) 
		{
			String actual = driver.findElement(By.xpath("//*[@id=\\\"customers\\\"]//tr["+(i+1)+"]/td["+j+"]")).getText();
      if(actual.equals("Laughing Bacchus Winecellars"))
{

	System.out.println("i"+i+","+"j"+j);
	break;
}
		}
	}
		
	
	}

}
