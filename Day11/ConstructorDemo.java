package Day11;

public class ConstructorDemo {

	int x , y;
	
//	Default Constructor
	ConstructorDemo(){
		x=10;
		y=9;
	}
	
//	Parameterised Constructor
	ConstructorDemo(int a, int b){
		x=a;
		y=b;
	}
	
//	method
	void sum() {
		System.out.println(x+y);
	}
	
	
	
	public static void main(String[] args) {
		
		
		//ConstructorDemo cd = new ConstructorDemo();//this will invoke default constructor
//		this will invoke parameterised constructor
		ConstructorDemo cd = new ConstructorDemo(10,19);
		cd.sum();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
