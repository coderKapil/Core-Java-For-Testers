package Day14;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
	
		System.out.println(args.length);
		for(String x: args) {
			System.out.println(x);
		}

	}

}
