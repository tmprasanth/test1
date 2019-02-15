package Roughwork;

public class stringprac 
{

	public static void main(String[] args) 
	{
	
		String s1="qaplanet";
		String s2="qaplanet";
		
		String s3=new String("qaplanet");//WHy this is required//
		
		String s4="QAPLANET";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		
		System.out.println(s1.equals(s4));
		
		
		System.out.println(s1.compareToIgnoreCase(s4));
		//Compared string to sting and returns the ascii difference
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1==s4);
		
		System.out.println(s1.concat(s4));
		System.out.println(s1+s4);
		
	}

}
