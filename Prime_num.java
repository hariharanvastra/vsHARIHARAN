package lab1;
import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		System.out.println("enter your num");
		int num=user.nextInt();
		boolean prime=true;
		
	for(int i=2;i<=num/2;i++) {
		if(num%i==0)
		{
			prime=false;
			break;
		}
	}
	
	if(prime) {
		System.out.println(num+" is prime number");
	}
	else {
		System.out.println(num+" is not prime number");
	}
		
	}

}
