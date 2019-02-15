package dayfour;

interface Testing 
{
	static void hello() 
	{
		System.out.println("Hello Everybody!");
	}

	public void testing();
}

interface Selenium 
{
	public void selenium();
}

abstract class Qaplanet
{
	abstract void welcome();
}

public class Mahesh extends Qaplanet implements Testing, Selenium 
{
	void welcome() 
	{
		System.out.println("Welcome to Qaplanet!");
	}

	public void testing() 
	{
		System.out.println("Mahesh teaches Testing!");
	}

	public void selenium() 
	{
		System.out.println("Mahesh also teaches selenium!");
	}

	public static void main(String[] args) 
	{
		Mahesh m = new Mahesh();
		// calling the static method of the interface Testing...
		Testing.hello();

		m.welcome();
		m.testing();
		m.selenium();
	}

}
