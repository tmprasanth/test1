package daytwo;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==7) {
		System.out.println("I am breaking off..");
				break;
			}
		}

	}

}
