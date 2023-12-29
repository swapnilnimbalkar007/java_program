
package Method;

public class Method_practice4 {
//modified the string with update method
	public static void update(String A[] ) {
		A[0]="Modified";
	}	
	public static void main(String args[]) {
		String A[] = {"Hello", "World", "Java"};
		
		update (A);
		
	    System.out.println(A[0]);
	}

}
