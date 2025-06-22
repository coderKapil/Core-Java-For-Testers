package Day7;

public class Problem2 {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		
		int n = a.length+1;//since one number is missing in the array
		int expectedSum = n*(n+1)/2;//sum of n natural numbers
		int actualSum = 0;
		
		for(int x:a) {
			actualSum += x;
		}
		
		int missingNumber = expectedSum - actualSum;
		System.out.println("Missing number in the array is: "+missingNumber);

	}

}
