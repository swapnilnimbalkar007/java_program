package loops;
import java.util.Scanner;
public class fibonacciseries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of terms");
		
		int n=scan.nextInt();
		int a=0, b=1, c;
		System.out.print(a+","+b);
		
		for(int i=0; i<n-2; i++)
		{
			c=a=b;
			System.out.print(c+",");
			a=b;
			b=c;
			
		}

	}

}
