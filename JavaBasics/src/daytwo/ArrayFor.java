package daytwo;

public class ArrayFor {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		String s[]= {"baji","praveen","laxman","prashanth"};
		for(int j=0;j<s.length;j++) {
			System.out.println(s[j]);
			if(s[j]=="laxman") break;
		}

	}

}
