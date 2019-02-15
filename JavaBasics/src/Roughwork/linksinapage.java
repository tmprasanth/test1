package Roughwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksinapage 
{
	public int a;
	public static List<WebElement> c;
	static WebDriver driver =new ChromeDriver();
	
	public List<WebElement> link() throws InterruptedException
	{
		
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		c = driver.findElements(By.tagName("a"));
		System.out.println(c.size());
		return c;
	}
	public static void main(String[] args) throws InterruptedException 
	{
		int i=0;
		linksinapage nooflink=new linksinapage();
		nooflink.link();
		System.out.println(c.size());
		
		for(i=0;i<c.size();i++)
		{
			System.out.println(c.get(i).getText().toString());
		}
	
		driver.close();
	}

}
