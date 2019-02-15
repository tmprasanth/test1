package dayfive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//enter email id...
		//driver.findElement(By.id("email")).sendKeys("maheshtungala");
		//use the name attribute
		driver.findElement(By.name("email")).sendKeys("maheshtungala");

	}

}
