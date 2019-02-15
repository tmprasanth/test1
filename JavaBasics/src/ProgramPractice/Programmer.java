package ProgramPractice;

class Employee
{
	double sal=1000;
	double hike()
	{
		return(sal*0.20);
	}
}


public class Programmer extends Employee

{
	
	double bonus=sal*0.20;
	
	public static void main(String[] args) 
	{
		
		 Programmer p = new Programmer();
		 System.out.println("The basic salary of the "
	                 + " Programmer is "+p.sal);
		 System.out.println("The Hike of the "
                 + " Programmer is "+p.hike());
		 System.out.println("The total salary of the "
                 + " Programmer is "+ (p.sal+p.bonus));
		 System.out.println("The new salary of the programmer is "
				 + (p.sal+p.bonus+p.hike()));
	}

}
