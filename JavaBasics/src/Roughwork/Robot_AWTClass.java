package Roughwork;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Robot_AWTClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\class room\\Downloads\\geckodriver.exe"); */
		WebDriver driver=new ChromeDriver();
		//Screen s=new Screen();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		//driver.get("http://classroom:90/qahrm/login.php");
		//driver.manage().window().maximize();
		// login 
		driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		driver.findElement(By.name("txtPassword")).sendKeys("lab1");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(3000);
		//enter the name of the employee.......
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Tungala");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mahesh");
		
		// click on browser button to upload a file....
		//Thread.sleep(2000);
		driver.findElement(By.id("photofile")).click();
		Robot rt=new Robot();
		StringSelection filepath=new StringSelection("C:\\Users\\TMPrasanth\\Pictures\\Screenpresso\\2019-01-29_18h56_22.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		rt.delay(1000);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.delay(1000);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	    rt.delay(1000);
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(3000);
		//swith back to the parent frame.......
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.close();
	}

}
