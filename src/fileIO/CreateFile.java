package fileIO;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	static String filepath = "C:\\Users\\Shiv\\Java_Workspace\\Ashok_IT_Java_Programs\\src\\file";
	public static void main(String[] args) throws IOException{
		
		for(int i=0; i<5; i++) {
			File file = new File(filepath+"\\TestFile"+i+".txt");
			file.createNewFile();
			System.out.println("File created!");
		}
	}

}
