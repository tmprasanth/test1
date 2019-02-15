package daytwo;

public class ForEachLoop 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		for(int i:a) 
		{
			System.out.println(i);
		}
		
		String s[]= {"baji","praveen","laxman","prashanth"};
		
		for(String st:s) 
		{
			System.out.println(st);
			if(st=="laxman") break;
		}
	}

}
