package Day15;

class ABC{
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

//there will total 3 methods in xyz one is m1 that is overrided and 2 are m2
class XYZ extends ABC{
	
	void m1(int a) {//overriding
		System.out.println(a*a);
	}
	
	void m2(int b) {
		System.out.println(b*b);
	}
	
	void m2(int a, int b) {//overloading
		System.out.println(a+b);
	}
}


public class OverloadingVsOverriding {

	public static void main(String[] args) {
		
		XYZ xyz = new XYZ();
		
		xyz.m1(100);
		xyz.m2(200);
		xyz.m2(10, 20);

		
		
		
		
		
		
		
		
		
		
		
	}

}
