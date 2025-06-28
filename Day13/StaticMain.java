package Day13;

public class StaticMain {

	public static void main(String[] args) {
		
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
//		System.out.println(b); cannot access b is non-static
//		m2(); cannot access m2 is non-static
		
//		static method can access non-statci stuff through objects
		StaticDemo sd = new StaticDemo();
//		System.out.println(sd.b);
//	    sd.m2();
	    
	    sd.m();

	}
}
