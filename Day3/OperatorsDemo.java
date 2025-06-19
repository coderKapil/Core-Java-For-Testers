package Day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic Operators--> + - * / %
		int a = 20, b=10;
//		System.out.println("Sum of a and b is: "+(a+b));
//		System.out.println("Subtraction of a and b is: "+(a-b));
//		System.out.println("Multiplication of a and b is: "+(a*b));
//		System.out.println("Division of a and b is: "+(a/b));
//		System.out.println("Modulo of a and b is: "+(a%b));
		
		//Relational or comparison operators--> > >= < <= == != 
//		System.out.println(a>b);
//		System.out.println(a>=b);
//		System.out.println(a<b);
//		System.out.println(a<=b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
		
		//Logical Operators --> && || !
		//returns boolean value either true or false
        //works between 2 boolean values
		
		boolean x = true;
		boolean y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1 = 10>20;
		System.out.println(b1);//false
		
		boolean b2 = 20>10;
		System.out.println(b2);//true
		
		System.out.println(b1 && b2);//false
		System.out.println(b1 || b2);//true
		
		System.out.println((10<20) && (20>10));//true
	}

}
