package dayeight;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(100, "Mahesh");
		ht.put(105, "Ravi");
		ht.put(104, "Angel");
		ht.put(103, "Marsh");
		ht.put(102, "Mahesh");
		ht.put(105, "Mahesh");
		ht.put(100, "Vinod");
		
		for(Map.Entry m:ht.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
