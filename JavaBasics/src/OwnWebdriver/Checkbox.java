package OwnWebdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
	
public static void main(String []args) throws InterruptedException{
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///D:/Mahesh/Mahesh/Checkbox.html");
	//driver.manage().window().maximize();
	WebElement chkBox=driver.findElement(By.name("vehicle1"));
	
	for(int i=1;i<3;i++){
		chkBox.click();
		System.out.println(chkBox.isSelected());
		Thread.sleep(2000);
	}
	driver.close();
}
}
