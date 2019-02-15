package daysix;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_VerifyLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
        
		//login
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("qaplanet1");
		driver.findElement(By.cssSelector("input[name=txtPassword]")).sendKeys("lab1");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		//verify page title...
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Login successful, TC passed");
		}else {
			System.out.println("Login failed, TC failed!");
		}
		
		//click the logout link
		driver.findElement(By.cssSelector("ul[id=option-menu]>li:nth-child(3)>a")).click();
		
		//close the browser...
		driver.close();

	}

}
