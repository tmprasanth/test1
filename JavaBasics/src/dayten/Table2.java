package dayten;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Table2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\class room\\Downloads\\geckodriver.exe");*/
    WebDriver driver = new ChromeDriver();
	driver.get("http://apps.qaplanet.in/qahrm");
	//driver.manage().window().maximize();
	
	//login to qaplanet......
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
	
	//switch to the frame...
	driver.switchTo().frame("rightMenu");
	
	//get the row count of the table ....
	int rowCount=driver.findElements(By.xpath("//*[@id='standardView']/table/tbody/tr")).size();
	System.out.println("The number of rows in the emp table are :"+rowCount);
	
	//get the column count of the table....
	int colCount=driver.findElements(By.xpath("//*[@id='standardView']/table/thead/tr/td")).size();
	System.out.println("The number of columns in the emp table are :"+colCount);
	
	ArrayList<WebElement> rows=(ArrayList<WebElement>)driver.
			findElements(By.xpath("//*[@id='standardView']/table/tbody/tr"));
	Iterator ir=rows.iterator();
	while(ir.hasNext()){
		WebElement we=((WebElement)ir.next());
		System.out.println(we.getText());
	}
	
/*	String[] linktxt=new String[rows.size()];
	int i=0;
	for(WebElement e:rows){
		linktxt[i]=e.getText();
		System.out.println(linktxt[i]);
		}*/
	
	driver.close();
	}
	 		
}

