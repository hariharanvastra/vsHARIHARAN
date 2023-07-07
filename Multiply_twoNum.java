package lab1;
import java.util.Scanner;
public class Multiply_twoNum {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		System.out.println("Enter first numbers");
		int num1=user.nextInt();
		System.out.println("Enter second numbers");
		int num2=user.nextInt();
		// multipling
		int ans=num1*num2;
		
		System.out.println("Multiple of your number is :"+ans);
		
		user.close();
		
		

	}

}
