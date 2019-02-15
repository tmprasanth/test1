package ProgramPractice;

public class ArrayPrint
{

	int a[]=new int[5];
	{
		a[0]=1003;
		a[1]=100;
		a[2]=209;
		a[3]=900;
		a[4]=890;
		
	}
	
			
		
	public static void main(String[] args) 
	{
	
		ArrayPrint temp=new ArrayPrint();
		
		for(int i=0;i<temp.a.length;i++)
		{
			System.out.println(temp.a[i]);
			
		}
		
	}

}
