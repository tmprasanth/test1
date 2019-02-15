package Roughwork;

public class Constructor 
{	
	
	int a,b,c;
	Constructor()
	{
		
	}
	Constructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
	}
	Constructor(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		c=a+b+c;
	
	}
	void print()
	{
		System.out.println(+c);
	}
	public static void main(String[] args) 
	{
		Constructor CST1 =new Constructor();
		Constructor CST2 = new Constructor(20,20);
		Constructor CST3=new Constructor(2,30,69);
		
		CST1.print();
		CST2.print();
		CST3.print();
	}
	

}
