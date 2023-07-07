package lab1;
import java.util.Scanner;

public class Nested_switch {

	public static void main(String[] args) {
		Scanner user=new Scanner(System.in);
		System.out.println("enter your block");
		int block=user.nextInt();
		System.out.println("enter your room");
		int room=user.nextInt();
		
		switch (block) {
		
		case 1:
			switch(room) {
			case 1:System.out.println("this is block 1 room 1");break;
			case 2:System.out.println("this is block 1 room 2");break;
			case 3:System.out.println("this is block 1 room 3");break;
			}
			break;
		case 2:
			switch(room) {
			case 1:System.out.println("this is block 2 room 1");break;
			case 2:System.out.println("this is block 2 room 2");break;
			case 3:System.out.println("this is block 2 room 3");break;
			}
			break;
		case 3:	
			switch(room) {
			case 1:System.out.println("this is block 3 room 1");break;
			case 2:System.out.println("this is block 3 room 2");break;
			case 3:System.out.println("this is block 3 room 3");break;
			}
			break;
			default:System.out.println("pls enter a valid room num");
		}

	}

}
