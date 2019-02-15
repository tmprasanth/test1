package dayeight;
import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>lhs=new LinkedHashSet<String>();
		lhs.add("Mahesh");
		lhs.add("Suresh");
		lhs.add("Rajesh");
		lhs.add("Ravi");
		lhs.add("Mahesh");
		
	
		//using iterator interface...
		Iterator itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
