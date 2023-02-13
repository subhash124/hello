package three;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));   //collect all the links present on a web page based on the in <a>tag
	    System.out.println("size"+"--->"+links.size());
	
	for(WebElement e:links)
	{
	String x = e.getAttribute("href");
	check(x);
	}

	}

	public static void check(String z) 
	{
		try
		{
			URL a=new URL(z);
			HttpURLConnection c=(HttpURLConnection) a.openConnection();     //send http request for each link
			c.setConnectTimeout(5000);
			c.connect();
		
		if(c.getResponseCode()>=400)                                                            //verify the http response code
		{
			System.out.println(z+"--->"+c.getResponseMessage()+ "  "+ "this is a broken link");       //determine if the link is valid or broken based on the http response code
		}

		else
		{
			System.out.println(z+"--->"+c.getResponseMessage());           //repeat the process for all links captured with the first step
		}
		
		}
		
		catch (Exception e)
		{
			
		}
	}
}


