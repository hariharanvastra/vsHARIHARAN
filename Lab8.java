package practice;

public class Lab8 {

	public static void main(String[] args) {
		
		int a=34543;
		float b=50.33f;
	     Boolean c=new Boolean(false);
	     Long d=new Long(876543456);
	     
		Integer a1=new Integer(a);
	     Float b1=new Float(b);
	     boolean c1=c;
	     long d1=d;
	     
	     System.out.println("this is auto boxing primitiv is "+a+" wrapper is "+a1);
	     System.out.println("this is auto boxing primitiv is "+b+" wrapper is "+b1);
	     System.out.println("this is  unboxing wrapper is "+c1+" primitiv is "+c);
	     System.out.println("this is  unboxing wrapper is "+d1+" primitiv is "+d);
	}

}
