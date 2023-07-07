package lab1;
import java.util.Scanner;

public class Area_of_rectangle {

	public static void main(String[] args) {
		
		Scanner user= new Scanner(System.in);
		System.out.println("enter length of rectangle");
		double length=user.nextDouble();
		System.out.println("enter width of rectangle");
		double width =user.nextDouble();
		
		double Area=length*width;
		System.out.println("Area of rectangle is :"+Area);
	}

}
