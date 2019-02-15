package daysix;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///D:/Selenium/Training/Day6/QAPlanet.html");
    
		//get the 2nd row 2nd col element 
	/*	String text = driver.findElement(By.xpath
				("//html/body/table/tbody/tr[2]/td[2]")).getText();*/
		
	/*	String text = driver.findElement(By.xpath
				("//table/tbody/tr[2]/td[2]")).getText();  */
		
		String text = driver.findElement(By.xpath("//*[@id='Table1']/tbody/tr[2]/td[2]")).getText();
        System.out.println(text);
        
        driver.close();
	}

}
