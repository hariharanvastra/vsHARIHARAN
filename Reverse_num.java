package lab1;
import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		int rev=0;
		System.out.println("enter your number ");
		int num=user.nextInt();
	
		while(num!=0) {
			rev= rev*10+num%10;
			num=num/10;
		}
      
		System.out.println("this is a reverse form of your number :"+rev);
	}

}
