package dayone;

public class Array {
    int i[]=new int[3];
    {
       i[0]=25;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[3];
		
		a[0]=12;
		a[1]=23;
		a[2]=24;
		//a[3]=34;
		
		System.out.println(a.length);
		System.out.println(a[2]);
		
		//alternatively,
		int x[]= {1,2,3,4,5};
		System.out.println(x[4]);
		System.out.println(x[1]);
		
		Array ar = new Array();
		ar.i[1]=23;
		ar.i[2]=34;
		System.out.println("ar[1]" +ar.i[1]);
	}

}
