package Roughwork;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionPracttwo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		
		WebElement drp1=driver.findElement(By.xpath("//div[@id='top-menu']/ul/li[4]/a/span"));
		WebElement drp2=driver.findElement(By.xpath("//div[@id='top-menu']/ul/li[4]/ul/li/a/span"));
		WebElement drp3=driver.findElement(By.xpath("//div[@id='top-menu']/ul/li[4]/ul/li/ul/li/a/span"));
		Actions obj=new Actions(driver);
		Action obj2=obj.moveToElement(drp1).moveToElement(drp2).moveToElement(drp3).click().build();
		obj2.perform();
		
		
		
		
		/*driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		
		//click on the ADD button by switching on to the frame.......
		String firstName ="Mahesh";
		String lastName  ="Tungala";
		
		//Switch to frame
		driver.switchTo().frame("rightMenu");
		
	*/		
	}

}
