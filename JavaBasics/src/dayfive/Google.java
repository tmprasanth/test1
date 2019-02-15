package dayfive;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		 //use the class attribute to enter some text
		//driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		
		//use linkText to click the gmail link
		//driver.findElement(By.linkText("Gmail")).click();
		
		//use the partialLinkText to click 
		//driver.findElement(By.partialLinkText("ma")).click();
		
		//fetch the number of links in the google homepage..
		int linkCount=driver.findElements(By.tagName("a")).size();
		System.out.println(" The number of links in google homepage are " + linkCount);
		driver.close();
	}

}
