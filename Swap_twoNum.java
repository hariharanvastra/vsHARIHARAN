package lab1;

public class Swap_twoNum {

	public static void main(String[] args) {
		float num1=25f;
		float num2=3.3f;
		System.out.println("num1 is "+num1);
		System.out.println("num2 is"+ num2);
		num2=num2+num1;
		num1=num2-num1;
		num2=num2-num1;
		System.out.println("num1 is "+num1);
		System.out.println("num2 is"+ num2);

	}

}
