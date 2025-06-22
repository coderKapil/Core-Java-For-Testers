package Day7;

public class Problem3 {

	public static void main(String[] args) {
		int a[]= {10,200,30,40};
      
		//Find largest num in array
		int largest = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(largest < a[i]) {
				largest = a[i];
			}
		}
		System.out.println("Largest number in an array is: "+largest);
	}

}
