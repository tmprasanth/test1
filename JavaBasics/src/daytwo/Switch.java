package daytwo;

public class Switch {

	public static void main(String[] args) {
		int m=40;
		switch(m) {
		case 40 : System.out.println("Pass");
		          break;
		case 50 : System.out.println("Second class");
		          break;
		case 60 : System.out.println("First class");
		          break;
		case 70 : System.out.println("Distinction!");  
		          break;
		default  : System.out.println("Invalid or failed!");          
		}
           System.out.println("After switching!");		

	}

}
