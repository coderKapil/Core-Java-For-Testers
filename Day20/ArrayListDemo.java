package Day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
//		Declaration
	   ArrayList mylist = new ArrayList();
//		List mylist = new ArrayList();
		
//		ArrayList<String> mylist = new ArrayList();
		
//	   Adding data into arraylist
	   mylist.add(100);
	   mylist.add(10.5);
	   mylist.add("welcome");
	   mylist.add('A');
	   mylist.add(true);
	   mylist.add(100);
	   mylist.add(null);
	   mylist.add(null);
	   
	   
//	   size of arraylist
//	   System.out.println("Size of arraylist is: "+mylist.size());
	   
//	   printing the values of arraylist
//	   System.out.println(mylist);
	   
//	   Removing element from arraylist
	   mylist.remove(5);
	   System.out.println(mylist);
	   
//	   Inserting element into arraylist
	   mylist.add(2,"Java");
	   
	   System.out.println(mylist);
	   
//	   Modify element in the arraylist(modify/change/replace)
	   mylist.set(2, "Python");
	   System.out.println(mylist);
	   
//	   Access specific element from arraylist
	   System.out.println(mylist.get(3));// here 3 is idx of that element
	   
//	   Reading all the elements from arraylist
	   
	   //using normal forloop
//	   for(int i=0; i<mylist.size(); i++) {
//		   System.out.println("Values of arraylists are: "+mylist.get(i));
//	   }
	   
//	using for each loop
	   
//	   for(Object x: mylist) {
//		   System.out.println(x);
//	   }
	   
//	   using Iterator
	   
	   Iterator it =mylist.iterator();
	   
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   }
	   
//	   checking the arraylist is empty or not
	   
	   System.out.println("is arraylist Empty ? "+mylist.isEmpty());
	   
	   //remove all the elements from the arraylist
//	   mylist.clear();
//	   System.out.println(mylist);
	   
//	   removing specific elements from arraylist without repeating remove() method again and again
//	 we will use removeAll() method
	   ArrayList mylist2 = new ArrayList();
	   mylist2.add(100);
	   mylist2.add("welcome");
	   mylist.removeAll(mylist2);
	   System.out.println(mylist);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
