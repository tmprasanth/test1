package daynine;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC2_AssertExample {
	WebDriver driver;
	WebDriverWait wait;
	@Before
	public void SetUp()
	{
      System.out.println("Executing the second test case!");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
	}
	
	@After
	public void Shutdown()
	{
		driver.close();
		driver.quit();
	}
	
	@Test
	public void Assert_OrangeHRM()
	{
		driver.get("http:apps.qaplanet.in/qahrm/login.php");
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		Assert.assertEquals("OrangeHRM - New Level of HR Management", driver.getTitle());
		System.out.println("Home Page displayed");
		//create object for UN,PWD
		WebElement UN=driver.findElement(By.name("txtUserName"));
		WebElement PWD=driver.findElement(By.name("txtPassword"));
		//verify UN,PWD
		Assert.assertTrue(UN.isDisplayed()&&PWD.isDisplayed());
		System.out.println("UN,PWD fields are displayed!");

		//type UN,PWD
		String username="qaplanet1";
		UN.sendKeys(username);
		PWD.sendKeys("lab1");
		//click on Login
		driver.findElement(By.name("Submit")).click();
		wait.until(ExpectedConditions.titleIs("OrangeHRM"));
		//verify home page
		Assert.assertEquals("OrangeHRM", driver.getTitle());
		System.out.println("OrangeHRM Page displayed");
		//Get welcome Text
		String WelText=driver.findElement(By.xpath("//*[@id='option-menu']/li[1]")).getText();
		//Verify welcome text
		Assert.assertEquals(WelText, "Welcome "+username);
		System.out.println("Welcome "+username+" displayed");
		//click on Logout
		driver.findElement(By.linkText("Logout")).click();
		wait.until(ExpectedConditions.titleIs("OrangeHRM - New Level of HR Management"));
		//verify home page
		Assert.assertEquals("OrangeHRM - New Level of HR Management", driver.getTitle());
		System.out.println("Signoff sucessfull and Home Page displayed");
	}

}
