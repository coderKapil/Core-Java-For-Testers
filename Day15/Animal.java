package Day15;

public class Animal {

	String color = "white";
	
	void eat() {
		System.out.println("eating...");
	}
	
}

class Dog extends Animal{
	String color = "black";
	
	void display() {
		System.out.println(super.color);
	}
	
	void eat() {
//		System.out.println("eating bread...");
//inside the child class meth we are invoking the parent class method using super keyword
		super.eat();
	}
}
