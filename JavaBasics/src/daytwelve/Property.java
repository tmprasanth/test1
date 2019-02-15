package daytwelve;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Property {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties obj = new Properties();
		
		
		obj.load(new FileInputStream("D:\\Selenium\\Training\\Day12\\pptblackboardprogramsjan30\\data.properties"));
		
		String UN=obj.getProperty("username");
		String Pwd=obj.getProperty("password");
	/*	System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\class room\\Downloads\\geckodriver.exe");  */
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys(UN);
		System.out.println(UN);
		driver.findElement(By.name("txtPassword")).sendKeys(Pwd);
		System.out.println(Pwd);
		driver.findElement(By.name("Submit")).click();
		
		//click the logout link...
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}

}
