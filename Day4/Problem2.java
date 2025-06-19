package Day4;

public class Problem2 {

	public static void main(String[] args) {
		//Smallest of 3 number
		int a = 10, b=12, c=3;
		
		if(a < b && a < c) {
			System.out.println("a is smallest");
		}
		else if(b < a && b < c) {
			System.out.println("b is smallest");
		}
		else {
			System.out.println("c is smallest");
		}

	}

}
