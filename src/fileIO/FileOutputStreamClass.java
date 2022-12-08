package fileIO;

import java.io.FileOutputStream;

public class FileOutputStreamClass {
	
	static String filepath = System.getProperty("user.dir")+"\\src\\file\\TestFile0.txt";
	static FileOutputStream fos;

	public static void main(String[] args) throws Exception {
		
		fos = new FileOutputStream(filepath);
		fos.write(122);
		String str = "This is sample data using file output stream";
		byte b[]=str.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("End of data");
	}

}
