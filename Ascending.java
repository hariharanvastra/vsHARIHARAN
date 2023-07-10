package lab2;

public class Ascending {

	public static void main(String[] args) {
		
		int[] array= {1,3,4,5};
		int temp=0;
		System.out.println("before sorting");
		for(int f=0;f<array.length;f++) {
			System.out.print(array[f]);
		}
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j<array.length;j++) 
			{
				
				if (array[i]<array[j]) 
				{
					 temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			
			}
		}
		System.out.println();
		System.out.println("After sorting");
		for(int e=0;e<array.length;e++) {
			System.out.print(array[e]);
		}
		
		

	}

}
