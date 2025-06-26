package Day11;

public class Student {
//   these variables are called as class variables
	int sid;
	String sname;
	char grade;
	
	void printStudentData() {
		System.out.println(sid+" "+sname+" "+grade);
	}
//these variables inside this method are called as local variables
	void setStudentData(int id, String name, char gr) {
		sid=id;
		sname=name;
		grade=gr;
	}
	
//	Constructor
	Student(int id, String name, char gr){
		sid=id;
		sname=name;
		grade=gr;
	}

}
