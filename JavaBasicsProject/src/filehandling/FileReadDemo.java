package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		//FileReader fileReader = new FileReader("Sample.txt");
		
		File file = new File("Sample.txt");
		try {
			FileReader fileReader = new FileReader(file);
//			char[] data = new char[(int) file.length()];
//			fileReader.read(data);
//			System.out.println(new String(data));
			
			int ch;
			StringBuffer sb = new StringBuffer();
			while((ch=fileReader.read())!=-1) {
				//System.out.println(ch);
				sb.append((char)ch);
			}
			System.out.println(sb);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
