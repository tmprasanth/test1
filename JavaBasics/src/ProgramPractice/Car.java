package ProgramPractice;

public class Car {
	int year;
	String model;
	
	void start()
	{
		System.out.println("Car started Year & Model" +year   +model);
		
	}
	void run()
	{
		System.out.println("Car running Year & Model" + year +model);
	}
	void stop()
	{
		System.out.println("car stopped Year & Model" + year +model);
	}

	public static void main(String[] args) {
		
		
		Car maruthi=new Car();
		maruthi.year=1985;
		maruthi.model="Swift";
		/*System.out.println("Year&Model" + maruthi.year +maruthi.model);*/
		
		maruthi.year=1985;
		maruthi.model="Swift";
		maruthi.start();
		maruthi.run();
		maruthi.stop();
		
		Car audi=new Car();
		audi.year=2012;
		audi.model="Q5";
		audi.start();
		audi.run();
		audi.stop();
		
		
	}

}
