package package_practice;

public class Exception_05 {

	public static void main(String[] args) {
		int A[]= {30,20,40,10,0};
		
		try
		{
			int c=A[0]/A[2];
			System.out.println("Division is"+c);
			
			System.out.println(A[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is Invalid");
		}
		System.out.println("Bye");

	}

}
