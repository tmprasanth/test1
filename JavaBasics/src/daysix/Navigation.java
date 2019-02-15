package daysix;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//maximize the window...
		driver.manage().window().maximize();
		
		//navigate to google.com..
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		//click on the gmail link
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(3000);
		//click the back button...
		driver.navigate().back();
		
		Thread.sleep(3000);
		//click the forward button..
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//click the refresh 
		driver.navigate().refresh();
		
		//get the current url...
		String url = driver.getCurrentUrl();
		
		Thread.sleep(3000);
		System.out.println("The currently opened page is " + url);
		
		Thread.sleep(3000);
		//close the browser
		driver.close();
	}

}
