package conditionalstatement;
import java.util.Scanner;
public class ifelsechallenge2 {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		age=sc.nextInt();
		if(age>14&&age<55)
		{
			System.out.println("You are Young");
		}
		else
		{
			System.out.println("You are not Young");
		}

	}

}
