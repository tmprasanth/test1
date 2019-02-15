package Roughwork;

public class Overloading 
{
	int add(int a,int b)
	{
		return(a+b);
	
	}
	
	int add(int a,int b,int c)
	{
		return(a+b+c);
	}
	
	double add(double a,double b,double c)
	{
		return(a+b+c);
	}
	

	public static void main(String[] args) 
	{
	
		Overloading OL=new Overloading();
		System.out.println(OL.add(10,20));
		System.out.println(OL.add(10,20,30));
		System.out.println(OL.add(10.236, 0.2365, 0.2365));
		
	}

}
