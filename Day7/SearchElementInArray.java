package Day7;

public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {700,800,400,200,1400,500,300};

		int target=200;
		boolean status = false; //false means not found , true means element found.
		//using normal for loop
		/*for(int i=0; i<a.length; i++) {
			if(a[i]==target) {
				System.out.println("Target Found");
				status = true;
				break;
			}
		}
		*/
		//using enhanced for loop
		for(int x:a) {
			if(x==target) {
				System.out.println("Target Found");
				status = true;
				break;
			}
		}
		
		if(status == false) {
		System.out.println("Element not found");
		}
	}

}
