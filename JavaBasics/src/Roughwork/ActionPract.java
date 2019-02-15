package Roughwork;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionPract 
{

	public static void main(String[] args) 
	{	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		WebElement sbox=driver.findElement(By.name("q"));
		
		Actions obj=new Actions(driver);
		/*Action obj1=obj.moveToElement(sbox).keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("elinium").sendKeys(Keys.ENTER).build();
		obj1.perform();*/
		
		
		
		Action obj2=obj.moveToElement(sbox).sendKeys("Selinium").build();
		obj2.perform();
		
		Action obj3=obj.moveToElement(sbox).sendKeys(Keys.ENTER).build();
		obj3.perform();
		
		

	}

}
