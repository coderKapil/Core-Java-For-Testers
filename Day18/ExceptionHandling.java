package Day18;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
	
System.out.println("program started .....");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		try {
			System.out.println(100/num);//Arithmetic Exception	
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data...");
		}
		
		System.out.println("program is completed .....");
		System.out.println("program is exited .....");
      

	}

}
