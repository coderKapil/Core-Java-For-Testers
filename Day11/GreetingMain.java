package Day11;

public class GreetingMain {

	public static void main(String[] args) {
		Greetings g1 = new Greetings();
		g1.m1();
//	whenever methos is returning something we have to store it insidea variable 
        String s = g1.m2();
        System.out.println(s);
        g1.m3("Kapil");
        String str = g1.m4("Roman");
        System.out.println(str);
	}

}
