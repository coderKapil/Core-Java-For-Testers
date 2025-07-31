package Day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
//		Declaration
//	These two approaches are used to store heterogenous types of data
		HashSet myset = new HashSet();
//		Set myset = new HashSet();
		
//	This approach is used to store homogenous type of data that is only String type of data
//		HashSet<String> myset = new HashSet<String>();
         
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
//		Printing HashSet elements
		//System.out.println(myset);//[null, A, 100, 10.5, welcome, true]
		
//		Size of HashSet
		System.out.println(myset.size());//6 Element
		
//	Removing elements from the HashSet
		myset.remove(10.5);
		System.out.println(myset);
		
//		Inserting element - not possible
//		Access specific element not possible
		
//		converting HashSet --> ArrayList
//		ArrayList al = new ArrayList(myset);
//		System.out.println(al);
//		System.out.println(al.get(2));
		
//		Read all the elements using for each loop
		
//		for(Object x: myset) {
//			System.out.println(x);
//		}
		
//		using iterator
		
		Iterator it=myset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		Clearing all the values
		myset.clear();
		System.out.println("Set is empty or not ? "+myset.isEmpty());
		
		
		
		
	}

}
