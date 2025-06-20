package Day5;

public class Problem3 {

	public static void main(String[] args) {
		//Count number of digits in a number
		int num=12;
		int count =0;
		
		while(num != 0) {
			int ld=num%10;
			count++;
			num /= 10;
		}
       System.out.println(count);
	}

}
