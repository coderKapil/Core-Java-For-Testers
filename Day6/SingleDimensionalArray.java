package Day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//declaring Array
		//Approach 1
		/*int a[] = new int[5];//declaration
		//adding values
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
       */
		
		//Approach 2
		int a[]= {100,200,300,400,500};//declaration plus assignment
		
		//find length of an array
		System.out.println("Length of a array is "+a.length);
		
		
		//reading specific value from an array
//		System.out.println(a[2]);
		
		//reading all the values from array
		//Normal for loop
//		for(int i=0; i<5; i++) {
//			System.out.println(a[i]);
//		}
		
		//Enhanced for loop or for each loop
		
		for(int x:a) {
			System.out.println(x);
		}
		
		
		
	}

}
