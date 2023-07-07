package lab1;
import java.util.Scanner;

public class User_input_array {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		int[]array=new int[10];
		System.out.println("enter your array...i will show sum of your array");
		for(int i=0;i<10;i++) {
			
			array[i]=user.nextInt();
			
		}
		int sum=0;
		for(int i:array) {
			sum+=i;
		}
		System.out.println("sum of your array:"+sum);
		

	}

}
