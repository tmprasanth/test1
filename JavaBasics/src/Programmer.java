
class Employee{
	double sal=10000;
	double hike() {
		return sal*0.40;
	}
}
public class Programmer extends Employee {
    double bonus=sal*0.12;  //parent class attribute..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Programmer p = new Programmer();
     System.out.println("The basic salary of the "
     		                 + " Programmer is "+p.sal);
     System.out.println("The total salary of the "
    		                 + " Programmer is "+ (p.sal+p.bonus));
     System.out.println("The new salary of the programmer is "
    		  + (p.sal+p.bonus+p.hike()));
	}
}
