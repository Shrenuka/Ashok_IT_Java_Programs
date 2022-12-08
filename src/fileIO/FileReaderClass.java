package fileIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	static String filepath = System.getProperty("user.dir")+"\\src\\file\\TestFile.txt";
	
	public static void main(String[] args) throws IOException {		
		
		FileReader fr = new FileReader(filepath);
		int i = 0;
		while((i = fr.read()) != -1) {
			System.out.print((char) i);
		}

	}

}
