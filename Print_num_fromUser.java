package lab1;
import java.util.Scanner;

public class Print_num_fromUser {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter your number");
		int input=user.nextInt();
		System.out.println("your number is :"+input);
		user.close();

	}

}
