package practice;

import java.util.InputMismatchException;

public class Lab10 {
		public static void division() {
			
			try {
			int div=1/0;
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		division();
	}
	

}
