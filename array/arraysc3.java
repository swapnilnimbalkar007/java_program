package array;
import java.util.*;
public class arraysc3 {

	public static void main(String[] args) {
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		
		int max=A[0]; //assume the element is the zero
		
		for(int i=1; i<A.length; i++)
		{
			if(A[i]>max) {
				max=A[i];
			}
		}
		System.out.println();
	}

}
