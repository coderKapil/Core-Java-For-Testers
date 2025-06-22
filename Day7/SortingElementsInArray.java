package Day7;

import java.util.*;

public class SortingElementsInArray {

	public static void main(String[] args) {
		int a[]= {100,600,200,400,500};
         
		System.out.println("Before Sorting....");
		//Printing elements of array using built in method(Before Sorting)
		System.out.println(Arrays.toString(a));
		
		//Sorting using inbuilt method
		System.out.println("After Sorting.....");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
