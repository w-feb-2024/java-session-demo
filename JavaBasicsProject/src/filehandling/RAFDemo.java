package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFDemo {

	public static void main(String[] args) {
		File file = new File("Sample.txt");
		try {
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer());
			raf.seek(10);
			byte[] data = new byte[(int)file.length()-10];
			raf.read(data);
			System.out.println(new String(data));
			
			System.out.println(raf.getFilePointer());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
