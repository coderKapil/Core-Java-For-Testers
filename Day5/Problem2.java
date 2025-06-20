package Day5;

public class Problem2 {

	public static void main(String[] args) {
		int rev = 0;
		int num = 12345;//number we wanted to reverse
		int temp=num;
		while(temp != 0) {//run the loop till the number become zero
			int ld = temp % 10;//extracting last digit from a num
			rev = rev * 10 +ld;//reversing the number
			temp /= 10;// removing the last digit
		}
		if(num == rev) {
			System.out.println("It is a palindrome number");
		}
		else {
			System.out.println("Not the palindrome number");
		}

	}

}
