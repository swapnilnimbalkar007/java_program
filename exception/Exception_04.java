package exception;
import java.util.Scanner;
public class Exception_04 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two Numbers");
		a=sc.nextInt();
	    b=sc.nextInt();
		
		
		try
		{
		    c=a/b;
		    System.out.println("Division is" +c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be 0, try again");
		}
		System.out.println("Bye");

	}

}
