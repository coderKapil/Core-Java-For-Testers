package Day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//declaring array
		//int a[][]=new int[3][2];
		//or
		//int [][]a=new int[3][2];
		//or
		//int []a[]=new int[3][2];
		//Approach 1
		/*a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
	   //Approach 2
		//thats how we can store data inside two dimensional array
		int a[][] = { {100,200},
				      {300,400},
				      {500,600}
				      };
		
		//finding size of an array
		
//		System.out.println("Length of rows: "+a.length);
//		System.out.println("Length of columns: "+a[0].length);
		
		//read single value from ana array
//		System.out.println(a[2][1]);
		
		//read all values from an two dimensional array
		//Normal for loop
		/*for(int i=0; i<a.length; i++) {//i represents row number
			for(int j=0; j<a[i].length; j++) {//j value represents column
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		//enhanced for loop
		
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}

}
