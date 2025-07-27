package Day19;

class Parent{
	String name="John";
	
	void m1() {
		System.out.println("this is a m1 method...");
	}
}

class Child extends Parent{
	int id=101;
	
	void m2() {
		System.out.println("this is a m2 method...");
	}
}

public class TypecastinforObject1 {

	public static void main(String[] args) {
		
	/*Child c = new Child();
	
	System.out.println(c.name);
	System.out.println(c.id);
	c.m1();
	c.m2();
	*/
// we are assigning lower class i.e child class to higher parent class
		/*Parent p = new Child();//upcasting
		
		System.out.println(p.name);
		p.m1();
		System.out.println(p.id);//error we cannot access since the ref var is of parent
		p.m2();//error
		
		*/
	/*	Parent p = new Parent();
		Child c = (Child) p;//downcasting
//u will get runtime error i.e parent cannot be cast to class
		c.m1();
		c.m2();
		System.out.println(c.name);
		System.out.println(c.id);
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
