package OOP;
// calculate area of square
class Square
{
	public double length;
	public double breadth;
	
	public double calculateArea()
	{
		return length*breadth;
	}
}
public class Class_02 {

	public static void main(String[] args) {
		Square s1=new Square();
		s1.length=10;
		s1.breadth=10;
		System.out.println("Area: "+s1.calculateArea());

	}

}
