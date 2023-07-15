package assignmentNew;

public class Lab1 {
	 
	public static void main(String[] args) {
		Person obj=new Person("hari",20,"no.2,pillaiyar kovil st");
		Person obj1=new Person("haran",20,"no.2,pillaiyar kovil st");
		Person obj2=new Person("amma",45,"no.2,pillaiyar kovil st");
		Employee ob=new Employee();
		
		ob.setEmployeeId(12);
        ob.setSalary(30000);
      
        
        System.out.println(ob.toString());
        
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        
        System.out.println("object counting :"+Person.count);
	}

}

 
	
	
