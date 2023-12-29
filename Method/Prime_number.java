package Method;
import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		
		int n=sc.nextInt();
		int i;
		
		for(i=2; i<n; i++) {
			if(n%i==0)
			{
				break;
			}
			
		}
		if(i==n)
		{
			System.out.println("Is Prime");
		}
		else 
		{
			System.out.println("Is not Prime");
		}
	}

}
