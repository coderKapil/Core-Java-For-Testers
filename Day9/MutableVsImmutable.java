package Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
//		mutable-can change
		/*int a[] = {20,10,40,50,30};
	    System.out.println(Arrays.toString(a));	
	    Arrays.sort(a);//mutable
	    System.out.println(Arrays.toString(a));
	    */
		
		//immutable
		String s = new String("welcome");
		String concatenatedString = s.concat(" to java");
		System.out.println(s);
		//but it is not changing the original value thats why string is immutable
		System.out.println(concatenatedString);
		
	}

}
