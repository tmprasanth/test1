package dayseven;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sleep {
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();

	}

}
