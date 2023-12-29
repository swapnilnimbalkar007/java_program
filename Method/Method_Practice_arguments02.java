package Method;

public class Method_Practice_arguments02
{
	static int sum(int...numbers) {
		int sum=0;
		for (int i=0; i<numbers.length; i++)
			sum += numbers[i];
		return sum;
	}
	public static void main(String agrs[])
	{
		int result= sum(10,20,30);
		System.out.println("sum: " +result);
	}
}