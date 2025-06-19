package Day3;

public class TernaryOperator {

	public static void main(String[] args) {
		//Ternanry Operator
		//var= exp ? result1 : result2
		
		//Example 1
		/*int a=100 , b=200;
		int largest = (a < b) ? b : a;
		System.out.println(largest);
		*/
		
		//Example 2
//		int x = (1 == 1) ? 100 : 200;
//		System.out.println(x);
		
//		int x = (1==2) ? 200 : 100;
//		System.out.println(x);
		
		//Example 3
		int person_age = 15;
		String result = (person_age >= 18) ? "Eligible for Vote" : "Not Eligible for Vote";
		System.out.println(result);
	}

}
