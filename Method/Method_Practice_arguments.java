package Method;

public class Method_Practice_arguments 
{
	static void show(int...x)
	{
		for(int a:x)
		{
			System.out.println(a);
		}
	}

	public static void main(String args[])
	{
		show(10,20,30,40);
	}
}	

