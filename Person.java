package assignmentNew;

public class Person{
		private String name;
		private  int age;
		private  String address;
		public static int count=0;
		 
		 public Person() {
			 count++;
		 }
		 
		public Person(String name, int age, String address) {
			
     		this.name = name;
			this.age = age;
			this.address = address;
			count++;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getAddress() {
			return address;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "EmployeeName=" + name + ", EmployeeAge=" + age + ", EmployeeAddress=" + address;
		}
		

}
