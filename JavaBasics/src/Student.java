
public class Student {
    int rollno;  //attributes
    String name;
    String city;
    
    Student(){}  //default constructor...
    
    Student(int rollno,String name){ //parameterized constructor..
    	this.rollno=rollno;
    	this.name=name;
    }
    Student(int rollno,String name,String city){  //overloaded...
    	this.rollno=rollno;
    	this.name=name;
    	this.city=city;
    }
    void print() {
    	System.out.println(rollno+" "+name+" "+city);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student(1111,"Mahesh");
		Student s3 = new Student(2222,"Rajesh","Hyderabad");
		
		s1.print();
		s2.print();
		s3.print();
	}

}
