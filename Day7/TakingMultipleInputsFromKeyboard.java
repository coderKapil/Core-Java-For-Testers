package Day7;
import java.util.*;
public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter number 1");
//		int num1 = sc.nextInt();
//		System.out.println("Enter Number 2");
//		int num2 = sc.nextInt();
//		
//		System.out.println("Addition of num1 and num2 is "+(num1+num2));
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Your name is: "+name);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: "+age);
		
		System.out.println("Enter unknown value");
		Object value = sc.next();
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
	}

}
