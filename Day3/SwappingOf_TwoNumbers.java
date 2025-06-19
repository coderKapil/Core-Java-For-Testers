package Day3;

public class SwappingOf_TwoNumbers {

	public static void main(String[] args) {
     //Solution 1
//		int a = 10 , b=20;
//		System.out.println("Values pf a and b before swapping");
//		System.out.println(a);
//		System.out.println(b);
//		int temp = 0;
//		temp = a;
//		a=b;
//		b=temp;
//		System.out.println("Values pf a and b after swapping");
//		System.out.println(a);
//		System.out.println(b);

		//Solution 2 --> without using temp variable
		
		int a = 10 , b = 20;
		a = a+b;//a becomes 30
		b = a-b;//b becomes 10 
		a = a-b;//a becomes 20
		System.out.println("Vlues of a and b after swapping");
		System.out.println(a);
		System.out.println(b);
	}

}
