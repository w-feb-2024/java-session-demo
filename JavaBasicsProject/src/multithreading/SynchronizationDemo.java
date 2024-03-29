package multithreading;

public class SynchronizationDemo {
	// [hello][welcome][java]
	// Thread1 - use the printer resource and print [hello] 
	// Thread2 - use the same printer resource and print [welcome]
	// Thread3 - use the same printer resource and print [java]
	// Resource - printer  which print the message on the console
	public static void main(String[] args) {
		ResourcePrinter printer = new ResourcePrinter();
		PrintRequestThread p1 = new PrintRequestThread("hello", printer);
		PrintRequestThread p2 = new PrintRequestThread("welcome", printer);
		PrintRequestThread p3 = new PrintRequestThread("java", printer);
	}

}
