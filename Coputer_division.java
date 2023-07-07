package lab1;
import java.util.Scanner;
public class Coputer_division {

	public static void main(String[] args) {
		
		Scanner user=new Scanner(System.in);		
	     System.out.println("enter dividend");
	     int dividend=user.nextInt();
	     System.out.println("enter divisor");
	     int divisor=user.nextInt();
	     
	     double qoution=dividend/divisor;
	     double remainder=dividend%divisor;
	     System.out.println("the qoution is :"+qoution);
	     System.out.println("the remainderis :"+remainder);
	
	user.close();

	}

}
