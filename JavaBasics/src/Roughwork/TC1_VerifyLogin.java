package Roughwork;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC1_VerifyLogin 
{
	WebDriver Brow;
	WebDriverWait wait;
	@Before
	public void SetUp() {
		System.out.println("Executing the first test case!");
		Brow=new ChromeDriver();
		wait=new WebDriverWait(Brow, 30);
		Brow.manage().window().maximize();

	}
	@After
	public void Shutdown()
	{
		Brow.close();
		//Brow.quit();
	}
	@Test
	public void VerifyOrangeHRM()
	{
		Brow.get("http://apps.qaplanet.in/qahrm");
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Home Page displayed");
		}
		//create object for UN,PWD
		WebElement UN=Brow.findElement(By.name("txtUserName"));
		WebElement PWD=Brow.findElement(By.name("txtPassword"));
		//verify UN,PWD
		if(UN.isDisplayed()&&PWD.isDisplayed())
		{
			System.out.println("UN,PWD fields are displayed!");
		}
		//type UN,PWD
		String username="qaplanet1";
		UN.sendKeys(username);
		PWD.sendKeys("lab1");
		//click on Login
		Brow.findElement(By.name("Submit")).click();
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify home page
		if (Brow.getTitle().equals("OrangeHRM"))
		{
			System.out.println("OrangeHRM Page displayed");
		}
		//Get welcome Text
		String WelText=Brow.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
		//Verify welcome text
		if (WelText.equals("Welcome "+username))
		{
			System.out.println("Welcome "+username+" displayed");
		}
		//click on Logout
		Brow.findElement(By.linkText("Logout")).click();
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		if(Brow.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Signoff sucessfull and Home Page displayed");
		}
	}

}