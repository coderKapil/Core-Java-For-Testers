package Day7;

public class Problem4 {

	public static void main(String[] args) {
		int a[] = {100,20,35,41,500};
		
		int smallest = a[0];
        
		for(int i=1; i< a.length; i++) {
			if(smallest > a[i]) {
				smallest = a[i];
			}
		}
		
		System.out.println("Smallest number in an array is: "+smallest);
	}

}
