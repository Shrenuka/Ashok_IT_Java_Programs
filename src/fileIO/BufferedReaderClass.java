package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
	
	static String filepath = System.getProperty("user.dir")+"\\src\\file\\TestFile0.txt";
	static BufferedReader br; 
	
	
	public static void main(String[] args) throws IOException {
	
		filereader1();
		System.out.println();
		System.out.println("************************");
		filereader2();
	
	}
	
	public static void filereader1() throws IOException {
		br = new BufferedReader(new FileReader(filepath));
		int i;
		while((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		br.close();			
	}
	
	public static void filereader2() throws IOException {
		br = new BufferedReader(new FileReader(filepath));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
