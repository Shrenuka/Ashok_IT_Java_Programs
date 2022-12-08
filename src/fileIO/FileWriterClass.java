package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	static String filepath = "C:\\Users\\Shiv\\Java_Workspace\\Ashok_IT_Java_Programs\\src\\file\\TestFile.txt"; 
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter(filepath);
		fw.write("This is sample data");
		fw.append(" This data is appended");
		fw.flush();
		fw.close();
		System.out.println("File writing completed !");

	}

}
