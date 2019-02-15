package dayeight;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mahesh");
		al.add("Suresh");
		al.add("Rajesh");
		al.add("Ravi");
		al.add("Mahesh");
		
		//using for each loop ....
   /*  for(String s:al){
			System.out.println(s);
		} */
		//using iterator interface...
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		} 
	}

}
