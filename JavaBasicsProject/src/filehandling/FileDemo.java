package filehandling;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("Sample.txt");
		System.out.println(file.getName());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.lastModified());
	}

}
