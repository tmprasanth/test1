package POM_OWN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Verifylogin
{
	@Test
	public void loginuser()
	{
		//To Launch specific Browser&URL
		WebDriver driver=POM_Helper.browserstart("chrome","http://apps.qaplanet.in/qahrm");
		
		//To create page object using pagefactory
		//Syntax of PageFactory.initElements(driver, page); i.e we have to pass the
		//driver on which we have to test and page i.e  object repository created 
		//for page specific if any testcase required multiple pages need to create multiple
		//pagefactory objectes--->Note:To convert the code to Byte code need to use .Class 
		//i.e. POM_PageOR.class
		
		POM_PageOR Loginpage_POM=PageFactory.initElements(driver, POM_PageOR.class);
		
		Loginpage_POM.PWD.sendKeys("testuser");
		Loginpage_POM.UN.sendKeys("testpassword");
	}
	
	
	
	
}
