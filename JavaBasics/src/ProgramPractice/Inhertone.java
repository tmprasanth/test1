package ProgramPractice;

public class Inhertone {
	
	public class Empsal{
		
		int sal=1000;
		double  hike()
		{
			return(sal*0.30);
		}
	}
	public  void main(String[] args) {

		Empsal temp1= new Empsal ();
		temp1.hike();
		System.out.println(temp1.sal);
	}

}
