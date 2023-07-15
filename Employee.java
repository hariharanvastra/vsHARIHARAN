package assignmentNew;

public class Employee extends Person{
   
	private int employeeId;
	 private int salary;
	 public Employee() {
		 
	 }
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public int getSalary() {
		return salary;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
