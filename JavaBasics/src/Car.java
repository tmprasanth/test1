

public class Car {
    int year;     //attributes..
    String model;
    
    void start() {  //methods...
    	System.out.println("Car started");
    }
    void run() {
    	System.out.println("Car is running");
    }
    void stop() {
    	System.out.println("Car stopped");
    }
    void print() {
    	System.out.println(year+" "+model);
    }
	public static void main(String[] args) {
		Car maruti = new Car(),audi = new Car();
		maruti.year=1985;
		maruti.model="800 classic";
		
		//maruti.print();
		System.out.println(maruti.year+" "+maruti.model);
		maruti.start();
		maruti.run();
		maruti.stop();
		
	}
}
