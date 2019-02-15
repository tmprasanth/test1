package Roughwork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	Select drpdown=new Select(driver.findElement(By.name("country")));
	drpdown.selectByIndex(10);
	System.out.println(drpdown.getFirstSelectedOption().getText());
	drpdown.selectByVisibleText("ZAIRE");
	System.out.println(drpdown.getFirstSelectedOption().getText());
	driver.close();
		

	}

}
