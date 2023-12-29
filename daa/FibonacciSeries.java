package daa;
public class FibonacciSeries {
    public static void main(String[] args) {
        int nterms = 10; 
        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < nterms; i++) {
            System.out.print(recurFibo(i) + " ");
        }
    }
          
    ]aas
    public static int recurFibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recurFibo(n - 1) + recurFibo(n - 2);
        }
    }
}
