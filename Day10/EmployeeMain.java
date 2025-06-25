package Day10;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();//object
		emp1.eid=101;
		emp1.ename="John";
		emp1.job = "Manager";
		emp1.salary=50000;
		
		
//		printing without display method
		
		System.out.println(emp1.eid);
		System.out.println(emp1.ename);
		System.out.println(emp1.job);
		System.out.println(emp1.salary);
		
//		emp1.display();
		
		
		Employee emp2 = new Employee();
		emp2.eid=102;
		emp2.ename="Kim";
		emp2.job="SDE";
		emp2.salary=60000;
		emp2.display();

	}

}
