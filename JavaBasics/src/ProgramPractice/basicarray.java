package ProgramPractice;

public class basicarray 
{

	public static void main(String[] args) 
	{
		
		/*Repeats the loop for full array length
		 Array index starts with zero,hence loop should be repeated always less(1 times) of array length 
		 i.e.  for(int i=1;i<a.length;i++) */
		
		int a[]= {20,23,67,9,89};
	
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		String st[]= {"temp1","temp2","temp3","temp4","temp5","temp6"};
		
		for(int j=0;j< st.length;j++)
		{
			System.out.println(st[j]);
		}
		
		
	}

}
