package Day12;

public class Adder {

	int a=10 , b=9;
	
	void sum() {
		System.out.println(a+b);
	}
//	1 number of parameters are different
	void sum(int x, int y) {
		System.out.println(x+y);
	}

//	Datatypes of parameteres should be different
	void sum(int x, double y) {
		System.out.println(x+y);
	}
	
// Orders of the parameter shoudl be different 
	void sum(double x, int y) {
		System.out.println(x+y);
	}
	
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	
	
}
