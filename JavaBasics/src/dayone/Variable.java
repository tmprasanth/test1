package dayone;

public class Variable {
    int i=10; //instance variable...
    void print() {  //instance method...
    	//System.out.println(i);  //instance variable
    	//int local=50;
    	//System.out.println(local);
    	s=s*2;
    	System.out.println(s);  //static variable..
    }
    static int s=100;   //static variable..
	public static void main(String[] args) {
		Variable v = new Variable();
	//	System.out.println(v.i);  //instance variable...
        v.print(); //instance method..
        
     /*   int local;  //local
        local=25;
        System.out.println(local);*/
        
        System.out.println(s);  //s is 200
       
        v.print();  //prints 400
        s=s*2;
        System.out.println(s); //prints 800
	}

}
