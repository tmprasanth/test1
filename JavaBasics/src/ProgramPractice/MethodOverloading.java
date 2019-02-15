package ProgramPractice;

public class MethodOverloading {
	
	int add(int a,int b)
	{
		return (a+b);
		
	}
	double add(double a,double b)
	{
		return(a+b);
	}
	int add(int a, int b,int c)
	{
		return(a+b+c);
	}

	public static void main(String[] args) {
		
		MethodOverloading calc =new MethodOverloading();
		System.out.println(calc.add(10, 20, 30));  
		System.out.println(calc.add(30, 60));
		System.out.println(calc.add(30.2, 26.36));

	}

}
