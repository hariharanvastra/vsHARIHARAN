package lab1;

public class Sum_of_array {

	public static void main(String[] args) {
		
		int[]array= {10,11,22,33,44,55,66,77,88,99};
		int sum=0;
		
		for(int i:array) {
			
			sum+=i;
		}
         System.out.println("the sum of array is :"+sum);
	}

}
