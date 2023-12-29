package loops;
import java.util.Scanner;
public class scloop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		int m=n;
		int rev =0,r;
		while(n>0)
		{
			r =n%10;
			rev =rev*10+r;
			n/=10;
		}
		if(rev==m)
		{
			System.out.println("Its P1alindrome");
		}
		else
		{
			System.out.println("Its not Palindrome");
		}
		

	}

}
