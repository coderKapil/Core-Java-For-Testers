package Day9;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		//check if a string is palindrome or not
		
		String s = "racecar";
		String rev = "";
		
		char a[] = s.toCharArray();
		
		for(int i=a.length-1; i>=0; i--) {
			rev += a[i];
		}
		
		if(rev.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
				
	}

}
