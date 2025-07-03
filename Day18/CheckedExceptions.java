package Day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program ended ...");
		System.out.println("Program in progress ...");
		
		Thread.sleep(5000);
		 
		FileInputStream file = new FileInputStream("C:\\Text.txt");
		/*try {
		Thread.sleep(5000);//checked exception java already notifies about it
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		*/
		System.out.println("Program finished ...");
		System.out.println("Program ended ...");

	}

}
