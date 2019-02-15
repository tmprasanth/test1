package daynine;
import org.junit.*;
public class Ex2_Annotations {
	@BeforeClass
	public static void login()
	{
		System.out.println("Logging In...@BeforeClass");
	}
	@AfterClass
	public static void logout()
	{
		System.out.println("Logging out... 	@AfterClass");
	}
	@Before
	public void Login()
	{
		System.out.println("Logging in 	@Before");
	}
	@After
	public void Logout()
	{
		System.out.println("Logging out @After");
	}
	@Test
	public void TestCase1()
	{
		System.out.println("Verfy Login Passed! @Test1");
	}
	@Test
	public void TestCase2()
	{
		System.out.println("Add Emp passed! @Test2");
	}
	

}
