package lab1;
import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		System.out.println("Enter a charater from alhabets");
		Scanner user= new Scanner(System.in);
		String character =user.next();
		char ch=character.charAt(0);
		
	    int ASCII=(int)ch;
	    System.out.println("the ASCII value of your charater is :"+ASCII);
		user.close();

	}

}
