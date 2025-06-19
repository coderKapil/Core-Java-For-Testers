package Day4;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=100, b=40,c=30;
		if(a > b && a > c) {
			System.out.println(a+" a is a largest number");
		}
		else if(b > a && b > c) {
			System.out.println(b+" b is a largest number");
		}
		else {
			System.out.println(c+" c is a largest number");
		}

	}

}
