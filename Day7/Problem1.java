package Day7;

import java.util.Arrays;

public class Problem1 {

	public static void main(String[] args) {
		//Sorting Element using for loop
		int a[] = {50,20,40,10,100};
        System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					//swapping
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));
		
	}

}
