package ProgramPractice;

public class eachfor
{
	
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int temp=0;
	/*	For each i stores the vales of the array and repeat the loop*/
		
		for(int i:a)
		{
			temp=temp+i;
			/*System.out.println(+i);*/
			System.out.println(+temp);
		}
		
		String st[]= {"test1","test2","test3","test4","test5"};
		
		for(String s:st)
		{
			
			System.out.println(s);
			if(s=="test4") break;
		}
	}

}
