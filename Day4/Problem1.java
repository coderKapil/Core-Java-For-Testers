package Day4;

public class Problem1 {

	public static void main(String[] args) {
		//Largest of 2 number using (if-else and ternary operator)
		int a=200,b=30;
		//Solution 1 using if-else
//		if(a > b) {
//			System.out.println(a);
//		}
//		else {
//			System.out.println(b);
//		}
		
		//Solution 2 using Ternary operator
		int result = (a>b)?a:b;
		System.out.println(result);

	}

}
