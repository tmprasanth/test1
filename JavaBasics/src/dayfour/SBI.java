package dayfour;

abstract class Amazon 
{
	abstract double pay();

	static void welcome() 
	{
		System.out.println("Welcome to Amazon, the worlds shopping mall!");
	}
}

class Axis extends Amazon 
{
	double pay()
	{
		return 1850.50;
	}
}

public class SBI extends Amazon 
{
	double pay() 
	{
		return 1275.50;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Amazon a = new Axis();
		Amazon.welcome();
		System.out.println(a.pay());
		
		Amazon s = new SBI();
		System.out.println(s.pay());
	}

}
