package lab1;

public class Pyramid {

	public static void main(String[] args) {
		 
		for(int i= 0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
        System.out.println();
        
        
		//reverse pyramid
		
		for(int i= 0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
