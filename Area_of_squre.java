package lab1;
import java.util.Scanner;

public class Area_of_squre {

	public static void main(String[] args) {
		Scanner user= new Scanner(System.in);
		System.out.println("enter side of squre");
		double side=user.nextDouble();
				
	    double Area=side*side;
		System.out.println("Area of squre is :"+Area);
		

	}

}
