package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
//		declaration
//		HashMap hm = new HashMap();
//		Map mymap = new HashMap();
		
//		for specific type of key value
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
//		Adding Pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");
		
		
		System.out.println(hm);//{101=John, 102=David, 103=Mary, 104=Scott}
		System.out.println("Size of a map is: "+hm.size());//4
		
//		removing a pair
		hm.remove(103);//here 103 is the key of the pair
		System.out.println("After removing the value: "+hm); 
		
//		Accessing values of the key
		System.out.println("Accessing value using key is: "+hm.get(102));
		
//		Get all the keys from hashmap
		System.out.println(hm.keySet());
		
//		Get all the values from the HashMap
		System.out.println(hm.values());
//	Get all the key values pair 
		System.out.println(hm.entrySet());
		
//		Reading data from HashMap
		
//		for(int k:hm.keySet()) {
//			System.out.println(k+"     "+hm.get(k));
//		}
		
//		Using Iteratot
		
		Iterator <Entry<Integer, String>> it =hm.entrySet().iterator();
		
		
		while(it.hasNext()) {
			Entry entry = it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
//		clear everything from your HashMap
		hm.clear();
		System.out.println(hm.isEmpty());
		
		
		
		
		

	}

}
