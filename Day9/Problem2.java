package Day9;

public class Problem2 {

	public static void main(String[] args) {
//		Remove Junk or special charater
		String s = "we$#@!%^&*lcome";
		String clean = s.replaceAll("[^a-zA-Z0-9]", "");//charcters other than aplphabets and numbers
		System.out.println(clean);

	}

}
