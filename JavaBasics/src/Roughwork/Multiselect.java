package Roughwork;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://Selenium/Training/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		//Select class//
		Select fruits=new Select(driver.findElement(By.id("fruits")));
		fruits.selectByIndex(0);
		/*System.out.println(fruits.getFirstSelectedOption().getText());*/
		fruits.selectByIndex(1);
		fruits.selectByIndex(2);
		
		// Retrieves all the selected the options in the combobox //
		ArrayList<WebElement> multsel=(ArrayList<WebElement>) fruits.getAllSelectedOptions();
		
		for(int i = 0;i< multsel.size();i++)
		{
			System.out.println(multsel.get(i).getText());
		}
		
		
	
		driver.close();

	}

}
