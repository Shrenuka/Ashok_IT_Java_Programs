package fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamClass {
	
	static String filepath = System.getProperty("user.dir")+"\\src\\file\\TestFile1.txt";
	static FileInputStream fis;
	
	public static void main(String[] args) throws IOException {

		readfileusingstream();
		System.out.println("");
		System.out.println("*************************");
		readonecharfilestream();
		System.out.println("");
		System.out.println("*************************");
		readfileusingstream2();
		System.out.println("");
		System.out.println("*************************");
		readfileusingstream3();
		System.out.println("");
		System.out.println("*************************");
		readfileusingstream4();
	}

	public static void readfileusingstream() throws IOException {
		
		fis = new FileInputStream(filepath);
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
	}
	
	public static void readonecharfilestream() throws IOException {
		
		fis = new FileInputStream(filepath);
		int i= fis.read();
		System.out.println((char) i);
	}
	
	public static void readfileusingstream2() throws IOException {
		
		fis = new FileInputStream(filepath);
		byte b[] = fis.readAllBytes();
		for(byte bb : b) {
			System.out.print((char) bb);
		}
	}
	
	public static void readfileusingstream3() throws IOException {
		
		fis = new FileInputStream(filepath);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}		
	}
	
	public static void readfileusingstream4() throws IOException {
		
		fis = new FileInputStream(filepath);
		BufferedInputStream br = new BufferedInputStream(fis);
		int i;
		while((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		
	}
}
