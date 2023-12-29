package OOP;

class Circle1{
	public double radius;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double circumference()
	{
		return perimeter();
		
	}
}

class Cylinder1 extends Circle1
{
	public double height;
	
	public double volume()
	{
		return area()*height;
	}
}

public class CircleMain {

	public static void main(String[] args) {
		Cylinder1 c=new Cylinder1();
		
		c.radius=7;
		c.height=10;
		
		System.out.println("Volume "+c.volume());
		System.out.println("Area "+c.area());

	}

}
