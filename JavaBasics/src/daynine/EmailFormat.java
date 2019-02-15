package daynine;
import java.util.regex.*;
public class EmailFormat {
 public static boolean RegEx(String pattern,String content) {
	 //create a pattern object..
	 Pattern r=Pattern.compile(pattern);
	 //now create a matcher object
	 Matcher m=r.matcher(content);
	 
	 if(m.matches()) {
		 return true;
	 }else {
		 return false;
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res=RegEx("^[a-zA-Z][a-zA-Z0-9\\.\\-\\_]@[a-zA-Z0-9]+[\\.][a-zA-Z]{2,}$",
				               "mahesh.tungala@gmail.com");
		System.out.println(res);
	}

}

