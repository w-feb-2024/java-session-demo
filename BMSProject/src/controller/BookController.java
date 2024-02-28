package controller;

import java.util.List;
import java.util.Optional;

import model.BookPojo;
import presentation.Presentation;
import service.BookService;
import service.BookServiceImpl;

// we do not keep any input/output in the controller
public class BookController {
	BookService bookService;
	
	public BookController() {
		bookService = new BookServiceImpl();
	}
	
	public void start() {
		
		// will call the display menu for books
		int option = 1;
		while(option <=7 && option > 0) {
			option = Presentation.displayMenu();
			// depending on the menu option selected, controller will call the respective method of service
			switch(option) {
				case 1:
					List<BookPojo> allBooks = bookService.fetchAllBook();
					Presentation.displayFetchAllBooks(allBooks);
					break;
				case 2:
					// get bookId as input from the user - ask the presentation layer to do it
					int bookId = Presentation.scanBookId();
					// then call bookService.fetchABook
					Optional<BookPojo> bookPojoOptional = bookService.fetchABook(bookId);
					Presentation.displayOptionalBookPojo(bookPojoOptional);
					break;
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
					Presentation.displayExitMessage();
					System.exit(0);
				
			}
		}
	 
	}
	
}
