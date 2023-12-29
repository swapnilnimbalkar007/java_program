package OOP;
//for circle
class Circle
{
	public double radius;
	public double area()
	{
		return Math.PI * radius *radius;
	}
	
}
public class Class {

	public static void main(String[] args) {
		 Circle c1=new Circle();
	     c1.radius=10;
	     System.out.println("Area:"+c1.area());
	     
	}

}
