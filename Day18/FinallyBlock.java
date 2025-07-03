package Day18;

public class FinallyBlock {

	public static void main(String[] args) {
        System.out.println("Program started ...");
		
		String s = "welcome";
		try {
			System.out.println(s.length());	
		}
		catch(NullPointerException e) {
			System.out.println("Catch block Handled exception...");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("you entered into finally block...");
		}
		System.out.println("Program ended ...");

	}

}
