package genericsandcollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		SortedSet<String> allNames = new TreeSet<String>();
		allNames.add("Harry Potter");
		allNames.add("Ron Weasley");
		allNames.add("Sirius Black");
		allNames.add("Draco Malfoy");
		allNames.add("Dobby");
		allNames.add("Draco Malfoy");
		
		
		for(String eachName: allNames) {
			System.out.println(eachName);
		}
		
		
		
	}
}
