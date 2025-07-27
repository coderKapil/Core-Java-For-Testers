package Day19;

public class TypecastingObject3 {

	public static void main(String[] args) {
		//Ex-1
//	Object o = new String("welcome");
//	StringBuffer sb = (StringBuffer)o; //Rule1-yes, Rule2-yes , Rule3-no
		
//if rule1 is failed we no need to check for other rules
	    //Ex-2
//		String s = new String("welcome");
//		StringBuffer sb = (StringBuffer)s;//Rule1 is failed
		
		//Ex-3
//		Object o = new String("welcome");
//		StringBuffer sb = (String) o;//Rule1-passed Rule2-failed

//		Ex-4
//		String s = new String("welcome");
//		StringBuffer sb = (String) s; //Rule1 - passed Rule2-failed
		
		//Ex-5
		Object o = new String("welcome");
		String s = (String) o;//Rule1-passed Rule2-passed Rule3-passed
		System.out.println(s);
	}

}
