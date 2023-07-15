package assignmentNew;

public class BankAccount {

	private int accountNumber;
	 private int balance;
	private String customerName;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "BankAccount accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName;
	}
	
	
	
}
