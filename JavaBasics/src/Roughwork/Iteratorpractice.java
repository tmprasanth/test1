package Roughwork;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iteratorpractice 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/Training/Day6/cssform.html");
		ArrayList<WebElement> al=(ArrayList<WebElement>) driver.findElements(By.tagName("input"));

		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			WebElement W=(WebElement)itr.next();
			System.out.println((WebElement)W);
			W.sendKeys("Hello");
			driver.close();
			
		}
		

	}

}
