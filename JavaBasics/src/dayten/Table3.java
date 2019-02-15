package dayten;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Table3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\class room\\Downloads\\geckodriver.exe");*/
		WebDriver driver=new ChromeDriver();

		//WebDriver driver=new FirefoxDriver();
		driver.get("D:\\Mahesh\\QAPlanet.html");
		//driver.manage().window().maximize();
		
		int rowcount = driver.findElements(By.xpath("//*[@id='Table1']/tbody/tr")).size();
		
		int colcount =driver.findElements(By.xpath("//*[@id='Table1']/thead/tr/td")).size();
		
		System.out.println("The number of rows :"+rowcount);
		System.out.println("The number of columns :"+colcount);
		
		//put all the table cells into a collection....
		List<WebElement> e = driver.findElements(By.xpath("//*[@id='Table1']/tbody/tr/td"));
		System.out.println("The number of cells in the table are "+ e.size());
		
		List<WebElement> rows=driver.findElements(By.xpath
				("//*[@id='Table1']/tbody/tr"));
		//create an Iterator interface on the list.....
		Iterator itr = rows.iterator();
		//String arr[]=new String[elements.size()];
		while(itr.hasNext()){
			WebElement s =(WebElement) itr.next();
			System.out.println(s.getText());
			//print a newline and print the next value in this new line....
			//System.out.println();
		}
		driver.close();
		}
}

	


