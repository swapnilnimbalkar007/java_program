package overriding;

class Super1
{
	public void display()
	{
		System.out.println("Super Class Display");
	}
}

class Sub1 extends Super1
{
	
	public void Display()
	{
		System.out.println("Sub class Display");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Super1 sup= new Sub1();
//		Sub1 sub=new Sub1();
		sup.display();
//		sub.Display();
	}

}
