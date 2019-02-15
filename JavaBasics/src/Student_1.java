

public class Student_1 {
	int rollno;  //attributes
    String name;
    static String college="IIT";
    
    Student_1(int rollno,String name){  //overloaded...
    	this.rollno=rollno;
    	this.name=name;
     }
    void print() {
    	System.out.println(rollno+" "+name+" "+college);
    }
    static void change() {
    	college = "VIT";
    }
    static {
    	System.out.println("Welcome to Freshers!");
    }
	public static void main(String[] args) {
		Student_1 s1=new Student_1(1111,"Mahesh");
		Student_1 s2=new Student_1(2222,"Laxman");
		
		//System.out.println(s1.college);
		//System.out.println(s2.college);
		
		
		s1.print();
		s2.print();
		
		change();
		
		s1.print();
		s2.print();
		
	}
	static {
		System.out.println("Ragging is prohibited!");
	}
}
