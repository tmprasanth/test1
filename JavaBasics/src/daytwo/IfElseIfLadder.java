package daytwo;

public class IfElseIfLadder {

	public static void main(String[] args) {
       int marks=400;
       if(marks>=40&&marks<50) {
    	   System.out.println("Pass");
       }else if(marks>=50&&marks<60) {
    	   System.out.println("Second class!");
       }else if(marks>=60&&marks<70) {
    	   System.out.println("First Class!");
       }else if(marks>=70&&marks<=100) {
    	   System.out.println("Distinction!");
       }else {
    	   System.out.println("Invalid or failed!");
       }

	}

}
