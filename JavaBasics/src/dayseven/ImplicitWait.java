package dayseven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait {
public static void main(String[] args) {
           ChromeDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
    driver.get("http://apps.qaplanet.in/qahrm/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
				
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.linkText("Logout")).click();
				
	driver.close();

	}

}
