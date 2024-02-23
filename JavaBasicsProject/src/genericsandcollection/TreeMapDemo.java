package genericsandcollection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
//		SortedMap<String, Long> phoneBook = new TreeMap<>();// default is ascending order of keys
//		SortedMap<String, Long> phoneBook = new TreeMap<>((obj1, obj2)->obj2.compareTo(obj1));
		SortedMap<String, Long> phoneBook = new TreeMap<>(Collections.reverseOrder());
		
		// C - Create
		phoneBook.put("abc", 1234567890L);
		phoneBook.put("xyz", 111111111L);
		phoneBook.put("lmn", 2222222222L);
		phoneBook.put("asd", 5555555555L);
		phoneBook.put("asd", 5555555555L);
		phoneBook.put("ert", 111111111L);
		
//		phoneBook.put(null, 3453453453L);
//		phoneBook.put(null, 3453453453L);
		
		phoneBook.put("rty", null);
		phoneBook.put("hjk", null);
		// R - Read
		//1
		Set<String> allNames = phoneBook.keySet();
		for(String eachName: allNames) {
			System.out.println(eachName + " : " + phoneBook.get(eachName));
		}
		System.out.println("-----------------------");
		//2
		Set<Entry<String, Long>> allKeyValue = phoneBook.entrySet();	
		for(Entry eachEntry: allKeyValue) {
			System.out.println(eachEntry.getKey() + ":" + eachEntry.getValue());
		}
		System.out.println("-----------------------");
		
		//3
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("-----------------------");
		
		// U - Update
		phoneBook.put("lmn", 5432154321L);
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("-----------------------");
		// D - Delete
		phoneBook.remove("xyz");
		phoneBook.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("-----------------------");

	}

}
