package Day5;

public class Problem1 {

	public static void main(String[] args) {
		int rev = 0;
		int num = 12345;//number we wanted to reverse
		while(num != 0) {//run the loop till the number become zero
			int ld = num % 10;//extracting last digit from a num
			rev = rev * 10 +ld;//reversing the number
			num /= 10;// removing the last digit
		}
		System.out.println(rev);//printing the reversed number at the end

	}

}
