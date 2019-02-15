package daysix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//fetch the inner text of the button GoogleSearch
		String buttonText=driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("The label on the search button is "+buttonText);
		
		//fetch the tooltip for the Search box....
		String tooltip= driver.findElement(By.name("q")).getAttribute("title");
		System.out.println("The tooltip of the Search box is :"+ tooltip);
		
		//fetch the tooltip for the Googleapps link....
		String tooltip1=driver.findElement(By.className("gb_b")).getAttribute("title");
		System.out.println("The tooltip of the GoogleApps is :" + tooltip1);
		driver.close();
	}

}
