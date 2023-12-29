package array;

public class arraysc1 {

	public static void main(String[] args) {
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		
//		for(int i=0; i<A.length; i++)
			
			//using for each loop 
		for(int x:A)	
		{
//			sum = sum+A[i];
			sum = sum+x;
		}
		System.out.println("sum is"+sum);
	}

}
