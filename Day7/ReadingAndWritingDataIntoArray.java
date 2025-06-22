package Day7;
import java.util.*;
public class ReadingAndWritingDataIntoArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);

		//Entering values inside array
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter the value for the position: "+i);
			a[i] = sc.nextInt();
		}
		
		System.out.println("Values inside array are: ");
		//printing values from ana array
		for(int x: a) {
			System.out.print(x+" ");
		}

	}

}
