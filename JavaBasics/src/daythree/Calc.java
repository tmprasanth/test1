package daythree;

public class Calc {
	    int add(int a,int b){
		   return(a+b);
		}
		double add(double a,double b){
		   return(a+b);
		}
		int add(int a,int b,int c){
		   return(a+b+c);
		}
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(10, 20));
        System.out.println(c.add(12.5,12.5));
        System.out.println(c.add(10,20,30));
	}
}
