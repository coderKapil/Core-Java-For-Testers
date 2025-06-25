package Day10;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sid=101;
		s1.sname="Mohan";
		s1.grade='A';
		
		s1.display();
		
		Student s2 = new Student();
		s2.sid=102;
		s2.sname="Rohan";
		s2.grade='B';
		
		s2.display();
	}

}
