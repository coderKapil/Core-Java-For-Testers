package Day17;

public class DataConversionMethods {

	public static void main(String[] args) {
	
//		String--> int
		
//		String s = "welcome";//cannot convert to int numberformatexception
//		String s = "12345";
//		int sint = Integer.parseInt(s);
//		System.out.println(sint);
		
//		String s1 = "10";
//		String s2 = "20";
//		converting s1 and s2 into integer using Integer wrapper class
//		int s1int=Integer.parseInt(s1);
//		int s2int = Integer.parseInt(s2);
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

//		String -> double
		
	/*	String s1 = "10.5";
		String s2 = "20.0";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
	*/
		
//		String -> Boolean only if u have true/false value as a string that u can convert to boolean
//if u pass anything in the string other than true then by default it will returns us false as an o/p		
		/*String s1 = "true";
		System.out.println(Boolean.parseBoolean(s1));
		
		*/
		
		
//		int , double, boolean, char --> String
		int a = 10;
		double d = 10.5;
		char c ='A';
		boolean bool = true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bool));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
