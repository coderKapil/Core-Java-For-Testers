package Day2;

public class DataTypesDemo {

	public static void main(String[] args) {
		//Numeric Data types
		int a=100 , b=200;
		
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		System.out.println("value of a and b is: "+(a+b));
		
		byte c = 125;
		System.out.println(c);
		
		short d = 3200;
				System.out.println(d);
				
		long e = 1234567789l;//Literal is needed which is l or L
		System.out.println(e);
		
		//Decimal Number
		float item_price=15.55f;//Here also literal is needed f or F
		System.out.println(item_price);
		
		double dbl = 15.444444444444444;
		System.out.println(dbl);
		
		char ch = 'a';
		System.out.println(ch);
		
		String name = "John";
		System.out.println(name);
		
		//char ch = 'abc';//invalid
		//String s = 'abc';//invalid
		//String ch = 'a';//invalid
		
//		String str = "A";
//		System.out.println(str);
		
		//boolean bl = false; //allows only true and false
		//System.out.println(bl);
		
		//boolean bl = "true"; //not invalid
		//boolean bl = "false"; //not invalid
		
		//String bl = true; //not valid
		String bl = "true";
	}

}
