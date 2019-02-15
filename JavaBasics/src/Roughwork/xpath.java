package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		///driver.findElement(By.xpath("//div[@id='gb']/div/div[2]/div[2]/div/a")).click();
		//driver.findElement(By.xpath("//div[@id='gbwa']/div/a")).click();
		driver.findElement(By.linkText("Google Search")).click();
		
	}

}
