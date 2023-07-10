package lab2;
import java.util.Scanner;

public class Avreage {
       
	static void m1() {
		 Scanner user=new Scanner(System.in);
		 System.out.println("enter a number");
		 int num=user.nextInt();
		 int  average=0;
		 int sum=0;
		 for(int i=0;i<=num;i++) {
			 
			 sum+=i;
			 average=sum/num;
		 }
		 System.out.println("the average is :"+average);
	
	}
	public static void main(String[] args) {
		 m1();
	}
}
