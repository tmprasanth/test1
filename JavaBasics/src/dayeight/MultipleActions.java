package dayeight;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class MultipleActions {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "https://www.google.co.in";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		Thread.sleep(5000);
        WebElement sbox=driver.findElement(By.name("q"));
       
        //create an object for the actions class...
        Actions obj=new Actions(driver);
        //Enters the text Selenium in upper case by pressing the shift + entering the text + 
        //releasing the Shift key and then clicking on the enter key... 
       
        Action obj1= obj.moveToElement(sbox).keyDown(Keys.SHIFT).sendKeys("s").
        keyUp(Keys.SHIFT).sendKeys("elenium").sendKeys(Keys.ENTER).build();
        Thread.sleep(2000);
        //perform the above actions........
        obj1.perform();
        
        //act1.perform();
        
        driver.close();//closes the browser.....
     
	}
}

