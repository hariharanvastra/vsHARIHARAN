package assignmentNew;



public class Circle extends Shape1{
	 static double cirArea;
	 
	public void calculateArea() {
		
		System.out.println("enter your Radius of rectangle");
		double r=user.nextInt();
		
		
		 cirArea=2*Math.PI*r;
		System.out.println("your circle area is :"+cirArea);
	}

	
}
