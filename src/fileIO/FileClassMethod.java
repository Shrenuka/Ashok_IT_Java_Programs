package fileIO;

import java.io.File;

public class FileClassMethod {

	static String filepath = System.getProperty("user.dir")+"\\src\\file";
	
	public static void main(String[] args) {
	
		File file = new File(filepath);
		
		if(file.isFile()) {
			System.out.println("Yes this is a file");
		}
		else if (file.isDirectory()) {
			System.out.println("Yes this is a folder");
			
			File files[] = file.listFiles();
			for(File filename:files) {
				//System.out.println(filename.getName());
				System.out.println(filename.getPath());
			}
		}
		
		
	}

}
