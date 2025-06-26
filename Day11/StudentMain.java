package Day11;

public class StudentMain {

	public static void main(String[] args) {
//		Student s1 = new Student();
//		diff ways of storing data
// 1) using object reference variable
		/*s1.sid=101;
		s1.sname="Joseph";
		s1.grade='A';
		*/
		
//		2) using method
		/*s1.setStudentData(101, "John", 'A');
		s1.printStudentData();
		*/
//   3) using constructor
		Student s2 = new Student(101,"John",'A');
		s2.printStudentData();

	}

}
