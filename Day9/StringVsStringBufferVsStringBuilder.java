package Day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		//Strings-immutable
		String s = "welcome";
		s.concat(" to java");
		System.out.println(s);
		
		//StringBuffer-mutable
		StringBuffer sb = new StringBuffer("welcome");
		sb.append(" to java");//mutable we can change the original value of s
		System.out.println(sb);
		
//		StringBuilder-mutable
		StringBuilder sb2 = new StringBuilder("welcome");
		sb2.append(" to java");//mutable we can change the original value of s
		System.out.println(sb2);
		
		

	}

}
