package Roughwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String temp="";
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.navigate().to("https://google.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		temp=driver.getCurrentUrl();
		
				

	}

}
