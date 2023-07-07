package lab1;
import java.util.Scanner;

public class EvenOrOdd_find {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);	
		System.out.println("Enter a number");
		int num=user.nextInt();
		
		if(num%2==0) {
			System.out.println("your number "+num+" is even");
		}
		else {
			System.out.println("your number "+num+" is odd");
		}
        user.close();
	}

}
