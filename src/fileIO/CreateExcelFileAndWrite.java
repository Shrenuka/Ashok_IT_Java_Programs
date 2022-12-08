package fileIO;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFileAndWrite {
	
	static String filepath = System.getProperty("user.dir") + "//src//file//Sample.xlsx";

	public static void main(String[] args) throws Exception {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("Employee");
		
		sh.createRow(0);
		sh.getRow(0).createCell(0).setCellValue("Emp_Id");
		sh.getRow(0).createCell(1).setCellValue("Emp_Name");
		sh.getRow(0).createCell(2).setCellValue("Emp_Designation");
		sh.getRow(0).createCell(3).setCellValue("Emp_Location");
		sh.getRow(0).createCell(4).setCellValue("Emp_DOJ");
		
		sh.createRow(1);
		sh.getRow(1).createCell(0).setCellValue("123");
		sh.getRow(1).createCell(1).setCellValue("Renu");
		sh.getRow(1).createCell(2).setCellValue("Qa");
		sh.getRow(1).createCell(3).setCellValue("Hyderabad");
		sh.getRow(1).createCell(4).setCellValue("13/01/21");
		
		sh.createRow(2);
		sh.getRow(2).createCell(0).setCellValue("456");
		sh.getRow(2).createCell(1).setCellValue("Shiv");
		sh.getRow(2).createCell(2).setCellValue("Dev");
		sh.getRow(2).createCell(3).setCellValue("Bangluru");
		sh.getRow(2).createCell(4).setCellValue("14/02/22");
		
		sh.createRow(3);
		sh.getRow(3).createCell(0).setCellValue("789");
		sh.getRow(3).createCell(1).setCellValue("Adi");
		sh.getRow(3).createCell(2).setCellValue("Man");
		sh.getRow(3).createCell(3).setCellValue("Chennai");
		sh.getRow(3).createCell(4).setCellValue("12/01/21");
		
		FileOutputStream fos = new FileOutputStream(filepath);
		wb.write(fos);
		
		wb.close();
		
		System.out.println("File created !");	
	}
}
