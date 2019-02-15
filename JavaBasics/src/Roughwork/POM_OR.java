package Roughwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_OR 
{
		public POM_OR(WebDriver ldriver)
		{
			PageFactory.initElements(ldriver, this);
		}
	
	/*@FIND if useinside a method orMain method thowing invalid location
		 *  to delcare error need to clarification*/
	
		@FindBy(name="txtUserName")
		WebElement UN;
		
		@FindBy(name="txtPassword") 
		WebElement PWD;
		
			
		
}
