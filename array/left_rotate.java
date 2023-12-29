package array;

public class left_rotate {

    public static void main(String[] args) {
        int A[] = {10, 20, 30, 40, 50};

        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println();

        int temp = A[0];

        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];
        }
        A[A.length - 1] = temp;

        for (int x : A) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }
}
