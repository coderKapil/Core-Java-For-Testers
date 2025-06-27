package Day12;

public class AdderMain {

	public static void main(String[] args) {
	
	Adder a1 = new Adder();
	a1.sum();//1
	a1.sum(1,2);//2
	a1.sum(3,4.5);//3
	a1.sum(4.5,12);//4
    a1.sum(1,2,3);//5
	}

}
