package Day9;

public class ReverseString {

	public static void main(String[] args) {
		//example 1
		/*String s = "welcome";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		
		System.out.println("Reverse String is: "+rev);
       */
		
//		Approach 2- by converting string to char array type
		
//		String s = "welcome";
//		String rev = "";
////		this will convert the entire string into character array
//		char a[] = s.toCharArray();
//		for(int i=a.length-1; i>=0; i--) {
//			rev = rev+a[i];
//		}
//		
//		System.out.println("Reverse string is: "+rev);
		
		
//		approach 3 - using stringbuffer class
		
//		StringBuffer a = new StringBuffer("welcome");
//		System.out.println(a.reverse());
		
		//approach 4-- using stringbuilder
		StringBuilder s = new StringBuilder("welcome");
		System.out.println("Reversed String is : "+s.reverse());
		
		
		
		
		
		
		
		
		
		
		
	}

}
