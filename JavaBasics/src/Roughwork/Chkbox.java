package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chkbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Selenium/Training/Day6/Checkbox.html");
		WebElement ele1= driver.findElement(By.xpath("//input[@name='vehicle1']"));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		ele1.click();
		System.out.println("ELement Status        :" + ele1.isSelected());
		Thread.sleep(2000);
		ele1.click();
		System.out.println("ELement Status        :" + ele1.isSelected());
		Thread.sleep(2000);
		ele1.click();
		System.out.println("ELement Status         :" + ele1.isSelected());
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
