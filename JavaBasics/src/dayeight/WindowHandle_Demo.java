package dayeight;
import java.util.*;	
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\class room\\Downloads\\geckodriver.exe"); */
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		
        //Launching the site.				
        driver.get("http://demo.guru99.com/popup.php");	        
        
        String MainWindow=driver.getWindowHandle();//will fetch the handle of the parent window..
        //System.out.println(MainWindow);
        
        //click on the link to open the new window....child window...        
        driver.findElement(By.linkText("Click Here")).click();
        //opens a new window .....which should be closed to return back to the main window....
        Thread.sleep(2000);
     // To handle all new opened windows.				
        Set<String> s1= driver.getWindowHandles();
        
        Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);		
                                                                                     
                                                                                         
                    driver.findElement(By.name("emailid")).sendKeys("maheshtungala@gmail.com");			
                                       
                   driver.findElement(By.name("btnLogin")).click();			
                             
		// Closing the Child Window.
                    driver.close();		
        }		
    }		
    // Switching to Parent window i.e Main Window.
       driver.switchTo().window(MainWindow);
       Thread.sleep(3000);
       //driver.close();  
    driver.findElement(By.linkText("Click Here")).click();
    Thread.sleep(3000);
      driver.quit();  
  }
}
