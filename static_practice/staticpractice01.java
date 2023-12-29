package static_practice;

class Test
{
	static
	{
		System.out.println("Block1");
	}
	static
	{
		System.out.println("Block2");
	}
}
public class staticpractice01 {

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println("Main");
//		Test t=new Test();

	}

}
