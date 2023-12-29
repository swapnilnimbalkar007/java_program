package array;
import java.util.*;
public class array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		int key=5;
		//search array element 
		System.out.println("Enter a Key ");
		key=sc.nextInt();
		
		for(int i=0; i<A.length; i++) {
			if(A[i]==key)
			{
				System.out.println("Element Found at:"+i);
				System.exit(0);
			}
		}
		System.out.println("Not found");

	}

}
