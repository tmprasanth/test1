package dayfive;

public class StringExample {

	public static void main(String[] args) {
		String s1="Sachin";
		
		//System.out.println(s1);  //prints sachin
		
		//System.out.println(s1.concat("tendulkar")); 
		//s1=s1.concat(" tendulkar");
		//System.out.println(s1);  //prints sachin tendulkar
		
		//using the + operator
		System.out.println(s1+" Tendulkar");
		System.out.println(s1+40);  //prints sachin40
		System.out.println(40+s1);  //prints 40sachin
		System.out.println(40+40+s1); //prints 80sachin
		System.out.println(s1+40+40);  //prints sachin4040..
		
	}
}
