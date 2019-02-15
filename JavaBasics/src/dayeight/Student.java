package dayeight;

import java.util.*;

public class Student {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1111, "Ravi");
		Student s2 = new Student(2222, "Mahesh");
		Student s3 = new Student(3333, "Vinay");

		// create an arraylist of students ...
		ArrayList<Student> al = new ArrayList<Student>();
		// put all the objects into this arraylist..
		al.add(s1);
		al.add(s2);
		al.add(s3);

		// create an iterator interface object..
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next(); // cast to Student class
			System.out.println(st.rollno + " " + st.name);
			// System.out.println(itr.next());
		}
	}
}
