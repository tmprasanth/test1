package daysix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/qahrm");
		//create a webelement for the username field...
		WebElement UN=driver.findElement(By.name("txtUserName"));
		//check if username field is displayed or not..
		if(UN.isDisplayed()) {
			System.out.println("The username field is displayed!");
		}else {
			System.out.println("The username field is not displayed!");
		}
		//enter text into the username field
		//driver.findElement(By.name("txtUserName")).sendKeys("wer23");
		UN.sendKeys("werwer");
		Thread.sleep(3000);
		//driver.findElement(By.name("txtUserName")).clear();
		UN.clear();
		Thread.sleep(3000);
		//driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		UN.sendKeys("qaplanet1");
		

	}

}
