package ProgramPractice;

public class Variables {
	
/*	Instance variables initialisation is not mandetory
	
	By default Java assigns default value to variable*/
	
	int a;
	String temp;
	double d;
	float f;
	char c;
	long l;
	byte by;
	boolean b;
	
/*	static variable ...This variable can be 
 * called from main even without creating the object*/
	
	static  int sint=100;
	
	
	void test()
	{
		
		/*	Local  variables initialisation is  mandetory
		
		If we don'tinitialize it will promt the error(The local variable mint may not have been initialized)*/
		
		int mint=50;
		double mfloat= 10.2;
		System.out.println("Local Variable initialization is mandetory integer"+mint +" local float" +mfloat);
		System.out.println(+sint);
		System.out.println(+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Variables var=new Variables();
/*		System.out.println(var.a +var.temp +var.d +var.f +var.c +var.l +var.by +var.b);*/
		System.out.println("Int" +var.a );
		System.out.println("string" +var.temp);
		System.out.println("Double" +var.d);
		System.out.println("Float" +var.f );
		System.out.println("char" +var.c );
		System.out.println("Long" +var.l);
		System.out.println("byte" +var.by );
		System.out.println("boolean" +var.b);
		var.test();
		System.out.println(+sint);
	}

}
