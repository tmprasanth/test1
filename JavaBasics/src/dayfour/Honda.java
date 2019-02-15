package dayfour;
class Car
{
	int speed=100;
    void start()
    {
		System.out.println("Car started!");
	}
	void run() 
	{
		System.out.println("Car is running!");
	}
	void stop()
	{
		System.out.println("Car stopped!");
	}
}
class Benz extends Car
{
	int speed = 120;
	void start()
 	{
		System.out.println("Benz started!");
	}
	void run()
	{
		System.out.println("Benz is running with speed "+super.speed);
	}
	void stop()
	{
		System.out.println("Benz stopped!");
	}
}
public class Honda extends Car
{
 void start()
 	{
		System.out.println("Honda started!");
	
 	}
	void run() 
	{
		System.out.println("Honda is running!");
	}
	void stop() 
	{
		System.out.println("Honda stopped!");
	}
public static void main(String[] args)
{
		Car b = new Benz();
		Car h = new Honda();
		
		b.start();
		b.run();
		b.stop();
	System.out.println("**************");	
		h.start();
		h.run();
		h.stop();
        
	}

}
