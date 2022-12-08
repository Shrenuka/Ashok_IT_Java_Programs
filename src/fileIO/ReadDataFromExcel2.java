package fileIO;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {
	
	static String filepath = System.getProperty("user.dir") + "//src//file//Sample.xlsx";

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(filepath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Employee");
		
		int noofrows = sh.getPhysicalNumberOfRows();
		
		int noofcols = sh.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0; i<noofrows; i++) {
			XSSFRow row = sh.getRow(i); //1st row
			
			for(int j=0; j<noofcols; j++) {
				XSSFCell cell = row.getCell(j); //1st colmn
				DataFormatter formatter = new DataFormatter();
				String value = formatter.formatCellValue(cell);
				System.out.print(value+" ");
			}
			System.out.println(" ");
		}
		
		
	}

}
