package Roughwork;





import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.parser.ParseException;

public class DynamicTable {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
	
	  wd= new ChromeDriver();
        wd.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
       // List  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        ArrayList<WebElement> multsel=(ArrayList<WebElement>) wd.findElements(By.xpath("div//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        
        System.out.println("No of cols are : " +multsel.size()); 
        //No.of rows 
        List  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        wd.close();
    }
}