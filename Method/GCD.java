package Method;

public class GCD {
    int gcd(int m, int n) {
        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }
// find the GCD number 
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        GCD method = new GCD();
        System.out.println(method.gcd(35, 56));
    }
}
