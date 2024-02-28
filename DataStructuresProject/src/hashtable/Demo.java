package hashtable;

public class Demo {

	public static void main(String[] args) {
		MySimpleHashtable hashtable = new MySimpleHashtable();
		hashtable.put("Bob", new Student(101, "Bob", 70));
		hashtable.put("Mike", new Student(102, "Mike", 80));
		hashtable.put("Maria", new Student(103, "Maria", 90));
		
		System.out.println(hashtable);
		
		System.out.println(hashtable.get("Mike"));
		
	}

}
