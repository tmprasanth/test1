package daysix;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		Select fruits=new Select(driver.findElement(By.id("fruits"))); // combo box.....
		//selecting multiple items from the combo box....
			
		fruits.selectByVisibleText("Banana");//selectByIndex(0).....
		Thread.sleep(3000);
		fruits.selectByIndex(1);  //selects apple...
		Thread.sleep(3000);
		//fruits.deselectByVisibleText("Banana");
		String text=fruits.getFirstSelectedOption().getText();
	    System.out.println("The first selected option is :"+ text);
		//deselect the value banana......
		fruits.deselectByVisibleText("Banana"); 
		Thread.sleep(3000);
		//get the url of the current page......
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		driver.close();
		
	}

}
