package dayeight;
import java.util.*;
public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String>();
		hm.put(100, "Mahesh");
		hm.put(105, "Ravi");
		hm.put(104, "Angel");
		hm.put(103, "Marsh");
		hm.put(102, "Mahesh");
		hm.put(105, "Mahesh");
		hm.put(100, "Vinod");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
