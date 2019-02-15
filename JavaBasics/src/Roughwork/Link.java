package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		WebElement Webele=driver.findElement(By.linkText("Gmail"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		if (Webele.isEnabled())
		{
			System.out.println(driver.getCurrentUrl().toString());
			System.out.println("Link Enabled");
			Webele.click();
			System.out.println(driver.getCurrentUrl().toString());
			System.out.println(driver.getTitle().toString());
		}
		else
		{
			System.out.println("Link disabled");
		}
		driver.close();
	}

}
