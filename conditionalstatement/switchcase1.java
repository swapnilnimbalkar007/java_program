package conditionalstatement;
import java.util.Scanner;

public class switchcase1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("========");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        System.out.println("Enter 2 numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter option in words");
        String option = sc.nextLine();
        option = option.toUpperCase();

        // Call the method with the switch-case statement
        performOperation(x, y, option);
    }

    private static void performOperation(int x, int y, String option) {
        switch (option) {
            case "ADD":
                System.out.println("Sum is " + (x + y));
                break;
            case "SUB":
                System.out.println("Difference " + (x - y));
                break;
            case "MUL":
                System.out.println("Product is " + (x * y));
                break;
            case "DIV":
                System.out.println("Ratio is " + (x / y));
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
