package Day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
//		char s[] = {'D','C','B','A'};
		String s[]= {"scott","marry","john","david"};
		
		System.out.println("Before Sorting....");
        System.out.println(Arrays.toString(s));
        
        System.out.println("After Sorting ....");
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
	}

}
