package practice;

import java.util.Scanner;
public class Assignment {
	
	Scanner user;
	int add() {
		user=new Scanner(System.in);
		System.out.println("Enter two numbers for adding");
		int num1=user.nextInt();
	    int num2=user.nextInt();
	    int sum=num1+num2;
	   
	    return sum;
		
	}
    int subtract() {
    	user=new Scanner(System.in);
    	System.out.println("Enter two numbers for subtract");
    	int num2=user.nextInt();
	    int num3=user.nextInt();
	    int sub=num2-num3;
	 
	    return sub;
		
	}
     int multiple() {
    	 user=new Scanner(System.in);
    	 System.out.println("Enter two numbers for multiple");
    	 int num4=user.nextInt();
 	    int num5=user.nextInt();
 	   int product=num4*num5;
	  
	    return product;
	
      }
    int division() {
    	user=new Scanner(System.in);
    	System.out.println("Enter two numbers for division");
    	int num6=user.nextInt();
	    int num7=user.nextInt();
	    int division=num6/num7;
	  
	    return division;
	
     }
    int power() {
    	user=new Scanner(System.in);
    	System.out.println("Enter a number for power");
        int num8=user.nextInt();
        int power=num8*num8;
       
        return power;
        
    
	
     }

	public static void main(String[] args) {
		Assignment obj=new Assignment();
		
		int addval=obj.add();
		System.out.println("your addition is :"+addval);
		int subval=obj.subtract();
		System.out.println("your subtraction is :"+subval);
		int mulval=obj.multiple();
		System.out.println("your multiple is :"+mulval);
		int divval=obj.division();
		System.out.println("your division is :"+divval);
		int powerval=obj.power();
		System.out.println("your power value is :"+powerval);
		
		
	}

}