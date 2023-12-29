package practice;

import java.util.Scanner;
//print the prime number
public class Example_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        boolean isPrime = true;

        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <=2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println("Is prime: " + isPrime);

        scan.close();
    }
}
