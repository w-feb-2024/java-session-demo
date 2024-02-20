package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) {
		File file = new File("Sample.txt");
		
		try(FileOutputStream fos = new FileOutputStream(file, true);) {
			String str = "this is the data that i want to write to the file";
			
			fos.write(str.getBytes());
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
