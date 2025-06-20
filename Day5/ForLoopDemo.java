package Day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		//Example 1 print 1..10 
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//Example 2 10 to 1
//         for(int i=10; i>=1; i--) {
//        	 System.out.println(i);
//         }
		
		//Example 3 print even number between 1..10
//		for(int i=2; i<=10; i+=2) {
//			System.out.println(i);
//		}
		
		
		// Example 4 print 1 to 10 even and odd along with statements
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i+" Even");
			}
			else {
				System.out.println(i+" Odd");
			}
		}
		
		
		
		
		
		
	}

}
