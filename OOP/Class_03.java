package OOP;

class triangle
{
	public double base;
	public double height;
	
	public double calculateArea()
	{
		return height*base;
	}
}


public class Class_03 {

	public static void main(String[] args) {
		triangle t1=new triangle();
		t1.base=10;
		t1.height=20;
		System.out.println("Area :" + t1.calculateArea());

	}

}
