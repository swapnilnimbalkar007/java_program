package recursion;

public class Recursion 
{
	static void fun(int n)
	{
		if(n>6)  
		{
			fun (n-1);
			System.out.println(n);
		}
	}
	public static void main(String args[])
	{
		fun(10);
	}
}