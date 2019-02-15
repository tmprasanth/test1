package daytwelve;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescendantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/QAPlanet.html");
		//fetch the S.No for the course Selenium...
		String Slno=driver.findElement(By.xpath("//table[@id='Table1']"
				+ "/descendant::td[contains(text(),'Selenium')]"
				+ "/preceding-sibling::td[1]")).getText();
		System.out.println("The S.No of Selenium course is "+ Slno);
		
		//fetch the instructor for the Selenium course...
		String Instructor = driver.findElement(By.xpath("//table"
				+ "[@id='Table1']/descendant::td[contains(text(),"
				+ "'Selenium')]/following-sibling::td[1]")).getText();
		System.out.println("The instructor for the Selenium course is "+Instructor);
		
		driver.close();
	}

}
