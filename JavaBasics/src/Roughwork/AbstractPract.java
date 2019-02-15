package Roughwork;

abstract class clsone
{
	abstract int add();
}

class clstwo extends clsone
{
	int c=10;
	int add()
	{
		return c;
		
	}
}

class clsthree extends clsone
{
	int c=89;
	int add()
	{
		return c;
	}
}

public class AbstractPract extends clsone
{
	int c=12365;
	int add()
	{
		return c;
	}
	

	public static void main(String[] args) 
	{
		
		/*//we create an object for the abstract class?
		no, but we can create a reference object for it..*/
		
		clsone a=new clstwo();
		clsone b=new clsthree();
		clsone c=new AbstractPract();
		System.out.println(a.add());
		System.out.println(b.add());
		System.out.println(c.add());
	}

}
