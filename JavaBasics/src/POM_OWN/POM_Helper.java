package POM_OWN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class POM_Helper 
{
	static WebDriver driver;
	
	public static WebDriver browserstart(String Browsername,String url)
	{
		if(Browsername.equalsIgnoreCase("Firefox"))
				{
					driver=new FirefoxDriver();
				}
		else if(Browsername.equalsIgnoreCase("Chrome"))	
		{
			driver=new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	
}
