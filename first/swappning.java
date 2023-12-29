package first;

public class swappning {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		int temp=a;
//		
//		a=b;
//		b=temp; 
//	 without using third variable swapping
		a=a^b;
		b=b^a;
		a=a^b;
		
//		System.out.println("After swapping: a = " + a + ", b = " + b);
//		System.out.println(a ^= b ^= a ^= b);
		//without using third variable swapping
		System.out.println(a);
		System.out.println(b);

	}

}
