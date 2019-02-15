package OwnWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wdone 
{
	
	

	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://gmail.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("identifier")).sendKeys("tmprasanth");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("gmail26082016");
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
	//driver.findElement(By.xpath("//div[@id=':10o']/div/div")).click();
	
	//driver.findElement(By.xpath("//*[@id=\":10o\"]/div/div")).click();
		
		
		
	}

}
