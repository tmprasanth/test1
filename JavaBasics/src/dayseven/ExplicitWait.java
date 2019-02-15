package dayseven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    WebDriverWait myWait = new WebDriverWait(driver,10);
			
	    driver.get("http://apps.qaplanet.in/qahrm/login.php");
		Thread.sleep(20);
	    //wait until the username field becomes visible...
	  myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("txtUserName")));

		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		
		//wait until the submit button becomes clickable..
		myWait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("Logout")).click();
					
		driver.close();


	}

}
