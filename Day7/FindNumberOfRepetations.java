package Day7;

public class FindNumberOfRepetations {

	public static void main(String[] args) {
		int a[]= {10,20,10,10,10};
        int count = 0;
        int target = 20;
        
        //using normal for loop
//        for(int i=0; i<a.length; i++) {
//        	if(target == a[i]) {
//        		count++;
//        	}
//        }
        
        //using for each loop
        for(int x:a) {
        	if(target == x){
        		count++;
        	}
        }
        System.out.println("Count of a number is: "+count);
	}

}
