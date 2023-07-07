package lab1;
import java.util.Scanner;

public class Find_Area_of_circle {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("enter radius of circle");
		double radius=user.nextDouble();
		
		double Area=Math.PI*(radius*radius);
		System.out.println("Area of circle is :"+Area);
		
		double circumference=Math.PI*2*radius;
		System.out.println("circumference of circle is :"+circumference);


	}

}
