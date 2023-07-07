package lab1;

public class Largest_3_num {

	public static void main(String[] args) {
		
		float num1=-2.0f;
		int num2 =39;
		int num3= 1111;
		
		if((num1>num2)&&(num1>num3)) {
			System.out.println(num1+" is grater");
		}
		else if (num2>num3) {
			System.out.println(num2+" is grater");
		}
		else {
			System.out.println(num3+" is grater");
		}
	}

}
