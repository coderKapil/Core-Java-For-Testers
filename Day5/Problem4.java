package Day5;

public class Problem4 {

	public static void main(String[] args) {
		//Count Number of Even and Odd digits in a Number
		int num=23456;
		int countEven=0;
		int countOdd=0;
		
		while(num!=0) {
			int ld=num%10;
			if(ld%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
			num /= 10;
		}
		System.out.println(countEven+" Even");
		System.out.println(countOdd+" Odd");

	}

}
