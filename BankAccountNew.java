package assignmentNew;

public class BankAccountNew {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		
		ba.setAccountNumber(45678);
		ba.setBalance(56000);
		ba.setCustomerName("Hariharan");
		
		System.out.println(ba.toString());
	}

}
