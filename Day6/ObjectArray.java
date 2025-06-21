package Day6;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[]= {100,10.5,'A',"Welcome",true};

		
		//normal for loop
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		//for each loop
//		for(Object x:a) {
//			System.out.println(x);
//		}
	}

}
