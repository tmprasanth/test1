package Roughwork;

public class Stringreverse {

	public static String temp;
	public String rev="";
	public static  void reverse(String rev )
	{
			
	char ch[]=rev.toCharArray();
		
				
		for(int i =ch.length-1;i>=0;i--)
		{
			temp+=ch[i];
			System.out.print(ch[i]);
		}
		
				
	}
	

	public static void main(String[] args)
	{
			Stringreverse.reverse("prasanth");
			System.out.println();
			Stringreverse.reverse("HTNASARP");
	}

}
