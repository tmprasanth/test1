package daynine;
import org.junit.*;
public class Ex1 {
	@BeforeClass
	public static void login()
	{
		System.out.println("Logging In...");
	}
	@AfterClass
	public static void logout()
	{
		System.out.println("Logging out...");
	}
	@Test
	public void method3()
	{
		System.out.println("Method3");
		Assert.assertEquals(11, 11);
	}
	@Test
	public void method4()
	{
		System.out.println("Method4");
		Assert.assertEquals(11, 12);
	}
}
