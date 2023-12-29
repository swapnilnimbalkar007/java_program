package overriding;

class Car
{
	public void start()
	{
		System.out.println("Start the Car");
	}
	public void accerate()
	{
		System.out.println("Accelerate the car");
	}
	public void changeGear()
	{
		System.out.println("Change the Gear");
	}
}
class Luxary extends Car
{
	public void changeGear()
	{
		System.out.println("Automatically changed Gear");
	}
	public void openRuff()
	{
		System.out.println("Sun Ruff is Open");
	}
	
}
public class Overriding_02 {

	public static void main(String[] args) {
		Car c= new Car();
		c.start();
		c.accerate();
		c.changeGear();

	}

}
