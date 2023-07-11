package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignmenat3 {
	static int array[]=new int[5];
	 
	  int sum=0;
	 void disElements(int array[]) {
		for(int i=0;i<array.length;i++) {
			 System.out.println(array[i]);		
		 }		 
	}
	 int sumOfArray(int array[]) {
		 for(int i=0;i<array.length;i++) {
		sum+=array[i];
	   }
	 return sum;
	 }
	 
	 int Average(int array[]) {		
		 return sum/array.length;
		 }
	 int accesnding() {
		 for(int i=0;i<array.length;i++) {
			 for(int j=i+1;j<array.length;j++) {
				 if(array[i]<array[j]) {
					 int temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			 }
			 
		 }
		 System.out.println(Arrays.toString(array));
		 return 0;
	 }
	 
	 int max() {
		 int maxval=array[array.length-array.length];
		 return maxval;
		 
	 }
	 int min() {
		 int minval=array[array.length-1];
		 return minval;
		 
	 }
	  int search(int searchVal ) {
		  int count=0;
		  for(int i=0;i<array.length;i++) {
		 if(array[i]==searchVal) {
			 	 count++;
		 }		
		 
		  }
		 if (count==1) {
			 System.out.println("your value "+searchVal+"is in the array");		
		 }
		 else {
			 System.out.println("your value "+searchVal+"is not in the array");	
		 }
		 return 0;
	 }
	  
	  int modifing(int index,int value)
	  {
		  array[index]=value;
		  
			  System.out.println("your array is "+Arrays.toString(array));	 
		  return 0;
	  }

	public static void main(String[] args) {
		Assignmenat3 obj=new Assignmenat3 ();
		 array[0]=30;
		 array[1]=41;
		 array[2]=22;
		 array[3]=13;
		 array[4]=48;
          obj.disElements(array);
		 int sumarray=obj.sumOfArray(array);
		 System.out.println("the sum of array is :"+sumarray);
         System.out.println();
         int avg=obj.Average(array);
         System.out.println("this is the average of array :"+avg);
         obj.accesnding();
         int arrayMax=obj.max();
         System.out.println("max value of array :"+arrayMax);
         int arrayMin=obj.min();
         System.out.println("max value of array :"+arrayMin);
         Scanner user= new Scanner(System.in);
         System.out.println("enter value for serching");
         int searchVal=obj.search(user.nextInt());
         System.out.println("enter value for modifing index");
         int index=user.nextInt();
         System.out.println("enter value for modifing value");
         int value=user.nextInt();
         obj.modifing(index, value);
         
	}

}
