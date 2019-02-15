package Roughwork;

public class Exception {

	public static void main(String[] args  ) 
	{
		int b=80;
		
		try{
								
			System.out.println(b/0);
			
		}
		catch(ArithmeticException  e)
		{
			System.out.println(e);
		}
		/*finally
		{
			System.out.println("Executing the finally block!");
		}*/
		
		 System.out.println("Hello");
	     System.out.println("World");
	
}
