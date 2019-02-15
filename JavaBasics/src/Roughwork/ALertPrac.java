package Roughwork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALertPrac {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.manage().window().maximize();
		driver.findElement(By.name("Submit")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		/*driver.quit();*/
		
		

	}

}
