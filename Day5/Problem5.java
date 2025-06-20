package Day5;

public class Problem5 {

	public static void main(String[] args) {
		//Find Sum of Digits in a Number
		int num=1234;
		int sum=0;
		
		while(num!=0) {
			int ld=num%10;
			sum += ld;
			num /= 10;
		}
		System.out.println(sum);

	}

}
