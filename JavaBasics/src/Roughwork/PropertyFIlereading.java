package Roughwork;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PropertyFIlereading {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties obj=new Properties();
		FileInputStream FIN=new FileInputStream("D:\\Selenium\\Training\\Day12\\pptblackboardprogramsjan30\\data.properties");
		
		obj.load(FIN);
		String UN=obj.getProperty("username");
		String PWD=obj.getProperty("password");

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm");
		driver.findElement(By.name("txtUserName")).sendKeys(UN);
		System.out.println(UN);
		driver.findElement(By.name("txtPassword")).sendKeys(PWD);
		System.out.println(PWD);
		driver.findElement(By.name("Submit")).click();
		
		//click the logout link...
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}

}
