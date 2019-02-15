package daysix;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Mahesh/Mahesh/cssform.html");
		
		//use css to enter username password and click login 
		driver.findElement(By.cssSelector("input.required")).sendKeys("mahesh");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class=passfield]")).sendKeys("mahesh");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input:nth-child(3)")).click();
		
		
		
	}

}
