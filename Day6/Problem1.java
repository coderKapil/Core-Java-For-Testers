package Day6;

public class Problem1 {

	public static void main(String[] args) {
		//Find sum of elements in array
		int a[]= {1,2,3,4,5};

		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println("The sum of all the elements of arrays are: "+sum);
	}

}
