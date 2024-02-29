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
	
	public static void displayInvalidOptionMessage() {
		System.out.println("***********************************");
		System.out.println("Invalid Menu Option. Please Try Again!");
		System.out.println("***********************************");
	}
	
	public static char displayConfirmation() {
		System.out.println("***********************************");
		System.out.println("Are you sure you want to remove the book(y/n)?");
		System.out.println("***********************************");
		char ans = scan.next().charAt(0);
		return ans;
	}
	
	public static void displayDeleteConfirmation(int bookId) {
		System.out.println("***********************************");
		System.out.println("Book with id: " + bookId + " has been removed!");
		System.out.println("***********************************");
	}
	
	public static String scanGenre() {
		System.out.println("Please enter the Genre:");
		String genre = scan.next();
		return genre;
	}
	
	public static void displayNoGenreFound(String genre) {
		System.out.println("***********************************");
		System.out.println("No books found in the genre: " + genre);
		System.out.println("***********************************");
	}
}
