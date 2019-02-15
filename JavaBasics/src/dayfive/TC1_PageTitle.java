package dayfive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_PageTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		/*String expTitle="Google";
		String actTitle=driver.getTitle();
		if(actTitle.equals(expTitle)) {*/
		if(driver.getTitle().equals("Google")) {
			System.out.println("Titles matching, TC Passed!");
		}else {
			System.out.println("Titles do not match, TC Failed!");
		}
		driver.close();
	}

}
