package one;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot 
{

	
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium support\\New folder (4)\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/channel/UCXJKOPxx4O1f63nnfsoiEug");
		
    File f = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File f1 =new File("C:\\shailaja\\Selenium Practice\\src\\one\\screenshot1\\img1.png");
    FileHandler.copy(f, f1);
	}
	
	
}
