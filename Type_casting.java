package lab1;
import java.util.Scanner;

public class Type_casting {

	public static void main(String[] args) {
		
	Scanner user = new Scanner(System.in);
	System.out.println("Enter a number 0 to 127");
	byte num=user.nextByte();
	if(num>0&&num<=127) {
		System.out.println(num+" is byte now ");
		int num2=num;//auto type casting
		System.out.println("now "+num2+" is int by auto type casting");
		byte num3=(byte)num2;//manual type casting
		System.out.println("now "+num3+" is byte by manual type casting");
		float num4=num3;//manual type casting
		System.out.println("now "+num4+" is float by auto type casting");
		
	}
	else {
		System.out.println("plss enter a valid value");
	}
	
  user.close();
	}

}
