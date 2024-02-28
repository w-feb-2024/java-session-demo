package hashtable;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MySimpleHashtable {
	Student[] items;
	
	public MySimpleHashtable() {
		items = new Student[10];
	}
	
	private int hashTheKey(String key) {
		// we mod the length of the key string with the length of the array
		// so that we get a value from 0 to 9
		return key.length() % items.length;
	}
	
	public void put(String key, Student value) {
		// here the hastable takes the name of student as key
		// and value is the student object
		
		// hash the key, 
		// this hashed key will become the index of the items array in which we want to insert the student object
		int index = hashTheKey(key);
		
		if(items[index] != null) {
			// here a collision occured because of same index
			// collision can solve by linear probing - finding the next free index and store the student object in that index
			// we have note handled collision here
			// we already have a student object in this index
			// so throw exception
			throw new NoSuchElementException("Value already present!");
		}
		items[index] = value;
	}

	public Student get(String key) {
		// first hash the key to know the index in the array from which the value has to be retrived
		int index = hashTheKey(key);
		return items[index];
	}
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "MySimpleHashtable [items="
				+ (items != null ? Arrays.asList(items).subList(0, Math.min(items.length, maxLen)) : null) + "]";
	}
	
	
}
