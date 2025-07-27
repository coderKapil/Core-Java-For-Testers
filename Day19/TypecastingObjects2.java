package Day19;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class TypecastingObjects2 {

	public static void main(String[] args) {
// Rule 1- conversion is valid or not
//Cat ct = (Cat)an;
//a    b     c   d
//The type of d and c must have some relationship(either parent to child or child to parent)
//		Animal an = new Dog();
//		Cat ct = (Cat)an;//valid as per rule 1
		
//		Dog dg = new Dog();
//		Cat c1 = (Cat) dg;//invalid as per rule 1
		
	//Rule2 - Assignment is valid or not
// c must be either same as a or child of a
		
//		Animal an = new Dog();
//		Cat ct = (Cat) an;//valid as per rule 2
		
//		Animal an = new Dog();
//dog is not same as cat and also not the child of cat thats why rule 2 failed here and it is invalid
//		Cat ct = (Dog) an;//invalid according to rule 2
		
//	Rule 3 - The underlying object of type of d must be either same or child of c
//		Animal an = new Dog();
//		Cat ct = (Cat) an;
		
//	Rule 1, RULE 2 , Rule 3 combine all
		Animal an = new Dog();
		Dog dg = (Dog) an;
		
		
		
		
		
		
		
		
		
		

	}

}
