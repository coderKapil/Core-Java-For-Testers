package Day3;

public class IncrementOperator {

	public static void main(String[] args) {
	    //Increment Operator
		//++ is called increment operator
		/*int a=10;
		System.out.println(a);
		a++; // is exactly equal to a = a+1;
		System.out.println(a);
		*/
		
		//case 2--> post increment
//		int a = 10;
//		int res = a++;
//		System.out.println(res); //10
//		System.out.println(a); //11
		
		//case 3--> pre increment
		int a=10;
		int res = ++a;
		System.out.println(res);//11
		System.out.println(a);//11
		
	}

}
