package practice;

public class StringObject {
	
	    static String st=new String("we are using ");
		static String st1=new String("eclipse");
		static String st2=new String("eclipse is");
	

	public static void main(String[] args) {
		
			
			System.out.println("The length of the string is: "+st.length());
			System.out.println(st+st1);
		     System.out.println(st1.substring(1,5));
		     System.out.println(st.contains(" are"));
		     System.out.println(st1.toUpperCase());
			System.out.println(st.replace('e','a'));
		 System.out.println(st1.equals(st2));
		 System.out.println( st1.compareTo(st2)); // st1  is subtracting by st2
		 
			 
			 
			 
			 
		System.out.println(st.substring(3, 10)); 
		
		

	}

}
