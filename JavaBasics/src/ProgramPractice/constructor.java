package ProgramPractice;

public class constructor 
{
	int rollno;
	String name;
	String city; 
	
	
	constructor()
	{

	}
	

	constructor(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	
	}
	
	constructor(int rollno,String name,String city)
	{
		this.rollno=rollno;
		this.name=name;
		this.city=city;
			
	}
	void print()
	{
		System.out.println(rollno+" "+name+" "+city);
	}
	public static void main(String[] args)
	{
		
		constructor s1=new constructor();
		constructor s2=new constructor(101,"prasanth");
		constructor s3=new constructor(991,"sample name","Hyderabad");
		s1.print();
		s2.print();
		s3.print();
		
		
	}

}
