package lab1;
import java.util.Scanner;

public class Floyds_pyramid {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		System.out.println("enter your how many rows you want");
		int row=user.nextInt();
		int num=1;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		user.close();
		
		
		

	}

}
