package dayseven;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample {
public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("Submit")).click();
	 
		Thread.sleep(3000);
		//switch to the alert...
		Alert al = driver.switchTo().alert();
		
		//fetch the innertext of the alert
		String message = al.getText();
		System.out.println(message);
		
		//click the ok button
		al.accept();
		
		Thread.sleep(3000);
		//check if the focus is back to the application window..
	   System.out.println(driver.getCurrentUrl());	
		
	   Thread.sleep(3000);
	   driver.close();
		

	}

}
