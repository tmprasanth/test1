package Roughwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_TC1 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		
		driver=new ChromeDriver();
		POM_OR objrep=new POM_OR(driver);
		driver.get("http://apps.qaplanet.in/qahrm");
		objrep.UN.sendKeys("test1");
		objrep.PWD.sendKeys("passwordtest");
		Thread.sleep(5000);
	}

}
