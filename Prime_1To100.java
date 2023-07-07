package lab1;

public class Prime_1To100 {

	public static void main(String[] args) {
		String prime="";
		for(int i=1;i<=100;i++) 
		{
			
			int count=0;
			for(int num=i;num>=1;num--) 
			{
				
				if(i%num==0) {
					count=count+1;
				}
			}
				if(count==2) {
					prime=prime+i+" ";
				}			
			
		}
		System.out.print(prime);
	}

}
