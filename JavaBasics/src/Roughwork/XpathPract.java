package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathPract 
{

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/qahrm/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
	
	///Menu Click //
	/*Thread.sleep(2000);*/
	 Actions act=new Actions(driver);
	 
	driver.findElement(By.xpath("//li[@id='benefits']/ul/li[2]/ul/li[2]/a/span")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//ul[@id=\"option-menu\"]/li[3]/a")).click();
	/*driver.close();*/

	}

}
