package fileIO;

import java.io.File;

public class FileModified {

	static String filepath = "C:\\Users\\Shiv\\Desktop\\Ashok IT\\Automation_Testing\\Java_AshokIT\\controlstatements"; 
			
	public static void main(String args[]) {		
		System.out.println("Last modified file is -> " + getLastModifiedFile(filepath));		
	}
	
	public static String getLastModifiedFile(String filepath) {
		
		File file =  new File(filepath);
		File lastmodifiedfile = null;
		
		if(file.isDirectory()) {			
			File files[] = file.listFiles();
			lastmodifiedfile = files[0];
			for(int i=0; i<files.length; i++) {
				if(files[i].lastModified() > lastmodifiedfile.lastModified()) {
					lastmodifiedfile = files[i];
				}
			}			
		}		
		return lastmodifiedfile.getName();		
	}
	
}
