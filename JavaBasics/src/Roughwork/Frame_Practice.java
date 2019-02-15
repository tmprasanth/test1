package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		
		//click on the ADD button by switching on to the frame.......
		String firstName ="Mahesh";
		String lastName  ="Tungala";
		
		//Switch to frame
		driver.switchTo().frame("rightMenu");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='rightMenu']")));
		
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();

	}

}
