package Day6;

public class Problem2 {

	public static void main(String[] args) {
		//Print even and odd numbers from array
		int a[]= {1,2,3,4,5,6};
        int countEven = 0;
        int countOdd = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] % 2 == 0) {
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		
		System.out.println("Even count: "+countEven);
		System.out.println("Odd count: "+countOdd);
	}

}
