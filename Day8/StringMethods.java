package Day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
//		String s = "welcome";
//		String s = new String("welcome");
//		System.out.println(s);
		
		//String methods
//		int l = s.length();
		
//		System.out.println(l);
		
		//Directly using length method
//		System.out.println("welcome".length());
		
//		String s1 = "welcome";
//		String s2 = " to java";
//		String s3 = " automation";
		//1st way
//		System.out.println(s1+s2+s3);
//		2nd way
//		System.out.println(s1.concat(s2).concat(s3));
		//3rd way
//		System.out.println(s1.concat(s2+s3));
		
		//Dierctly concating the values instead of using variables
//		System.out.println("welcome".concat(" to java".concat(" automation")));
		
		//trim()
		
//		String s = "   welcome   ";
		//finding length of string before trimming
//		System.out.println(s.length());
//		System.out.println(s);//print string along with spaces
//		System.out.println(s.trim());
		//finding length of string after trimming
//		System.out.println(s.trim().length());
		
		//charAt()
		
//		String s = "welcome";
//		System.out.println(s.charAt(3));
//		System.out.println(s.charAt(0));
		
		//contains()
//		String s1 = "welcome";
	
//		System.out.println(s1.contains("wel"));//true
//		System.out.println(s1.contains("come"));//true
		//false due of W uppercase it will treat upper and lower case differently
//		System.out.println(s1.contains("Wel"));
		
		//equals() or equalsIgnoreCase()--> both are used for comparing the two strings
		
//		String s1 = "welcome";
//		String s2 = "welcome";
//		
//		System.out.println(s1 == s2);//true
//		System.out.println(s1.equals(s2));//true
//		System.out.println(s1.equals("Welcome"));//false
//		System.out.println(s1.equalsIgnoreCase("Welcome"));//true
		
		//replace()
//		String s = "welcome to selenium java selenium python selenium c#";
//		System.out.println(s.replace('e', 'x'));
//		System.out.println(s.replace("selenium", "playright"));
//		
//		replace all a with x and all c with y
		String s = "aacaacc";
	    System.out.println(s.replace("a", "x").replace("c", "y"));
		
		//substring()
		s = "Selenium";
		System.out.println(s.substring(1,5));
		System.out.println(s.substring(0,3));
		
//		toUpperCase() and toLowerCase()
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
//		split()
//		s="abc123@gmail.com";
//		
//		String a[]=s.split("@");
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(Arrays.toString(a));
		
		//ex1
		String amount = "$15,20,55";
		System.out.println(amount.replace("$", "").replace(",", ""));
		
		//ex2
		s="abc,123@xyz";
		String a1[]=s.split(",");
		System.out.println(Arrays.toString(a1));
		
		String a2[]=a1[1].split("@");
		System.out.println(Arrays.toString(a2));
		
		System.out.println(a1[0]);
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		
		//ex3
		s = "abc 123";
		String a3[] = s.split(" ");
		System.out.println(Arrays.toString(a3));
		
		//ex4
		String name = "John Keenedy";
//		1st way
		System.out.println(name.toLowerCase().contains("john"));
//		2nd way
		System.out.println(name.replace("J", "j").contains("john"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
