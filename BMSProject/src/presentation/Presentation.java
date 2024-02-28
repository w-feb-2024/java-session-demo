package presentation;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import model.BookPojo;

public class Presentation {
	static Scanner scan;

	static {
		scan = new Scanner(System.in);
	}

	static public int displayMenu() {
		
		System.out.println("***********************************");
		System.out.println("BOOK MANAGEMENT SYSTEM");
		System.out.println("***********************************");
		System.out.println("MENU");
		System.out.println("***********************************");
		System.out.println("1. Fetch all Books");
		System.out.println("2. Fetch a Book");
		System.out.println("3. Fetch all Books by Genre");
		System.out.println("4. Add a Book");
		System.out.println("5. Update a Book");
		System.out.println("6. Remove a Book");
		System.out.println("7. Exit");
		System.out.println("***********************************");
		System.out.println("Enter the menu option:");
		int option = scan.nextInt();
		return option;
	}
	
	public static void displayFetchAllBooks(List<BookPojo> allBooks) {
		for(BookPojo eachBook: allBooks) {
			System.out.println(eachBook);
		}
	}
	
	public static void displayExitMessage() {
		System.out.println("***********************************");
		System.out.println("Thankyou for using BMS");
		System.out.println("***********************************");
	}
	
	public static int scanBookId() {
		System.out.println("Enter book id:");
		int bookId = scan.nextInt();
		return bookId;
	}
	
	public static void displayOptionalBookPojo(Optional<BookPojo> optionalBP) {
		if(optionalBP.isPresent()) {
			System.out.println(optionalBP.get());
		} else {
			System.out.println("Sorry! Book id does not exist!");
		}
	}
}
