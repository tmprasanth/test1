package OwnWebdriver;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php");
		//create a collection and fetch all the elements in the combo box into it...
		//casting each element to WebElement...
	    ArrayList<WebElement> countries = (ArrayList<WebElement>) driver.findElements(By.xpath("//select[@size='1']"));
	    
	   //create the iterator for the above list...
	/* Iterator itr=countries.iterator();
	    while(itr.hasNext()){
	    	WebElement w=((WebElement)itr.next());//casting
	    	System.out.println(w.getText());
	       	} */
	    //Using a String array.....print the elements...
	    
 String[] test = new String[countries.size()];
        int i=0;
        for(WebElement e :  countries)
        {
        	test[i] = e.getText();
            System.out.println(test[i]);

        } 
        driver.close();
	}

}
