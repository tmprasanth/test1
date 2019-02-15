package Roughwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGParam2 
{
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void Browserlaunch()
	{
		driver.get("http://apps.qaplanet.in/qahrm");
		
	}
	@BeforeTest
	@Parameters({"Username","Password"})
	public void login(String Username,String Password) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys(Username);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
		driver.findElement(By.name("Submit")).click();
	}
	@Test(priority=-1,description="VerifyLogin")
	
	public void verifyLogin() 
	{
		String expTitle="OrangeHRM";
		String actTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
	}
	@Test(priority=1)
	public void addEmp() throws InterruptedException 
	{
		
		//click on the ADD button by switching on to the frame.......
				String firstName ="Mahesh";
				String lastName  ="Tungala";
			
				driver.switchTo().frame("rightMenu");
				driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
				                             
				//add the employee details.....
				Thread.sleep(5000);
				driver.findElement(By.name("txtEmpLastName")).sendKeys(lastName);
				driver.findElement(By.name("txtEmpFirstName")).sendKeys(firstName);
				driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
				
				//Thread.sleep(2000);
				
				//verify the employee name just entered .....in the personal details page...
				
				Thread.sleep(5000);
				//driver.switchTo().frame("rightMenu");
				driver.findElement(By.xpath("//*[@id='btnEditPers']")).click();
				//Thread.sleep(2000);
				String fN=driver.findElement(By.xpath("//*[@id='txtEmpFirstName']")).getAttribute("value");
				String lN=driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).getAttribute("value");
				System.out.println("firstName :"+ fN);
				System.out.println("lastName : "+ lN);
				
				if(fN.equals(firstName)&&(lN.equals(lastName))){
					System.out.println("Employee successfully added : TestCase Passed");
				}
				else
				{
					System.out.println("Add Employee failed : testcase failed");
				}
				
				driver.switchTo().defaultContent();
	}
	@Test
	public void editEmp() 
	{
		Assert.assertEquals(11, 11);
	}
	@AfterMethod
	public void logout() 
	{
		  driver.findElement(By.linkText("Logout")).click();	
	}
	@AfterClass
	public void afterClass() 
	{
		System.out.println("afterClass");
	}
	@AfterTest
	public void closeBrowser() 
	{
		driver.close();
		System.out.println("aftertest");
	}
	

}
