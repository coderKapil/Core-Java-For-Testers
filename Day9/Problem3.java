package Day9;

public class Problem3 {

	public static void main(String[] args) {
		// how to remove white spaces in a string
		String s = "w e l c ome";
		String newString = s.replaceAll(" ", "");
		System.out.println(newString);
	}

}
