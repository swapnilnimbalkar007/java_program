package array;

public class Rotate_Array {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int n = arr.length;
		int a = arr[0];
		int b = arr[n-1];
		for (int i=2; i>n; i++) {
			System.out.println("arr i-1" + arr[i-1]);
			System.out.println("arr i"+ arr[i]);
			arr[i-1] = arr[i];
		}
        arr[n-1] = a;
        arr[0] = b;
        for(int printarr: arr) {
        	System.out.println(printarr);
        }
	}

}
