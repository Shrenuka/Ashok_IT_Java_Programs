package fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {

	static String filepath = System.getProperty("user.dir")+"\\src\\file\\TestFile.txt";
	
	public static void main(String[] args) throws IOException {
 
		BufferedWriter br = new BufferedWriter(new FileWriter(filepath));
		br.write("This is data Written using buffered writer class");
		br.newLine();
		br.append("This text is appended");
		br.newLine();
		br.append("This is the new line text appended");		
		br.newLine();
		br.append("This is the new line text appended");
		br.flush();
		br.close();
		System.out.println("File writting finished..");

	}

}
