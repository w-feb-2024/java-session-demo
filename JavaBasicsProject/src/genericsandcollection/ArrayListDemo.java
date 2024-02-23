package genericsandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		//ArrayList<Integer> allNumbers = new ArrayList<>(); // not recomended
		
		List<Integer> allNumbers = new ArrayList<>();
		//List<Integer> allNumbers = new Vector<>();
		
		// CRUD - Create, Read, Update, Delete
		// C - Create
		allNumbers.add(45);
		allNumbers.add(60);
		allNumbers.add(50);
		allNumbers.add(2);
		
		// R - Read
		//1
		for(int i=0;i<allNumbers.size();i++) {
			System.out.println(allNumbers.get(i));
		}
		
		System.out.println("---------------");
		//2
		Iterator itr = allNumbers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------");
		
		//3
		for(int eachNum: allNumbers) {
			System.out.println(eachNum);
		}
		System.out.println("---------------");

		//4 - using lambda expressions
		allNumbers.forEach((item)->System.out.println(item));
	
		
		System.out.println("---------------");
		// U - Update
		allNumbers.set(1, 65);
		for(int eachNum: allNumbers) {
			System.out.println(eachNum);
		}
		System.out.println("---------------");
		
		// D - delete
		allNumbers.remove(2);
		for(int eachNum: allNumbers) {
			System.out.println(eachNum);
		}
		
		for(Integer num: allNumbers) {
			if(num < 50) {
				System.out.println(num);
				//allNumbers.remove(Integer.valueOf(num));
			}
		}
		System.out.println("---------------");

		allNumbers.removeIf((item) -> item < 50);
		allNumbers.forEach((item)-> System.out.println(item));
	}

}
