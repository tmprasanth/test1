package dayeight;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("Mahesh");
		hs.add("Suresh");
		hs.add("Rajesh");
		hs.add("Ravi");
		hs.add("Mahesh");
		
	
		//using iterator interface...
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
