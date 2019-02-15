package daysix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		//driver.manage().window().maximize(); // maximize the browser window.....
		
		Select drpCountry=new Select(driver.findElement
				(By.xpath("//select[@size='1']")));
		Thread.sleep(3000);
		
		//drpCountry.selectByVisibleText("ANTARCTICA");
		drpCountry.selectByIndex(6);
		Thread.sleep(3000);
		//drpCountry.deselectByVisibleText("ANTARCTICA");
	
		//drpCountry.selectByVisibleText("ANGOLA");
		drpCountry.selectByIndex(4);
		Thread.sleep(3000);
		//driver.navigate().refresh();
		driver.close();
		
	}
}
