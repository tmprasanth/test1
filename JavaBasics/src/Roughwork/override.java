package Roughwork;
class Car
{
	int a=10,b=20;
	int c;
    int add()
    {
		return c=a+b;
		
	}
    void print()
    {
    	System.out.println(c);
    }
	
}

public class override extends Car
{

	public static void main(String[] args) 
	{
		Car temp=new Car();
		temp.add();
		temp.print();
		

	}

}
