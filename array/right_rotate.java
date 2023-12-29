package array;

public class right_rotate {

    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50};

        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println();

        int temp = A[A.length-1];

        for (int i = A.length-2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
        A[0] = temp;

        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }
}
