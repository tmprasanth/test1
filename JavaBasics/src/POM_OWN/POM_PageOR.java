package POM_OWN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PageOR 
{
		/*public POM_PageOR(WebDriver ldriver)
		{
			PageFactory.initElements(ldriver, this);
		}*/
	
	/*@FIND if useinside a method orMain method thowing invalid location
		 *  to delcare error need to clarification*/
		
	/*//@CacheLookup used to reduce execution time,if element is frequently used then
		by using this notion this object defination will be stored in cache for quick
		usage for consequent calls*/
		
		@FindBy(name="txtUserName")
		@CacheLookup
		WebElement UN;
		
		@FindBy(name="txtPassword") 
		WebElement PWD;
		
	
		
}
