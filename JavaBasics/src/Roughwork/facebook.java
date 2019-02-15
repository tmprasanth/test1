package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("tmprasanth@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("adsfsf");
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();

			
	/*	Actions ToolTip1 = new Actions(driver);
	    WebElement passfld = driver.findElement(By.name("pass"));

	    Thread.sleep(2000);

	    ToolTip1.clickAndHold(passfld).build().perform();*/
	    WebElement temp= driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
	    System.out.println(temp.getText());
	}

}
