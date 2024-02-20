package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationDemo {

	public static void main(String[] args) {
		try {
			//1
			FileOutputStream fout = new FileOutputStream("output.txt");
			//2
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			//3
			Account acc1 = new Account("abc", 2000, 1234);
			
			//4
			oos.writeObject(acc1);
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
