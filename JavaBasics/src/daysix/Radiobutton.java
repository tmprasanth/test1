package daysix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//login 
		driver.findElement(By.name("userName")).sendKeys("mahesh");
		driver.findElement(By.name("password")).sendKeys("mahesh");
		driver.findElement(By.name("login")).click();
		
		//create a webelement for the radiobutton oneway
		WebElement rb = driver.findElement(By.xpath("//input[@value='oneway']"));
		rb.click();
		if(rb.isSelected()) {
			System.out.println("the radio button oneway is selected!");
		}else {
			System.out.println("the radio button cannot be identified/selected");
		}
		//driver.close();

	}

}
