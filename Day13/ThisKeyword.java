package Day13;

public class ThisKeyword {
	
	int x,y;//class variables
	
	//local variable inside methods and var pass as params
	
//	ThisKeyword(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
	
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
	
//		ThisKeyword tk = new ThisKeyword(5,2);
		ThisKeyword tk = new ThisKeyword();
		tk.setData(10, 20);
		tk.display();
		

	}

}
