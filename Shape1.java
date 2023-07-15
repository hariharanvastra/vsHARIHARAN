package assignmentNew;

import java.util.Scanner;
 abstract class Shape1 {
	 Scanner user= new Scanner(System.in);
    static double recArea;
	public abstract void calculateArea() ;
	
	public static void main(String[] args) {
		Rectangle ob=new Rectangle();
		Circle ob1=new Circle();
		ob.calculateArea();
		ob1.calculateArea();
	}
	
}

class Rectangle extends Shape1 {
		
	public	 void calculateArea() {
			
			System.out.println("enter your length of rectangle");
			double length=user.nextInt();
			System.out.println("enter your breath of rectangle");
			double breath=user.nextInt();
			 recArea=length*breath;
			
			 System.out.println("your rectangle area is:"+recArea);
		}
		
}
	
