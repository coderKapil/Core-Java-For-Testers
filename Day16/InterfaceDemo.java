package Day16;import java.awt.Rectangle;

interface Shape{
	int length=10; //by default variables are final static
	int width=20;
	
//abstract , static and default methods are allowed inside interface
	void circle();//abstract method no implementation
	
	default void square() {
		System.out.println("This is a square-default method");
	}
	
	static void rectangle() {
		System.out.println("This is a rectangle-static method");
	}
}

public class InterfaceDemo implements Shape{

	public void circle() {
		System.out.println("This is a circle");
	}
	
	void triangle() {
		System.out.println("This is a triangle");
	}
	
	public static void main(String[] args) {
//		Scenario 1
//		InterfaceDemo obj = new InterfaceDemo();
//		obj.circle();
//		obj.square();
//		//static meth can directly access from interface without creating any obj
//		Shape.rectangle();
//		obj.triangle();

//		Scenario 2
		
		Shape x = new InterfaceDemo();
		
		x.circle();//abstract method
		x.square();//default method
		
		Shape.rectangle();//static method can directly access from interface
//error u can't access it because no triangle method is defined in the interface even though
//if u create class object but ur holding child class into Interface shape type ref var and their 
	//no triangle meth is defined
		
//		x.triangle()
		//accessing static variables directly access static variable no need of obj 
		System.out.println(Shape.length * Shape.width);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
