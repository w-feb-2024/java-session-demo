// extend RuntimeException if you want to create a unchecked excpetion
// by extending Exception we have created a checked exception
public class InvalidOptionException extends Exception{
	
	int option;

	public InvalidOptionException(int option) {
		super();
		this.option = option;
	}

	@Override
	public String getMessage() {
		return option + " is not a valid option!";
	}
	
	
}
