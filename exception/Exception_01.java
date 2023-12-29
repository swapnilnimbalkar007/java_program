
package exception;


public class Exception_01 {

	public static void main(String[] args) {
		int a,b,c;
		
		try
		{
			a=10;
			b=0;
			c=a/b;
			System.out.println("Result is"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divison by zero");
		}

	}

}
