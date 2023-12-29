package exception;

public class Exception_06 {

	public static void main(String[] args) {
		
		int i =0;
		int j =0;
		
		int nums[]= new int[5];
		
		try
		{
			j=18/i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		catch(Exception e)
		{
			System.out.println("Something went Wrong. "+e);
		}
		
		System.out.println(j);
		
		System.out.println( "Bye");

	}

}
