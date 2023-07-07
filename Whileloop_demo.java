package lab1;
import java.util.Scanner;

public class Whileloop_demo{

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);
		System.out.println("enter a number that should below 10 ");
		int num=user.nextInt();
		int sum=0;
		while(num<=10) {
			sum+=num;
			num++;
		}
		System.out.format("the sum from your num to 10 is : %d",sum);
		
	}

}
