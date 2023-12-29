//package conditionalstatement;
//
//public class nestedloop {
//
//	public static void main(String[] args) {
//		
//		int rows=5;
//		for(int i=1; i<=5; i++)
//		{
//			for(int j=1; j<=rows-i+1; j++)
//			{
//				
//				System.out.println("* ");
//			}
//			System.out.println();
//		}	
//
//	}
//
//}

//pattern2

package conditionalstatement;

public class nestedloop {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j>=i)
				{
					System.out.println("* ");
				}
				else
					System.out.println(" ");
			}
			System.out.println();
		}	

	}

}


