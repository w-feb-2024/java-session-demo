package exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			layer1();
		} catch (FileNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void layer1() throws FileNotFoundException, SQLException {
		layer2();
	}
	
	static void layer2() throws FileNotFoundException, SQLException {
		layer3();
	}
	
	static void layer3() throws FileNotFoundException{
			FileInputStream fis = new FileInputStream("Sample.txt");

	}
}
