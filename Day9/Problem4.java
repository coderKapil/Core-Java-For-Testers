package Day9;

public class Problem4 {

	public static void main(String[] args) {
		// Count Occurences of a characters in a string
		String s = "aabbbccccd";
		
       int totalCount = s.length();
       int totalCount_AfterRemoving = s.replace("c", "").length();
       int count = totalCount - totalCount_AfterRemoving;
       
       System.out.println("Total occurences of a charactres in a string is: "+count);
	}

}
