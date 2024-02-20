package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializationDemo {

	public static void main(String[] args) {
		try {
			//1
			FileInputStream fis = new FileInputStream("output.txt");
			//2
			ObjectInputStream ois = new ObjectInputStream(fis);
			//3
			Account account = (Account)ois.readObject();
			System.out.println(account);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
