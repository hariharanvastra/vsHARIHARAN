package practice;

import java.util.Scanner;
public class Assignment {
	
	
	int add(int num1,int num2) 
	{

	    int sum=num1+num2;	   
	    return sum;		
	}
    int subtract(int num3,int num4) 
	{
	    int sub=num3-num4;	 
	    return sub;		
	}
     int multiple(int num5,int num6)
	{    	
 	   int product=num5*num6;	  
	    return product;	
      }
    int division(int num7,int num8) 
	{
	    int division=num7/num8;	  
	    return division;	
     }
    int power(int num9) 
	{  	
        int power=num9*num9;       
        return power;	
     }

	public static void main(String[] args) {
		Assignment obj=new Assignment();
		Scanner user=new Scanner(System.in);
		System.out.println("Enter two numbers for adding");
		int num1=user.nextInt();
		int num2=user.nextInt();
		int addval=obj.add(num1,num2);
		System.out.println("your addition is :"+addval);

		System.out.println("Enter two numbers for subtract");
    	        int num3=user.nextInt();
	        int num4=user.nextInt();		
		int subval=obj.subtract(num3,num4);
		System.out.println("your subtraction is :"+subval);

	        System.out.println("Enter two numbers for multiple");
    	        int num5=user.nextInt();
 	        int num6=user.nextInt();
		int mulval=obj.multiple(num5,num6);
		System.out.println("your multiple is :"+mulval);

		System.out.println("Enter two numbers for division");
    	        int num7=user.nextInt();
	        int num8=user.nextInt();
		int divval=obj.division(num7,num8);
		System.out.println("your division is :"+divval);

		System.out.println("Enter a number for power");
                int num9=user.nextInt();
		int powerval=obj.power(num9);
		System.out.println("your power value is :"+powerval);
		
		
	}

}
