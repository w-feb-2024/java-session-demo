package genericsandcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Long> phoneBook = new HashMap<>();
		
		// C - Create
		phoneBook.put("abc", 1234567890L);
		phoneBook.put("xyz", 111111111L);
		phoneBook.put("lmn", 2222222222L);
		phoneBook.put("asd", 5555555555L);
		phoneBook.put("asd", 5555555555L);
		phoneBook.put("ert", 111111111L);
		
		phoneBook.put(null, 3453453453L);
		phoneBook.put(null, 3453453453L);
		
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
