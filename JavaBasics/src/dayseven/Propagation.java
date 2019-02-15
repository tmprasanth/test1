package dayseven;

public class Propagation {
    void a() {
    	int i=10;
    	System.out.println(i/0);
    }
    void b() {
    	a();
    }
    void c() {
    	b();
    }
	public static void main(String[] args) {
		  Propagation p = new Propagation();
		  try {
		  p.c();
		  }catch(ArithmeticException e) {
			  System.out.println("Cannot divide a number by zero");
		  }
      
	}

}
