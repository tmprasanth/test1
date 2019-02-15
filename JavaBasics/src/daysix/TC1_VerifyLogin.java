package daysix;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC1_VerifyLogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
        
		//login
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//verify page title...
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Login successful, TC passed");
		}else {
			System.out.println("Login failed, TC failed!");
		}
		
		//click the logout link
		driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a\r\n" + 				"")).click();
		
		//close the browser...
		driver.close();
	}

}
